public class RectangularDemo {
    public static void main (String[] args) {
        Rectangular box1 = new Rectangular();
        Rectangular box2 = new Rectangular(4, 5);
        Rectangular box3 = box1;

        System.out.println("Box 1");
        box1.setLength(10);
        box1.setWidth(20);
        box1.getDimensions();
        System.out.println("---------------------------");
        System.out.println("Box 2");
        box2.getDimensions();
        System.out.println("---------------------------");
        System.out.println("Box 3");
        box3.setLength(50);
        box3.setWidth(40);
        box3.getDimensions();


    }
}
