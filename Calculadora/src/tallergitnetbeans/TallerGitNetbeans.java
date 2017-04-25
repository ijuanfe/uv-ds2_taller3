/*
    Universidad del Valle
    Asignatura: Desarrollo de Software II 750092M
    Tema: Taller 3 - GitHub
    Archivo: TallerGitNetbeans.java
    Version: 1.0
    Fecha de creacion: 20 abril 2017
    Autores:   
                Juan Felipe Orozco Escobar	1426244
                Sebastian Balanta		1723609
                Cristian Camilo Jurado		1324366
                Monica Marcela Llano		1323319

    Responsabilidad: Clase main para inicializar la interfaz de una calculadora

    Colaboracion: ninguna
    LEER
    Hice unas modificaciones, si no entienden algo me avisan, no vayan a cambiar todo solo
    porque si, recuerden hacer la comprobacion de valores para la division y el resto
    (si son negativos y eso). att: Sebastian.
*/

package tallergitnetbeans;

public class TallerGitNetbeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadoraSimple interfaz = new CalculadoraSimple();
        interfaz.setVisible(true);
    }
    
}
