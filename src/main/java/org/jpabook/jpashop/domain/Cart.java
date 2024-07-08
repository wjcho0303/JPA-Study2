package org.jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Cart extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
