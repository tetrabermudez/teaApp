package com.bertamalfitano.teagenerator.model;

import javax.persistence.*;

@Entity
@Table(name = "tea")
public class Tea {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "grade")
    private String teaGrade;

    @Column(name = "type")
    private String teaType;

    @Column(name = "country_of_origin")
    private String teaCountryOfOrigin;



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTeaGrade() {
        return teaGrade;
    }
    public void setTeaGrade(String teaGrade) {
        this.teaGrade = teaGrade;
    }
    public String getTeaType() {
        return teaType;
    }
    public void setTeaType(String teaType) {
        this.teaType = teaType;
    }
    public String getTeaCountryOfOrigin() {
        return teaCountryOfOrigin;
    }
    public void setTeaCountryOfOrigin(String teaCountryOfOrigin) {
        this.teaCountryOfOrigin = teaCountryOfOrigin;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "id=" + id +
                ", teaGrade='" + teaGrade + '\'' +
                ", teaType='" + teaType + '\'' +
                ", teaCountryOfOrigin='" + teaCountryOfOrigin + '\'' +
                '}';
    }
}
