package Person;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String fullName;
    private int age;

    public Person(){}

    public Person(String fullName){
        setFullName(fullName);
    }
    public  Person (int age ){
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                '}';
    }





    @Override
    public int compareTo(Person o) {
        return o.getAge();
    }


}
