
package Game;
import java.awt.Color;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class TXT extends javax.swing.JFrame {

    public int posicaoSubL,posicaoSubC,posicaoEscoltaL,posicaoEscoltaC,posicaoCacaL,posicaoCacaC;
    
    public TXT() {
        initComponents();
        setSize(1280,720);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);          

    }
    
    int matriz[][] = new int[10][10];
    private int[] posXInt = new int[4];
    private int[] posYInt = new int[4];
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        A0 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        A7 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        A9 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        C0 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        C9 = new javax.swing.JButton();
        D0 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        D6 = new javax.swing.JButton();
        D7 = new javax.swing.JButton();
        D8 = new javax.swing.JButton();
        D9 = new javax.swing.JButton();
        E0 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        E5 = new javax.swing.JButton();
        E6 = new javax.swing.JButton();
        E7 = new javax.swing.JButton();
        E8 = new javax.swing.JButton();
        E9 = new javax.swing.JButton();
        F0 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        F5 = new javax.swing.JButton();
        F6 = new javax.swing.JButton();
        F7 = new javax.swing.JButton();
        F8 = new javax.swing.JButton();
        F9 = new javax.swing.JButton();
        G0 = new javax.swing.JButton();
        G1 = new javax.swing.JButton();
        G2 = new javax.swing.JButton();
        G3 = new javax.swing.JButton();
        G4 = new javax.swing.JButton();
        G5 = new javax.swing.JButton();
        G6 = new javax.swing.JButton();
        G7 = new javax.swing.JButton();
        G8 = new javax.swing.JButton();
        G9 = new javax.swing.JButton();
        H0 = new javax.swing.JButton();
        H1 = new javax.swing.JButton();
        H2 = new javax.swing.JButton();
        H3 = new javax.swing.JButton();
        H4 = new javax.swing.JButton();
        H5 = new javax.swing.JButton();
        H6 = new javax.swing.JButton();
        H7 = new javax.swing.JButton();
        H8 = new javax.swing.JButton();
        H9 = new javax.swing.JButton();
        I0 = new javax.swing.JButton();
        I1 = new javax.swing.JButton();
        I2 = new javax.swing.JButton();
        I3 = new javax.swing.JButton();
        I4 = new javax.swing.JButton();
        I5 = new javax.swing.JButton();
        I6 = new javax.swing.JButton();
        I7 = new javax.swing.JButton();
        I8 = new javax.swing.JButton();
        I9 = new javax.swing.JButton();
        J0 = new javax.swing.JButton();
        J1 = new javax.swing.JButton();
        J2 = new javax.swing.JButton();
        J3 = new javax.swing.JButton();
        J4 = new javax.swing.JButton();
        J5 = new javax.swing.JButton();
        J6 = new javax.swing.JButton();
        J7 = new javax.swing.JButton();
        J8 = new javax.swing.JButton();
        J9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shipwreck - In Game (Sua Tela)");
        setMinimumSize(new java.awt.Dimension(1285, 748));
        setPreferredSize(new java.awt.Dimension(1285, 748));
        setSize(new java.awt.Dimension(1285, 748));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 105, 193));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new java.awt.GridLayout(10, 10));

        A0.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(A0);

        A1.setBackground(new java.awt.Color(0, 0, 255));
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        jPanel1.add(A1);

        A2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(A2);

        A3.setBackground(new java.awt.Color(0, 0, 255));
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        jPanel1.add(A3);

        A4.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(A4);

        A5.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(A5);

        A6.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(A6);

        A7.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(A7);

        A8.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(A8);

        A9.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(A9);

        B0.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(B0);

        B1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(B1);

        B2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(B2);

        B3.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(B3);

        B4.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(B4);

        B5.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(B5);

        B6.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(B6);

        B7.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(B7);

        B8.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(B8);

        B9.setBackground(new java.awt.Color(0, 0, 255));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        jPanel1.add(B9);

        C0.setBackground(new java.awt.Color(0, 0, 255));
        C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C0ActionPerformed(evt);
            }
        });
        jPanel1.add(C0);

        C1.setBackground(new java.awt.Color(0, 0, 255));
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        jPanel1.add(C1);

        C2.setBackground(new java.awt.Color(0, 0, 255));
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        jPanel1.add(C2);

        C3.setBackground(new java.awt.Color(0, 0, 255));
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        jPanel1.add(C3);

        C4.setBackground(new java.awt.Color(0, 0, 255));
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });
        jPanel1.add(C4);

        C5.setBackground(new java.awt.Color(0, 0, 255));
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });
        jPanel1.add(C5);

        C6.setBackground(new java.awt.Color(0, 0, 255));
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });
        jPanel1.add(C6);

        C7.setBackground(new java.awt.Color(0, 0, 255));
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });
        jPanel1.add(C7);

        C8.setBackground(new java.awt.Color(0, 0, 255));
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });
        jPanel1.add(C8);

        C9.setBackground(new java.awt.Color(0, 0, 255));
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });
        jPanel1.add(C9);

        D0.setBackground(new java.awt.Color(0, 0, 255));
        D0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D0ActionPerformed(evt);
            }
        });
        jPanel1.add(D0);

        D1.setBackground(new java.awt.Color(0, 0, 255));
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });
        jPanel1.add(D1);

        D2.setBackground(new java.awt.Color(0, 0, 255));
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });
        jPanel1.add(D2);

        D3.setBackground(new java.awt.Color(0, 0, 255));
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });
        jPanel1.add(D3);

        D4.setBackground(new java.awt.Color(0, 0, 255));
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });
        jPanel1.add(D4);

        D5.setBackground(new java.awt.Color(0, 0, 255));
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });
        jPanel1.add(D5);

        D6.setBackground(new java.awt.Color(0, 0, 255));
        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
            }
        });
        jPanel1.add(D6);

        D7.setBackground(new java.awt.Color(0, 0, 255));
        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });
        jPanel1.add(D7);

        D8.setBackground(new java.awt.Color(0, 0, 255));
        D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D8ActionPerformed(evt);
            }
        });
        jPanel1.add(D8);

        D9.setBackground(new java.awt.Color(0, 0, 255));
        D9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D9ActionPerformed(evt);
            }
        });
        jPanel1.add(D9);

        E0.setBackground(new java.awt.Color(0, 0, 255));
        E0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E0ActionPerformed(evt);
            }
        });
        jPanel1.add(E0);

        E1.setBackground(new java.awt.Color(0, 0, 255));
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });
        jPanel1.add(E1);

        E2.setBackground(new java.awt.Color(0, 0, 255));
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });
        jPanel1.add(E2);

        E3.setBackground(new java.awt.Color(0, 0, 255));
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });
        jPanel1.add(E3);

        E4.setBackground(new java.awt.Color(0, 0, 255));
        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4ActionPerformed(evt);
            }
        });
        jPanel1.add(E4);

        E5.setBackground(new java.awt.Color(0, 0, 255));
        E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E5ActionPerformed(evt);
            }
        });
        jPanel1.add(E5);

        E6.setBackground(new java.awt.Color(0, 0, 255));
        E6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E6ActionPerformed(evt);
            }
        });
        jPanel1.add(E6);

        E7.setBackground(new java.awt.Color(0, 0, 255));
        E7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E7ActionPerformed(evt);
            }
        });
        jPanel1.add(E7);

        E8.setBackground(new java.awt.Color(0, 0, 255));
        E8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E8ActionPerformed(evt);
            }
        });
        jPanel1.add(E8);

        E9.setBackground(new java.awt.Color(0, 0, 255));
        E9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E9ActionPerformed(evt);
            }
        });
        jPanel1.add(E9);

        F0.setBackground(new java.awt.Color(0, 0, 255));
        F0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F0ActionPerformed(evt);
            }
        });
        jPanel1.add(F0);

        F1.setBackground(new java.awt.Color(0, 0, 255));
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });
        jPanel1.add(F1);

        F2.setBackground(new java.awt.Color(0, 0, 255));
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });
        jPanel1.add(F2);

        F3.setBackground(new java.awt.Color(0, 0, 255));
        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });
        jPanel1.add(F3);

        F4.setBackground(new java.awt.Color(0, 0, 255));
        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });
        jPanel1.add(F4);

        F5.setBackground(new java.awt.Color(0, 0, 255));
        F5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F5ActionPerformed(evt);
            }
        });
        jPanel1.add(F5);

        F6.setBackground(new java.awt.Color(0, 0, 255));
        F6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F6ActionPerformed(evt);
            }
        });
        jPanel1.add(F6);

        F7.setBackground(new java.awt.Color(0, 0, 255));
        F7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F7ActionPerformed(evt);
            }
        });
        jPanel1.add(F7);

        F8.setBackground(new java.awt.Color(0, 0, 255));
        F8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F8ActionPerformed(evt);
            }
        });
        jPanel1.add(F8);

        F9.setBackground(new java.awt.Color(0, 0, 255));
        F9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F9ActionPerformed(evt);
            }
        });
        jPanel1.add(F9);

        G0.setBackground(new java.awt.Color(0, 0, 255));
        G0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0ActionPerformed(evt);
            }
        });
        jPanel1.add(G0);

        G1.setBackground(new java.awt.Color(0, 0, 255));
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });
        jPanel1.add(G1);

        G2.setBackground(new java.awt.Color(0, 0, 255));
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });
        jPanel1.add(G2);

        G3.setBackground(new java.awt.Color(0, 0, 255));
        G3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G3ActionPerformed(evt);
            }
        });
        jPanel1.add(G3);

        G4.setBackground(new java.awt.Color(0, 0, 255));
        G4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G4ActionPerformed(evt);
            }
        });
        jPanel1.add(G4);

        G5.setBackground(new java.awt.Color(0, 0, 255));
        G5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G5ActionPerformed(evt);
            }
        });
        jPanel1.add(G5);

        G6.setBackground(new java.awt.Color(0, 0, 255));
        G6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G6ActionPerformed(evt);
            }
        });
        jPanel1.add(G6);

        G7.setBackground(new java.awt.Color(0, 0, 255));
        G7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G7ActionPerformed(evt);
            }
        });
        jPanel1.add(G7);

        G8.setBackground(new java.awt.Color(0, 0, 255));
        G8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G8ActionPerformed(evt);
            }
        });
        jPanel1.add(G8);

        G9.setBackground(new java.awt.Color(0, 0, 255));
        G9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G9ActionPerformed(evt);
            }
        });
        jPanel1.add(G9);

        H0.setBackground(new java.awt.Color(0, 0, 255));
        H0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H0ActionPerformed(evt);
            }
        });
        jPanel1.add(H0);

        H1.setBackground(new java.awt.Color(0, 0, 255));
        H1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H1ActionPerformed(evt);
            }
        });
        jPanel1.add(H1);

        H2.setBackground(new java.awt.Color(0, 0, 255));
        H2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H2ActionPerformed(evt);
            }
        });
        jPanel1.add(H2);

        H3.setBackground(new java.awt.Color(0, 0, 255));
        H3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H3ActionPerformed(evt);
            }
        });
        jPanel1.add(H3);

        H4.setBackground(new java.awt.Color(0, 0, 255));
        H4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H4ActionPerformed(evt);
            }
        });
        jPanel1.add(H4);

        H5.setBackground(new java.awt.Color(0, 0, 255));
        H5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H5ActionPerformed(evt);
            }
        });
        jPanel1.add(H5);

        H6.setBackground(new java.awt.Color(0, 0, 255));
        H6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H6ActionPerformed(evt);
            }
        });
        jPanel1.add(H6);

        H7.setBackground(new java.awt.Color(0, 0, 255));
        H7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H7ActionPerformed(evt);
            }
        });
        jPanel1.add(H7);

        H8.setBackground(new java.awt.Color(0, 0, 255));
        H8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H8ActionPerformed(evt);
            }
        });
        jPanel1.add(H8);

        H9.setBackground(new java.awt.Color(0, 0, 255));
        H9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H9ActionPerformed(evt);
            }
        });
        jPanel1.add(H9);

        I0.setBackground(new java.awt.Color(0, 0, 255));
        I0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I0ActionPerformed(evt);
            }
        });
        jPanel1.add(I0);

        I1.setBackground(new java.awt.Color(0, 0, 255));
        I1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I1ActionPerformed(evt);
            }
        });
        jPanel1.add(I1);

        I2.setBackground(new java.awt.Color(0, 0, 255));
        I2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I2ActionPerformed(evt);
            }
        });
        jPanel1.add(I2);

        I3.setBackground(new java.awt.Color(0, 0, 255));
        I3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I3ActionPerformed(evt);
            }
        });
        jPanel1.add(I3);

        I4.setBackground(new java.awt.Color(0, 0, 255));
        I4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I4ActionPerformed(evt);
            }
        });
        jPanel1.add(I4);

        I5.setBackground(new java.awt.Color(0, 0, 255));
        I5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I5ActionPerformed(evt);
            }
        });
        jPanel1.add(I5);

        I6.setBackground(new java.awt.Color(0, 0, 255));
        I6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I6ActionPerformed(evt);
            }
        });
        jPanel1.add(I6);

        I7.setBackground(new java.awt.Color(0, 0, 255));
        I7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I7ActionPerformed(evt);
            }
        });
        jPanel1.add(I7);

        I8.setBackground(new java.awt.Color(0, 0, 255));
        I8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I8ActionPerformed(evt);
            }
        });
        jPanel1.add(I8);

        I9.setBackground(new java.awt.Color(0, 0, 255));
        I9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I9ActionPerformed(evt);
            }
        });
        jPanel1.add(I9);

        J0.setBackground(new java.awt.Color(0, 0, 255));
        J0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J0ActionPerformed(evt);
            }
        });
        jPanel1.add(J0);

        J1.setBackground(new java.awt.Color(0, 0, 255));
        J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J1ActionPerformed(evt);
            }
        });
        jPanel1.add(J1);

        J2.setBackground(new java.awt.Color(0, 0, 255));
        J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J2ActionPerformed(evt);
            }
        });
        jPanel1.add(J2);

        J3.setBackground(new java.awt.Color(0, 0, 255));
        J3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J3ActionPerformed(evt);
            }
        });
        jPanel1.add(J3);

        J4.setBackground(new java.awt.Color(0, 0, 255));
        J4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J4ActionPerformed(evt);
            }
        });
        jPanel1.add(J4);

        J5.setBackground(new java.awt.Color(0, 0, 255));
        J5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J5ActionPerformed(evt);
            }
        });
        jPanel1.add(J5);

        J6.setBackground(new java.awt.Color(0, 0, 255));
        J6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J6ActionPerformed(evt);
            }
        });
        jPanel1.add(J6);

        J7.setBackground(new java.awt.Color(0, 0, 255));
        J7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J7ActionPerformed(evt);
            }
        });
        jPanel1.add(J7);

        J8.setBackground(new java.awt.Color(0, 0, 255));
        J8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J8ActionPerformed(evt);
            }
        });
        jPanel1.add(J8);

        J9.setBackground(new java.awt.Color(0, 0, 255));
        J9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J9ActionPerformed(evt);
            }
        });
        jPanel1.add(J9);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(45, 49, 890, 640);

        jPanel3.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OverlaySuaTlea.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1280, 720);

        jPanel2.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wallpaperGame.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J8ActionPerformed

    private void I9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I9ActionPerformed

    private void I8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I8ActionPerformed

    private void I7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I7ActionPerformed

    private void I6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I6ActionPerformed

    private void I5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I5ActionPerformed

    private void I4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I4ActionPerformed

    private void I3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I3ActionPerformed

    private void I2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I2ActionPerformed

    private void I1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I1ActionPerformed

    private void I0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I0ActionPerformed

    private void H9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_H9ActionPerformed

    private void H8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_H8ActionPerformed

    private void H7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_H7ActionPerformed

    private void H6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_H6ActionPerformed

    private void H5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_H5ActionPerformed

    private void H4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_H4ActionPerformed

    private void H3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_H3ActionPerformed

    private void H2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_H2ActionPerformed

    private void H1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_H1ActionPerformed

    private void H0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_H0ActionPerformed

    private void G9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G9ActionPerformed

    private void G8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G8ActionPerformed

    private void G7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G7ActionPerformed

    private void G6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G6ActionPerformed

    private void G5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G5ActionPerformed

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G4ActionPerformed

    private void G3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G3ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G2ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G1ActionPerformed

    private void G0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G0ActionPerformed

    private void F9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F9ActionPerformed

    private void F8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F8ActionPerformed

    private void F7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F7ActionPerformed

    private void F6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F6ActionPerformed

    private void F5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F5ActionPerformed

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F4ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F3ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F2ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F1ActionPerformed

    private void F0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F0ActionPerformed

    private void E9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E9ActionPerformed

    private void E8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E8ActionPerformed

    private void E7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E7ActionPerformed

    private void E6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E6ActionPerformed

    private void E5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E5ActionPerformed

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E4ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E3ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E2ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E1ActionPerformed

    private void E0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E0ActionPerformed

    private void D9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D9ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D8ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D7ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D6ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D5ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D4ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D3ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D2ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D1ActionPerformed

    private void D0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D0ActionPerformed

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C9ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C8ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C7ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C6ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C5ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C4ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C3ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C2ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1ActionPerformed

    private void C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C0ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B9ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A3ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A1ActionPerformed

    private void J7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J7ActionPerformed

    private void J6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J6ActionPerformed

    private void J5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J5ActionPerformed

    private void J4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J4ActionPerformed

    private void J3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J3ActionPerformed

    private void J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J2ActionPerformed

    private void J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J1ActionPerformed
             
    }//GEN-LAST:event_J1ActionPerformed

    private void J0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J0ActionPerformed

    private void J9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J9ActionPerformed

  
    
    public int getPosicaoSubL() {
        return posicaoSubL;  
             
    }

    public void setPosicaoSubL(int posicaoSubL) {
        this.posicaoSubL = posicaoSubL;
    }

    public int getPosicaoSubC() {
        return posicaoSubC;
    }

    public void setPosicaoSubC(int posicaoSubC) {
        this.posicaoSubC = posicaoSubC;
    }

    public int getPosicaoEscoltaL() {
        return posicaoEscoltaL;
    }

    public void setPosicaoEscoltaL(int posicaoEscoltaL) {
        this.posicaoEscoltaL = posicaoEscoltaL;
    }

    public int getPosicaoEscoltaC() {
        return posicaoEscoltaC;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public void setPosicaoEscoltaC(int posicaoEscoltaC) {
        this.posicaoEscoltaC = posicaoEscoltaC;
    }

    public int getPosicaoCacaL() {
        return posicaoCacaL;
    }

    public void setPosicaoCacaL(int posicaoCacaL) {
        this.posicaoCacaL = posicaoCacaL;
    }

    public int getPosicaoCacaC() {
        return posicaoCacaC;
    }
    
    public void setPosicaoCacaC(int posicaoCacaC) {
        this.posicaoCacaC = posicaoCacaC;
    }
    
    public void CriandoTelas(int[] tamBarco, char[] posX, int[] posY){
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
            java.util.logging.Logger.getLogger(TXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        this.setVisible(false);
        TXT temp= new TXT();
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
        JButton[][] botoes= new JButton[10][10];
        //A
        botoes[0][0]= temp.A0;
        botoes[0][1]= temp.A1;
        botoes[0][2]= temp.A2;
        botoes[0][3]= temp.A3;
        botoes[0][4]= temp.A4;
        botoes[0][5]= temp.A5;        
        botoes[0][6]= temp.A6;
        botoes[0][7]= temp.A7;
        botoes[0][8]= temp.A8;
        botoes[0][9]= temp.A9;
        //B
        botoes[1][0]= temp.B0;
        botoes[1][1]= temp.B1;
        botoes[1][2]= temp.B2;
        botoes[1][3]= temp.B3;
        botoes[1][4]= temp.B4;
        botoes[1][5]= temp.B5;
        botoes[1][6]= temp.B6;
        botoes[1][7]= temp.B7;
        botoes[1][8]= temp.B8;
        botoes[1][9]= temp.B9;
        //C
        botoes[2][0]= temp.C0;
        botoes[2][1]= temp.C1;
        botoes[2][2]= temp.C2;
        botoes[2][3]= temp.C3;
        botoes[2][4]= temp.C4;
        botoes[2][5]= temp.C5;
        botoes[2][6]= temp.C6;
        botoes[2][7]= temp.C7;
        botoes[2][8]= temp.C8;
        botoes[2][9]= temp.C9;
        //D
        botoes[3][0]= temp.D0;
        botoes[3][1]= temp.D1;
        botoes[3][2]= temp.D2;
        botoes[3][3]= temp.D3;
        botoes[3][4]= temp.D4;
        botoes[3][5]= temp.D5;
        botoes[3][6]= temp.D6;
        botoes[3][7]= temp.D7;
        botoes[3][8]= temp.D8;
        botoes[3][9]= temp.D9;
        //E
        botoes[4][0]= temp.E0;
        botoes[4][1]= temp.E1;
        botoes[4][2]= temp.E2;
        botoes[4][3]= temp.E3;
        botoes[4][4]= temp.E4;
        botoes[4][5]= temp.E5;
        botoes[4][6]= temp.E6;     
        botoes[4][7]= temp.E7;
        botoes[4][8]= temp.E8;
        botoes[4][9]= temp.E9;
        //F
        botoes[5][0]= temp.F0;
        botoes[5][1]= temp.F1;
        botoes[5][2]= temp.F2;
        botoes[5][3]= temp.F3;
        botoes[5][4]= temp.F4;
        botoes[5][5]= temp.F5;
        botoes[5][6]= temp.F6;
        botoes[5][7]= temp.F7;
        botoes[5][8]= temp.F8;
        botoes[5][9]= temp.F9;
        //G
        botoes[6][0]= temp.G0;
        botoes[6][1]= temp.G1;
        botoes[6][2]= temp.G2;
        botoes[6][3]= temp.G3;
        botoes[6][4]= temp.G4;
        botoes[6][5]= temp.G5;
        botoes[6][6]= temp.G6;
        botoes[6][7]= temp.G7;
        botoes[6][8]= temp.G8;
        botoes[6][9]= temp.G9;
        //H
        botoes[7][0]= temp.H0;
        botoes[7][1]= temp.H1;        
        botoes[7][2]= temp.H2;
        botoes[7][3]= temp.H3;
        botoes[7][4]= temp.H4;
        botoes[7][5]= temp.H5;
        botoes[7][6]= temp.H6;
        botoes[7][7]= temp.H7;
        botoes[7][8]= temp.H8;
        botoes[7][9]= temp.H9;
        //I
        botoes[8][0]= temp.I0;
        botoes[8][1]= temp.I1;
        botoes[8][2]= temp.I2;
        botoes[8][3]= temp.I3;
        botoes[8][4]= temp.I4;
        botoes[8][5]= temp.I5;
        botoes[8][6]= temp.I6;
        botoes[8][7]= temp.I7;
        botoes[8][8]= temp.I8;
        botoes[8][9]= temp.I9;
        //J
        botoes[9][0]= temp.J0;
        botoes[9][1]= temp.J1;
        botoes[9][2]= temp.J2;
        botoes[9][3]= temp.J3;
        botoes[9][4]= temp.J4;
        botoes[9][5]= temp.J5;
        botoes[9][6]= temp.J6;
        botoes[9][7]= temp.J7;
        botoes[9][8]= temp.J8;
        botoes[9][9]= temp.J9;
        
        int linhaSorteada;
        int colunaSorteada;
        int i = 0,j=0;
        int verificaTwo = 0;
        
        for(i = 0; i < 4; i++){
            if(posX[i] == 'A'){
                posXInt[i] = 0;
            }
            if(posX[i] == 'B'){
                posXInt[i] = 1;
            }
            if(posX[i] == 'C'){
                posXInt[i] = 2;
            }
            if(posX[i] == 'D'){
                posXInt[i] = 3;
            }
            if(posX[i] == 'E'){
                posXInt[i] = 4;
            }
            if(posX[i] == 'F'){
                posXInt[i] = 5;
            }
            if(posX[i] == 'G'){
                posXInt[i] = 6;
            }
            if(posX[i] == 'H'){
                posXInt[i] = 7;
            }
            if(posX[i] == 'I'){
                posXInt[i] = 8;
            }
            if(posX[i] == 'J'){
                posXInt[i] = 9;
            }
        }
        
        for(i = 0; i < 4; i++){
            if(posY[i] == 1){
                posYInt[i] = 0;
            }
            if(posY[i] == 2){
                posYInt[i] = 1;
            }
            if(posY[i] == 3){
                posYInt[i] = 2;
            }
            if(posY[i] == 4){
                posYInt[i] = 3;
            }
            if(posY[i] == 5){
                posYInt[i] = 4;
            }
            if(posY[i] == 6){
                posYInt[i] = 5;
            }
            if(posY[i] == 7){
                posYInt[i] = 6;
            }
            if(posY[i] == 8){
                posYInt[i] = 7;
            }
            if(posY[i] == 9){
                posYInt[i] = 8;
            }
            if(posY[i] == 10){
                posYInt[i] = 9;
            }
        }
        
        for(i=0; i < 4; i++){
            System.out.printf("linha %d : %d %d%d  ",i, tamBarco[i], posXInt[i], posYInt[i]);
            System.out.printf("\n");
        }
        
        
        for(j = 0; j <= 3; j++){ //verifica a qtd de barco
            for(int k = 3; k >= 0; k--){
                if(j != k){
                    if(tamBarco[j] == tamBarco[k]){
                        if(tamBarco[j] == 2 && verificaTwo == 0){ //primeiro barco de tam 2
                            verificaTwo = 1;
                            continue;
                        }
                        if(tamBarco[j] == 2 && verificaTwo == 1){ //segundo barco de tam 2
                            verificaTwo = 2;
                            continue;
                        }
                        if(tamBarco[j] == 2 && verificaTwo == 2){ //terceiro barco ou mais de tam 2
                            JOptionPane.showMessageDialog(this, "O documento é inválido. Só existem dois barcos com tamanho 2.");
                            this.dispose();
                            break;
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "O documento é inválido. Os barcos não são únicos.");
                                this.dispose();
                                break;
                            }
                        }
                    }
                }
            }
       
        //Bota água em tudo
        for(i=0; i<10; i++){
            for(j = 0; j < 10; j++){
                botoes[i][j].setBackground(new java.awt.Color(0, 0, 255));
                temp.matriz[i][j]=0;
            }
        }
        
        boolean ocupado;
        int verificaDois = 0;
        
        for(i = 0; i < 4; i++){ //começa a colorir o mapa de acordo com o arquivo TXT
            ocupado = false;
            
           if(i >= 1){
                 for( j = posYInt[i]; j < (posYInt[i] + tamBarco[i]); j++){
                    if(temp.matriz[posXInt[i]][j] != 0){
                        ocupado = true;
                        JOptionPane.showMessageDialog(this, "O documento é inválido. Existem mais de 1 barco na mesma posição."); //lembrar de fechar o jogo
                        break;
                    }
                }
            }
           
            if(ocupado){
                break;
            }
            
            ///////////////////// SUBMARINO /////////////////////////////
            
            if(tamBarco[i] == 2 && verificaDois == 0){ //Submarino cor: Vermelho num: 1
                for(j = posYInt[i]; j < (posYInt[i] + 2); j++){
                    botoes[posXInt[i]][j].setBackground(new java.awt.Color(255, 51, 51));
                    verificaDois = 1;
                    temp.matriz[posXInt[i]][j] = 1;
                    }
                continue;
            }
            
            /*-------DICA------------
            int dica = 0 ; //global
            boolean enableDica = false; //global
            
            //o label do botão será "Dica(3 restantes)"
            //quando clica no botao de dica
                dica += 1;
                if(dica > 3){
                    JOptionPane.showMessageDialog(this, "Você não pode pegar mais dicas.");
                    this.setText("Dica(%d restantes)", (3 - dica));
                {
                else{
                    enableDica = true;
                }
            
            //nos botoes
                if(enableDica){
                    if(este botao != 0){
                        JOptionPane.showMessageDialog(this, "Existe um barco aqui.");
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Não existe nenhum barco aqui.");
                    }
                enableDica = false;
                }
            */
            
            ///////////////////// CAÇA /////////////////////////////
            
            if(tamBarco[i] == 2 && verificaDois == 1){ //Caça cor: Roxo num: 2
                for(j = posYInt[i]; j < (posYInt[i] + 2); j++){
                            botoes[posXInt[i]][j].setBackground(new java.awt.Color(153, 0, 255));
                            verificaDois = 2;
                            temp.matriz[posXInt[i]][j] = 2;
                        }
            }
            
            ///////////////////// ESCOLTA /////////////////////////////
            
            if(tamBarco[i] == 3){ //Navio de Escolta cor: Laranja num: 3
               for(j = posYInt[i]; j < (posYInt[i] + 3); j++){
                        botoes[posXInt[i]][j].setBackground(new java.awt.Color(255, 153, 102));
                        temp.matriz[posXInt[i]][j] = 3;
                        }
        }
            
        ///////////////////// PORTA AVIAO /////////////////////////////
            
            if(tamBarco[i] == 4){ //Porta Aviao num: 4
                for(j = posYInt[i]; j < (posYInt[i] + 4); j++){
                        botoes[posXInt[i]][j].setBackground(new java.awt.Color(0, 28, 4));
                        temp.matriz[posXInt[i]][j] = 4;
                    }
            }
    }
        
    for(i=0; i<10; i++){
        for(j=0; j<10; j++){
            System.out.printf(" %d ",temp.matriz[i][j]);
        }
            System.out.printf("\n");
        }
        
    //------------------------ TIRO ---------------------------------------
        
      // temp.setVisible(false); 
       TXT tiro= new TXT();
       tiro.setVisible(false);
       
       JButton[][] botao= new JButton[10][10];
        //A
        botao[0][0]= tiro.A0 ;
        botao[0][1]= tiro.A1;
        botao[0][2]= tiro.A2;
        botao[0][3]= tiro.A3;
        botao[0][4]= tiro.A4;
        botao[0][5]= tiro.A5;        
        botao[0][6]= tiro.A6;
        botao[0][7]= tiro.A7;
        botao[0][8]= tiro.A8;
        botao[0][9]= tiro.A9;
        //B
        botao[1][0]= tiro.B0;
        botao[1][1]= tiro.B1;
        botao[1][2]= tiro.B2;
        botao[1][3]= tiro.B3;
        botao[1][4]= tiro.B4;
        botao[1][5]= tiro.B5;
        botao[1][6]= tiro.B6;
        botao[1][7]= tiro.B7;
        botao[1][8]= tiro.B8;
        botao[1][9]= tiro.B9;
        //C
        botao[2][0]= tiro.C0;
        botao[2][1]= tiro.C1;
        botao[2][2]= tiro.C2;
        botao[2][3]= tiro.C3;
        botao[2][4]= tiro.C4;
        botao[2][5]= tiro.C5;
        botao[2][6]= tiro.C6;
        botao[2][7]= tiro.C7;
        botao[2][8]= tiro.C8;
        botao[2][9]= tiro.C9;
        //D
        botao[3][0]= tiro.D0;
        botao[3][1]= tiro.D1;
        botao[3][2]= tiro.D2;
        botao[3][3]= tiro.D3;
        botao[3][4]= tiro.D4;
        botao[3][5]= tiro.D5;
        botao[3][6]= tiro.D6;
        botao[3][7]= tiro.D7;
        botao[3][8]= tiro.D8;
        botao[3][9]= tiro.D9;
        //E
        botao[4][0]= tiro.E0;
        botao[4][1]= tiro.E1;
        botao[4][2]= tiro.E2;
        botao[4][3]= tiro.E3;
        botao[4][4]= tiro.E4;
        botao[4][5]= tiro.E5;
        botao[4][6]= tiro.E6;     
        botao[4][7]= tiro.E7;
        botao[4][8]= tiro.E8;
        botao[4][9]= tiro.E9;
        //F
        botao[5][0]= tiro.F0;
        botao[5][1]= tiro.F1;
        botao[5][2]= tiro.F2;
        botao[5][3]= tiro.F3;
        botao[5][4]= tiro.F4;
        botao[5][5]= tiro.F5;
        botao[5][6]= tiro.F6;
        botao[5][7]= tiro.F7;
        botao[5][8]= tiro.F8;
        botao[5][9]= tiro.F9;
        //G
        botao[6][0]= tiro.G0;
        botao[6][1]= tiro.G1;
        botao[6][2]= tiro.G2;
        botao[6][3]= tiro.G3;
        botao[6][4]= tiro.G4;
        botao[6][5]= tiro.G5;
        botao[6][6]= tiro.G6;
        botao[6][7]= tiro.G7;
        botao[6][8]= tiro.G8;
        botao[6][9]= tiro.G9;
        //H
        botao[7][0]= tiro.H0;
        botao[7][1]= tiro.H1;        
        botao[7][2]= tiro.H2;
        botao[7][3]= tiro.H3;
        botao[7][4]= tiro.H4;
        botao[7][5]= tiro.H5;
        botao[7][6]= tiro.H6;
        botao[7][7]= tiro.H7;
        botao[7][8]= tiro.H8;
        botao[7][9]= tiro.H9;
        //I
        botao[8][0]= tiro.I0;
        botao[8][1]= tiro.I1;
        botao[8][2]= tiro.I2;
        botao[8][3]= tiro.I3;
        botao[8][4]= tiro.I4;
        botao[8][5]= tiro.I5;
        botao[8][6]= tiro.I6;
        botao[8][7]= tiro.I7;
        botao[8][8]= tiro.I8;
        botao[8][9]= tiro.I9;
        //J
        botao[9][0]= tiro.J0;
        botao[9][1]= tiro.J1;
        botao[9][2]= tiro.J2;
        botao[9][3]= tiro.J3;
        botao[9][4]= tiro.J4;
        botao[9][5]= tiro.J5;
        botao[9][6]= tiro.J6;
        botao[9][7]= tiro.J7;
        botao[9][8]= tiro.J8;
        botao[9][9]= tiro.J9;
       
       int numAleatorio;
         int LinhaSub, ColunaSub, LinhaEscolta,ColunaEscolta, LinhaCaca, ColunaCaca;
         int matriz[][]= new int[10][10];
         
           numAleatorio =(int) (Math.round(0+(Math.random()*2)));
        
        matriz = temp.getMatriz();
         //Submarino
         if(numAleatorio == 0){
             
             LinhaSub= temp.getPosicaoSubL();
             ColunaSub = temp.getPosicaoSubC();
             boolean submarino=false;
             
              for( j = ColunaSub; j < ColunaSub + 2; j++){
                  if(matriz[LinhaSub][j]==3){
                      submarino=true;
                  }
              }
                
             if(submarino){
                 linhaSorteada =(int) (Math.round(0+(Math.random()*9)));
                 colunaSorteada = (int) (Math.round(0+(Math.random()*6)));
              
                botao[linhaSorteada][colunaSorteada].setBackground(new java.awt.Color(145, 13, 23));
             }
             
         }
         //Caça
          if(numAleatorio == 1){
                
             LinhaCaca= temp.getPosicaoCacaL();
             ColunaCaca = temp.getPosicaoCacaC();
             boolean caca=false;
             
              for( j = ColunaCaca; j < ColunaCaca + 2; j++){
                  if(matriz[LinhaCaca][j]==2){
                      caca=true;
                  }
              }
             
              if(caca){
                  
                linhaSorteada =(int) (Math.round(0+(Math.random()*9)));
                colunaSorteada = (int) (Math.round(0+(Math.random()*6)));

                botao[linhaSorteada][colunaSorteada].setBackground(new java.awt.Color(145, 13, 23));
                botao[linhaSorteada-1][colunaSorteada].setBackground(new java.awt.Color(145, 13, 23));
                botao[linhaSorteada+1][colunaSorteada].setBackground(new java.awt.Color(145, 13, 23));
                botao[linhaSorteada][colunaSorteada-1].setBackground(new java.awt.Color(145, 13, 23));
                botao[linhaSorteada][colunaSorteada+1].setBackground(new java.awt.Color(145, 13, 23));
                  
              }
         }
         
         //Navio Escolta
         if(numAleatorio == 2){
             
             LinhaEscolta= temp.getPosicaoEscoltaL();
             ColunaEscolta = temp.getPosicaoEscoltaC();
             boolean navio=false;
             
              for( j = ColunaEscolta; j < ColunaEscolta + 2; j++){
                  if(matriz[LinhaEscolta][j]==1){
                      navio=true;
                  }
              }
             if(navio){
                 
              linhaSorteada =(int) (Math.round(0+(Math.random()*9)));
             colunaSorteada = (int) (Math.round(0+(Math.random()*6)));
                        
              for( j = colunaSorteada; j < colunaSorteada + 1; j++){
			 
	      botao[linhaSorteada][j].setBackground(new java.awt.Color(145, 13, 23));
             }
             
                 
             }
            
         }
         System.out.println("--------------------Matriz Tiro-----------------------");
         for(i=0; i<10; i++){
            for(j=0; j<10; j++){
                 System.out.printf(" %d ",matriz[i][j]);
            }
            System.out.printf("\n");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A0;
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7;
    private javax.swing.JButton A8;
    private javax.swing.JButton A9;
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton C0;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JButton C9;
    private javax.swing.JButton D0;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton D6;
    private javax.swing.JButton D7;
    private javax.swing.JButton D8;
    private javax.swing.JButton D9;
    private javax.swing.JButton E0;
    private javax.swing.JButton E1;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton E4;
    private javax.swing.JButton E5;
    private javax.swing.JButton E6;
    private javax.swing.JButton E7;
    private javax.swing.JButton E8;
    private javax.swing.JButton E9;
    private javax.swing.JButton F0;
    private javax.swing.JButton F1;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JButton F5;
    private javax.swing.JButton F6;
    private javax.swing.JButton F7;
    private javax.swing.JButton F8;
    private javax.swing.JButton F9;
    private javax.swing.JButton G0;
    private javax.swing.JButton G1;
    private javax.swing.JButton G2;
    private javax.swing.JButton G3;
    private javax.swing.JButton G4;
    private javax.swing.JButton G5;
    private javax.swing.JButton G6;
    private javax.swing.JButton G7;
    private javax.swing.JButton G8;
    private javax.swing.JButton G9;
    private javax.swing.JButton H0;
    private javax.swing.JButton H1;
    private javax.swing.JButton H2;
    private javax.swing.JButton H3;
    private javax.swing.JButton H4;
    private javax.swing.JButton H5;
    private javax.swing.JButton H6;
    private javax.swing.JButton H7;
    private javax.swing.JButton H8;
    private javax.swing.JButton H9;
    private javax.swing.JButton I0;
    private javax.swing.JButton I1;
    private javax.swing.JButton I2;
    private javax.swing.JButton I3;
    private javax.swing.JButton I4;
    private javax.swing.JButton I5;
    private javax.swing.JButton I6;
    private javax.swing.JButton I7;
    private javax.swing.JButton I8;
    private javax.swing.JButton I9;
    private javax.swing.JButton J0;
    private javax.swing.JButton J1;
    private javax.swing.JButton J2;
    private javax.swing.JButton J3;
    private javax.swing.JButton J4;
    private javax.swing.JButton J5;
    private javax.swing.JButton J6;
    private javax.swing.JButton J7;
    private javax.swing.JButton J8;
    private javax.swing.JButton J9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
