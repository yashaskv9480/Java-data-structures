package Oops;

class Animal {
    // Method in the superclass
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    // Overriding the makeSound method from the superclass
    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }

    // This method is not an override, it's a new method in Dog
    public void fetch() {
        System.out.println("Fetching the ball");
    }
}

public class override {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();  // Output: Generic animal sound

        Dog myDog = new Dog();
        myDog.makeSound();  // Output: Bark! Bark!
        myDog.fetch();      // Output: Fetching the ball

        // Polymorphism: Using a Dog reference to an Animal object
        Animal myAnimal = new Dog();
        myAnimal.makeSound();  // Output: Bark! Bark! (dynamic method dispatch)
    }
}
