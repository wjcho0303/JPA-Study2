package org.jpabook.jpashop.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("앨범")
public class Album extends Item {

    private String artist;

}
