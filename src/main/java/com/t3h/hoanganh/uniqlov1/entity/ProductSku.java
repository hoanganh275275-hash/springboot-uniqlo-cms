package com.t3h.hoanganh.uniqlov1.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Builder
@Entity
@Table(name = "product_skus")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductSku extends AbstractAuditingEntity{

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;

    @ManyToOne
    @JoinColumn(name = "size_id")
    Size size;

    @Column(name = "sku_code", unique = true, length = 100)
    String skuCode;

    @Column(name = "original_price", nullable = false, precision = 15, scale = 2)
    BigDecimal originalPrice;

    @Column(name = "sale_price", precision = 15, scale = 2)
    BigDecimal salePrice;

    @Column(name = "stock_quantity")
    @Builder.Default
    Integer stockQuantity = 0;

}
