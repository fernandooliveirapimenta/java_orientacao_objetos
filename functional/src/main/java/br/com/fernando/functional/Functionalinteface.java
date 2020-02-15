package br.com.fernando.functional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Functionalinteface {

    public static void main(String[] args) {

        EstojoFechar f = (z) -> System.out.println(z.nome);
        f.fechar(new Ziper());


        testaFunctionalVoid((z)
                -> System.out.println("novo"));

        //Recebe dois argumentos e retorna um
        BiFunction<Ziper, Integer, String>
                b = (z, i) -> "sucesso";
        System.out.println(b.apply(new Ziper(), 33));

        Supplier<LocalDate> dataHoje = LocalDate::now;

        System.out.println(dataHoje.get());


//        final Stream<String> generate = Stream.generate(() -> "Fernando");

//        generate.forEach(System.out::println);

        int[] fibs = {0, 1};
        Stream<Integer> fibonacci = Stream.generate(() -> {
            int result = fibs[1];
            int fib3 = fibs[0] + fibs[1];
            fibs[0] = fibs[1];
            fibs[1] = fib3;
            return result;
        });

        Consumer<Double> dc = System.out::println;

        Predicate<String> solteiro = s -> s.equals("solteiro");
        Predicate<Integer> maior = idade -> idade > 18;


        System.out.println(solteiro
                .and(s -> s.equals("solteiro"))
                .test("solteiro"));

        //Operators

        var names = new ArrayList<>(
                Arrays.asList("bob", "josh", "megan")
        );

        names.replaceAll(String::toUpperCase);
        names.
                removeIf(n -> n
                        .equalsIgnoreCase("megan"));

        names.forEach(System.out::println);

        var m = Map.of("2", "33",
                "ff", "dd");


        Thread t = new Thread(
                () -> System.out.println("Fernando")
        );

        t.start();



    }

    static void testaFunctionalVoid(EstojoFechar e) {
        e.fechar(new Ziper());
    }


}

@FunctionalInterface
interface EstojoFechar{

    void fechar(Ziper z);

}

class Ziper {
    String nome;
}

