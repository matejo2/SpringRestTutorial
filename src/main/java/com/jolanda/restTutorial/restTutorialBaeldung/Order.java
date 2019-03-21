package com.jolanda.restTutorial.restTutorialBaeldung;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "CUSTOM_ORDER")
public class Order {

    @Id
    @GeneratedValue
    private long id;

    private String description;
    private Status status;

    Order(String description, Status status) {

        this.description = description;
        this.status = status;
    }

}
