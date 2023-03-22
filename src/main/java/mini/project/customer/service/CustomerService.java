package mini.project.customer.service;

import mini.project.customer.request.CustomerRequest;
import mini.project.customer.response.CustomerResponse;

public interface CustomerService {
    CustomerResponse getCustomerById(String customerId);
    String editCustomerById(CustomerRequest customerRequest);
}
