package mini.project.customer.request;

import lombok.Data;

@Data
public class CustomerRequest {
    private long id;
    private String customerId;
    private int urutanId;
    private String provinsi;
    private String alamatId;
}
