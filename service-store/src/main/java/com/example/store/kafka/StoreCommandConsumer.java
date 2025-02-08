package com.example.store.kafka;

import com.example.kafka.*;
import com.example.store.entity.Store;
import com.example.store.service.StoreService;
lombok.RequiredArgsConstructor;
        lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class StoreCommandConsumer {

    private final StoreService storeService;
    private final StoreEventProducer eventProducer;

    @KafkaListener(topics = "store-command", groupId = "store-group")
    public void onCommandEvent(ConsumerRecord<String, Event> record) {
        // TODO #1: Kafka에서 스토어 이벤트를 수신하는 로직을 구현하세요.
        // 요구사항:
        // - store-command 토픽에서 이벤트를 수신해야 합니다.
        // - 수신된 이벤트 유형을 식별하여 적절한 핸들러로 전달해야 합니다.
    }

    private void handleCreateStore(CreateStoreEvent event) {
        // TODO #2: 스토어 생성 이벤트를 처리하는 로직을 구현하세요.
        // 요구사항:
        // - storeService를 사용하여 스토어를 생성해야 합니다.
        // - StoreCreatedEvent를 생성하여 Kafka에 발행해야 합니다.
    }

    private void handleUpdateStore(UpdateStoreEvent event) {
        // TODO #3: 스토어 업데이트 이벤트를 처리하는 로직을 구현하세요.
        // 요구사항:
        // - storeService를 사용하여 스토어 정보를 업데이트해야 합니다.
        // - StoreUpdatedEvent를 생성하여 Kafka에 발행해야 합니다.
    }

    private void handleDeleteStore(DeleteStoreEvent event) {
        // TODO #4: 스토어 삭제 이벤트를 처리하는 로직을 구현하세요.
        // 요구사항:
        // - storeService를 사용하여 스토어를 삭제해야 합니다.
        // - StoreDeletedEvent를 생성하여 Kafka에 발행해야 합니다.
    }
}
