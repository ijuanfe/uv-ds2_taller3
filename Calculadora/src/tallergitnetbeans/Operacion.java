/*
 -    Universidad del Valle
 -    Asignatura: Desarrollo de Software II 750092M
 -    Tema: Taller 3 - GitHub
 -    Archivo: Operacion.java
 -    Version: 1.0
 -    Fecha de creacion: 20 abril 2017
 -    Autores:   
 -                Juan Felipe Orozco Escobar	1426244
 -                Sebastian Balanta		        1723609
 -                Cristian Camilo Jurado		1324366
 -                Monica Marcela Llano		    1323319
 -
 -    Responsabilidad: Clase que tiene las operaciones suma, resta
                       multiplicacion y divisio de la calculadora
 -
 -    Colaboracion: ninguna
 -*/

package tallergitnetbeans;

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
