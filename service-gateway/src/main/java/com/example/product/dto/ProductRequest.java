package com.example.product.dto;

import lombok.Data;

@Data
public class ProductRequest {
    // TODO #1: 상품 생성 요청을 처리하는 DTO 클래스를 구현하세요.
    // 요구사항:
    // - name: 상품의 이름
    // - price: 상품의 가격
    private String name;
    private long price;
}