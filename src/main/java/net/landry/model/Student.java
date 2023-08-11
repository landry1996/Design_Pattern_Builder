package net.landry.model;

public class Student {
    // instance fields
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // Setter Methods
    // Note that all setters method
    // return this reference
    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setAddress(String address) {
        this.address = address;
        return this;
    }


}
