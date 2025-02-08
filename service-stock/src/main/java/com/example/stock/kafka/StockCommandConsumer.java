package com.example.stock.controller;

import com.example.kafka.*;
        import com.example.stock.dto.StockDto;
import com.example.stock.entity.Stock;
import com.example.stock.kafka.StockEventProducer;
import com.example.stock.service.StockService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

        import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class StockCommandConsumer {

    private final StockService stockService;
    private final StockEventProducer eventProducer;

    @KafkaListener(topics = "stock-command", groupId = "stock-group")
    public void onCommandEvent(ConsumerRecord<String, Event> record) {
        // TODO #1: Kafka에서 재고 이벤트를 수신하는 로직을 구현하세요.
        // 요구사항:
        // - stock-command 토픽에서 이벤트를 수신해야 합니다.
        // - 수신된 이벤트 유형을 식별하여 적절한 핸들러로 전달해야 합니다.
    }

    private void handleCreateStock(CreateStockEvent event) {
        // TODO #2: 재고 생성 이벤트를 처리하는 로직을 구현하세요.
        // 요구사항:
        // - 재고를 생성해야 합니다.
        // - StockCreatedEvent 결과 이벤트를 생성하여 Kafka에 발행해야 합니다.
    }

    private void handleUpdateStock(UpdateStockEvent event) {
        // TODO #3: 재고 업데이트 이벤트를 처리하는 로직을 구현하세요.
        // 요구사항:
        // - 재고를 업데이트해야 합니다.
        // - StockUpdatedEvent 결과 이벤트를 생성하여 Kafka에 발행해야 합니다.
    }

    private void handleDecreaseStock(DecreaseStockEvent event) {
        // TODO #4: 재고 감소 이벤트를 처리하는 로직을 구현하세요.
        // 요구사항:
        // - 재고 수량을 감소시켜야 합니다.
        // - StockUpdatedEvent 결과 이벤트를 생성하여 Kafka에 발행해야 합니다.
    }

    private void handleDeleteStock(DeleteStockEvent event) {
        // TODO #5: 재고 삭제 이벤트를 처리하는 로직을 구현하세요.
        // 요구사항:
        // - 재고를 삭제해야 합니다.
        // - StockDeletedEvent 결과 이벤트를 생성하여 Kafka에 발행해야 합니다.
    }
}
