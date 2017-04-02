package com.example.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zsj on 2017/3/20.
 */
@Entity   //该bean对应数据库中的一张表
public class User {

    @Id   //主键
    @GeneratedValue  //自增字段
    private Integer id;

    private String username ;

    private String password ;


    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
