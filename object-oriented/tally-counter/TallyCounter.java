public class TallyCounter {
	//instance variables
    private int counter = 0;
    private String color;
    
    
    //mutators
    public void setCounter(int count){
        this.counter = count;
    }
    
    //accessors 
    public int getCounter() {
        return this.counter;
    }
    
    //mutators
    public void setColor(String color) {
        this.color = color;
    }
    
    //accessors 
    public String getColor() {
        return this.color;
    }
    /**
     *increase counter
     */
    public void increaseCounter() {
        counter++;
    }
    /**
     * display counter
     */
    public void displayCounter() {
        System.out.println(counter);
    }
    
    /**
     * display color
     */
    public void displayColor() {
        System.out.println(color);
    }
}
