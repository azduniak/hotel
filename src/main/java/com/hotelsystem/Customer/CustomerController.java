package com.hotelsystem.Customer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CustomerController {

        private CustomerService customerService;

        @RequestMapping("/customer")
        public Object addCustomer(@RequestBody CustomerEntity customerEntity) {
            return customerService.createCustomer(customerEntity);
        }
}
