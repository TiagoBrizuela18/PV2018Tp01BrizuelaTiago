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
public class Sumatoria {
    int a;
    public void ingreso(){
        Scanner ingreso=new Scanner (System.in);
        System.out.println("Ingrese num");
        a=ingreso.nextInt();
    }
    public void realizSumatoria(){
        int i=1;
        int resultado=0;
        while (i<=a){
            resultado=resultado+2*i-1;
            i++;
        }
        System.out.println(resultado);
    }
    

       
}
