package com.example.store.service;

import com.example.cache.CachePublisher;
import com.example.kafka.CreateStoreEvent;
import com.example.kafka.UpdateStoreEvent;
import com.example.store.entity.Store;
import com.example.store.repository.StoreRepository;
import com.github.benmanes.caffeine.cache.Cache;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreService {

    private static final String STORE_KEY_PREFIX = "store:";

    private final StoreRepository storeRepository;

    private final Cache<String, Object> localCache;
    private final RedisTemplate<String, Object> redisTemplate;
    private final CachePublisher cachePublisher;

    public Store createStore(CreateStoreEvent event) {
        // TODO #1: 매장 생성 로직을 구현하세요.
        // 요구사항:
        // - storeRepository를 사용하여 매장을 생성해야 합니다.
        // - 생성된 매장을 캐시에 저장해야 합니다.
    }

    public Store updateStore(UpdateStoreEvent event) {
        // TODO #2: 매장 업데이트 로직을 구현하세요.
        // 요구사항:
        // - storeRepository를 사용하여 매장 정보를 업데이트해야 합니다.
        // - 업데이트된 매장을 캐시에 갱신해야 합니다.
        // - 캐시 무효화 메시지를 Pub/Sub을 통해 전파해야 합니다.
    }

    public void deleteStore(String storeId) {
        // TODO #3: 매장 삭제 로직을 구현하세요.
        // 요구사항:
        // - storeRepository를 사용하여 매장을 삭제해야 합니다.
        // - 캐시에서 해당 매장을 무효화해야 합니다.
        // - 캐시 무효화 메시지를 Pub/Sub을 통해 전파해야 합니다.
    }

    public Store getStore(String storeId) {
        // TODO #4: 매장 조회 로직을 구현하세요.
        // 요구사항:
        // - 로컬 캐시 → Redis → DB 순서로 조회해야 합니다.
        // - 조회된 데이터를 캐시에 저장해야 합니다.
    }
}