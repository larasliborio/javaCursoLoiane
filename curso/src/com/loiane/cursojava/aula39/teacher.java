package com.loiane.cursojava.aula39;

public class teacher extends Person {
    private String name;
    private String address;
    private String cpf;
    private String phone;
    private String course;
    private double wage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getcourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String get() {
        return address;
    }

    public void wage(Double wage) {
        this.wage = wage;
    }
}
