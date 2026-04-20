package com.t3h.hoanganh.uniqlov1.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Getter
@Setter
@Entity
@Table(name = "product_images")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class ProductImage extends AbstractAuditingEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "color_id")
    Color color;

    @Column(name = "image_url", nullable = false, length = 255)
    String imageUrl;

    @Column(name = "is_main")
    @Builder.Default
    Boolean isMain = false;

    @Column(name = "sort_order")
    @Builder.Default
    Integer sortOder = 0;

}
