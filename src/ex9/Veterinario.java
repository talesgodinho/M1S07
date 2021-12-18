package ex9;

//Implemente uma classe Veterinario que contenha um método examinar() passando como parâmetro de entrada um Animal,
//        quando o animal é examinado ele deve emitir um som, passe os 3 animais com parâmetro.
//        Escreva um programa de teste adequado para esta classe.

import ex7.*;

public class Veterinario {

    public static void examinar(Animal animal){
    System.out.println("Em exame...");
        System.out.print(animal.getClass().getSimpleName() + " " + animal.toString() + " está ");
        animal.emitirSom();
    }

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Dagos", 7);
        Cavalo cavalo = new Cavalo("Talismã", 12);
        Preguica preguica = new Preguica("Fuxirico", 4);

        examinar(cachorro);
        examinar(cavalo);
        examinar(preguica);

    }
}


