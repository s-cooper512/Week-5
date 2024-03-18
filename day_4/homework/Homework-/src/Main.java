import sectionone.GraduateStudent;
import sectionone.Person;
import sectionone.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Person person1 = new Person();
        GraduateStudent gradStudent1 = new GraduateStudent();

        student1.speak();
        person1.speak("ur mom");
        gradStudent1.speak();
    }
}