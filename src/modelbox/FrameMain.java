package modelbox;

import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultListSelectionModel;

public class FrameMain extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        if (!enabledItemIndexes.contains(combo.getSelectedIndex())) {
            combo.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_comboActionPerformed

    public FrameMain() {
        initComponents();
        setLocationRelativeTo(null);
        init();
    }

    private void init() {
        enabledItemIndexes.add(0);
        enabledItemIndexes.add(1);
        enabledItemIndexes.add(2);
        enabledItemIndexes.add(3);
        enabledItemIndexes.add(6);

        combo.addItem("Testing...");
        combo.addItem("1...");
        combo.addItem("2...");
        combo.addItem("3...");
        combo.addItem("4...");
        combo.addItem("Wait...");
        combo.addItem("Go...");

        for (int index : enabledItemIndexes) {
            renderModel.addSelectionInterval(index, index);
        }

        EnabledJComboBoxRenderer enableRenderer = new EnabledJComboBoxRenderer(renderModel);
        combo.setRenderer(enableRenderer);
        combo.setSelectedIndex(-1);
    }

    private final DefaultListSelectionModel renderModel = new DefaultListSelectionModel();
    private final Set<Integer> enabledItemIndexes = new HashSet<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo;
    // End of variables declaration//GEN-END:variables
}
