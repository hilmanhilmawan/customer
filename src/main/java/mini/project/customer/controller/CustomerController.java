package mini.project.customer.controller;

import lombok.AllArgsConstructor;
import mini.project.customer.request.CustomerRequest;
import mini.project.customer.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/detail")
    public ResponseEntity<?> getDetailById(@RequestParam String customerId) {
        return ResponseEntity.ok(customerService.getCustomerById(customerId));
    }

    @PostMapping("/edit")
    public ResponseEntity<?> editCustome(@RequestBody CustomerRequest customerRequest) {
        return ResponseEntity.ok(customerService.editCustomerById(customerRequest));
    }
}
