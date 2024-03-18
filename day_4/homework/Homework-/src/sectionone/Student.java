package sectionone;

public class Student extends Person {
    @Override
    public void speak () {
        super.speak();
        System.out.println("Hello, I am a student");
    }

    public void Student () {
        super.Person();
    }
}


