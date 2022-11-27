package dialogs;

/**
 *
 * @author electro-zombie
 * 
 */
public class MessageDialog extends AbstractFrame {

    
    private final AbstractFrame parent;
    private final int seleccion;

   
    public MessageDialog(String dialogText, String dialogTitle, Language language, AbstractFrame parent){
        
        initComponents();
        
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);
        
        this.seleccion=-1;
        this.parent = parent;
        this.DialogText.setText(dialogText);
        this.setTitle(dialogTitle);
        
        this.setVisible(true);
        parent.setEnabled(false);
    }
    
    public MessageDialog(int seleccion, String dialogText, String dialogTitle, Language language, AbstractFrame parent){
        
        initComponents();
        
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);
        
        this.seleccion = seleccion;
        this.parent = parent;
        this.DialogText.setText(dialogText);
        this.setTitle(dialogTitle);
        
        this.setVisible(true);
        parent.setEnabled(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Accept = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DialogText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Accept.setText("Aceptar");
        Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptActionPerformed(evt);
            }
        });

        DialogText.setEditable(false);
        DialogText.setColumns(20);
        DialogText.setLineWrap(true);
        DialogText.setRows(3);
        DialogText.setWrapStyleWord(true);
        jScrollPane1.setViewportView(DialogText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(Accept)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(Accept)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptActionPerformed
        parent.setEnabled(true);
        if(seleccion != -1){
            parent.messageDialog_returnValue(seleccion);
        }
        dispose();
    }//GEN-LAST:event_AcceptActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        parent.setEnabled(true);
        if(seleccion != -1){
            parent.messageDialog_returnValue(seleccion);
        }
        dispose();
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept;
    private javax.swing.JTextArea DialogText;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
