package com.t3h.hoanganh.uniqlov1.entity;

import com.t3h.hoanganh.uniqlov1.enums.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends AbstractAuditingEntity {

    @Column(name = "full_name", length = 100)
    String fullName;

    @Column(nullable = false, unique = true, length = 255)
    String email;

    @Column(name = "password_hash", nullable = false, length = 255)
    String passwordHash;

    LocalDate birthday;

    @Enumerated(EnumType.STRING)
    Gender gender;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    Set<Role> roles;

    @Column(length = 500)
    String avatar;

}
