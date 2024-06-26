package com.chat.form;

import com.chat.function.*;
import java.awt.Adjustable;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import com.chat.component.*;
import static com.chat.main.Main.outStream;
import static com.chat.main.Main.query;
import static com.chat.main.Main.ss;
import java.io.File;
import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import message.Message;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Mahmoud
 */
public class Chat extends javax.swing.JPanel {

    /**
     * Creates new form Chat
     */
    public Chat() {
        initComponents();
        init();
    }

    private void init() {
        ChatBG.setLayout(new MigLayout("fillx"));
        new Scrolling(ChatBG);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUp = new javax.swing.JPopupMenu();
        menu_img = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menu_attach = new javax.swing.JMenuItem();
        ChatSP = new javax.swing.JScrollPane();
        ChatBG = new javax.swing.JDesktopPane(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(51,51,51));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        ChatText = new javax.swing.JTextField();
        cmdSend = new javax.swing.JButton();
        cmdMore = new javax.swing.JButton();

        popUp.setBackground(new java.awt.Color(51, 51, 51));
        popUp.setFocusable(false);

        menu_img.setBackground(new java.awt.Color(51, 51, 51));
        menu_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/chat/icon/image.png"))); // NOI18N
        menu_img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_imgActionPerformed(evt);
            }
        });
        popUp.add(menu_img);
        popUp.add(jSeparator1);

        menu_attach.setBackground(new java.awt.Color(51, 51, 51));
        menu_attach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/chat/icon/attach.png"))); // NOI18N
        menu_attach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_attachActionPerformed(evt);
            }
        });
        popUp.add(menu_attach);

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(700, 470));

        ChatSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ChatSP.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ChatBG.setBackground(new java.awt.Color(51, 51, 51));
        ChatBG.setAlignmentX(0.0F);
        ChatBG.setLayout(new javax.swing.BoxLayout(ChatBG, javax.swing.BoxLayout.LINE_AXIS));
        ChatSP.setViewportView(ChatBG);

        ChatText.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ChatText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ChatText.setPreferredSize(new java.awt.Dimension(64, 25));
        ChatText.setSelectionColor(new java.awt.Color(131, 188, 227));
        ChatText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ChatTextKeyTyped(evt);
            }
        });

        cmdSend.setBackground(new java.awt.Color(0, 0, 0));
        cmdSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/chat/icon/send.png"))); // NOI18N
        cmdSend.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmdSend.setBorderPainted(false);
        cmdSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdSend.setFocusPainted(false);
        cmdSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSendActionPerformed(evt);
            }
        });

        cmdMore.setBackground(new java.awt.Color(0, 0, 0));
        cmdMore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/chat/icon/more.png"))); // NOI18N
        cmdMore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmdMore.setBorderPainted(false);
        cmdMore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdMore.setFocusPainted(false);
        cmdMore.setFocusable(false);
        cmdMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ChatSP, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(cmdMore)
                .addGap(28, 28, 28)
                .addComponent(ChatText, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdSend)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ChatSP, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdSend, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChatText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMore, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMoreActionPerformed
        // TODO add your handling code here:
        popUp.show(cmdMore, -10, -87);
    }//GEN-LAST:event_cmdMoreActionPerformed

    private void menu_imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_imgActionPerformed
        setImage();
    }//GEN-LAST:event_menu_imgActionPerformed

    private void menu_attachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_attachActionPerformed
        try {
            // TODO add your handling code here:
            setFile();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_menu_attachActionPerformed

    public static void refresh(Component obj) {
        obj.revalidate();
        obj.repaint();
    }

    public static void scrollToBottom(JScrollPane scrollPane) {
        JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
    }
    private void cmdSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSendActionPerformed
        // TODO add your handling code here:
        if (!ChatText.getText().trim().equals("")) {
            try {
                // TODO add your handling code here:
                String text = ChatText.getText().trim();
                Message msg = new Message();
                msg.setStatus("Message");
                msg.setMessage(text);
                outStream.writeObject(msg);
                snd_msg snd = new snd_msg(text);
                ChatBG.add(snd, "wrap");
                refresh(ChatBG);
                scrollToBottom(ChatSP);
                ChatText.setText("");
                ChatText.grabFocus();

                query = "insert into MyTable values(N's" + text + "')";
                try {
                    ss.execute(query);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_cmdSendActionPerformed

    private void ChatTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ChatTextKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() == 10)
            cmdSendActionPerformed(null);
    }//GEN-LAST:event_ChatTextKeyTyped
    private void setImage() {
        JFileChooser ch = new JFileChooser();
        FileChooser preview = new FileChooser();
        ch.setAccessory(preview);
        ch.addPropertyChangeListener(preview);
        ch.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File file) {
                String name = file.getName();
                return file.isDirectory() || name.endsWith(".png") || name.endsWith(".PNG") || name.endsWith("jpg") || name.endsWith("JPG");
            }

            @Override
            public String getDescription() {
                return "png,jpg";
            }
        });
        int c = ch.showOpenDialog(this);
        if (c == JFileChooser.APPROVE_OPTION) {
            ImageIcon image = new ImageIcon(ch.getSelectedFile().getAbsolutePath());
            try {
                Message ms = new Message();
                ms.setStatus("Photo");
                ms.setImage(image);
                ImageViewer snd = new ImageViewer();
                snd.setImage(image);
                ChatBG.add(snd, "wrap");
                refresh(ChatBG);
                scrollToBottom(ChatSP);
                outStream.writeObject(ms);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void setFile() throws Exception {
        JFileChooser ch = new JFileChooser();
        FileChooser preview = new FileChooser();
        ch.setAccessory(preview);
        ch.addPropertyChangeListener(preview);
        int c = ch.showOpenDialog(this);
        if (c == JFileChooser.APPROVE_OPTION) {
            sendFile(ch.getSelectedFile());
        }
    }

    public static void sendFile(File file) throws Exception {
        FileInputStream in = new FileInputStream(file);
        byte data[] = new byte[in.available()];
        in.read(data);
        in.close();
        String fileSize = convertSize(file.length());
        Message msg = new Message();
        msg.setStatus("File");
        msg.setData(data);
        msg.setName(file.getName() + "!" + fileSize);
        outStream.writeObject(msg);
        sndFile snd = new sndFile(msg.getName());
        ChatBG.add(snd, "wrap");
        refresh(ChatBG);
        scrollToBottom(ChatSP);
    }

    private static final String[] fileSizeUnits = {"bytes", "KB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB"};

    private static String convertSize(double bytes) {
        String sizeToReturn;
        DecimalFormat df = new DecimalFormat("0.#");
        int index;
        for (index = 0; index < fileSizeUnits.length; index++) {
            if (bytes < 1024) {
                break;
            }
            bytes = bytes / 1024;
        }
        System.out.println("Systematic file size: " + bytes + " " + fileSizeUnits[index]);
        sizeToReturn = df.format(bytes) + " " + fileSizeUnits[index];
        return sizeToReturn;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane ChatBG;
    public static javax.swing.JScrollPane ChatSP;
    public static javax.swing.JTextField ChatText;
    public static javax.swing.JButton cmdMore;
    public static javax.swing.JButton cmdSend;
    public static javax.swing.JPopupMenu.Separator jSeparator1;
    public static javax.swing.JMenuItem menu_attach;
    public static javax.swing.JMenuItem menu_img;
    public static javax.swing.JPopupMenu popUp;
    // End of variables declaration//GEN-END:variables
}
