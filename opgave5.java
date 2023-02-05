public class opgave5 {

        public void main(String[] args) {
            Car car = new Car("Model X Tesla", 50000);
            Driver driver = new Driver("Lasse Lasse", 26);

            driver.drive(car);
            car.start();
            car.move();
            car.stop();
        }
    }

     class Car {
        private String model;
        private int price;

        public Car(String model, int price) {
            this.model = model;
            this.price = price;
        }

        public void start() {
            System.out.println("Starting the car");
        }

        public void stop() {
            System.out.println("Stopping the car");
        }

        public void move() {
            System.out.println("Moving the car");
        }

        public String getModel() {
            return model;
        }

        public int getPrice() {
            return price;
        }
    }

    class Driver {
        private String name;
        private int age;

        public Driver(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void drive(Car car) {
            System.out.println("Driving the car " + car.getModel());
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

