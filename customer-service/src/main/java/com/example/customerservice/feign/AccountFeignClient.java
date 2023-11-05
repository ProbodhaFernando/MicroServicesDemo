package com.example.customerservice.feign;

import com.example.customerservice.domain.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "Account-Service", url = "http://localhost:8082/api/v1/accounts")
public interface AccountFeignClient {

    @RequestMapping(method = RequestMethod.GET)
    Account getAccounts();
}
