package com.example.product;

import com.example.product.dto.ProductRequest;
import com.example.product.dto.ProductResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductFeignClient productFeignClient;

    public ProductController(ProductFeignClient productFeignClient) {
        this.productFeignClient = productFeignClient;
    }

    @PostMapping
    public String createProduct(@RequestBody ProductRequest request) {
        // TODO #1: 상품을 생성하는 API 엔드포인트를 구현하세요.
        // 요구사항:
        // - ProductFeignClient를 사용하여 상품을 생성해야 합니다.
        // - 생성된 상품의 ID를 반환해야 합니다.
    }

    @GetMapping("/{productId}")
    public ProductResponse getProduct(@PathVariable String productId) {
        // TODO #2: 특정 상품을 조회하는 API 엔드포인트를 구현하세요.
        // 요구사항:
        // - productId를 기반으로 상품을 조회해야 합니다.
        // - 조회된 상품 정보를 반환해야 합니다.
    }

    @PutMapping("/{productId}")
    public boolean updateProduct(
            @PathVariable String productId,
            @RequestBody ProductRequest request
    ) {
        // TODO #3: 상품 정보를 업데이트하는 API 엔드포인트를 구현하세요.
        // 요구사항:
        // - productId와 새로운 상품 정보를 사용하여 상품을 업데이트해야 합니다.
        // - 업데이트 성공 여부를 반환해야 합니다.
    }
}
