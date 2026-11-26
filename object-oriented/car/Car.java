public class Car {
	//instance variables
    private String make;
    private String model;
    private int year;
    private int speed;
    private String color;
    private double price;
    private static String dealer = "Car Max";//Static variable

    /**
     * default Constructor
     */
    public Car() {

    }
    
    /**
     * Constructor initialize value to variables by parameters
     * @param make
     * @param model
     * @param year
     * @param speed
     * @param color
     * @param price
     */
    public Car(String make, String model, int year, int speed, String color, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.color = color;
        this.price = price;
    }
    
    /**
     * Static method display dealer
     * @return dealer
     */
    public static String displayDealer() {
    	return dealer;
    }
    /**
     * This method set value to make variable
     * @param make
     */
    public void setMake(String make) {
        this.make = make;
    }
    /**
     * this method get the Make value when it called
     * @return make value
     */
    public String getMake() {
        return this.make;
    }

    /**
     * This method set value to model variable
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * this method get the model value when it called
     * @return model value
     */
    public String getModel() {
        return this.model;
    }

    /**
     * This method set value to year variable
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * this method get the year value when it called
     * @return year value
     */
    public int getYear() {
        return this.year;
    }

    /**
     * This method set value to speed variable
     * @param speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * this method get the speed value when it called
     * @return speed value
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * This method set value to color variable
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * this method get the color value when it called
     * @return color value
     */
    public String getColor() {
        return this.color;
    }

    /**
     * This method set value to price variable
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * this method get the price value when it called
     * @return price value
     */
    public double getPrice() {
        return this.price;
    }
    /**
     * This method increase speed value to 10 every time it called
     */
    public void accel() {
    	
    	 if(this.speed < 100) {
             this.speed += 10;
         } else {
             System.out.println("Caution! you may get a ticket!");
          	this.speed = 100;
         }
    }
    /**
     * This method increase speed value by plus x every time it called
     * @param x
     */
    public void accel(int x) {
        if((this.speed + x) < 100) {
            this.speed += x;
        } else {
            System.out.println("Caution! you may get a ticket!");
        	this.speed = 100;
        }
    }
    /**
     * This method decrease speed value to 10 every time it called
     */
    public void brake() {
    	if (speed < 0) {
            System.out.println("Speed cannot be negative");
            speed = 0;
        } else {
            speed -= 10;
        }
    }
    /**
     * This method decrease speed value by minus x every time it called
     * @param x
     */
    public void brake(int x) {
    	if ((speed - x) < 0) {
            System.out.println("Speed cannot be negative");
            speed = 0;
        } else {
            speed -= x;
        }
    }
    /**
     * This method display features of car when it called
     */
    public void displayFeatures(){
        System.out.println("Your car make: " + make);
        System.out.println("Your car model: " + model);
        System.out.println("Your car year: " + year);
        System.out.println("Your car speed: " + speed);
        System.out.println("your car color: " + color);
        System.out.println("Your car price: " + price);
    }
}
