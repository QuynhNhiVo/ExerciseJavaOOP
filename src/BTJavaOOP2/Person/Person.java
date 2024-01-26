package BTJavaOOP2.Person;

public class Person {
    public String name = "Anh";
    public int age = 22;
    public String gender = "Male";
    protected String address = "Ha Noi";
    protected int phone = 123456789;

    public Person() {
    }

    public Person(String name, int age, String gender, String address, int phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public void getInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(address);
        System.out.println(phone);
    }

    public static void main(String[] args) {

    }
}
