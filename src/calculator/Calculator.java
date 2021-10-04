/*
 * /*Tort Juliette 
*EXO1 calculator
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author 33782
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operator; 
        int operande1;
        int operande2;
        float resultat = 0; 
        System.out.println("please enter the operator:\n1) add \n2) substract \n3) multiply \n4) divide \n5) modulo");
    System.out.println("entrer une valeur entière?");
    Scanner sc;
    sc = new Scanner(System.in);
    operator = sc.nextInt();
    System.out.println("entrer une premiere valeur?");
    operande1 = sc.nextInt();
    System.out.println("entrer une deuxieme valeur?");
    operande2 = sc.nextInt();
    if (operator==1)
        resultat= operande1+operande2;
    if (operator ==2)
        resultat = operande1-operande2;
    if (operator ==3)
        resultat = operande1*operande2;
    if (operator ==4)
        resultat = operande1/operande2;
    if (operator ==5)
        resultat = operande1%operande2;
    else 
      if (operator>5)
        System.out.println("ERREUR");
         break;
    
      System.out.println(resultat);
            
        }

    
    }
    
