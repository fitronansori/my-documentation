class Person {
  // field
  String name;
  int age;
  final String country = "Indonesia";

  // constructor
  Person(this.name, this.age);

  // method
  String sayHello(String other) {
    return "Hello $other, I'm $name $age years old from $country";
  }

  @override
  String toString() {
    return 'Name: $name, Age: $age';
  }
}

void main() {
  // membuat objek dari class Person
  var person = Person("Fitron", 22);
  print(person.sayHello("Budi"));
  print(person);
}
