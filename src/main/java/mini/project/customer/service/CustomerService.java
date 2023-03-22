package mini.project.customer.service;

import mini.project.customer.request.CustomerRequest;
import mini.project.customer.response.CustomerResponse;

import java.util.List;

public interface CustomerService {
    List<CustomerResponse> getCustomerById(String customerId);
    String editCustomerById(CustomerRequest customerRequest);
}
