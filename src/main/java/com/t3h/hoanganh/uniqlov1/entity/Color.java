package com.t3h.hoanganh.uniqlov1.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Entity
@Table(name = "colors")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Color extends AbstractAuditingEntity {

    @Column(name = "color_code", nullable = false, length = 50)
    String colorCode;

    @Column(name = "hex_code", length = 10)
    String hexCode;

}
