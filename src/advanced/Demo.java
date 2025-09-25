package advanced;

import labactivity1.Student;

public class Demo {
    public static void main(String[] args) {

        Car car = new Car("toyota", "vios", 400, 1.6);
        car.getEngine().displayEngine();
        car.displayInfo();
    }
}
