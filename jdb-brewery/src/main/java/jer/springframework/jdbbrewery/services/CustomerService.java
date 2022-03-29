package jer.springframework.jdbbrewery.services;

import jer.springframework.jdbbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
