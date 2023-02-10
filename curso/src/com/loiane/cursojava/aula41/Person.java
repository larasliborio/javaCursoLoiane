package com.loiane.cursojava.aula41;

public abstract class Person {
    private String name;
    private String address;
    private String cpf;
    private String phone;
    protected String visibility;

    public Person() {
        visibility = "sfhdgifukgsiufd";

    }

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

    public void visibility(String visibility) {
        this.visibility = visibility;
    }

    public String  getaddress() {
        return address;
    }






}
