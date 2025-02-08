
package com.example.stock.kafka;

import com.example.events.EventEntity;
import com.example.events.EventRepository;
import com.example.kafka.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
@RequiredArgsConstructor
public class StockResultConsumer {

    private final EventRepository eventRepository;
    private final ObjectMapper mapper = new ObjectMapper();

    @KafkaListener(topics = "stock-result", groupId = "stock-group")
    public void onCommandEvent(ConsumerRecord<String, Event> record) {
        // TODO #2: Kafka에서 재고 처리 결과 이벤트를 수신하는 로직을 구현하세요.
        // 요구사항:
        // - stock-result 토픽에서 이벤트를 수신해야 합니다.
        // - 수신된 이벤트 유형을 식별하여 적절한 핸들러로 전달해야 합니다.
        // - 적당한 이벤트가 없다면 로그를 남겨야 합니다.
    }

    private void handleStockCreated(StockCreatedEvent evt) {
        // TODO #3: 재고 생성 결과 이벤트를 처리하는 로직을 구현하세요.
        // 요구사항:
        // - StockCreatedEvent를 처리해야 합니다.
        // - 이벤트 정보를 DB에 저장해야 합니다.
    }

    private void handleStockUpdated(StockUpdatedEvent evt) {
        // TODO #4: 재고 업데이트 결과 이벤트를 처리하는 로직을 구현하세요.
        // 요구사항:
        // - StockUpdatedEvent를 처리해야 합니다.
        // - 이벤트 정보를 DB에 저장해야 합니다.
    }

    private void handleStockDecreased(StockDecreasedEvent evt) {
        // TODO #5: 재고 감소 결과 이벤트를 처리하는 로직을 구현하세요.
        // 요구사항:
        // - StockDecreasedEvent를 처리해야 합니다.
        // - 이벤트 정보를 DB에 저장해야 합니다.
    }

    private void handleStockDeleted(StockDeletedEvent evt) {
        // TODO #6: 재고 삭제 결과 이벤트를 처리하는 로직을 구현하세요.
        // 요구사항:
        // - StockDeletedEvent를 처리해야 합니다.
        // - 이벤트 정보를 DB에 저장해야 합니다.
    }
}
