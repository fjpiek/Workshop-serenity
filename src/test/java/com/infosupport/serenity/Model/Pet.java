package com.infosupport.serenity.Model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Pet {
    private String name;
    private String status;
    private int id;

    public Pet(String status, String name) {
        this.status = status;
        this.name = name;
    }

}
