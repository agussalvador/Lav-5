package Model;

import Interfaces.Drink;
import Interfaces.Urinate;

public class Human {

    //Attributes
    private String name;
    private int age;
    private float weight;

    //Constructor

    public Human(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    //Custom methods


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
