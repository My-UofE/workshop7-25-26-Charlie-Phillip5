public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    private String colour

    public Triangle(){}
    public Triangle(double a, double b, double c, String colour){
        this.a = a;
        this.b = b;
        this.c = c;
        this.colour = colour;
    }
    public double getSideA(){return a;}
    public double getSideB(){return b;}
    public double getSideC(){return c;}

    @Override
    public double area(){
        double semi_perim = (a + b + c)/2.0;
        return Math.pow(semi_perim((semi_perim - a)*(semi_perim - b)*(semi_perim-c)),0.5);
    }

    @Override
    public double perimeter(){
        return a+b+c;
    }

    @Override
    public String toString(){
        return String.format("Triangle[a=%.2f,b=%.2f,c=%.2f,color=%s,area=%.2f,perimeter=%.2f]", a, b, c, colour, area(), perimeter());
    }
    @Override
    public boolean equals(Object obj){
        if (obj.getClass()==getClass()){
            if (obj.a == a && obj.b == b && obj.c == c && obj.colour == colour){
                return true;
            }
        }
        return false;
    }
}