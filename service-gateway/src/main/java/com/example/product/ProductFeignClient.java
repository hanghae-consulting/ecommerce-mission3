package com.example.product;

import com.example.product.dto.ProductRequest;
import com.example.product.dto.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "productClient", url = "http://localhost:8082")
public interface ProductFeignClient {

    // TODO #1: 상품을 생성하는 Feign 클라이언트 createProduct 메서드를 구현하세요.
    // 요구사항:
    // - ProductRequest를 받아 상품을 생성해야 합니다.
    // - 생성된 상품의 ID를 반환해야 합니다.

    // TODO #2: 특정 상품을 조회하는 Feign 클라이언트 getProduct 메서드를 구현하세요.
    // 요구사항:
    // - productId를 기반으로 상품을 조회해야 합니다.
    // - 조회된 상품 정보를 ProductResponse로 반환해야 합니다.

    // TODO #3: 상품 정보를 업데이트하는 Feign 클라이언트 updateProducts 메서드를 구현하세요.
    // 요구사항:
    // - productId와 새로운 상품 정보를 사용하여 상품을 업데이트해야 합니다.
    // - 업데이트 성공 여부를 반환해야 합니다.
}
