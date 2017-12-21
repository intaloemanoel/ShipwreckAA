package Game;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainMenu extends javax.swing.JFrame {

    private final JFileChooser openFileChooser = new JFileChooser();
    private BufferedReader br;
    private File file;
    private int returnVal;
    private String currentLine;
    private int[] tamBarco = new int[4];
    private char[] posXBarco = new char[4];
    private int[] posYBarco = new int[4];
    
    
    public MainMenu() {
        initComponents();
        NewGame.setVisible(false);
        setSize(1280,720);
        openFileChooser.setCurrentDirectory(new File("c:\\temp"));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("documentos TXT", "txt"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewGame = new javax.swing.JPanel();
        newGameBack = new javax.swing.JPanel();
        buttonBack = new javax.swing.JButton();
        Botoes = new javax.swing.JPanel();
        buttonAhoyTXT = new javax.swing.JButton();
        buttonAhoyPosBarcos = new javax.swing.JButton();
        buttonAhoyRandom = new javax.swing.JButton();
        newGameBackground = new javax.swing.JLabel();
        Buttons = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        Logo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shipwreck");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1285, 748));
        setName("Main Menu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        NewGame.setBackground(new java.awt.Color(0, 0, 0));
        NewGame.setAlignmentX(0.0F);
        NewGame.setAlignmentY(0.0F);
        NewGame.setMaximumSize(new java.awt.Dimension(1280, 720));
        NewGame.setOpaque(false);
        NewGame.setLayout(null);

        newGameBack.setOpaque(false);
        newGameBack.setLayout(null);

        buttonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buttons/voltarNormal.png"))); // NOI18N
        buttonBack.setContentAreaFilled(false);
        buttonBack.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buttons/voltarPressed.png"))); // NOI18N
        buttonBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buttons/voltarSelected.png"))); // NOI18N
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });
        newGameBack.add(buttonBack);
        buttonBack.setBounds(247, 0, 203, 69);

        NewGame.add(newGameBack);
        newGameBack.setBounds(780, 25, 460, 70);

        Botoes.setOpaque(false);
        Botoes.setLayout(null);

        buttonAhoyTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/AhoyNormal.png"))); // NOI18N
        buttonAhoyTXT.setContentAreaFilled(false);
        buttonAhoyTXT.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/AhoyPressed.png"))); // NOI18N
        buttonAhoyTXT.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/AhoySelected.png"))); // NOI18N
        buttonAhoyTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAhoyTXTActionPerformed(evt);
            }
        });
        Botoes.add(buttonAhoyTXT);
        buttonAhoyTXT.setBounds(860, 0, 203, 69);

        buttonAhoyPosBarcos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/AhoyNormal.png"))); // NOI18N
        buttonAhoyPosBarcos.setContentAreaFilled(false);
        buttonAhoyPosBarcos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/AhoyPressed.png"))); // NOI18N
        buttonAhoyPosBarcos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/AhoySelected.png"))); // NOI18N
        buttonAhoyPosBarcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAhoyPosBarcosActionPerformed(evt);
            }
        });
        Botoes.add(buttonAhoyPosBarcos);
        buttonAhoyPosBarcos.setBounds(65, 0, 203, 69);

        buttonAhoyRandom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/AhoyNormal.png"))); // NOI18N
        buttonAhoyRandom.setContentAreaFilled(false);
        buttonAhoyRandom.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/AhoyPressed.png"))); // NOI18N
        buttonAhoyRandom.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/AhoySelected.png"))); // NOI18N
        buttonAhoyRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAhoyRandomActionPerformed(evt);
            }
        });
        Botoes.add(buttonAhoyRandom);
        buttonAhoyRandom.setBounds(420, 0, 203, 69);

        NewGame.add(Botoes);
        Botoes.setBounds(70, 600, 1140, 90);

        newGameBackground.setBackground(new java.awt.Color(0, 0, 0));
        newGameBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newGameBackground.png"))); // NOI18N
        NewGame.add(newGameBackground);
        newGameBackground.setBounds(0, 0, 1318, 720);

        getContentPane().add(NewGame);
        NewGame.setBounds(0, 0, 1280, 720);

        Buttons.setAlignmentX(0.0F);
        Buttons.setAlignmentY(0.0F);
        Buttons.setOpaque(false);
        Buttons.setLayout(null);

        playButton.setBackground(new java.awt.Color(255, 0, 0));
        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buttons/playNormal.png"))); // NOI18N
        playButton.setAlignmentY(0.0F);
        playButton.setBorderPainted(false);
        playButton.setContentAreaFilled(false);
        playButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buttons/playPressed.png"))); // NOI18N
        playButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buttons/playSelected.png"))); // NOI18N
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        Buttons.add(playButton);
        playButton.setBounds(0, 40, 300, 110);

        getContentPane().add(Buttons);
        Buttons.setBounds(40, 520, 340, 180);

        Logo.setAlignmentX(0.0F);
        Logo.setAlignmentY(0.0F);
        Logo.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoTitle.png"))); // NOI18N
        jLabel2.setAlignmentY(0.0F);

        javax.swing.GroupLayout LogoLayout = new javax.swing.GroupLayout(Logo);
        Logo.setLayout(LogoLayout);
        LogoLayout.setHorizontalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        LogoLayout.setVerticalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Logo);
        Logo.setBounds(0, 0, 1280, 720);

        Background.setAlignmentX(0.0F);
        Background.setAlignmentY(0.0F);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wallpaperTitle.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Background);
        Background.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        NewGame.setVisible(true);
    }//GEN-LAST:event_playButtonActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        NewGame.setVisible(false);
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonAhoyTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAhoyTXTActionPerformed
        returnVal = openFileChooser.showOpenDialog(null);
        int i = 0;
        
        if(returnVal == JFileChooser.APPROVE_OPTION){
            file = openFileChooser.getSelectedFile();
            boolean valido = true;
            
            try{
                br = new BufferedReader(new FileReader(file));
                
                while((currentLine = br.readLine()) != null){
                        tamBarco[i] = Character.getNumericValue(currentLine.charAt(0)); //Primeiro Numero
                        posXBarco[i] = currentLine.charAt(2); //Pos x
                        posYBarco[i] = Character.getNumericValue(currentLine.charAt(3)); //Pos y
                        
                        if((tamBarco[i] + posYBarco[i]) > 11){
                            JOptionPane.showMessageDialog(this, "O documento é inválido. O tamanho do barco ultrapassa o limite do mapa.");
                            valido = false;
                            break;
                        }
                        
                        if(tamBarco[i] < 2 || tamBarco[i] > 4){
                            JOptionPane.showMessageDialog(this, "O documento é inválido. O tamanho do barco não é permitido pelas regras do jogo.");
                            valido = false;
                            break;
                        }
                        
                        if(posXBarco[i] < 'A' || posXBarco[i] > 'J'){
                            JOptionPane.showMessageDialog(this, "O documento é inválido. A posição X não existe.");
                            valido = false;
                            break;
                        }
                        
                        if(posYBarco[i] < 1 && posYBarco[i] > 10){
                            JOptionPane.showMessageDialog(this, "O documento é inválido. A posição Y não existe.");
                            valido = false;
                            break;
                        }
                    
                    if(!valido){
                        break;
                    }
                    
                    i += 1;
                }
            }catch(Exception error){
                error.printStackTrace();
            }
            
            if(valido){
                            TXT text = new TXT();
                            text.CriandoTelas(tamBarco, posXBarco, posYBarco);
                            this.dispose();
                    }
        }
    }//GEN-LAST:event_buttonAhoyTXTActionPerformed

    private void buttonAhoyPosBarcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAhoyPosBarcosActionPerformed
            PosBarco create = new PosBarco();
            create.setVisible(true);
            this.dispose();
            
    }//GEN-LAST:event_buttonAhoyPosBarcosActionPerformed

    private void buttonAhoyRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAhoyRandomActionPerformed
        Random rand = new Random();
        rand.CriandoTelas();
        this.dispose();
    }//GEN-LAST:event_buttonAhoyRandomActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Botoes;
    private javax.swing.JPanel Buttons;
    private javax.swing.JPanel Logo;
    private javax.swing.JPanel NewGame;
    private javax.swing.JButton buttonAhoyPosBarcos;
    private javax.swing.JButton buttonAhoyRandom;
    private javax.swing.JButton buttonAhoyTXT;
    private javax.swing.JButton buttonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel newGameBack;
    private javax.swing.JLabel newGameBackground;
    private javax.swing.JButton playButton;
    // End of variables declaration//GEN-END:variables
}
