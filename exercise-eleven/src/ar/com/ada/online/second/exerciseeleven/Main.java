package ar.com.ada.online.second.exerciseeleven;

/* . Se les dará un bono por antigüedad a los empleados de una tienda. Si tienen un año, se
les dará $100; si tienen 2 años, $200, y así sucesivamente hasta los 5 años. Para los que
tengan más de 5, el bono será de $1000. Realice un algoritmo y represéntelo mediante el
diagrama de flujo y el pseudocódigo que permita determinar el bono que recibirá un
trabajador.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Variables
        int seniority, bonus;

    //ingreso de antiguedad
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese la antigüedad laboral: ");
        seniority = keyboard.nextInt();

        //Calculo del bono a pagar
        if(seniority>5){
            bonus = 1000;
        } else{
            bonus = seniority * 100;
        }
        //Impresión de resultado
        System.out.println("El bono es de: $" + bonus);
    }
}
