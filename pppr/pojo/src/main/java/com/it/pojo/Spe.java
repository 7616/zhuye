package com.it.pojo;

import java.io.Serializable;

public class Spe implements Serializable {

    private Integer id;
    private String speName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpeName() {
        return speName;
    }

    public void setSpeName(String speName) {
        this.speName = speName;
    }


    @Override
    public String toString() {
        return "Spe{" +
                "id=" + id +
                ", speName='" + speName + '\'' +
                '}';
    }
}
