package ar.com.ada.online.second.exercisenine;

/*
    Una compañía de seguros para autos ofrece dos tipos de póliza: cobertura amplia (A) y
daños a terceros (B). Para el plan A, la cuota base es de $1,200, y para el B, de $950. A
ambos planes se les carga 10% del costo si la persona que conduce tiene por hábito
beber alcohol, 5% si utiliza lentes, 5% si padece alguna enfermedad –como de- ficiencia
cardiaca o diabetes–, y si tiene más de 40 años, se le carga 20%, de lo contrario sólo
10%. Todos estos cargos se realizan sobre el costo base. Realice diagrama de flujo que
represente el algoritmo para determinar cuánto le cuesta a una persona contratar una
póliza
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Definición de variables
        Scanner keyboard = new Scanner(System.in);
	    char coverageType; //Puede ser Amplia (A) ó Daños a terceros (B)
        int coveragePrice; // Ya sea 1200 o 950
        char alcoholConsume; //Bebe alcohol?
        char visualDeficiency; //Utiliza lentes?
        char additionalDiseases; //Tiene alguna enfermedad adiciona?
        int age; //Edad del asegurado
        int percent = 0 ;
        double totalCost; //Costo total del asegurado

        //Llenado de factores
        System.out.println("Por favor ingrese el tipo de cobertura deseado, ingrese A si se desea cobertura amplia \n" +
                "o de lo contrario ingrese B si se desea solamente cobertura de daños a terceros: ");
        coverageType = keyboard.next().charAt(0);

        System.out.println("¿El asegurado bebe alcohol? ingrese S para SI o N para NO: ");
        alcoholConsume = keyboard.next().charAt(0);

        System.out.println("¿El asegurado utiliza lentes? ingrese S para SI o N para NO: ");
        visualDeficiency = keyboard.next().charAt(0);

        System.out.println("¿El asegurado padece padece deficiencia cardiaca o diabetes? ingrese S para SI o N para NO:");
        additionalDiseases = keyboard.next().charAt(0);

        System.out.println("Ingrese la edad:");
        age = keyboard.nextInt();

        //Precio de cobertura
        if(coverageType == 'A'){
            coveragePrice = 1200;
        } else {
            coveragePrice = 950;
        }

        //Calculo de porcentaje extra
        if(alcoholConsume == 'S'){
            percent = 10;
        } if (visualDeficiency == 'S'){
            percent += 5;
        } if (additionalDiseases == 'S'){
            percent += 5;
        } if (age > 40){
            percent += 20;
        } else{
            percent += 10;
        }

        //Calculo de resultado
        totalCost = (coveragePrice * (100 + percent))/100 ;

        //impresión
        System.out.println("El costo total de la cobertura es de: $" + totalCost);

    }
}
