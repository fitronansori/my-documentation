// Extenion Method adalah cara untuk menambahkan method ke class yang sudah ada

class Person {
  String name;
  int age;
  final String country = "Indonesia";

  Person(this.name, this.age);

  @override
  String toString() {
    return 'Name: $name, Age: $age';
  }
}

// membuat extension method
extension PrintHello on Person {
  String sayHello() {
    return "Hello $name, I'm $age years old from $country";
  }
}

void main() {
  var person = Person("Fitron", 22);
  print(person.sayHello());
  print(person);
}
