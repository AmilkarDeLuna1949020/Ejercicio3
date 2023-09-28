//Amilkar Jhair De Luna Palacios
//Ejercicio 3

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    private List<Card> cards;

    public Main() {
        cards = new ArrayList<>();
        String[] palos = {"tréboles", "corazones", "picas", "diamantes"};
        String[] colores = {"rojo", "negro"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String palo : palos) {
            for (String color : colores) {
                for (String valor : valores) {
                    cards.add(new Card(palo, color, valor));
                }
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (!cards.isEmpty()) {
            Card card = cards.remove(0);
            System.out.println(card);
            System.out.println("Quedan 51 cartas en el deck.");
        } else {
            System.out.println("El deck está vacío.");
        }
    }

    public void pick() {
        if (!cards.isEmpty()) {
            Random random = new Random();
            int index = random.nextInt(cards.size());
            Card card = cards.remove(index);
            System.out.println(card);
            System.out.println("Quedan 50 cartas en el deck.");
        } else {
            System.out.println("El deck está vacío.");
        }
    }

    public void hand() {
        if (cards.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Card card = cards.remove(0);
                System.out.println(card);
            }
            System.out.println("Quedan 45 cartas en el deck.");
        } else {
            System.out.println("No hay suficientes cartas en el deck para repartir una mano de cinco cartas.");
        }
    }

    public static void main(String[] args) {
        Main deck = new Main();
        deck.shuffle();
        deck.head();
        deck.pick();
        deck.hand();
    }
}

class Card {
    private String palo;
    private String color;
    private String valor;

    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    public String toString() {
        return palo + "," + color + "," + valor;
    }
}





