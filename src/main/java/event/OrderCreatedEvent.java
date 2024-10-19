package event;

import lombok.Getter;
import lombok.Setter;
import model.CartItem;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class OrderCreatedEvent {

    private UUID orderId;
    private UUID userId;
    private List<CartItem> cartItems;

}
