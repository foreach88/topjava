package com.topjava.model;

public class BaseEntity {
    protected Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isNew() {
        this.id = null;
    }
}
