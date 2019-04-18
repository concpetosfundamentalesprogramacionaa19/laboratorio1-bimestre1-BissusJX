/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        String Nota1;
        String Nota2;
        String Nota3;
        
        System.out.println("Ingrese la nota 1");
        Nota1 = entrada.nextLine();
        System.out.println("Ingrese la nota 2");
        Nota2= entrada.nextLine();
        System.out.println("Ingrese la nota 3");
        Nota3 = entrada.nextLine();
       double N1= Double.parseDouble(Nota1);
       double N2= Double.parseDouble(Nota2);
       double N3= Double.parseDouble(Nota3);
       double promedio;
       promedio = (N1+N2+N3)/3;
       
       String r = promedio>14 ? "Usted paso el año": "Usted no paso "
               + "el año";
        System.out.printf("%s\n",r);
       
    }
    
}
