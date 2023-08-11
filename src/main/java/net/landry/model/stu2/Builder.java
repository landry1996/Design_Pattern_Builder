package net.landry.model.stu2;

public  class Builder {

    /// instance fields
    public int id;
    public String name;
    public String address;

    public static Builder newInstance()
    {
        return new Builder();
    }

    private Builder() {}

    // Setter methods
    public Builder setId(int idb)
    {
        this.id = idb;
        return this;
    }
    public Builder setName(String name)
    {
        this.name = name;
        return this;
    }
    public Builder setAddress(String address)
    {
        this.address = address;
        return this;
    }



    // build method to deal with outer class
    // to return outer instance
    public Student build()
    {
        return new Student(this);
    }
}
