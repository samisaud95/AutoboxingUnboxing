//Scrivere una funzione che accetti in input 2 int e ne stampi la somma
//Scrivere una funzione che accetti in input 1 char lo stampi
//Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
//Scrivere una funzione che accetti in input 1 Character lo stampi
//Scrivere un un valore primitivo per int, double e char e fare autoboxing
//Scrivere un oggetto per Integer, Double e Character e fare Unboxing
//Usare le funzioni scritte con i valori creati

public class Main {
    public static void main(String[] args) {
        sommaInt(5,7);
        controlloChart('o');
        sommaInteger(9,1);
        stampaChar('s');
        autoboxing();
        unboxing();
    }
    public static void sommaInt(int a,int b) {
        int somma = a + b;
        System.out.println("La somma di due int è:" + somma);
    }
    public static void controlloChart(char c) {
        System.out.println("Il carattere acettati è :" + c);
    }
    public static void sommaInteger(Integer x, Integer y) {
        int somma = x + y;
        System.out.println("La somma di due Integer è :" + somma);
    }
    public static void stampaChar(char c) {
        System.out.println("Il carattere acettati è :" + c);
    }
    public static void autoboxing() {
        int valInt = 42;
        Integer oggettoInteger = valInt;

        double valDouble = 3.14;
        Double oggettoDouble = valDouble;

        char valChar = 'A';
        Character oggettoCharacter = valChar;

        System.out.println("Il autoboxing Integer è:" + valInt);
        System.out.println("Il autoboxing Double è :" + valDouble);
        System.out.println("Il autoboxing Char è :" + valChar);
    }

    public static void unboxing() {
        Integer oggetoInteger =42;
        Double oggettoDouble = 3.14;
        Character oggettoCharacter = 'A';

        int valInt=oggetoInteger;
        double valDouble= oggettoDouble;
        char valChar= oggettoCharacter;

        System.out.println("Il Unboxing Integer è:" + valInt);
        System.out.println("Il Unboxing Double è :" + valDouble);
        System.out.println("Il Unboxing Char è :" + valChar);

    }
}
