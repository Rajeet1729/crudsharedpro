package com.example.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import javax.persistence.*;



@Entity
@Table(name = "tbl_employee")
@NoArgsConstructor
public class Model {
    @Column(name = "Professor_name",nullable = false)
    private String Professor_name;
    @Column(name = "City",nullable = false)
    private String City;
    @Column(name = "Bithdate")
    private int Birthdate;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Department_id;



    public Model(String professor_name, String city, int birthdate, int department_id) {
        this.Professor_name = professor_name;
        this.City = city;
        this.Birthdate = birthdate;
        this.Department_id = department_id;
    }


    public String getProfessor_name() {
        return Professor_name;
    }

    public void setProfessor_name(String professor_name) {
        Professor_name = professor_name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(int birthdate) {
        Birthdate = birthdate;
    }

    public int getDepartment_id() {
        return Department_id;
    }

    public void setDepartment_id(int department_id) {
        Department_id = department_id;
    }

    @Override
    public String toString() {
        return "model{" +
                "Professor_name='" + Professor_name + '\'' +
                ", City='" + City + '\'' +
                ", Birthdate=" + Birthdate +
                ", Department_id=" + Department_id +
                '}';
    }
}
