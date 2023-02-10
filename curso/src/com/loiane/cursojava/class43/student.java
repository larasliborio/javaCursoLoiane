package com.loiane.cursojava.class43;

public class student  {
    private String name;
    private String address;
    private String cpf;
    private String phone;
    private String course;
    private double[] grades;

    public void check() {
       

    }

    public student() {
       super();
    }

    public student(String name, String address, String phone, String course) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.course = course;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Maria leonor";
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String curso) {
        this.course = curso;
    }

    public void metodoQualquer() {
       
    }

    public void  getGrades(double grades) {
        
    }

    public void setGrades(Double grades) {
    
    }
}
