package com.study.jpa.chap01_basic.entity;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.cglib.core.Local;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="tbl_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "prod_id")
    private long id;
    @Column(name = "prod_name", nullable = false, length = 30)
    private String name;

    @Builder.Default
    private int price = 0; // 디폴트값 지정

    @Enumerated(EnumType.ORDINAL)
    private Category category;

    @CreationTimestamp // 현재 시간
    @Column(updatable = false) // 등록시간을 수정못하게 설정
    private LocalDateTime createdDate;

    @UpdateTimestamp // 업데이트가 돌아갈 때 자동으로 들어감
    private LocalDateTime updatedDate;


    public enum Category{
        FOOD, FASHION, ELECTRONIC
    }

}
