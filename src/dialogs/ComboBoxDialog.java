package dialogs;

/**
 *
 * @author electro-zombie
 * 
 */
public class ComboBoxDialog extends AbstractFrame{
    
    private final AbstractFrame parent;
    private final int selection;
    private String selectedValue;
    private final String formerValue;
    private final Language language;

 public ComboBoxDialog(int selection, String dialogText, String dialogTitle, String[] options, String formerValue, Language language, AbstractFrame parent) {
        
        initComponents();        
        
        this.setSize(450, 200);
        this.setLocationRelativeTo(null);
        
        this.formerValue = formerValue;
        this.parent = parent;
        this.selection = selection;
        this.setTitle(dialogTitle);
        this.DialogText.setText(dialogText);
        this.language = language;
        
        if(language == Language.EN){
            Accept.setText("Accept");
            Cancel.setText("Cancel");
        }
        else if(language == Language.ES){
            Accept.setText("Aceptar");
            Cancel.setText("Cancelar");
        }
        
        for (String currentOption : options) {
            this.Options.addItem(currentOption);
        }
        selectedValue = this.Options.getItemAt(0);
                
        this.setVisible(true);
        parent.setEnabled(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Options = new javax.swing.JComboBox<>();
        jScrollPane = new javax.swing.JScrollPane();
        DialogText = new javax.swing.JTextArea();
        Accept = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Options.setAutoscrolls(true);
        Options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionsActionPerformed(evt);
            }
        });

        DialogText.setEditable(false);
        DialogText.setColumns(20);
        DialogText.setRows(3);
        jScrollPane.setViewportView(DialogText);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Options, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(Accept)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(Cancel)
                        .addGap(91, 91, 91)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Options, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel)
                    .addComponent(Accept))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionsActionPerformed
        selectedValue = (String)this.Options.getSelectedItem();
    }//GEN-LAST:event_OptionsActionPerformed

    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptActionPerformed
        parent.setEnabled(true);
        parent.comboBoxDialog_returnValue(selectedValue, formerValue, selection);
        dispose();
    }//GEN-LAST:event_AcceptActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        parent.setEnabled(true);
        parent.comboBoxDialog_returnValue(null, formerValue, selection);
        dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        parent.setEnabled(true);
        parent.comboBoxDialog_returnValue(null, formerValue, selection);
        dispose();
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept;
    private javax.swing.JButton Cancel;
    private javax.swing.JTextArea DialogText;
    private javax.swing.JComboBox<String> Options;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables
}
