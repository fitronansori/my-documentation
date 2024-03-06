import 'package:test/test.dart';

import '../bin/class.dart';

void main() {
  group('Person', () {
    test('sayHello should return a greeting message', () {
      var person = Person("Fitron", 22);
      expect(person.sayHello("Budi"),
          equals('Hello Budi, I\'m Fitron 22 years old from Indonesia'));
    });

    test('toString should return a string representation of the person', () {
      var person = Person("Fitron", 22);
      expect(person.toString(), equals('Name: Fitron, Age: 22'));
    });
  });
}
