package net.landry.model.stu2;

class Student {

    // final instance fields
    private final int id;
    private final String name;
    private final String address;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {

        return address;
    }

    public Student(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
    }

    // Static class Builder


    @Override
    public String toString()
    {
        return "id = " + this.id + ", name = " + this.name +
                ", address = " + this.address;
    }
}