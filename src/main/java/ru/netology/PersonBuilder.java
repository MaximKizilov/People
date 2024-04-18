package ru.netology;


public class PersonBuilder {
    private String name;
    private String surName;
    private Integer age;
    private String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surName) {
        this.surName = surName;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        if (age != null && age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surName == null) {
            throw new IllegalStateException("Недостаточно информации для создания объекта Person");
        }
        return new Person(name, surName, age, address);
    }

}
