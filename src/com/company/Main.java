package com.company;

public class Main {

    public static void main(String[] args) {
	    coche miCoche = new coche();
        miCoche.NumPuertas();
        miCoche.NumPuertas();
        miCoche.NumPuertas();
        System.out.println("El coche tiene: " + miCoche.puertas + " puertas.");
    }
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

class coche {
    public  int puertas = 0;

    public void  NumPuertas() {
        this.puertas++;
    }

}