package ch07.sec12;

public class Temp {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Cat();

        for(Animal a : animals) {
            if (a instanceof Dog) {
                ((Dog)a).sound();
            } else if (a instanceof Cat) {
                ((Cat)a).sound();
            }
            else {
                a.sound();
            }
        }
//      동적 바인딩
//      상속의 깊이가 길어질수록 효과 증대
        animals[0].sound();
        animals[1].sound();
        animals[2].sound();

    }
}
