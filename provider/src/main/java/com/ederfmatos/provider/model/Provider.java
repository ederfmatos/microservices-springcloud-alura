package com.ederfmatos.provider.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity(name = "providers")
public final class Provider {

    @Id
    private String id;

    private String name;

    @OneToOne
    @JoinColumn(name = "address")
    private Address address;

}
