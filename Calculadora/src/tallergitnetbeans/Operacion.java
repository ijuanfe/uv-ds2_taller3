/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallergitnetbeans;

import javax.swing.JOptionPane;

/**
 *
 *
 */
public class Operacion {
    
    private double num1;
    private double num2;

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double Suma() {
        double resultado = 0;
        resultado = this.num1 + this.num2;   
        return resultado;
    }
    
    public double Multiplicacion() {
        double resultado = 0;
        resultado = this.num1 * this.num2;   
        return resultado;
    }
    
    public double Division() {
        double resultado = 0;
        if (this.num2 != 0){
        resultado = this.num1 / this.num2;   
        return resultado; 
        }else {
            JOptionPane.showMessageDialog( null,"Error");
            return resultado;
        }
    }
    
    public double Resta() {
        double resultado = 0;
        if(this.num2 < 0){
            resultado = this.num1 - (-1 * this.num2);   
        }else{
            resultado = this.num1 - this.num2;   
        }
        return resultado;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    
    
}
