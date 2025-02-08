package com.example.stock.controller;

import com.example.kafka.CreateStockEvent;
import com.example.kafka.DecreaseStockEvent;
import com.example.kafka.DeleteStockEvent;
import com.example.kafka.UpdateStockEvent;
import com.example.stock.dto.StockDto;
import com.example.stock.entity.Stock;
import com.example.stock.kafka.StockEventProducer;
import com.example.stock.service.StockService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

        import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/api/stock")
@RequiredArgsConstructor
public class StockController {

    private final StockEventProducer eventProducer;
    private final StockService stockService;

    @PostMapping
    public String createStock(@RequestBody StockDto dto) {
        // TODO #1: 재고를 생성하고 이벤트를 발행하는 API 엔드포인트를 구현하세요.
        // 요구사항:
        // - UUID를 생성하여 재고 이벤트를 식별해야 합니다.
        // - CreateStockEvent를 생성하여 Kafka에 발행해야 합니다.
    }

    @GetMapping("/{stockId}")
    public Stock getStock(@PathVariable String stockId) {
        // TODO #2: 재고를 조회하는 API 엔드포인트를 구현하세요.
        // 요구사항:
        // - stockId를 기반으로 재고를 조회해야 합니다.
        // - 조회된 재고 정보를 반환해야 합니다.
        log.info("Get stock by id: {}", stockId);
        return stockService.getStock(stockId);
    }

    @PutMapping("/{stockId}")
    public boolean updateStock(@PathVariable String stockId,
                               @RequestBody StockDto dto) {
        // TODO #3: 재고를 업데이트하고 이벤트를 발행하는 API 엔드포인트를 구현하세요.
        // 요구사항:
        // - stockId와 StockDto를 기반으로 UpdateStockEvent를 생성해야 합니다.
        // - Kafka에 이벤트를 발행해야 합니다.
    }

    @PutMapping("/{stockId}/decrease/{quantity}")
    public boolean decreaseStock(@PathVariable String stockId,
                                 @PathVariable Long quantity) {
        // TODO #4: 재고 감소 이벤트를 처리하는 API 엔드포인트를 구현하세요.
        // 요구사항:
        // - stockId와 quantity를 기반으로 DecreaseStockEvent를 생성해야 합니다.
        // - Kafka에 이벤트를 발행해야 합니다.
    }

    @DeleteMapping("/{stockId}")
    public boolean deleteStock(@PathVariable String stockId) {
        // TODO #5: 재고를 삭제하고 이벤트를 발행하는 API 엔드포인트를 구현하세요.
        // 요구사항:
        // - stockId를 기반으로 DeleteStockEvent를 생성해야 합니다.
        // - Kafka에 이벤트를 발행해야 합니다.
    }
}
