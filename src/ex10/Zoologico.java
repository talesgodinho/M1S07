package ex10;

/*Crie uma classe Zoologico, com 10 jaulas (utilize um array) coloque em cada jaula um animal diferente,
        percorra cada jaula e emita o som e, se o tipo de animal possuir o comportamento, faça-o correr.
        Escreva um programa de teste adequado para esta classe.*/


import ex7.*;

import java.util.ArrayList;

public class Zoologico {

    static ArrayList<Animal> jaulas = new ArrayList<>(10);

    public static void colocarNaJaula(Animal animal){
        jaulas.add(animal);
    }

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Cão 1",3);
        Cachorro cachorro2 = new Cachorro("Cão 2",6);
        Cachorro cachorro3 = new Cachorro("Cão 3",4);
        Cavalo cavalo1 = new Cavalo("Cavalo 1", 7);
        Cavalo cavalo2 = new Cavalo("Cavalo 2", 6);
        Cavalo cavalo3 = new Cavalo("Cavalo 3", 4);
        Preguica preguica1 = new Preguica("Preguiça 1", 5);
        Preguica preguica2 = new Preguica("Preguiça 2", 2);
        Preguica preguica3 = new Preguica("Preguiça 3", 12);
        Preguica preguica4 = new Preguica("Preguiça 4", 8);

        colocarNaJaula(cachorro1);
        colocarNaJaula(cachorro2);
        colocarNaJaula(cachorro3);
        colocarNaJaula(cavalo1);
        colocarNaJaula(cavalo2);
        colocarNaJaula(cavalo3);
        colocarNaJaula(preguica1);
        colocarNaJaula(preguica2);
        colocarNaJaula(preguica3);
        colocarNaJaula(preguica4);

        for (Animal animal : jaulas){
            System.out.print(animal.getClass().getSimpleName() + " " + animal.toString() + " está ");
            animal.emitirSom();
            if (animal instanceof Cachorro || animal instanceof Cavalo) {
                System.out.print(animal.getNome() + " está ");
                animal.movimenta();
            }
        }


    }

}
