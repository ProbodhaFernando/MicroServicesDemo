package com.example.accountservice.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
    private String name;
}
