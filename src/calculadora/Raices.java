/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class Raices {
    int a;
    int b;
    int c;
    double r;
    double Raiz1;
    double Raiz2;
    public void ingresarCoef (){
        Scanner ingreso=new Scanner(System.in);       
        System.out.println("Ingrese primer coeficiente");
        a=ingreso.nextInt();
        System.out.println("Ingrese segundo coeficiente");
        b=ingreso.nextInt();
        System.out.println("Ingrese tercer coeficiente");
        c=ingreso.nextInt();
    }
    public void calcularRaices (){
        r = Math.pow(b,2)-(4*a*c);
        if (r < 0)
	{
          System.out.println("Raices Imaginarias");
        }
        else
	{
        Raiz1= (-b + Math.sqrt(r)) / 2 * a;
        Raiz2= (-b - Math.sqrt(r)) / 2 * a;
        System.out.println(Raiz1);
        System.out.println(Raiz2);
        }
    }
}
