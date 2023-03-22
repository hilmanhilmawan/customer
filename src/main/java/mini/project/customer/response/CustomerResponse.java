package mini.project.customer.response;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
    private String customerId;
    private int urutanId;
    private String provinsi;
    private String alamatId;
}
