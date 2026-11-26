public class CarDemo {
    public static void main(String[] args) {
        Car adamCar = new Car();
        Car sarahCar = new Car( "Lamborgini",  "SVJ",  2023,  80,  "green", 100000);
        Car toyota = adamCar;

        System.out.println("Car 1");
        adamCar.setColor("blue");
        System.out.println(adamCar.getColor());
        adamCar.setMake("Bugati");
        adamCar.setModel("Diva");
        adamCar.setYear(2023);
        adamCar.setPrice(100000000);
        adamCar.setSpeed(90);
        adamCar.displayFeatures();
        System.out.println("Accel!");
        adamCar.accel();
        System.out.println(adamCar.getSpeed());
        adamCar.accel();
        System.out.println(adamCar.getSpeed());
        adamCar.accel(100);
        System.out.println(adamCar.getSpeed());
        System.out.println("Brake!");
        adamCar.brake();
        System.out.println(adamCar.getSpeed());
        adamCar.brake(20);
        System.out.println(adamCar.getSpeed());
        adamCar.brake(100);
        System.out.println(adamCar.getSpeed());
        System.out.println("Dealer: " + Car.displayDealer());
       
        System.out.println("------------------------------");
        
        System.out.println("Car 2");
        sarahCar.displayFeatures();
        System.out.println("Accel!");
        sarahCar.accel();
        System.out.println(sarahCar.getSpeed());
        sarahCar.accel();
        System.out.println(sarahCar.getSpeed());
        sarahCar.accel(100);
        System.out.println(sarahCar.getSpeed());
        System.out.println("Brake!");
        sarahCar.brake();
        System.out.println(sarahCar.getSpeed());
        sarahCar.brake(100);
        System.out.println(sarahCar.getSpeed());
        
        System.out.println("------------------------------");
        
        System.out.println("Car 3");
        System.out.println(adamCar.getColor());
        System.out.println(toyota.getColor());
        System.out.println(adamCar);
        System.out.println(toyota);
        toyota.setMake("Toyota");
        toyota.setColor("White");
        toyota.setSpeed(90);
        toyota.setPrice(50000);
        toyota.displayFeatures();
    }
}
