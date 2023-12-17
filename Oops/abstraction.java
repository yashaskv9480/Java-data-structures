package Oops;

public class abstraction {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.display();

        Square square = new Square();
        square.draw();
        square.display();
    }
}

abstract class Shape {
    // Abstract method (no implementation)
    public abstract void draw();

    // Regular method with an implementation
    public void display() {
        System.out.println("Displaying the shape.");
    }
}

class Circle extends Shape {
    // Implementation of the abstract method
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square extends Shape {
    // Implementation of the abstract method
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}



