package net.landry.model;

public class Person {

    public String name;
    public String surname;


    private Person( PersonBuilder personBuilder){
        this.name=personBuilder.name;
        this.surname=personBuilder.surname;
    }
    public static class PersonBuilder{
        public String name;
        public String surname;

        public PersonBuilder() {
        }

        public PersonBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        public PersonBuilder withName(String name){
            this.name = name;
            return this;
        }
        public PersonBuilder withSurname(String surname){
            this.surname = surname;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

    }


}
