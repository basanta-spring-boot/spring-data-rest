package com.javatechie.data.rest.api;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {

    List<Customer> findByEmail(@Param("email") String email);
}
