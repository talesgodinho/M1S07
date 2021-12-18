package ex8;

/*Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e
        invoque o método que emite o som de cada um de forma polimórfica, isto é,
        independente do tipo de animal. Escreva um programa de teste adequado para esta classe.*/


import ex7.*;

import java.util.ArrayList;

public class Main {

     public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Dagos", 7);
        Cavalo cavalo = new Cavalo("Talismã", 12);
        Preguica preguica = new Preguica("Fuxirico", 4);

         ArrayList<Animal> animais = new ArrayList<>();

         animais.add(cachorro);
         animais.add(cavalo);
         animais.add(preguica);

         for (Animal animal : animais){
             System.out.print(animal.getClass().getSimpleName() + " " + animal.toString() + " está ");
             animal.emitirSom();
         }

    }
}
