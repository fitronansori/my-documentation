public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Fitron", "lombok");

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        System.out.println(person.sayHello("Eko"));
    }
}
