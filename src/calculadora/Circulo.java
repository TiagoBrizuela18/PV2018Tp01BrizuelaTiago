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
public class Circulo {
    double resultado;
    private Object math;
        public double calcularArea (double r){
            resultado = Math.PI * Math.pow(r, 2);
            return resultado;
        }
        public double calcularPerimetro (double r){
            resultado = 2*Math.PI*r;
            return resultado;
        }
    
}
