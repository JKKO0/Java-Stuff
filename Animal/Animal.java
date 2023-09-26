public class Animal {
    private String name;
    private int age;
    private String species;

    public static void main(String[] args) {

        Animal ANI = new Animal("Bob", 3, "Tiger");
        Dog dogg = new Dog("Tyson", 5, "Dog", "Golden Retriever");
        Cat Catt = new Cat("Simba", 4, "Cat", "Orange");

        ANI.eat();
        dogg.eat();
        dogg.bark();
        Catt.eat();
        Catt.meow();
    }

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void eat() {
        System.out.println("I am eating");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String species, String breed) {
        super(name, age, species);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    private String furColor;

    public Cat(String name, int age, String species, String furColor) {
        super(name, age, species);
        this.furColor = furColor;
    }

    public void meow() {
        System.out.println("Meow!");
    }
}

