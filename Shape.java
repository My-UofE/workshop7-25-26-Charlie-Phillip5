public abstract class Shape{
    private String colour;

    public Shape(){}
    public Shape(String colour){ this.colour = colour; }

    public String getColour(){return colour;}
    public void setColour(String colour){this.colour = colour;}

    public abstract double area();
    public abstract double perimeter();
}