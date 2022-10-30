package dialogs;

/**
 *
 * @author SchWarZer
 * 
 */
public class ConfirmDialog extends AbstractFrame {

    private final AbstractFrame parent;
    private final int selection;

   
    public ConfirmDialog(int selection, String dialogText, String dialogTitle, Language language, AbstractFrame parent){
        
        initComponents();
        
        this.setSize(450, 200);
        this.setLocationRelativeTo(null);
        
        this.parent = parent;
        this.selection = selection;
        this.DialogText.setText(dialogText);
        this.setTitle(dialogTitle);
        if(language == Language.EN){
            Accept.setText("Accept");
            Cancel.setText("Cancel");
        }
        else if(language == Language.ES){
            Accept.setText("Aceptar");
            Cancel.setText("Cancelar");
        }
        
        this.setVisible(true);
        parent.setEnabled(false);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Accept = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DialogText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Accept.setText("Aceptar");
        Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptActionPerformed(evt);
            }
        });

        Cancel.setText("Cancelar");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        DialogText.setEditable(false);
        DialogText.setColumns(20);
        DialogText.setRows(3);
        jScrollPane1.setViewportView(DialogText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(Accept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(Cancel)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accept)
                    .addComponent(Cancel))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        parent.setEnabled(true);
        parent.confirmDialog_returnValue(false, selection);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptActionPerformed
        parent.setEnabled(true);
        parent.confirmDialog_returnValue(true, selection);
        dispose();
    }//GEN-LAST:event_AcceptActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        parent.setEnabled(true);
        parent.confirmDialog_returnValue(false, selection);
       dispose();
    }//GEN-LAST:event_CancelActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept;
    private javax.swing.JButton Cancel;
    private javax.swing.JTextArea DialogText;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
