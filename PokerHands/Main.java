package PokerHands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       // Multiple ranks
       // Cards have certain values.
       
       // Card written as <val><card family>

       // The hands for each player.
       ArrayList<ArrayList<String>> allHands = readHands("p054_poker.txt");

    }

    public static ArrayList<ArrayList<String>> readHands(String fileName) {

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));

            String line = br.readLine();
            while (!line.equals(null)) {
                String[] cards = line.split(" ");
                if (cards.length == 10) {

                    // Add player 1 hand.
                    for (int i = 0; i < 5; i++) {
                        player1.add(cards[i]);
                    }

                    // Add player 2 hand.
                    for (int i = 5; i < 10; i++) {
                        player2.add(cards[i]);
                    }

                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("BufferedReader for " + fileName + " not working");
        } catch (IOException e) {
            System.out.println("Cannot read line from " + fileName);
        }

        ArrayList<ArrayList<String>> allHands = new ArrayList<>();
        allHands.add(player1);
        allHands.add(player2);

        return allHands;

    }

    public boolean player1Wins() {
        return false;
    }
}
