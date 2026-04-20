package com.t3h.hoanganh.uniqlov1.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

@Getter
@JsonIgnoreProperties(
        value = {"createdBy", "createdDate", "lastModifiedBy", "lastModifiedDate"},
        allowGetters = true
)
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractAuditingEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @CreatedBy
    @Column(name = "created_by", updatable = false)
    private Integer createdBy;

    @CreatedDate
    @Column(name = "created_date", updatable = false)
    private Instant createdDate;

    @LastModifiedBy
    @Column(name = "updated_by")
    private Integer updatedBy;

    @LastModifiedDate
    @Column(name = "updated_date")
    private Instant updatedDate;


}

