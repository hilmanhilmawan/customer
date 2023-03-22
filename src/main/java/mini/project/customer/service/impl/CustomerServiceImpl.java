package mini.project.customer.service.impl;

import lombok.AllArgsConstructor;
import mini.project.customer.mapper.CustomerMapper;
import mini.project.customer.model.Customer;
import mini.project.customer.repository.CustomerRepository;
import mini.project.customer.request.CustomerRequest;
import mini.project.customer.response.CustomerResponse;
import mini.project.customer.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    public CustomerResponse getCustomerById(String customerId) {
        Optional<Customer> customerOptional = customerRepository.findCustomerByCustomerId(customerId);
        if (!customerOptional.isPresent()) {
            throw new RuntimeException("Tidak ada data");
        }
        return customerMapper.convertToResponse(customerOptional.get());
    }

    @Override
    public String editCustomerById(CustomerRequest customerRequest) {
        Optional<Customer> customerOptional = customerRepository.findById(customerRequest.getId());
        if (!customerOptional.isPresent()) {
            throw new RuntimeException("Tidak ada data");
        }

        Customer customer =new Customer();
        customer.setCustomerId(customerRequest.getCustomerId());
        customer.setUrutanId(customerRequest.getUrutanId());
        customer.setProvinsi(customerRequest.getProvinsi());
        customer.setAlamatId(customerRequest.getAlamatId());
        try {
            customerRepository.save(customer);
        } catch (Exception e) {
            throw new RuntimeException("Ggala menyimpan data");
        }
        return customer.getCustomerId();
    }
}
