package dialogs;

/**
 *
 * @author SchWarZer
 * 
 */
public class InputDialog extends AbstractFrame {

    
    private final AbstractFrame parent;
    private final int selection;
    private String input;
    private final Language language;

    public InputDialog(int selection, String dialogText, String dialogTitle, String input, Language language, AbstractFrame parent){
        
        initComponents();
        
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);
        
        this.parent = parent;
        this.selection = selection;
        this.input=input;
        this.setTitle(dialogTitle);
        this.DialogText.setText(dialogText);
        this.Input.setText(input);
        this.language = language;
        
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

        Input = new javax.swing.JTextField();
        Accept = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DialogText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InputKeyReleased(evt);
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
        DialogText.setLineWrap(true);
        DialogText.setRows(3);
        DialogText.setWrapStyleWord(true);
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
                .addGap(98, 98, 98)
                .addComponent(Accept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(Cancel)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Input)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Input, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel)
                    .addComponent(Accept))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptActionPerformed
       
        if(input.equals("")){
            if(language==Language.ES){
            MessageDialog messageDialog = new MessageDialog("Debe escribir primero una opcion en el campo de texto", "Error", language, this);            
            }
            else if(language==Language.EN){
            MessageDialog messageDialog = new MessageDialog("You should first write an option in the textfield", "Error", language, this);            
            }
        }
        else{
       parent.setEnabled(true);
       parent.inputDialog_returnValue(input, selection);
       dispose();
        }
    }//GEN-LAST:event_AcceptActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
       parent.setEnabled(true);
       parent.inputDialog_returnValue(null, selection);
       dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       parent.setEnabled(true);
       parent.inputDialog_returnValue(null, selection);
       dispose();
    }//GEN-LAST:event_formWindowClosing

    private void InputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputKeyReleased
        input = Input.getText();
    }//GEN-LAST:event_InputKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept;
    private javax.swing.JButton Cancel;
    private javax.swing.JTextArea DialogText;
    private javax.swing.JTextField Input;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
