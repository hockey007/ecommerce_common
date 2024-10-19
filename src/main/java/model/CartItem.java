package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class CartItem {

    private UUID id;

    private Cart cart;

    @Column(name = "product_id")
    @JsonProperty("product_id")
    private UUID productId;

    @Column(name = "variant_id")
    @JsonProperty("variant_id")
    private UUID variantId;

    private Integer quantity;

}