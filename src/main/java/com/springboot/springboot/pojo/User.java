package com.springboot.springboot.pojo;

import javax.persistence.*;

@Entity  //告诉springboot这是一个实体类，而不是一个普通的javaBean
@Table(name = "jpa_user")  //用@table来指引和那个数据库表对于，包括自动创建。如果省略表名就是类名小写
public class User {

    //配置映射关系
    @Id  //表名这是一个主键
    @GeneratedValue  //自增
    private Integer id;

    @Column
    private String name;
    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
