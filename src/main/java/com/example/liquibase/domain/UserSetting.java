package com.example.liquibase.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserSetting {

    private Long id;
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
