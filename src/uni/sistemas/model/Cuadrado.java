/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uni.sistemas.model;

import uni.sistemas.services.Figura;

/**
 *
 * @author Alumno
 */
public class Cuadrado extends Figura{
    //atributo
    double lado ;
    //constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    //Implementar metodos polimorfos

    @Override
    public double Area() {
        return Math.pow(lado,2);
    }

    @Override
    public double Perimetro() {
        return lado*4;
    }
    
    
            
    
    
}
