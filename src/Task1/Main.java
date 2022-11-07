package Task1;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter positiv number generate");
        try (Scanner sc = new Scanner(System.in)) {
            size = sc.nextInt();
        }
        List<Object> numbersPositiv = new Random().ints(0,
                350).limit(size).boxed().collect(Collectors.toList());
        System.out.println(numbersPositiv);

        System.out.println("Enter negativ number generate");
        try (Scanner sc = new Scanner(System.in)) {
            size = sc.nextInt();
        }
        List<Object> numbersNegativ = new Random().ints(-350,
                0).limit(size).boxed().collect(Collectors.toList());
        System.out.println(numbersNegativ);

    }

}
