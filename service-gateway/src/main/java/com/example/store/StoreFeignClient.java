package com.example.store;

import com.example.config.FeignConfig;
import com.example.store.dto.StoreRequest;
import com.example.store.dto.StoreResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "storeClient", url = "http://localhost:8081", configuration = FeignConfig.class)
public interface StoreFeignClient {
    // TODO #1: 매장을 생성하는 Feign 클라이언트 메서드를 구현하세요.
    // 요구사항:
    // - StoreRequest를 받아 매장을 생성해야 합니다.
    // - 생성된 매장의 ID를 반환해야 합니다.

    // TODO #2: 특정 매장을 조회하는 Feign 클라이언트 메서드를 구현하세요.
    // 요구사항:
    // - storeId를 기반으로 매장을 조회해야 합니다.
    // - 조회된 매장 정보를 StoreResponse로 반환해야 합니다.

    // TODO #3: 매장 정보를 업데이트하는 Feign 클라이언트 메서드를 구현하세요.
    // 요구사항:
    // - storeId와 새로운 매장 정보를 사용하여 매장을 업데이트해야 합니다.
    // - 업데이트 성공 여부를 반환해야 합니다.

    // TODO #4: 매장을 삭제하는 Feign 클라이언트 메서드를 구현하세요.
    // 요구사항:
    // - storeId를 기반으로 매장을 삭제해야 합니다.
    // - 삭제 성공 여부를 반환해야 합니다.
}
