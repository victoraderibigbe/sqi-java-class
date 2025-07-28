class Person {
    String name;
    int age;

    Person() {
        this.name = "Nifemi Adeniyi";
        this.age = 8;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }

    public void printAge() {
        System.out.println("Age: " + age);
    }

    public void printInfo() {
        System.out.println("Your name is " + name + " and you are " + age + " years old.");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.printName();
        person1.printAge();
        person1.printInfo();

        System.out.println("\n--------------------\n");

        Person person = new Person("Victor Aderibigbe", 10);
        person.printName();
        person.printAge();
        person.printInfo();
    }
}
