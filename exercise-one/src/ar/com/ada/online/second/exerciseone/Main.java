package ar.com.ada.online.second.exerciseone;
/*Se desea implementar un algoritmo para determinar cuál de dos valores
proporcionados es el mayor. Representarlo con pseudocódigo y diagrama de flujo.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int firstNumber, secondNumber;

        Scanner keyboard = new Scanner(System.in);

        firstNumber = keyboard.nextInt();
        secondNumber = keyboard.nextInt();

        if (firstNumber>secondNumber){
            System.out.println("El número mayor es: " + firstNumber);
        }else{
            System.out.println("El número mayor es: " + secondNumber);
        }


    }
}
