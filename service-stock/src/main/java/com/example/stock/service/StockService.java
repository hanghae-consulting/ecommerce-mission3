package com.example.stock.service;

import com.example.annotations.RedissonLock;
import com.example.cache.CachePublisher;
import com.example.kafka.CreateStockEvent;
import com.example.kafka.DecreaseStockEvent;
import com.example.kafka.UpdateStockEvent;
import com.example.stock.entity.Stock;
import com.example.stock.repository.StockRepository;
import com.github.benmanes.caffeine.cache.Cache;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class StockService {

    private static final String STOCK_KEY_PREFIX = "stock:";

    private final StockRepository stockRepository;
    private final Cache<String, Object> localCache;
    private final RedisTemplate<String, Object> redisTemplate;
    private final CachePublisher cachePublisher;


    public Stock createStock(CreateStockEvent event) {
        // TODO #1: 재고 생성 메서드를 구현하세요.
        // 요구사항:
        // - 재고 정보를 DB에 저장해야 합니다.
        // - 저장된 정보를 캐시에 저장해야 합니다.
    }


    public Stock getStock(String stockId) {
        // TODO #2: 재고 조회 메서드를 구현하세요.
        // 요구사항:
        // - 로컬 캐시 → Redis → DB 순서로 조회해야 합니다.
        // - 조회 시 데이터가 없으면 캐시를 갱신해야 합니다.
    }


    public Stock updateStock(UpdateStockEvent event) {
        // TODO #3: 재고 업데이트 메서드를 구현하세요.
        // 요구사항:
        // - 재고 정보를 수정하고 캐시를 갱신해야 합니다.
    }

    public Stock decreaseStock(DecreaseStockEvent event) {
        // TODO #4: 재고 감소 메서드를 구현하세요.
        // 요구사항:
        // - 재고 수량을 감소시켜야 합니다.
        // - 동시성 제어를 적용해야 합니다.
    }
}
