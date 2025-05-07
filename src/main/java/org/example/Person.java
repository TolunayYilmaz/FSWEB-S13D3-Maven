package org.example;

public class Person {

    String firstName;
    String lastName;
    int age;
    int size;
    int kilo;
    boolean health;
    public  Person(String firstName, String lastName,int age){
     this.firstName=firstName;
     this.lastName=lastName;
     this.age=age;

    }
    public  Person(String firstName, String lastName,int age,int size,int kilo,boolean health){
       this(firstName,lastName,age);
       this.size=size;
       this.kilo=kilo;
       this.health=health;

    }
    public String getFirstName(){
        return  this.firstName;
    }
    public String getLastName(){
        return  this.lastName;
    }
    public int getAge(){
        return  this.age;
    }
    public boolean isTeen(){
        if(age>=13&&age<=19){
            return true;
        }
        else{
            return  false;
        }
    }
}
