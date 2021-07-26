package com.example.simpleProject.entities;


import javax.persistence.*;

@Entity
@Table(name ="TestDataBase")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String userName;
    private String password;
    private boolean active;
    private String role;


    public UserEntity(long id, String userName, String password, boolean active, String role) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.role = role;
    }

    public UserEntity() {
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", role='" + role + '\'' +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId()
    {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



}
