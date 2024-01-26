package BTJavaOOP2.Company;

import BTJavaOOP2.Person.Person;

public class Company {
    public static void main(String[] args) {
        Person person = new Person("Phuong", 12, "Female", "Ho Chi Minh", 22312141);
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);
    }
}
