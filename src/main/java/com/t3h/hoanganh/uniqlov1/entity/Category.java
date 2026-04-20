package com.t3h.hoanganh.uniqlov1.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Builder
@Getter
@Setter
@Entity
@Table(name = "categories")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Category extends AbstractAuditingEntity {

    @Column(nullable = false, length = 255)
    String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    Category parent;

    @OneToMany(
            mappedBy = "parent",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    List<Category> children;

    @OneToMany(
            mappedBy = "category",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    List<Product> products;

    Boolean isDeleted;


}
