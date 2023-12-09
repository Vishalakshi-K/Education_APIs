package com.education.eccentric.contact;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "feigncustomer", url = "http://localhost:8080/api1/")
public interface FeginContactCustomer {

}
