package event;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class InventoryFailedEvent {

    private UUID userId;
    private UUID orderId;
    private String reason;

}
