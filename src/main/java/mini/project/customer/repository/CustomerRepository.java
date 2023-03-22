package mini.project.customer.repository;

import mini.project.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findCustomerByCustomerId(String customerId);
    Optional<Customer> findById(long id);
}
