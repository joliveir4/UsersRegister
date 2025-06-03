package dev.joao.UserRegister;

import jakarta.persistence.*;


// @Entity: Marks this class as a JPA entity, meaning it maps to a table in the database.
@Entity

// @Table(name = "tb_register"): Specifies the name of the table in the database that this entity will be mapped to.
// In this case, it's mapped to a table called "tb_register".
@Table(name = "tb_register")
public class UserModel {

// @Id: Marks this field as the primary key of the entity.
    @Id

// @GeneratedValue: Indicates that the ID value will be generated automatically (usually auto-incremented by the database).
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Integer age;

    public UserModel() {
    }

    public UserModel(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
