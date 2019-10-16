package com.javatechie.data.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringDataRestExampleApplication {

    @Autowired
    private CustomerRepository repository;

    @PostConstruct
    public void init() {
        repository.saveAll(Stream.of(
        		new Customer(101, "Pratik", "p@gmail.com"),
				new Customer(102, "Dileep", "d@gmail.com"),
				new Customer(103, "Lav", "l@gmail.com"),
				new Customer(104, "Kantha", "k@gmail.com"))
				.collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRestExampleApplication.class, args);
    }

}
