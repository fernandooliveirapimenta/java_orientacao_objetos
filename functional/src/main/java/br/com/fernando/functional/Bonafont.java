package br.com.fernando.functional;

import br.com.fernando.funcional.BonafonteScala;

import java.util.ArrayList;

public class Bonafont {

    public static void main(String[] args) {
        var f = new ArrayList<>();

        System.out.println(f);

        Fernando fefe = (ano, fim) -> ano + fim + 0.0;

        System.out.println(fefe.idade(3,3));

        System.out.println(test(50, 30, (ano, fim) -> ano - fim + 0.0));
        BonafonteScala.falar();
    }

    public static Double test(int i, int b, Fernando f){
        return f.idade(i, b);
    }

    public static void oi(){
        System.out.println("oi");
    }

    public static void oi(String valor){
        System.out.println(valor);
    }
}


@FunctionalInterface
interface Fernando{
    Double idade(int ano, int fim);
}

