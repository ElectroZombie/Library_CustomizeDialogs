package dialogs;

import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author electro-zombie
 */
public class TableDialog extends AbstractFrame {

    private final int selection;
    private final AbstractFrame parent;
    private final DefaultTableModel table;
    private final Language language;
    
    public TableDialog(int selection, String dialogText, String dialogTitle, DefaultTableModel table, Language language, AbstractFrame parent) {
        initComponents();

        this.setSize(450, 381);
        this.setLocationRelativeTo(null);
        
        this.selection = selection;
        this.table = table;
        this.parent = parent;
        this.setTitle(dialogTitle);
        this.DialogText.setText(dialogText);
        this.Table = new JTable(table);
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
    
    public JTable getTable(){
        return Table;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Accept = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DialogText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Table);

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

        DialogText.setColumns(20);
        DialogText.setRows(5);
        jScrollPane2.setViewportView(DialogText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(Accept)
                        .addGap(102, 102, 102)
                        .addComponent(Cancel)
                        .addGap(0, 97, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accept)
                    .addComponent(Cancel))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptActionPerformed
        
        if(Table.getSelectedRow()>=0){
         
            int row = Table.getSelectedRow();
            parent.setEnabled(true);
            Vector<Object> selectedElement = new Vector<>();
            
            for(int i = 0; i < Table.getColumnCount();i++){
                selectedElement.add(Table.getValueAt(row, i));
            }
            
            parent.tableDialog_returnValue(selectedElement, selection);
            dispose();
        }
        else{
            if(language==Language.ES){
            MessageDialog messageDialog = new MessageDialog("Debe seleccionar primero un elemento de la tabla", "Error", language, this);            
            }
            else if(language==Language.EN){
            MessageDialog messageDialog = new MessageDialog("You should first select an element from table", "Error", language, this);            
            }
            }
        
    }//GEN-LAST:event_AcceptActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        parent.setEnabled(true);
        parent.tableDialog_returnValue(null, selection);
        dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        parent.setEnabled(true);
        parent.tableDialog_returnValue(null, selection);
        dispose();
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept;
    private javax.swing.JButton Cancel;
    private javax.swing.JTextArea DialogText;
    private javax.swing.JTable Table;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
