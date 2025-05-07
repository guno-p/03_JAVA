package ch16.exam02;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        // Suplier 계열 : 매개변수 X, 반환형 O
        // - 값을 제공

        Supplier<Double> supplier = () -> Math.PI;
        Supplier<String> nameSupplier = () -> "신짱구";

        IntSupplier randomSupplier = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };

        System.out.println("supplier.get() = " + supplier.get());
        System.out.println("name: " + nameSupplier.get());
        System.out.println();
        System.out.println("random 1: " + randomSupplier.getAsInt());
        System.out.println("random 2: " + randomSupplier.getAsInt());
        System.out.println("random 3: " + randomSupplier.getAsInt());
    }
}
