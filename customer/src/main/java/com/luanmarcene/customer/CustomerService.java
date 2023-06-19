package com.luanmarcene.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {

    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        Customer customer = Customer.builder()
                                    .firstName(customerRegistrationRequest.firstName())
                                    .lastName(customerRegistrationRequest.lastName())
                                    .email(customerRegistrationRequest.email())
                                    .build();
        /*todo -> check if email is valid; 
         *     -> check if email is not taken
         */
        customerRepository.save(customer);
    }

}
