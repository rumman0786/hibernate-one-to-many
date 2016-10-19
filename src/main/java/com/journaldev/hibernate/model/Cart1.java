package com.journaldev.hibernate.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * @author rumman
 * @since 10/19/16
 */
@Entity
@Table(name="Cart")
public class Cart1 {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="cart_id")
    private long id;

    @Column(name="total")
    private double total;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy="cart1")
    private Set<Items1> items1;

// Getter Setter methods for properties
    public long getId() {
    return id;
}
    public void setId(long id) {
        this.id = id;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<Items1> getItems() {
        return items1;
    }
    public void setItems1(Set<Items1> items) {
        this.items1 = items;
    }
}