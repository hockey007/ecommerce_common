package event;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class PaymentConfirmedEvent {

    @JsonProperty("order_id")
    private UUID orderId;

    @JsonProperty("user_id")
    private UUID userId;

    @JsonProperty("payment_id")
    private UUID paymentId;

}
