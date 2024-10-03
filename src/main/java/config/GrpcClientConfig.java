package config;

import com.ecommerce.common.InventoryServiceGrpc;
import com.ecommerce.common.CartServiceGrpc;
import com.ecommerce.common.InventoryServiceGrpc.InventoryServiceBlockingStub;
import com.ecommerce.common.CartServiceGrpc.CartServiceBlockingStub;
import com.ecommerce.common.ProductServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcClientConfig {

    @Bean
    @Qualifier("inventoryChannel")
    public ManagedChannel inventoryServiceManagedChannel() {
        return ManagedChannelBuilder.forAddress("localhost", 8084)
                .usePlaintext()
                .build();
    }

    @Bean
    @Qualifier("cartChannel")
    public ManagedChannel cartServiceManagedChannel() {
        return ManagedChannelBuilder.forAddress("localhost", 8086)
                .usePlaintext()
                .build();
    }

    @Bean
    @Qualifier("productChannel")
    public ManagedChannel productServiceManagedChannel() {
        return ManagedChannelBuilder.forAddress("localhost", 8082)
                .usePlaintext()
                .build();
    }

    @Bean
    public InventoryServiceBlockingStub inventoryServiceBlockingStub(
            @Qualifier("inventoryChannel") ManagedChannel channel) {
        return InventoryServiceGrpc.newBlockingStub(channel);
    }

    @Bean
    public CartServiceBlockingStub cartServiceBlockingStub(
            @Qualifier("cartChannel") ManagedChannel channel) {
        return CartServiceGrpc.newBlockingStub(channel);
    }

    @Bean
    public ProductServiceGrpc.ProductServiceBlockingStub productServiceBlockingStub(
            @Qualifier("productChannel") ManagedChannel channel
    ) {
        return ProductServiceGrpc.newBlockingStub(channel);
    }

}
