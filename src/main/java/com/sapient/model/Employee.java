package com.sapient.model;

//Resource Representation class

public class Employee {

    private long id;
    private String name;
    private String company;

    public void Employee(long id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }
}
