package ru.netology;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surName;
    protected Integer age;
    protected String city;


    public Person(String name, String surName, Integer age, String city) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.city = city;
    }


    public PersonBuilder newChildBuilder() {
        PersonBuilder builder = new PersonBuilder();
        builder.setSurname(surName);
        builder.setAge(null);
        builder.setAddress(city);
        return builder;
    }

    public boolean hasAge() {
        return age != null;

    }

    public boolean hasAddress() {
        return city != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surName;
    }

    public OptionalInt getAge() {
        return age != null ? OptionalInt.of(age) : OptionalInt.empty();
    }

    public String getAddress() {
        return city;
    }

    public void setAddress(String address) {
        this.city = address;
    }

    public void happyBirthday() {
        if (age != null) {
            age++;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surName, person.surName) && Objects.equals(age, person.age) && Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, age, city);
    }


}
