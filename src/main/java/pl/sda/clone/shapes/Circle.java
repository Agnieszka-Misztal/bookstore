package pl.sda.clone.shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
//
    @Override
    public double area() {
        return radius * radius;
    }

    @Override
    public double perimeter() {
        return 2*PI*radius;
    }

    @Override
    public void printName() {
//        super.printName();
        System.out.println("I'm a circle!");
    }

    public void printDiamiter(){
        System.out.println("Diamiter is " + this.radius*2);
    }
//
}
