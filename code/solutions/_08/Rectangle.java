package solutions._08;

public class Rectangle extends Shape
{
    //# Fields
    private double width;
    private double height;


    //# Constructors
    public Rectangle(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    //# Getter-methods
    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }


    //# Setter-methods
    public void setWidth(double value) {
        this.width = value;
    }

    public void setHeight(double value) {
        this.height = value;
    }

    //# Methods-methods
    public double getArea() {
        return this.getWidth()*this.getHeight();
    }

    public double getPerimeter() {
        return this.getWidth()*2 + this.getHeight()*2;
    }
}