package com.chat.component;

public class sndFile extends javax.swing.JLayeredPane {

    public sndFile(String text) {
        initComponents();
        txt.setText(text);
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new com.chat.component.Chat_Text();
        user = new javax.swing.JLabel();

        txt.setEditable(false);
        txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        txt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txt.setForeground(new java.awt.Color(6, 23, 183));
        txt.setBgColor(new java.awt.Color(221, 246, 255));
        txt.setBorderColor(new java.awt.Color(6, 126, 183));

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/chat/icon/user.png"))); // NOI18N

        setLayer(txt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(user, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.chat.component.Chat_Text txt;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
