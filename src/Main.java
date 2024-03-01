import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        float MarsWagaWszeborowski=0.0F;
        float WagaZiemskaWszeborowski = 70.0F;
        double WynikWszeborowski;
        int IntWszeborowski;
        char CharWszeborowski;
        int NewIntWszeborowski;

        int RandomWszeborowski = (int)((Math.random() * (100 -1)) + 1);

        int NumberofBricksWszeborowski = (int)((Math.random() * (100 -50)) + 50);
        while(NumberofBricksWszeborowski % 2 == 0){
            NumberofBricksWszeborowski = (int)((Math.random() * (100 -50)) + 50);
        }
        int bricksInBucketWszeborowski = (int)((Math.random() * (10 -5)) + 5);
        while(bricksInBucketWszeborowski % 2 != 0){
            bricksInBucketWszeborowski = (int)((Math.random() * (10 -5)) + 5);
        }

        final BigDecimal priceWszeborowski = new BigDecimal("9.99");
        final BigDecimal vatWszeborowski = new BigDecimal("1.23") ;
        final BigDecimal grossWszeborowski = priceWszeborowski.multiply(vatWszeborowski).setScale(2, RoundingMode.HALF_UP);
        final BigDecimal saleWszeborowski = new BigDecimal("10000");

        MarsWagaWszeborowski = WagaZiemskaWszeborowski * 0.38F;
        System.out.println("Obliczona waga na marsie: ");
        System.out.println(MarsWagaWszeborowski);
        System.out.println("Z floata na double: ");
        WynikWszeborowski = MarsWagaWszeborowski;
        System.out.format("%.4f%n",WynikWszeborowski);
        IntWszeborowski = (int)WynikWszeborowski;
        System.out.println("Z double na inta: ");
        System.out.println(IntWszeborowski);
        CharWszeborowski = (char)IntWszeborowski;
        System.out.println("Z inta na char: ");
        System.out.println(CharWszeborowski);
        NewIntWszeborowski = CharWszeborowski * 4;
        System.out.println("Działanie na char i wrzucone do int");
        System.out.println(NewIntWszeborowski);


        if(RandomWszeborowski % 2 == 0){
            System.out.println("Wylosowana liczba: " + RandomWszeborowski + " Jest parzysta");
        }
        else{
            System.out.println("Wylosowana liczba: " + RandomWszeborowski + " Jest nie parzysta");
        }

        System.out.println("Liczba klocków: " + NumberofBricksWszeborowski + " Pojemność pojemnika: " + bricksInBucketWszeborowski);
        System.out.println("Liczba pełnych pojemników: " + (NumberofBricksWszeborowski/bricksInBucketWszeborowski) + " Ilość klocków w nie zapełnionym pojemniku: " + NumberofBricksWszeborowski % bricksInBucketWszeborowski + "Wszystkich pojemników jest: " + (NumberofBricksWszeborowski/bricksInBucketWszeborowski + 1));

        System.out.println("Koszt wszystkich sprzedanych: " + (grossWszeborowski.multiply(saleWszeborowski).setScale(2, RoundingMode.HALF_UP)));

    }
}