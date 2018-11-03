package com.hotelsystem.Customer;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@NoArgsConstructor
@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Transactional
    public Object createCustomer(CustomerEntity customerEntity) {

        return customerRepository.save(customerEntity);

    }
}
