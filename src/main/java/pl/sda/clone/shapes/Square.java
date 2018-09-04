package pl.sda.clone.shapes;

public class Square extends Shape{
    //
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double area(){
        return a*a;
    }

    public double perimeter(){
        return 4*a;
    }
    //
}
