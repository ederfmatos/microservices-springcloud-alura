package com.ederfmatos.provider.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity(name = "provider_address")
public final class Address {

    @Id
    private String id;
    private String street;
    private Long number;
    private String city;
    private String uf;

    @OneToOne(mappedBy = "address")
    private Provider provider;

}
