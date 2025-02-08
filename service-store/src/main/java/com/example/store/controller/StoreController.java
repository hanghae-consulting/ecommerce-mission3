package com.example.store.controller;

import com.example.store.entity.Store;
import com.example.kafka.CreateStoreEvent;
import com.example.kafka.DeleteStoreEvent;
import com.example.kafka.UpdateStoreEvent;
import com.example.store.dto.StoreDto;
import com.example.store.kafka.StoreEventProducer;
import com.example.store.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/api/store")
@RequiredArgsConstructor
public class StoreController {
    private final StoreEventProducer eventProducer;
    private final StoreService storeService;


    @PostMapping
    public String createStore(@RequestBody StoreDto dto) {
        // TODO #1: 스토어 생성 메서드를 구현하세요.
        // 요구사항:
        // - CreateStoreEvent를 발행해야 합니다.
        // - UUID를 생성하여 반환해야 합니다.
    }


    @GetMapping("/{storeId}")
    public Store getStore(@PathVariable String storeId) {
        // TODO #2: 스토어 조회 메서드를 구현하세요.
        // 요구사항:
        // - 스토어 정보를 반환해야 합니다.
    }


    @PutMapping("/{storeId}")
    public boolean updateStore(@PathVariable String storeId,
                               @RequestBody StoreDto dto) {
        // TODO #3: 스토어 수정 메서드를 구현하세요.
        // 요구사항:
        // - UpdateStoreEvent를 발행해야 합니다.
        // - 성공 여부를 반환해야 합니다.
    }


    @DeleteMapping("/{storeId}")
    public boolean deleteStore(@PathVariable String storeId) {
        // TODO #4: 스토어 삭제 메서드를 구현하세요.
        // 요구사항:
        // - DeleteStoreEvent를 발행해야 합니다.
        // - 성공 여부를 반환해야 합니다.
    }
}
