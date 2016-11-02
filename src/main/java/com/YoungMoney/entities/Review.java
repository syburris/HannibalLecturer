package com.YoungMoney.entities;

import javax.persistence.*;

/**
 * Created by stevenburris on 11/2/16.
 */
@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String author;

    @Column(nullable = false)
    String text;

    @Column(nullable = false)
    boolean isGood;

    @ManyToOne
    Lecturer lecturer;

}
