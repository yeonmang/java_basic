package day15.poly.basic;
class Bus extends Vehicle {}
class Taxi extends Vehicle {}

class Student{
    Vehicle vehicle;
    void goToSchool(){
        vehicle = new Taxi();
    }
}

public class Vehicle {
}
