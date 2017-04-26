/*
    Universidad del Valle
    Asignatura: Desarrollo de Software II 750092M
    Tema: Taller 3 - GitHub
    Archivo: CalculadoraSimple.java
    Version: 1.0
    Fecha de creacion: 20 abril 2017
    Autores:   
                Juan Felipe Orozco Escobar	1426244
                Sebastian Balanta		1723609
                Cristian Camilo Jurado		1324366
                Monica Marcela Llano		1323319

    Responsabilidad: Interfaz que simula una calculadora que suma, resta, multiplica y divide dos numeros

    Colaboracion: Extiende de javax.swing.JFrame
*/

package tallergitnetbeans;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CalculadoraSimple extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraSimple
     */
    Operacion operacion;
    
    public CalculadoraSimple() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        Suma sum = new Suma();
        this.btn_suma.addActionListener(sum);
        Resta rest = new Resta();
        this.btn_resta.addActionListener(rest);
        Multiplicacion mult = new Multiplicacion();
        this.btn_multiplicacion.addActionListener(mult);
        Division div = new Division();
        this.btn_division.addActionListener(div);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_suma = new javax.swing.JButton();
        txt_valor1 = new javax.swing.JTextField();
        lbl_valor1 = new javax.swing.JLabel();
        lbl_valor2 = new javax.swing.JLabel();
        txt_valor2 = new javax.swing.JTextField();
        lbl_resultado = new javax.swing.JLabel();
        txt_resultado = new javax.swing.JTextField();
        btn_resta = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_suma.setText("Suma");
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });

        lbl_valor1.setText("Valor 1");

        lbl_valor2.setText("Valor 2");

        lbl_resultado.setText("Resultado");

        txt_resultado.setEditable(false);

        btn_resta.setText("Resta");
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });

        btn_multiplicacion.setText("Multiplicación");
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });

        btn_division.setText("División");
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txt_valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txt_valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_multiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(btn_division, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_resta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_suma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_suma))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_resta))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_multiplicacion)
                        .addGap(11, 11, 11)
                        .addComponent(btn_division))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JLabel lbl_resultado;
    private javax.swing.JLabel lbl_valor1;
    private javax.swing.JLabel lbl_valor2;
    private javax.swing.JTextField txt_resultado;
    private javax.swing.JTextField txt_valor1;
    private javax.swing.JTextField txt_valor2;
    // End of variables declaration//GEN-END:variables

    

    private class Suma implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(txt_valor1.getText().isEmpty() || txt_valor2.getText().isEmpty()){
                JOptionPane.showMessageDialog( null,"¡Por favor, llene los dos campos!");
            }else{
                operacion = new Operacion(Double.parseDouble(txt_valor1.getText()), Double.parseDouble(txt_valor2.getText()));
                txt_resultado.setText(Double.toString(operacion.Suma()));
            }
            
        }
    }
    
    private class Resta implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(txt_valor1.getText().isEmpty() || txt_valor2.getText().isEmpty()){
                JOptionPane.showMessageDialog( null,"¡Por favor, llene los dos campos!");
            }else{
                operacion = new Operacion(Double.parseDouble(txt_valor1.getText()), Double.parseDouble(txt_valor2.getText()));
                txt_resultado.setText(Double.toString(operacion.Resta()));
            }
        }
    }
    
    private class Multiplicacion implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(txt_valor1.getText().isEmpty() || txt_valor2.getText().isEmpty()){
                JOptionPane.showMessageDialog( null,"¡Por favor, llene los dos campos!");
            }else{
                operacion = new Operacion(Double.parseDouble(txt_valor1.getText()), Double.parseDouble(txt_valor2.getText()));
                txt_resultado.setText(Double.toString(operacion.Multiplicacion()));
            }                
        }
    }
    
    private class Division implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            
        }
    }
          
}
