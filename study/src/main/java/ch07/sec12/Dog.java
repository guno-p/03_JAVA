package ch07.sec12;

public class Dog extends Animal {
    public Dog() {
        super.name = "Kong";
    }

    @Override
    public void sound() {
        System.out.println(name + ": BarkBark");
    }
}
