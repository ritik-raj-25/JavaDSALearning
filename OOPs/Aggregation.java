package OOPs;

class Address {
    private String city;
    private String state;
    private String country;

    public Address(String city, String state, String country){
        this.city = city;
        this.state= state;
        this.country = country;
    }

    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getCountry(){
        return country;
    }
}

class Employee_ {
    private int id;
    private String name;
    private Address address; // Employee_ "has-a" Address

    public Employee_(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display(){
        System.out.println(id+", "+name);
        System.out.println(address.getCity()+", "+address.getState()+", "+address.getCountry());
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Address a1 = new Address("Vellore", "Tamil Nadu", "India");

        Employee_ e1 = new Employee_(261, "Ritik Raj", a1);
        e1.display();
    }
}
