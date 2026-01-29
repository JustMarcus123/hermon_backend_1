package com.hermon_backend_1.hermon_backend_1.Entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table (name = "members")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column (nullable = false, unique = true)
    private String email;

    private String phone;

}
