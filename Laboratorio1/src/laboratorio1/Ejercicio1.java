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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        int horas;
        int costo;
        int sueldomensual;
        double descuento;
        System.out.println("Ingrese el numero de horas");
        horas = entrada.nextInt();
        System.out.println("Ingrese el costo oficial");
        costo = entrada.nextInt();
        sueldomensual = horas*costo;
        descuento = sueldomensual*0.10;
        //System.out.printf("el sueldo mensual es:",sueldomensual);
        System.out.println("Su suedo mensual es: "+sueldomensual+"\nSu "
                + "descuento es: " +descuento);
              
               
                
                

       
    }
    
}
