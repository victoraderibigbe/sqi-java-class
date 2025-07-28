class Car {
    String make;
    String model;
    int year;

    Car() {
        this("Toyota", "Venza");
    }

    Car(String make, String model) {
        this(make, model, 2019);
    }

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void printInfo() {
        System.out.println("Your car is " + make + ", " + model + " model and its manufacture date is " + year + ".");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.printInfo();
    }
}
