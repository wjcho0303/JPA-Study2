package org.jpabook;

import org.jpabook.jpashop.domain.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDateTime;

public class JpaShop {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Address address1 = new Address("서울특별시", "강서구 까치산로1길", "115-115");
            AddressEntity addressEntity1 = new AddressEntity(address1);
            Member member1 = new Member();
            member1.setName("홍길동");
            member1.setHomeAddress(address1);

            member1.getFavoriteFoods().add("치킨");
            member1.getFavoriteFoods().add("피자");
            member1.getFavoriteFoods().add("햄버거");

            member1.getAddressHistory().add(addressEntity1);

            em.persist(member1);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();

    }
}