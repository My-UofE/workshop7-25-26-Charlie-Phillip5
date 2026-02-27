public class Rectangle extends Shape{
    private double width;
    private double height;
    private String colour;

    public Rectangle(){}
    public Rectangle(double width, double height, String colour){
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public double getWidth(){return width;}
    public double getHeight(){return height;}

    @Override
    public double area(){
        return width * height;
    }
    @Override
    public double perimeter(){
        return 2 * (width + height);
    }

    @Override
    public String toString(){
        return String.format("Rectangle[width=%.2f,height=%.2f,color=%s,area=%.2f,perimeter=%.2f]", width, height, colour, area(), perimeter());
    }
    @Override
    public boolean equals(Object obj){
        if (obj.getClass()==getClass()){
            if (obj.width == width && obj.height == height && obj.colour == colour){
                return true;
            }
        }
        return false;
    }

}