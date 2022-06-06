package com.ruanko.entity;

import javax.persistence.*;

@Entity
@Table(name = "problem")
public class Problem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String content;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return  content;
    }

    public void setContent(String content) {
        this.content =content;
    }



}
