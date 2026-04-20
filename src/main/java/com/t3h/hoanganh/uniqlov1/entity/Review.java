package com.t3h.hoanganh.uniqlov1.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Getter
@Setter
@Entity
@Table(name = "reviews")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Review extends AbstractAuditingEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sku_id")
    ProductSku sku;

    @Column(nullable = false)
    Byte rating;

    @Column(columnDefinition = "TEXT")
    String comment;

    @Column(name = "user_height", length = 50)
    private String userHeight;

    @Column(name = "user_weight", length = 50)
    private String userWeight;

    @Column(name = "fit_status", length = 50)
    private String fitStatus;

}
