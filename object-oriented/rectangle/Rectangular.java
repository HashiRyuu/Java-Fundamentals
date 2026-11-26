public class Rectangular {
	//instance variables
    private int length;
    private int width;

    //needs to create default constructor when create a overloading constructure
    public Rectangular (){

    }
    
    /**
     * Constructor initialize value to variables by parameters
     * @param length
     * @param width
     */
    public Rectangular (int length, int width) {
        this.length = length;
        this.width = width;
    }

    /**
     * This method set value length by parameter
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * this method get value of Length
     * @return length value
     */
    public int getLength() {
        return this.length;
    }
    
    /**
     * This method set value width by parameter
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * This method get value of width
     * @return width value
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * This method calculate and return value
     * @return Area value
     */
    public int getArea() {
        return this.length * this.width;
    }

    /**
     * This method calculate and return value
     * @return perimeter value
     */
    public int getPerimeter() {
        return (this.length + this.width) * 2;
    }

    /**
     * this method display values
     */
    public void getDimensions() {
        System.out.println("The Dimension is: " + this.length + " x " + this.width + " ft.");
        System.out.println("The length is: " + this.length + " ft.");
        System.out.println("The width is: " + this.width + " ft.");
        System.out.println("The Area is: " + getArea() + " sq. ft.");
        System.out.println("The Perimeter is: " + getPerimeter() + " ft.");
    }

}
