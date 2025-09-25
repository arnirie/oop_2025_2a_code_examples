package advanced;

public class Car {
    private String maker;
    private String model;
    private Engine engine;
    private static int counter;

    class Engine{
        int horsepower;
        private double displacement;
        private boolean isRunning;

        Engine(int horsepower, double displacement){
            this.horsepower = horsepower;
            this.displacement = displacement;
            isRunning = false;
        }

        void displayEngine(){
            System.out.println("HP " + this.horsepower);
        }
    }

    {
        maker = "";
        model = "";
        System.out.println("init called");
    }

    static {
        counter = 10;
        System.out.println("static init called");
    }

    Car(String maker, String model, int hp, double disp){
        //setMaker(maker);
        this.maker = maker;
        this.model = model;
        this.engine = new Engine(hp, disp);
        counter++;
        System.out.println("constructor called");
    }

    Car setMaker(String maker){
        this.maker = maker;
        return this;
    }

    Car setModel(String model){
        this.model = model;
        return this;
    }

    Engine getEngine(){
        return this.engine;
    }

    protected void displayInfo(){
        class Message{
            void displayMessage(){
                System.out.println(maker);
                System.out.println("this is a special message");
            }
        }
        Message m = new Message();
        m.displayMessage();
    }

    static void displayCounter(){
        System.out.println(counter);
    }

}

