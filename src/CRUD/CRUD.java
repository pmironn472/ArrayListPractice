package CRUD;

import Person.Person;


import java.util.ArrayList;
import java.util.Collections;

public class CRUD {


    private static ArrayList<Person> person = new ArrayList<>();
    private static ArrayList<Person> names = new ArrayList<>();

    public static void insert() {

        person.add(new Person("Ja0"));
        person.add(new Person("Ja1"));
        person.add(new Person("Ja2"));
        person.add(new Person("Ja3"));
        person.add(new Person("Ja4"));
        person.add(new Person("Ja5"));

    }

    public static void print() {
        person.forEach(name -> {
            System.out.println(name.getFullName());
        });
    }

    public static void delete() {
        person.remove(person.get(3));
    }

    public static void add() {
        person.add(new Person("Ja6"));
    }


    public static void swap(String name) {
        person.get(3).setFullName(name);
    }

    public static void equals() {

        names.add(new Person("Ja0"));
        names.add(new Person("Ja1"));
        names.add(new Person("Ja2"));
        names.add(new Person("Ja"));
        names.add(new Person("J"));
        names.add(new Person("J"));
        int i = 0;
        while (i < 6) {
            if (names.get(i).getFullName().equals(person.get(i).getFullName())) {
                System.out.println(names.get(i).getFullName() + " equals " + person.get(i).getFullName() + " ---> True");
            } else {
                System.out.println(names.get(i).getFullName() + " equals " + person.get(i).getFullName() + " ---> False");
            }
            i++;
        }

    }

    public static void find() {
        names.add(new Person("Ja0"));
        names.add(new Person("Ja1"));
        names.add(new Person("Ja2"));
        names.add(new Person("Ja"));
        names.add(new Person("J"));
        names.add(new Person("J"));
        int i = 0;
        while (i < 6) {
            if (names.get(i).getFullName().equals(person.get(2).getFullName())) {
                System.out.println("We find " + person.get(2).getFullName() + " in the Arrays names --->  " + names.get(i).getFullName());
                return;
            }

            i++;
        }

    }

    public static void sort() {

        person.add(new Person(23));
        person.add(new Person(20));
        person.add(new Person(21));
        person.add(new Person(27));
        person.add(new Person(28));
        person.add(new Person(26));

        int temp = 0;
        for (int i = 0; i < person.size(); i++) {
            for (int j = 1; j < (person.size() - i); j++) {
                if (person.get(j - 1).getAge() > person.get(j).getAge()) {
                    //swap elements
                    temp = person.get(j - 1).getAge();
                    person.get(j - 1).setAge(person.get(j).getAge());
                    person.get(j).setAge(temp);
                }

            }
        }
            person.forEach(name -> {
                if(name.getAge() !=0 )
                System.out.println("The ages are sorted like this ---> " + name.getAge());
            });


    }
}


