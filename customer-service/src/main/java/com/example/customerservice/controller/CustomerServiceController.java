package com.example.customerservice.controller;

import com.example.customerservice.domain.Account;
import com.example.customerservice.domain.Customer;
import com.example.customerservice.feign.AccountFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerServiceController {

    private final AccountFeignClient feignClient;

    @GetMapping
    public ResponseEntity<Customer> getAllCustomers() {
        Account account = feignClient.getAccounts();

        Customer customer = Customer.builder()
                .name("Probodha")
                .account(account)
                .build();
        return ResponseEntity.status(HttpStatus.OK).body(customer);
    }
}
