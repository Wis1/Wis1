package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){

        //Given
        Product product1= new Product("laptop");
        Product product2= new Product("headphones");
        Product product3= new Product("loudspeakers");

        Item item1= new Item(product1,new BigDecimal(3000),2);
        Item item2= new Item(product2, new BigDecimal(100), 4);
        Item item3= new Item(product3, new BigDecimal(200), 3);

        Invoice invoice= new Invoice("2431" );
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int invoiceId= invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

//        try{
//            invoiceDao.deleteById(invoiceId);
//        }catch (Exception e){
//            System.out.println(e);
//        }

    }
}
