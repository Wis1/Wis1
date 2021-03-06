package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CrudAppTestSuite {
    private static final String BASE_URL = "https://Wis1.github.io";
    private WebDriver driver;
    private Random generator;

    @BeforeEach
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
    }

    @AfterEach
    public void cleanUpAfterTest() {
        driver.close();
    }
    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        assertTrue(checkTaskExistsInTrello(taskName));
        deleteCrudAppTestTask(taskName);
    }

    private String createCrudAppTestTask() throws InterruptedException {
        driver.get(BASE_URL);
        generator= new Random();
        final String XPATH_TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";
        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }
    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(
                        By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement selList= theForm.findElement(By.xpath(".//select[2]"));
                    Select selectList= new Select(selList);
                    selectList.selectByVisibleText("Things to do");

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });

            Thread.sleep(2000);

        driver.switchTo().alert().accept();
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        driver.get(TRELLO_URL);

        driver.findElement(By.id("user")).sendKeys("szymekwizdorf@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Mamamama1");
        WebElement el = driver.findElement(By.id("login"));
        el.submit();

        Thread.sleep(4000);

        driver.findElement(By.id("password")).sendKeys("Mamamama1");
        driver.findElement(By.id("login-submit")).submit();

        Thread.sleep(4000);

        driver.findElement(By.xpath(".//a[@class=\"boards-page-board-section-header-options-item\"]")).click();

        Thread.sleep(4000);

        driver.findElement(By.xpath(".//div[@title=\"KodillaAplication\"]")).click();

        Thread.sleep(4000);

        result = driver.findElements(By.xpath("//span")).stream()
                .anyMatch(theSpan -> theSpan.getText().equalsIgnoreCase(taskName));

        return result;
    }

    private void deleteCrudAppTestTask(String taskName) throws InterruptedException {
        driver.get(BASE_URL);

        Thread.sleep(4000);

        driver.findElements(
                        By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(button -> {
                    WebElement buttonDelete = button.findElement(By.xpath(".//button[@data-task-delete-button=\"\"]"));
                    buttonDelete.click();
                });

        Thread.sleep(2000);
    }
}
