/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
/**
 *
 * @author Tiago
 */
public class Triangulo {
    int resultado;
        public int calcularArea (int b, int h){
            resultado=(b*h)/2;
            return resultado;
        }
        public int calcularPerimetro (int l1, int l2, int l3){
            resultado=l1+l2+l3;
            return resultado;
        }
        
}

