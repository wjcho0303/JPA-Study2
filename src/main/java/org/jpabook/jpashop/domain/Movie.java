package org.jpabook.jpashop.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("영화")
public class Movie extends Item {

    private String director;

    private String actor;

}
