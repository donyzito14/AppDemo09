/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.model;

import uni.sistemas.services.Figura;

public class Rectangulo extends Figura {

    //atributos
    double largo, ancho;

    //constructor
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double Area() {
        return largo*ancho;
        
    }

    @Override
    public double Perimetro() {
        return largo * 2 + ancho * 2 ;

    }

}
