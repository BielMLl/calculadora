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
    
    }
}



    
    
    

    



    
   
