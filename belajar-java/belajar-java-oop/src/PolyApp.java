public class PolyApp {
    public static void main(String[] args) {
        // polymorphism = banyak bentuk (sifat dari OOP)
        
        Employee employee = new Employee("Aditya");
        employee.sayHello("Budi");

        employee = new Manager("Aditya");
        employee.sayHello("Budi");

        employee = new VicePresident("Aditya");
        employee.sayHello("Budi");
    }
}
