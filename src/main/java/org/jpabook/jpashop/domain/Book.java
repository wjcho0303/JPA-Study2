package org.jpabook.jpashop.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("책")
public class Book extends Item {

    private String author;

    private String isbn;

}
