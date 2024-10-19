package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class Cart {

    private UUID id;

    @Column(name = "user_id", nullable = false)
    @JsonProperty("user_id")
    private UUID userId;

    @Column(nullable = false)
    private Integer count = 0;

}
