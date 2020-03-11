package com.bertamalfitano.teagenerator.model;

import javax.persistence.*;

public class Tea {


    private int id;
    private String teaGrade;
    private String teaType;
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
