package com.t3h.hoanganh.uniqlov1.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Entity
@Getter
@Setter
@Table(name = "visit_stats")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class VisitStat extends  AbstractAuditingEntity{

    @Column(name = "visit_count", nullable = false)
    @Builder.Default
    Long visitCount = 0L;

}
