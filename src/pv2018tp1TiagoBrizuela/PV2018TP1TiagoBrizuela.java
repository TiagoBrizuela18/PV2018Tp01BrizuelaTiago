/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pv2018tp1TiagoBrizuela;

import calculadora.Circulo;
import calculadora.Impares;
import calculadora.Primos;
import calculadora.Raices;
import calculadora.Sumatoria;
import calculadora.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class PV2018TP1TiagoBrizuela{
    
    public static void main(String[] args) {
        puntos();
        }
        public static void puntos(){
            int opcion;
            int b;
            int h;
            int l1;
            int l2;
            int l3;
            double r;
            Scanner ingreso=new Scanner(System.in);
            System.out.println("Ingrese Una Opcion");
            System.out.println("1: Primer Problema");
            System.out.println("2: Segundo Problema");
            System.out.println("3: Tercer Problema");
            System.out.println("4: Cuarto Problema");
            System.out.println("5: Quinto Problema");
            opcion=ingreso.nextInt();
            switch (opcion){
                case 1: Impares mostrarImpares=new Impares();
                        mostrarImpares.Impares();
                        break;
                case 2: Sumatoria operarSum=new Sumatoria();
                        operarSum.ingreso();
                        operarSum.realizSumatoria();
                        break;
                case 3: Triangulo calcularValores=new Triangulo();
                        System.out.println("Ingrese base y altura");
                        b=ingreso.nextInt();
                        h=ingreso.nextInt();
                        System.out.println("Ingrese los 3 lados");
                        l1=ingreso.nextInt();
                        l2=ingreso.nextInt();
                        l3=ingreso.nextInt();
                        System.out.println("perimetro: "+calcularValores.calcularPerimetro(l1, l2, l3));
                        System.out.println("area: "+calcularValores.calcularArea(b, h));
                        Circulo calcularValoresCirc=new Circulo();
                        System.out.println("Ingrese radio de circulo");
                        r=ingreso.nextDouble();
                        System.out.println("area: "+calcularValoresCirc.calcularArea(r));
                        System.out.println("perimetro: "+calcularValoresCirc.calcularPerimetro(r));    
                        break;
                case 4: Primos ingresarext=new Primos();
                        ingresarext.ingreso();
                        ingresarext.calcularPrimos();
                        break;
                case 5: Raices raices=new Raices();
                        raices.ingresarCoef();
                        raices.calcularRaices();
                        break;
        }
    }
    
}
