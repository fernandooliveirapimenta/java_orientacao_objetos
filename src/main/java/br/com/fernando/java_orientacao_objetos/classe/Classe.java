package br.com.fernando.java_orientacao_objetos.classe;

public class Classe {
    public static void main(String[] dfs) {
        Form f = new Ball();
        f.doIt();

        Person person = new Person();
        person.name = "Fernando";
        person.age=23;
        person.cpf = "##3.3555.555";

        person.say();
        System.out.println(Person.copaAmerica());
    }
}

class Ball extends Square {
    @Override
    void doI2t() {
    }
}

abstract class Square implements Form{
   abstract void doI2t();
    @Override
    public void doIt() {
        System.out.println("Square");
    }
}

interface Form {
    void doIt();
}
