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
    
           public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraSimple().setVisible(true);
                
            }
        });
    }

        
    
    
}
