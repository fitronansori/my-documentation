class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    String sayHello(String name) {
        String greeting = "Hello, " + name + " " + "my name is " + this.name;
        return greeting;
    }
}
