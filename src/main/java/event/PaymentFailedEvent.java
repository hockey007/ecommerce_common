package event;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class PaymentFailedEvent {

    @JsonProperty("user_id")
    private UUID userId;

    @JsonProperty("order_id")
    private UUID orderId;

    private String reason;

}
