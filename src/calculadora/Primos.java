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
public class Primos {
    int a;
    int b;
    Scanner ingreso=new Scanner(System.in);
    public void ingreso (){
        System.out.println("Ingrese Primer Numero");
        a=ingreso.nextInt();
        System.out.println("Ingrese Segundo Numero");
        b=ingreso.nextInt();
    }
    public void calcularPrimos(){
        int j=a;
              
        while (j<=b){
        int i=1;
        int contador=0;
          while (i<=j){
              if (j%i==0){
                  contador=contador+1;
              }
              i=i+1;
          }  
          if (contador==2){
              System.out.println(j);
          }
          j=j+1;
        }
      }
    }

