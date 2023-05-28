/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacio1;

import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class Estructures_alternatives_II {
    
    public static void main(String[]Args){
    
    Scanner teclat = new Scanner(System.in);
  
        
    // ex1 - Escriu un programa que llegeixi tres números enters i ens digui quin és el valor més gran.
        
    /*    System.out.println("Anomena el primer numero:");
        int numero1 = teclat.nextInt();
        System.out.println("Anomena el segon numero:");
        int numero2 = teclat.nextInt();
        System.out.println("Anomena el tercer numero:");
        int numero3 = teclat.nextInt();
        
        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("El numero mes gran es: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("el numero mes gran es: " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2);
                   System.out.println("El numero mes gran es: " + numero3);
     */
    
    // ex2 - Escriu un programa que simuli una calculadora simple. El programa llegeix dos enters i un caràcter. Si el caràcter és un + s’imprimeix la suma, si és un – la resta, si és un * el producte, si és un / la divisió entera i si és un %, el mòdul.
    
    /*               
        char operador;
        Double num1, num2, resultat;

        System.out.println("Tria un operador: +, -, *, /");
        operador = teclat.next().charAt(0);

        System.out.println("Primer numero:");
        num1 = teclat.nextDouble();

        System.out.println("Segon numero:");
        num2 = teclat.nextDouble();

        switch (operador) {
      // SUMA 
        case '+':
        resultat = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + resultat);
        break;

      // RESTA
        case '-':
        resultat = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + resultat);
        break;

      // Multiplicacio
        case '*':
        resultat = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + resultat);
        break;

      // Divisio 
        case '/':
        resultat = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + resultat);
        break;

        default:
        System.out.println("Operador Incorrecte!");
        break;
        }
    */
        
        
    // ex3 - Escriu un programa en el qual a partir d’una data inicial llegida per teclat amb el format dia, mes, any (guardats amb variables diferents), ens digui la data del dia següent.
    
    /*    System.out.println("Dia actual ??");
        int Dia = teclat.nextInt();
        
        System.out.println("Mes actual ??");
        int Mes = teclat.nextInt();
        
        System.out.println("Any actual ??");
        int Any = teclat.nextInt();
        */
    
    // ex4 - Els treballadors d’una fàbrica treballen en dos torns: diürn i nocturn. Es vol calcular el salari d’un dia d’acord amb els següents punts:
    
    int dia, mes, any, diaActual;
    
        System.out.println("introduieix el dia");
        dia = teclat.nextInt();
        System.out.println("Introdueix el mes:");
        mes = teclat.nextInt();
        System.out.println("introdueix l'any: ");
        any = teclat.nextInt();
        
        diaActual = (dia) + (mes) + (any);
        System.out.println("Dia actual:" + diaActual);
    
    }
}



    
    
    

    



    
   
