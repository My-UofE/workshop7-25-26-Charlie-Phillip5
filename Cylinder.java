/*
 * A Cylinder is a Circle plus a height.
 */

// Task 1a. Edit the definition to make Cylinder a subclass of Circle
//         

public class Cylinder extends Circle {
    
    // Task 1b. add additional private height attribute (double)
    private double height;

    // Task 2. add code to define the following four constructors
    // no-arg constructor (set height to 1.0)
    // 1-arg constructor (set height to the given value)
    // 2-arg constructor (set height and radius to the given values)
    // 3-arg constructor (set height, radius, and color to the given values)
    public Cylinder(){
        this.height = 1.0;
    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double height, double radius){
        this.height = height;
        setRadius(radius);
    }
    public Cylinder(double height, double radius, String colour){
        this.height = height;
        setRadius(radius);
        setColor(colour);
    }
    // Task 3. add getter and setter for height
    // (methods for radius and color are inherited)
    public double getHeight(){return height;}
    public void setHeight(double height){this.height = height;}

    // Task 4. add code for method getVolume()
    // make use of superclass' getArea() method
    public double getVolume(){
        return super.getArea() * height;
    }
 
    // Task 5. Override toString() method to describe itself
    // (output format should be in line with format: Cylinder[Circle[...],height=X.XX]
    public String toString(){
        return String.format("Cylinder[Circle[radius=%.2f,color=%s]],height=%.2f", getRadius(), getColor(), height);
    }
    
    @Override
    public double getArea(){
       return 2 * getRadius() * Math.PI * (getRadius()+height);
    }

    // instance method
    public void printClassInfo(){
    System.out.println("It is a Cylinder class");
    }

    // static method
    public static void printClassInfoStatic(){
    System.out.println("It is a Cylinder class");
    }
 }