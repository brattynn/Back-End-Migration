package com.d288.d288.bootstrap;

import com.d288.d288.dao.CustomerRepository;
import com.d288.d288.dao.DivisionRepository;
import com.d288.d288.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootStrapData implements CommandLineRunner {

    @Autowired
    private final CustomerRepository customerRepository;
    @Autowired
    private final DivisionRepository divisionRepository;

    //Constructor
    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (customerRepository.count() == 1) {
            Customer matt = new Customer();
            matt.setFirstName("Matthew");
            matt.setLastName("Heafy");
            matt.setAddress("123 Sing Road");
            matt.setPostal_code("12345");
            matt.setPhone("111-555-0123");
            matt.setDivision(divisionRepository.findAll().get(1));

            Customer corey = new Customer();
            corey.setFirstName("Corey");
            corey.setLastName("Beaulieu");
            corey.setAddress("234 Guitar Street");
            corey.setPhone("23456");
            corey.setPostal_code("222-444-1234");
            corey.setDivision(divisionRepository.findAll().get(2));

            Customer alex = new Customer();
            alex.setFirstName("Alex");
            alex.setLastName("Bent");
            alex.setAddress("345 Drum Way");
            alex.setPhone("34567");
            alex.setPostal_code("333-333-2345");
            alex.setDivision(divisionRepository.findAll().get(3));

            Customer paulo = new Customer();
            paulo.setFirstName("Paulo");
            paulo.setLastName("Gregoletto");
            paulo.setAddress("456 Bass Court");
            paulo.setPhone("45678");
            paulo.setPostal_code("444-222-3456");
            paulo.setDivision(divisionRepository.findAll().get(4));

            Customer jason = new Customer();
            jason.setFirstName("Jason");
            jason.setLastName("Suecoff");
            jason.setAddress("567 Studio Drive");
            jason.setPhone("56789");
            jason.setPostal_code("555-111-4567");
            jason.setDivision(divisionRepository.findAll().get(5));

            customerRepository.save(matt);
            customerRepository.save(corey);
            customerRepository.save(alex);
            customerRepository.save(paulo);
            customerRepository.save(jason);

            System.out.println("5 additional customers added to database");
        } else {
            System.out.println("Customer repository has more than 1 customer currently.");
        }
    }
}
