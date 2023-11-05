package com.example.accountservice.controller;

import com.example.accountservice.domain.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountServiceController {

    @GetMapping
    public ResponseEntity<Account> getAccounts() {
        Account account = Account.builder()
                .name("Test Account")
                .build();
        return ResponseEntity.ok(account);
    }
}
