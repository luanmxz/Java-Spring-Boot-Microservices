package com.luanmarcene.customer;

public record CustomerService() {

    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        Customer customer = Customer.builder()
                                    .firstName(customerRegistrationRequest.firstName())
                                    .lastName(customerRegistrationRequest.lastName())
                                    .email(customerRegistrationRequest.email())
                                    .build();
        //todo
    }

}
