package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmployeeFacadeTestSuite {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeFacade employeeFacade;

    @AfterEach
    public void cleanUp() {
        //CleanUp
        try {
            companyDao.deleteAll();
            employeeDao.deleteAll();
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }
    }

    @Test
    public void shouldFindCompaniesByAnyPartOfName() {
        //Given
        Company dataMaesters = new Company("Data Maesters");
        Company softwareMachine = new Company("Software Machine");
        Company utilitarySoftware = new Company("Utilitary Software");
        Company greyMatter = new Company("Grey Matter");
        companyDao.save(dataMaesters);
        companyDao.save(softwareMachine);
        companyDao.save(utilitarySoftware);
        companyDao.save(greyMatter);

        //When
        List<Company> retrievedCompanies = employeeFacade.findCompaniesByNameFragment("ili");

        //Then
        assertEquals(1, retrievedCompanies.size());
    }

    @Test
    public void shouldFindEmployeesByAnyPartOfName(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee ignacyPaderewski= new Employee("Ignacy", "Paderewson");
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(ignacyPaderewski);

        //When
        List<Employee> retrievedEmployees= employeeFacade.findEmployeesByNameFragment("son");

        //Then
        assertEquals(2, retrievedEmployees.size());
    }
}

