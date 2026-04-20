package com.t3h.hoanganh.uniqlov1.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Getter
@Setter
@Entity
@Table(name = "sizes")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Size extends AbstractAuditingEntity{

    @Column(name = "size_code", nullable = false, length = 20)
    String sizeCode;

}
