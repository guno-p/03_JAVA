package ch07.sec12;

public class Cat extends Animal{
    public Cat() {
        super.name = "Yomy";
    }

    @Override
    public void sound() {
        System.out.println(name + " : Nyah");
    }
}
