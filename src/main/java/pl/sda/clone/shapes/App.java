package pl.sda.clone.shapes;

public class App {
    public static void main(String[] args) {
//
        Circle newCircle = new Circle(5);
        newCircle.printName();
        System.out.println("Circle area is " + newCircle.area());

        Shape circle1 = new Circle(3);
        circle1.printName();
        System.out.println("Circle area is " + circle1.area());
        ((Circle) circle1).printDiamiter();

        Square newSquare = new Square(10);
        newSquare.printName();
        System.out.println("Square area is " + newSquare.area());
//

    }
}
