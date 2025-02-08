package com.example.order;

import com.example.order.dto.OrderRequest;
import com.example.order.dto.OrderResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/order")
public class OrderController {

    private final OrderFeignClient orderFeignClient;

    public OrderController(OrderFeignClient orderFeignClient) {
        this.orderFeignClient = orderFeignClient;
    }

    @PostMapping
    public String createOrder(@RequestBody OrderRequest request) {
        // TODO #1: 주문을 생성하는 API 엔드포인트를 구현하세요.
        // 요구사항:
        // - OrderFeignClient를 사용하여 주문을 생성해야 합니다.
        // - 생성된 주문의 ID를 반환해야 합니다.
    }

    @GetMapping("/{storeId}")
    public OrderResponse getStore(@PathVariable String storeId) {
        // TODO #2: 특정 매장의 주문을 조회하는 API 엔드포인트를 구현하세요.
        // 요구사항:
        // - storeId를 기반으로 주문을 조회해야 합니다.
        // - 조회된 주문 정보를 반환해야 합니다.
        log.info("Get store with id {}", storeId);
    }

    @PutMapping("/{orderId}")
    public boolean updateStore(
            @PathVariable String orderId,
            @RequestBody OrderRequest request
    ) {
        // TODO #3: 주문을 업데이트하는 API 엔드포인트를 구현하세요.
        // 요구사항:
        // - orderId와 새로운 주문 정보를 사용하여 주문을 업데이트해야 합니다.
        // - 업데이트 성공 여부를 반환해야 합니다.
    }

    @DeleteMapping("/{orderId}")
    public boolean deleteStore(@PathVariable String orderId) {
        // TODO #4: 주문을 삭제하는 API 엔드포인트를 구현하세요.
        // 요구사항:
        // - orderId를 기반으로 주문을 삭제해야 합니다.
        // - 삭제 성공 여부를 반환해야 합니다.
    }
}