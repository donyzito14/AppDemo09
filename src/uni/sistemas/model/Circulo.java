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
public class Circulo extends Figura {

    //atributo
    double radio;

    //constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double Area() {
        return Math.PI * Math.pow(radio, 2);

    }

    @Override
    public double Perimetro() {
        return Math.PI * 2 * radio;

    }

}
