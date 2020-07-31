package ar.com.ada.online.second.exercisetwo;

/*Realice un algoritmo para determinar si un número es positivo o negativo.
Represéntelo en pseudocódigo y diagrama de flujo*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int number;

        Scanner keyboard = new Scanner(System.in);

        number = keyboard.nextInt();

        if (number >= 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }
    }
}
