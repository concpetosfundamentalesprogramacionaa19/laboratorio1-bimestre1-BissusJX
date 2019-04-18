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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        String Variablex;
        String Variabley;
        String Variablez;
        
        System.out.println("ingrese la variable x");
        Variablex = entrada.nextLine();
        System.out.println("ingrese la variable y");
        Variabley = entrada.nextLine();
        System.out.println("ingrese la variable z");
        Variablez = entrada.nextLine();
       double x= Double.parseDouble(Variablex);
       double y= Double.parseDouble(Variabley);
       double z= Double.parseDouble(Variablez);
       double m;
        m = x+(y/z)/x-(y/z);
        //System.out.println("el resultado es \n" +m);
        System.out.printf("el valor de m en base a las variables:\nx=%.1f"
                + "\n\ty= %1f\n\t\t z= %1f",x,y,z);
        System.out.printf("\nda como resultado \nm: %.2f\n", m);
    }
    
}
