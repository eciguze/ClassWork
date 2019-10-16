package javaguru.Lesson3;

import java.awt.*;
import java.time.LocalDate;

public class Dog {
    private int yearOfBirth;
    private String name;
    private Color color;

    public Dog(String name,int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
        this.name = name;
    }

    public Dog(String name, Color color) {
        this.name = name;
        this.color = color;
    }
    public String getName(){
        return this.name;
    }
    public Color getColor(){
        return this.color;
    }


    public int getAge(){
        int age = LocalDate.now().getYear() - yearOfBirth;
        return age;
    }

    public void voice(){
        System.out.println("vau vau");
    }
    public void eat(){
        System.out.println("nom nom");
    }
    public void sleep(){
        System.out.println("zzzzzzz...");
    }

}

