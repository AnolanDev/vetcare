package com.gus.vetcare.models;

public class VetModel extends UserModel {

    private String degree;
    private String grad_year;
    private String university;

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getGrad_year() {
        return grad_year;
    }

    public void setGrad_year(String grad_year) {
        this.grad_year = grad_year;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
