package br.com.fernando.java_orientacao_objetos.classe;

import java.util.Random;

public class Person {
    public String name;
    public Integer age;
    public String cpf;

    protected void falar() {
    }

    private void see() {
    }

    public void say() {
        System.out.println("Hello World");
    }

    public static String copaAmerica(){
      return new Random().nextLong() + "";
    }
}
