package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //OPDRACHT 2.1
        System.out.println("opdracht 2.1\n");
        System.out.print("Typ het aantal mijlen: ");
        double mijlen = scanner.nextDouble();
        double kilometers = mijlen * 1.6;
        int tussenstap = (int) (kilometers * 10);
        kilometers = tussenstap / 10.0;
        System.out.println(mijlen + " mijlen is " + kilometers + " kilometer\n\n");

        //OPDRACHT 2.2
        System.out.println("Opdracht 2.2\n");
        System.out.print("Hoeveel jaar oud ben je? ");
        int leeftijdInJaren = scanner.nextInt();
        System.out.print("Hoeveel maanden komen daar nog bij? ");
        int leeftijdInMaanden = scanner.nextInt();
        int leeftijdInMinuten = leeftijdInJaren * 365 * 24 * 60 + leeftijdInMaanden * 30 * 24 * 60;
        System.out.println("Dan ben je nu ongeveer " + leeftijdInMinuten + " minuten oud");

        //OPDRACHT 2.3
        System.out.println("Opdracht 2.3\n");
        System.out.print("Wat is het startbedrag? ");
        double startbedrag = scanner.nextDouble();
        System.out.print("Typ het rentepercentage: ");
        double rente = scanner.nextDouble();
        double renteBedrag = rente / 100 * startbedrag;
        double totaalBedrag = startbedrag + renteBedrag;
        System.out.println("Het startbedrag is " + startbedrag + " En het totaal bedrag is: " + totaalBedrag + "\n\n");

        //OPDRACHT 2.4
        System.out.println("Opdracht 2.4\n ");
        System.out.print("Typ een getal tussen 10 en 100: ");
        int userInput = scanner.nextInt();
        int buurman1 = userInput - 2;
        int buurman2 = userInput - 1;
        int buurman3 = userInput + 1;
        int buurman4 = userInput + 2;
        System.out.println("De vijf getallen zijn " + buurman1 + " - " + buurman2 + " - " + userInput + " - " + buurman3 + " - " + buurman4 + "\n\n");

        //OPDRACHT 2.5
        System.out.println("Opdracht 2.5\n");
        System.out.print("Typ een getal tussen de 0 en 1000: ");
        userInput = scanner.nextInt();

        int lastDigit = userInput % 10;
        userInput = userInput / 10;

        int middleDigit = userInput % 10;
        userInput = userInput / 10;

        int firstDigit = userInput;

        int product = firstDigit * middleDigit * lastDigit;

        System.out.println("De vermenigvuldiging van de cijfers luidt: " + firstDigit + " x " + middleDigit + " x " + lastDigit + " = " + product + "\n\n");



    }

}