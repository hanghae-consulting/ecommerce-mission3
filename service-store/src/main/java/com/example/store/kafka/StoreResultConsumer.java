
package com.example.store.kafka;

import com.example.events.EventEntity;
import com.example.events.EventRepository;
import com.example.kafka.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Slf4j
@Service
@RequiredArgsConstructor
public class StoreResultConsumer {

    private final EventRepository eventRepository;

    @KafkaListener(topics = "store-result", groupId = "store-group")
    public void onResultEvent(ConsumerRecord<String, Event> record) {
        // TODO #1: Kafka에서 store-result 이벤트를 수신하는 로직을 구현하세요.
        // 요구사항:
        // - store-result 토픽에서 이벤트를 수신해야 합니다.
        // - 수신된 이벤트 유형을 식별하여 적절한 핸들러로 전달해야 합니다.
    }

    private void handleStoreCreated(StoreCreatedEvent evt) {
        // TODO #2: 스토어 생성 이벤트를 처리하는 로직을 구현하세요.
        // 요구사항:
        // - 수신된 StoreCreatedEvent 데이터를 EventEntity로 저장해야 합니다.
        // - 이벤트 타입과 관련 데이터를 저장하고, 상태를 "SUCCESS"로 설정해야 합니다.
    }

    private void handleStoreUpdated(StoreUpdatedEvent evt) {
        // TODO #3: 스토어 업데이트 이벤트를 처리하는 로직을 구현하세요.
        // 요구사항:
        // - 수신된 StoreUpdatedEvent 데이터를 EventEntity로 저장해야 합니다.
        // - 이벤트 타입과 관련 데이터를 저장하고, 상태를 "SUCCESS"로 설정해야 합니다.
    }

    private void handleStoreDeleted(StoreDeletedEvent evt) {
        // TODO #4: 스토어 삭제 이벤트를 처리하는 로직을 구현하세요.
        // 요구사항:
        // - 수신된 StoreDeletedEvent 데이터를 EventEntity로 저장해야 합니다.
        // - 이벤트 타입과 관련 데이터를 저장하고, 상태를 "SUCCESS"로 설정해야 합니다.
    }
}
