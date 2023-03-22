package mini.project.customer.mapper;

import mini.project.customer.model.Customer;
import mini.project.customer.response.CustomerResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class CustomerMapper {
    public abstract CustomerResponse convertToResponse(Customer customer);
}
