/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;
import javax.swing.JButton;
import java.awt.Color;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */

/*
 ---------   modelo -----------------
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(I9,I8,2); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(I9,I8,I7,3);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(I8,1); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(J0,J3,J2,J1,4); 
           
        }
*/
public class PosBarco extends javax.swing.JFrame {

    /**
     * Creates new form JogadorTela
     */
    public PosBarco() {
        initComponents();
    }
          JButton botao= new JButton();

    java.awt.Color color= new java.awt.Color(145, 13, 23);
    java.awt.Color SubRed= new java.awt.Color(255, 51, 51);
     java.awt.Color PortaGreen = new java.awt.Color(0, 28, 4);
     java.awt.Color  CacaRoxo = new  java.awt.Color(153, 0, 255);
     java.awt.Color  NavioLaran = new java.awt.Color(255, 153, 102);
     
    public int getSub() {
        return Sub;
    }

    public void setSub(int Sub) {
        this.Sub = Sub;
    }

    public int getNav() {
        return Nav;
    }

    public void setNav(int Navio) {
        this.Nav = Navio;
    }

    public int getCa() {
        return Ca;
    }

    public void setCa(int Caca) {
        this.Ca = Caca;
    }

   

    public int getPorta() {
        return Porta;
    }

    public void setPorta(int Porta) {
        this.Porta = Porta;
    }

     private int Sub=0, Nav=0, Ca=0, Porta=0;
     
     private int limiteSub=0, limiteNav=0, limiteCa=0, limitePorta=0;

     private void setlimiteSub(int num) {
        this.limiteSub = num;
    }
     
     private void setlimiteNav(int num) {
        this.limiteNav = num;
    }
     
     private void setlimiteCa(int num) {
        this.limiteCa = num;
    }
     
     private void setlimitePorta(int num) {
        this.limitePorta = num;
    }

    public  int getLimiteSub() {
        return limiteSub;
    }

    public  int getLimiteNav() {
        return limiteNav;
    }

    public int getLimiteCa() {
        return limiteCa;
    }

    public int getLimitePorta() {
        return limitePorta;
    }
    
   
    
     public void VerificandoCor(JButton botao,JButton botao1,int num){
       
        if((botao.getBackground()!= SubRed && botao1.getBackground()!= SubRed  
                && botao.getBackground()!= PortaGreen && botao1.getBackground()!= PortaGreen  
                && botao.getBackground()!= CacaRoxo && botao1.getBackground()!= CacaRoxo 
                && botao.getBackground()!= NavioLaran  && botao1.getBackground()!= NavioLaran )){

           
           
           switch(num){
                case 1:
                    this.setlimiteSub(1);
                     botao.setBackground(SubRed);
                    botao1.setBackground(SubRed);
                            break;
                case 2:
                   this.setlimiteNav(1);
                   break;
                case 3:
                    this.setlimiteCa(1);
                     botao.setBackground(CacaRoxo);
                    botao1.setBackground(CacaRoxo);
                    break;
                case 4:
                    this.setlimitePorta(1);
                    break;
                   
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Escolh novamente um lugar para o barco" );
             this.setlimiteSub(0);
            
        }
    }
     
      public void VerificandoCor(JButton botao, JButton botao1, JButton botao2, int num){
       
        if((botao.getBackground()!= SubRed && botao1.getBackground()!= SubRed  && botao2.getBackground()!= SubRed 
                && botao.getBackground()!= PortaGreen && botao1.getBackground()!= PortaGreen  && botao2.getBackground()!= PortaGreen 
                && botao.getBackground()!= CacaRoxo && botao1.getBackground()!= CacaRoxo  && botao2.getBackground()!= CacaRoxo  )){
            botao.setBackground(NavioLaran);
            botao1.setBackground(NavioLaran);
            botao2.setBackground(NavioLaran);
           
             switch(num){
                case 1:
                    this.setlimiteSub(1);
                            break;
                case 2:
                   this.setlimiteNav(1);
                   break;
                case 3:
                    this.setlimiteCa(1);
                    break;
                case 4:
                    this.setlimitePorta(1);
                    break;
                   
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Escolh novamente um lugar para o barco" );
            this.setlimiteNav(0);
            
        }
    }
      
       public void VerificandoCor(JButton botao, JButton botao1, JButton botao2, JButton botao3,int num){
        
        
        if((botao.getBackground()!= SubRed && botao1.getBackground()!= SubRed && botao2.getBackground()!= SubRed && botao3.getBackground()!= SubRed 
                &&  botao.getBackground()!= NavioLaran && botao1.getBackground()!= NavioLaran && botao2.getBackground()!= NavioLaran && botao3.getBackground()!= NavioLaran
                &&  botao.getBackground()!= CacaRoxo && botao1.getBackground()!= CacaRoxo && botao2.getBackground()!= CacaRoxo && botao3.getBackground()!= CacaRoxo )){
            botao.setBackground(PortaGreen);
            botao1.setBackground(PortaGreen);
            botao2.setBackground(PortaGreen);
            botao3.setBackground(PortaGreen);
            switch(num){
                case 1:
                    this.setlimiteSub(1);
                            break;
                case 2:
                   this.setlimiteNav(1);
                   break;
                case 3:
                    this.setlimiteCa(1);
                    break;
                case 4:
                    this.setlimitePorta(1);
                    break;
                   
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Escolh novamente um lugar para o barco" );
            this.setlimitePorta(0);
           
        }
        
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        J2 = new javax.swing.JButton();
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
        J3 = new javax.swing.JButton();
        J4 = new javax.swing.JButton();
        J5 = new javax.swing.JButton();
        J6 = new javax.swing.JButton();
        J7 = new javax.swing.JButton();
        J8 = new javax.swing.JButton();
        J9 = new javax.swing.JButton();
        Submarino = new javax.swing.JButton();
        Navio = new javax.swing.JButton();
        Caca = new javax.swing.JButton();
        PortaAviao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 105, 193));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        A0.setBackground(new java.awt.Color(0, 0, 255));
        A0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A0ActionPerformed(evt);
            }
        });

        A1.setBackground(new java.awt.Color(0, 0, 255));
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        A2.setBackground(new java.awt.Color(0, 0, 255));
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        A3.setBackground(new java.awt.Color(0, 0, 255));
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        A4.setBackground(new java.awt.Color(0, 0, 255));
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        A5.setBackground(new java.awt.Color(0, 0, 255));
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        A6.setBackground(new java.awt.Color(0, 0, 255));
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        A7.setBackground(new java.awt.Color(0, 0, 255));
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });

        A8.setBackground(new java.awt.Color(0, 0, 255));
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });

        A9.setBackground(new java.awt.Color(0, 0, 255));
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });

        B0.setBackground(new java.awt.Color(0, 0, 255));
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(0, 0, 255));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(0, 0, 255));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(0, 0, 255));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(0, 0, 255));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(0, 0, 255));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(0, 0, 255));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setBackground(new java.awt.Color(0, 0, 255));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(0, 0, 255));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(0, 0, 255));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        C0.setBackground(new java.awt.Color(0, 0, 255));
        C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C0ActionPerformed(evt);
            }
        });

        C1.setBackground(new java.awt.Color(0, 0, 255));
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setBackground(new java.awt.Color(0, 0, 255));
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C3.setBackground(new java.awt.Color(0, 0, 255));
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        C4.setBackground(new java.awt.Color(0, 0, 255));
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        C5.setBackground(new java.awt.Color(0, 0, 255));
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        C6.setBackground(new java.awt.Color(0, 0, 255));
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        C7.setBackground(new java.awt.Color(0, 0, 255));
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });

        C8.setBackground(new java.awt.Color(0, 0, 255));
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        C9.setBackground(new java.awt.Color(0, 0, 255));
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });

        J2.setBackground(new java.awt.Color(0, 0, 255));
        J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J2ActionPerformed(evt);
            }
        });

        D0.setBackground(new java.awt.Color(0, 0, 255));
        D0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D0ActionPerformed(evt);
            }
        });

        D1.setBackground(new java.awt.Color(0, 0, 255));
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        D2.setBackground(new java.awt.Color(0, 0, 255));
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        D3.setBackground(new java.awt.Color(0, 0, 255));
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        D4.setBackground(new java.awt.Color(0, 0, 255));
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        D5.setBackground(new java.awt.Color(0, 0, 255));
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });

        D6.setBackground(new java.awt.Color(0, 0, 255));
        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
            }
        });

        D7.setBackground(new java.awt.Color(0, 0, 255));
        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });

        D8.setBackground(new java.awt.Color(0, 0, 255));
        D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D8ActionPerformed(evt);
            }
        });

        D9.setBackground(new java.awt.Color(0, 0, 255));
        D9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D9ActionPerformed(evt);
            }
        });

        E0.setBackground(new java.awt.Color(0, 0, 255));
        E0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E0ActionPerformed(evt);
            }
        });

        E1.setBackground(new java.awt.Color(0, 0, 255));
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        E2.setBackground(new java.awt.Color(0, 0, 255));
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });

        E3.setBackground(new java.awt.Color(0, 0, 255));
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });

        E4.setBackground(new java.awt.Color(0, 0, 255));
        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4ActionPerformed(evt);
            }
        });

        E5.setBackground(new java.awt.Color(0, 0, 255));
        E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E5ActionPerformed(evt);
            }
        });

        E6.setBackground(new java.awt.Color(0, 0, 255));
        E6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E6ActionPerformed(evt);
            }
        });

        E7.setBackground(new java.awt.Color(0, 0, 255));
        E7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E7ActionPerformed(evt);
            }
        });

        E8.setBackground(new java.awt.Color(0, 0, 255));
        E8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E8ActionPerformed(evt);
            }
        });

        E9.setBackground(new java.awt.Color(0, 0, 255));
        E9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E9ActionPerformed(evt);
            }
        });

        F0.setBackground(new java.awt.Color(0, 0, 255));
        F0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F0ActionPerformed(evt);
            }
        });

        F1.setBackground(new java.awt.Color(0, 0, 255));
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });

        F2.setBackground(new java.awt.Color(0, 0, 255));
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });

        F3.setBackground(new java.awt.Color(0, 0, 255));
        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });

        F4.setBackground(new java.awt.Color(0, 0, 255));
        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });

        F5.setBackground(new java.awt.Color(0, 0, 255));
        F5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F5ActionPerformed(evt);
            }
        });

        F6.setBackground(new java.awt.Color(0, 0, 255));
        F6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F6ActionPerformed(evt);
            }
        });

        F7.setBackground(new java.awt.Color(0, 0, 255));
        F7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F7ActionPerformed(evt);
            }
        });

        F8.setBackground(new java.awt.Color(0, 0, 255));
        F8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F8ActionPerformed(evt);
            }
        });

        F9.setBackground(new java.awt.Color(0, 0, 255));
        F9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F9ActionPerformed(evt);
            }
        });

        G0.setBackground(new java.awt.Color(0, 0, 255));
        G0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0ActionPerformed(evt);
            }
        });

        G1.setBackground(new java.awt.Color(0, 0, 255));
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });

        G2.setBackground(new java.awt.Color(0, 0, 255));
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });

        G3.setBackground(new java.awt.Color(0, 0, 255));
        G3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G3ActionPerformed(evt);
            }
        });

        G4.setBackground(new java.awt.Color(0, 0, 255));
        G4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G4ActionPerformed(evt);
            }
        });

        G5.setBackground(new java.awt.Color(0, 0, 255));
        G5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G5ActionPerformed(evt);
            }
        });

        G6.setBackground(new java.awt.Color(0, 0, 255));
        G6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G6ActionPerformed(evt);
            }
        });

        G7.setBackground(new java.awt.Color(0, 0, 255));
        G7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G7ActionPerformed(evt);
            }
        });

        G8.setBackground(new java.awt.Color(0, 0, 255));
        G8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G8ActionPerformed(evt);
            }
        });

        G9.setBackground(new java.awt.Color(0, 0, 255));
        G9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G9ActionPerformed(evt);
            }
        });

        H0.setBackground(new java.awt.Color(0, 0, 255));
        H0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H0ActionPerformed(evt);
            }
        });

        H1.setBackground(new java.awt.Color(0, 0, 255));
        H1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H1ActionPerformed(evt);
            }
        });

        H2.setBackground(new java.awt.Color(0, 0, 255));
        H2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H2ActionPerformed(evt);
            }
        });

        H3.setBackground(new java.awt.Color(0, 0, 255));
        H3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H3ActionPerformed(evt);
            }
        });

        H4.setBackground(new java.awt.Color(0, 0, 255));
        H4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H4ActionPerformed(evt);
            }
        });

        H5.setBackground(new java.awt.Color(0, 0, 255));
        H5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H5ActionPerformed(evt);
            }
        });

        H6.setBackground(new java.awt.Color(0, 0, 255));
        H6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H6ActionPerformed(evt);
            }
        });

        H7.setBackground(new java.awt.Color(0, 0, 255));
        H7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H7ActionPerformed(evt);
            }
        });

        H8.setBackground(new java.awt.Color(0, 0, 255));
        H8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H8ActionPerformed(evt);
            }
        });

        H9.setBackground(new java.awt.Color(0, 0, 255));
        H9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H9ActionPerformed(evt);
            }
        });

        I0.setBackground(new java.awt.Color(0, 0, 255));
        I0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I0ActionPerformed(evt);
            }
        });

        I1.setBackground(new java.awt.Color(0, 0, 255));
        I1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I1ActionPerformed(evt);
            }
        });

        I2.setBackground(new java.awt.Color(0, 0, 255));
        I2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I2ActionPerformed(evt);
            }
        });

        I3.setBackground(new java.awt.Color(0, 0, 255));
        I3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I3ActionPerformed(evt);
            }
        });

        I4.setBackground(new java.awt.Color(0, 0, 255));
        I4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I4ActionPerformed(evt);
            }
        });

        I5.setBackground(new java.awt.Color(0, 0, 255));
        I5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I5ActionPerformed(evt);
            }
        });

        I6.setBackground(new java.awt.Color(0, 0, 255));
        I6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I6ActionPerformed(evt);
            }
        });

        I7.setBackground(new java.awt.Color(0, 0, 255));
        I7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I7ActionPerformed(evt);
            }
        });

        I8.setBackground(new java.awt.Color(0, 0, 255));
        I8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I8ActionPerformed(evt);
            }
        });

        I9.setBackground(new java.awt.Color(0, 0, 255));
        I9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I9ActionPerformed(evt);
            }
        });

        J0.setBackground(new java.awt.Color(0, 0, 255));
        J0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J0ActionPerformed(evt);
            }
        });

        J1.setBackground(new java.awt.Color(0, 0, 255));
        J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J1ActionPerformed(evt);
            }
        });

        J3.setBackground(new java.awt.Color(0, 0, 255));
        J3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J3ActionPerformed(evt);
            }
        });

        J4.setBackground(new java.awt.Color(0, 0, 255));
        J4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J4ActionPerformed(evt);
            }
        });

        J5.setBackground(new java.awt.Color(0, 0, 255));
        J5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J5ActionPerformed(evt);
            }
        });

        J6.setBackground(new java.awt.Color(0, 0, 255));
        J6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J6ActionPerformed(evt);
            }
        });

        J7.setBackground(new java.awt.Color(0, 0, 255));
        J7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J7ActionPerformed(evt);
            }
        });

        J8.setBackground(new java.awt.Color(0, 0, 255));
        J8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J8ActionPerformed(evt);
            }
        });

        J9.setBackground(new java.awt.Color(0, 0, 255));
        J9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J9ActionPerformed(evt);
            }
        });

        Submarino.setText("Submarino");
        Submarino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmarinoActionPerformed(evt);
            }
        });

        Navio.setText("Navio Escolta");
        Navio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NavioActionPerformed(evt);
            }
        });

        Caca.setText("Caça");
        Caca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CacaActionPerformed(evt);
            }
        });

        PortaAviao.setText("Porta Avião");
        PortaAviao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PortaAviaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A0, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(C0, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D0, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E0, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F0, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G0, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(H0, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I0, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J0, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(Submarino, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(Navio, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(J5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Caca, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(PortaAviao, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(A9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A0, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(B0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(B1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(C0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(D0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(C2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(C3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(F0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(G8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J0, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Caca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Submarino, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PortaAviao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Navio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
       
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(A1,A2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(A1,A2,A3,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
              VerificandoCor(A1,A2,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(A1,A2,A3,A4,4); 
        }// TODO add your handling code here:A1.setBackground(color);
                    // TODO add your handling code here:
    }//GEN-LAST:event_A1ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(A3,A2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(A3,A2,A1,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(A3,A2,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(A3,A2,A1,A0,4); 
        }// TODO add your handling code here: A3.setBackground(color);// TODO add your handling code here:
    }//GEN-LAST:event_A3ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(B9,B8,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(B9,B8,B7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(B9,B8,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(B9,B8,B7,B6,4); 
        }// TODO add your handling code here: B9.setBackground(color);// TODO add your handling code here:
    }//GEN-LAST:event_B9ActionPerformed

    private void C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C0ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(C0,C1,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(C0,C1,C2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
               VerificandoCor(C0,C1,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(C0,C1,C2,C3,4); 
        }// TODO add your handling code here:C0.setBackground(color); // TODO add your handling code here:
    }//GEN-LAST:event_C0ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(C1,C2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(C1,C2,C3,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(C1,C2,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(C1,C2,C3,C4,4); 
        }// TODO add your handling code here:C1.setBackground(color); // TODO add your handling code here:
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
      int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(C2,C3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(C2,C3,C4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(C2,C3,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(C2,C3,C4,C5,4); 
        }// TODO add your handling code here: C2.setBackground(color); // TODO add your handling code here:
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(C3,C2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(C3,C2,C1,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(C3,C2,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(C3,C2,C1,C0,4); 
        }// TODO add your handling code here:C3.setBackground(color); // TODO add your handling code here:
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(C4,C3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(C4,C3,C2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(C4,C3,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(C4,C3,C2,C1,4); 
        }// TODO add your handling code here: C4.setBackground(color);// TODO add your handling code here:
    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(C5,C4,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(C5,C4,C3,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
              VerificandoCor(C5,C4,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(C5,C4,C3,C2,4); 
        }// TODO add your handling code here:C5.setBackground(color); // TODO add your handling code here:
    }//GEN-LAST:event_C5ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(C6,C5,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(C6,C5,C4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(C6,C5,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(C6,C5,C4,C3,4); 
        }// TODO add your handling code here:C6.setBackground(color); // TODO add your handling code here:
    }//GEN-LAST:event_C6ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
      int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(C7,C6,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(C6,C5,C7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(C7,C6,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(C5,C4,C7,C6,4); 
        }// TODO add your handling code here: C7.setBackground(color); // TODO add your handling code here:
    }//GEN-LAST:event_C7ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(C8,C7,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(C6,C8,C7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(C8,C7,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(C5,C8,C7,C6,4); 
        }// TODO add your handling code here:C8.setBackground(color);// TODO add your handling code here:
    }//GEN-LAST:event_C8ActionPerformed

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(C9,C8,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(C9,C8,C7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(C9,C8,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(C9,C8,C7,C6,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_C9ActionPerformed

    private void J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J2ActionPerformed
      int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(J2,J3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(J2,J3,J4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(J2,J3,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(J2,J3,J4,J5,4); 
        }// TODO add your handling code here: J2.setBackground(color);// TODO add your handling code here:
    }//GEN-LAST:event_J2ActionPerformed

    private void D0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D0ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(D0,D1,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(D0,D1,D2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(D0,D1,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(D0,D1,D2,D3,4); 
        }// TODO add your handling code here:// D0.setBackground(color);// TODO add your handling code here:
    }//GEN-LAST:event_D0ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(D1,D2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(D1,D2,D3,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(D1,D2,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(D1,D2,D3,D4,4);
        }
        }// TODO add your handling code here:    }//GEN-LAST:event_D1ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(D2,D3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(D2,D3,D4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(D2,D3,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(D2,D3,D4,D5,4); 
        }
        }// TODO add your handling code here:    }//GEN-LAST:event_D2ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(D3,D2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(D3,D2,D1,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(D3,D2,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(D3,D2,D1,D0,4); 
        }
        }// TODO add your handling code here:    }//GEN-LAST:event_D3ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(D4,D3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(D4,D3,D2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(D4,D3,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(D4,D3,D2,D1,4); 
        }
        }// TODO add your handling code here:    }//GEN-LAST:event_D4ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(D5,D4,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(D5,D4,D3,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(D5,D4,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(D5,D4,D3,D2,4); 
        }
        }// TODO add your handling code here:    }//GEN-LAST:event_D5ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(D6,D5,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(D6,D5,D4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(D6,D5,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(D5,D4,D3,D6,4); 
        }
        }// TODO add your handling code here:    }//GEN-LAST:event_D6ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(D7,D6,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(D5,D6,D7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(D7,D6,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(D5,D4,D7,D6,4); 
        }
        }// TODO add your handling code here:    }//GEN-LAST:event_D7ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(D7,D8,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(D6,D5,D7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(D7,D8,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(D5,D4,D7,D6,4); 
        }// TODO add your handling code here: 
    }//GEN-LAST:event_D8ActionPerformed

    private void D9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D9ActionPerformed
int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(D9,D8,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(D9,D8,D7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
              VerificandoCor(D9,D8,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(D9,D8,D7,D6,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_D9ActionPerformed

    private void E0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E0ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(E0,E1,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(E0,E1,E2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(E0,E1,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(E0,E1,E2,E3,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_E0ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(E1,E2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(E1,E2,E3,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
              VerificandoCor(E1,E2,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(E1,E2,E3,E4,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_E1ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
      int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(E2,E3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(E2,E3,E4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(E2,E3,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(E2,E3,E4,E5,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_E2ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(E3,E2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(E3,E2,E1,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(E3,E2,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(E3,E2,E1,E0,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_E3ActionPerformed

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4ActionPerformed
int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(E4,E3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(E4,E3,E2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(E4,E3,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(E4,E5,E3,E6,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_E4ActionPerformed

    private void E5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E5ActionPerformed
int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(E5,E4,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(E5,E4,E3,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(E5,E4,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(E5,E4,E3,E6,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_E5ActionPerformed

    private void E6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E6ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(E6,E5,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(E6,E5,E4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(E6,E5,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(E4,E5,E3,E6,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_E6ActionPerformed

    private void E7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E7ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(E7,E6,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(E6,E5,E7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(E7,E6,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(E5,E4,E7,E6,4);
        }
  }// TODO add your handling code here:    }//GEN-LAST:event_E7ActionPerformed

    private void E8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E8ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(E7,E8,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(E6,E8,E7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
              VerificandoCor(E7,E8,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(E5,E8,E7,E6,4); 
        }
  }// TODO add your handling code here:    }//GEN-LAST:event_E8ActionPerformed

    private void E9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E9ActionPerformed
      int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(E9,E8,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(E9,E8,E7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(E9,E8,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(E9,E8,E7,E6,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_E9ActionPerformed

    private void F0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F0ActionPerformed
              int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(F0,F1,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(F0,F1,F2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(F0,F1,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(F0,F1,F2,F3,4); 
        }// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_F0ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
             int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(F1,F2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(F1,F2,F3,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(F1,F2,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(F1,F2,F3,F4,4); 
        }// TODO add your handling code here://r TODO add your handling code here:
    }//GEN-LAST:event_F1ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
              int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(F2,F3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(F2,F3,F4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
              VerificandoCor(F2,F3,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(F2,F3,F4,F5,4); 
        }// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_F2ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed
             int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(F3,F2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(F3,F2,F1,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
                       VerificandoCor(F3,F2,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(F3,F2,F1,F0,4); 
        }// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_F3ActionPerformed

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4ActionPerformed
            int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(F4,F3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(F4,F3,F2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(F4,F3,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(F4,F3,F2,F1,4); 
        }// TODO add your handling code here: // TODO add your handling code here:
    }//GEN-LAST:event_F4ActionPerformed

    private void F5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F5ActionPerformed
              int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(F5,F4,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(F5,F4,F3,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(F5,F4,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(F5,F4,F3,F2,4); 
        }// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_F5ActionPerformed

    private void F6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F6ActionPerformed
             int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(F6,F5,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(F6,F5,F4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(F6,F5,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(F3,F4,F5,F6,4); 
        }// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_F6ActionPerformed

    private void F7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F7ActionPerformed
              int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(F7,F6,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(F5,F6,F7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
              VerificandoCor(F7,F6,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(F5,F4,F7,F6,4); 
        }// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_F7ActionPerformed

    private void F8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F8ActionPerformed
              int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(F7,F8,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(F6,F8,F7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
              VerificandoCor(F7,F8,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(F5,F8,F7,F6,4); 
        }// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_F8ActionPerformed

    private void F9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F9ActionPerformed
                 int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(F9,F8,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(F9,F8,F7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
              VerificandoCor(F9,F8,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(F9,F8,F7,F6,4); 
        }// TODO add your handling code here:
// TODO add your handling code here:
    }//GEN-LAST:event_F9ActionPerformed

    private void G0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0ActionPerformed
                int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(G0,G1,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(G0,G1,G2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(F9,F8,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(G0,G1,G2,G3,4); 
        }
    }//GEN-LAST:event_G0ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
                 int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(G1,G2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(G1,G2,G3,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(G1,G2,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(G1,G2,G3,G4,4); 
        }
       
    }//GEN-LAST:event_G1ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
              int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(G2,G3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(G2,G3,G4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(G2,G3,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(G2,G3,G4,G5,4); 
        }
    }//GEN-LAST:event_G2ActionPerformed

    private void G3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G3ActionPerformed
             int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(G3,G2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(G3,G2,G1,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(G3,G2,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(G3,G2,G1,G0,4); 
        }
// TODO add your handling code here:
    }//GEN-LAST:event_G3ActionPerformed

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G4ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(G4,G3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(G4,G5,G3,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(G4,G3,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(G4,G3,G2,G1,4); 
        }
    }//GEN-LAST:event_G4ActionPerformed

    private void G5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G5ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(G5,G4,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(G5,G4,G3,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(G5,G4,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(G1,G3,G4,G5,4); 
        }
    }//GEN-LAST:event_G5ActionPerformed

    private void G6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G6ActionPerformed
          int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(G5,G6,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(G5,G4,G6,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(G5,G6,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(G4,G3,G6,G5,4); 
        }
// TODO add your handling code here:
    }//GEN-LAST:event_G6ActionPerformed

    private void G7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G7ActionPerformed
        
 int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(G6,G7,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(G5,G7,G6,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(G6,G7,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(G4,G7,G6,G5,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_G7ActionPerformed

    private void G8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G8ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(G8,G7,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(G8,G7,G6,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(G8,G7,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(G8,G7,G6,G5,4); 
        }
// TODO add your handling code here:
    }//GEN-LAST:event_G8ActionPerformed

    private void G9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G9ActionPerformed
       
            int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(G9,G8,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(G9,G8,G6,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(G9,G8,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(G9,G8,G6,G5,4); 
        }
    }//GEN-LAST:event_G9ActionPerformed

    private void H0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H0ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(H0,H1,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(H0,H1,H2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(H0,H1,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(H0,H1,H2,H3,4); 
        }
    }//GEN-LAST:event_H0ActionPerformed

    private void H1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H1ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(H1,H2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(H1,H2,H3,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(H1,H2,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(H1,H2,H3,H4,4); 
        }
    }//GEN-LAST:event_H1ActionPerformed

    private void H2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H2ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(H2,H3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(H2,H3,H1,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(H2,H3,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(H2,H3,H1,H4,4); 
        }
    }//GEN-LAST:event_H2ActionPerformed

    private void H3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H3ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(H3,H2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(H3,H2,H1,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(H3,H2,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(H3,H2,H1,H0,4); 
        }
    }//GEN-LAST:event_H3ActionPerformed

    private void H4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H4ActionPerformed
            int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(H4,H3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(H3,H2,H4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(H4,H3,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(H2,H1,H4,H3,4); 
        }
    }//GEN-LAST:event_H4ActionPerformed

    private void H5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H5ActionPerformed
      int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(H4,H5,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(H3,H5,H4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(H4,H5,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(H2,H5,H4,H3,4); 
        }
    }//GEN-LAST:event_H5ActionPerformed

    private void H6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H6ActionPerformed
      
                    int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(H6,H5,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(H6,H5,H4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(H6,H5,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(H6,H5,H4,H3,4); 
        }
    }//GEN-LAST:event_H6ActionPerformed

    private void H7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H7ActionPerformed
       
                int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(H7,H6,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(H7,H6,H5,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(H7,H6,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(H7,H6,H5,H4,4); 
        }
    }//GEN-LAST:event_H7ActionPerformed

    private void H8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H8ActionPerformed
        
                   int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(H8,H7,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(H8,H7,H6,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(H8,H7,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(H8,H7,H6,H5,4); 
        }
    }//GEN-LAST:event_H8ActionPerformed

    private void H9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H9ActionPerformed
        
                    int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(H9,H8,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(H9,H8,H7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
         VerificandoCor(H9,H8,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(H9,H8,H7,H6,4); 
        }
    }//GEN-LAST:event_H9ActionPerformed

    private void I0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I0ActionPerformed
               int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(I0,I1,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(I0,I1,I2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
           VerificandoCor(I0,I1,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(I0,I1,I2,I3,4); 
        }
    }//GEN-LAST:event_I0ActionPerformed

    private void I1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I1ActionPerformed
       
                int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(I1,I2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(I1,I2,I3,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(I1,I2,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(I1,I2,I4,I3,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_I1ActionPerformed

    private void I2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I2ActionPerformed
        
               int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(I2,I3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(I2,I3,I4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(I2,I3,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(I2,I5,I4,I3,4); 
        }
    }//GEN-LAST:event_I2ActionPerformed

    private void I3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I3ActionPerformed
               int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(I3,I2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(I3,I2,I1,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(I3,I2,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(I2,I1,I0,I3,4); 
        }          
    }//GEN-LAST:event_I3ActionPerformed

    private void I4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I4ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(I4,I3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(I4,I3,I2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(I4,I3,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(I2,I1,I4,I3,4); 
        }       
    }//GEN-LAST:event_I4ActionPerformed

    private void I5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I5ActionPerformed
              int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(I4,I5,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(I3,I5,I4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(I4,I5,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(I4,I5,I2,I3,4); 
        }
    }//GEN-LAST:event_I5ActionPerformed

    private void I6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I6ActionPerformed
        
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(I6,I5,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(I6,I5,I4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(I6,I5,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(I6,I5,I4,I3,4); 
        }
        
         // TODO add your handling code here:
    }//GEN-LAST:event_I6ActionPerformed

    private void I7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I7ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(I7,I6,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(I6,I5,I7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
              VerificandoCor(I7,I6,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(I7,I6,I5,I4,4); 
           
        }
    }//GEN-LAST:event_I7ActionPerformed

    private void I8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I8ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(I9,I8,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(I9,I8,I7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
              VerificandoCor(I9,I8,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(I8,I7,I6,I5,4); 
           
        }
    }//GEN-LAST:event_I8ActionPerformed

    private void I9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I9ActionPerformed
        
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
              VerificandoCor(I9,I8,1);        
          
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
            VerificandoCor(I9,I8,I7,2); 
        }
        else if(ca==3 && this.getLimiteCa()==0){
            
            VerificandoCor(I9,I8,3);   
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(I9,I8,I7,I6,4); 
           
        }
     // TODO add your handling code here:
    }//GEN-LAST:event_I9ActionPerformed

    private void J0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J0ActionPerformed
     int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                  
             VerificandoCor(J0,J1,1);
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
           VerificandoCor(J0,J1,J2,2); 
            
        }
        else if(ca==3 && this.getLimiteCa()==0){
                         VerificandoCor(J0,J1,3);    
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(J0,J3,J2,J1,4); 
           
        }
     
             
    }//GEN-LAST:event_J0ActionPerformed

    private void J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J1ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                 
            VerificandoCor(J1,J2,1);
        }
        else if(nav==2 && this.getLimiteNav()==0){
             
            VerificandoCor(J1,J3,J2,2); 
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(J1,J2,3);   
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(J4,J3,J2,J1,4); 
           
        }
     
             
     
    }//GEN-LAST:event_J1ActionPerformed

    private void J3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J3ActionPerformed
      int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
             VerificandoCor(J2,J3,1);     
          
        }
        else if(nav==2 && this.getLimiteNav()==0){
            
           VerificandoCor(J1,J3,J2,2);
            
        }
        else if(ca==3 && this.getLimiteCa()==0){
            
              VerificandoCor(J2,J3,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(J0,J3,J2,J1,4); 
           
        }
     
           
    }//GEN-LAST:event_J3ActionPerformed

    private void J4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J4ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                     
             VerificandoCor(J4,J3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           VerificandoCor(J4,J3,J2,2);
            
        }
        else if(ca==3 && this.getLimiteCa()==0){
             
            VerificandoCor(J4,J3,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(J4,J3,J2,J1,4); 
           
        }
     
    }//GEN-LAST:event_J4ActionPerformed

    private void J5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J5ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                      
            VerificandoCor(J5,J4,1);
        }
        else if(nav==2 && this.getLimiteNav()==0){
             VerificandoCor(J5,J4,J3,2); 
            
        }
        else if(ca==3 && this.getLimiteCa()==0){
            
             VerificandoCor(J5,J4,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(J5,J4,J3,J2,4); 
           
        }
     
    }//GEN-LAST:event_J5ActionPerformed

    private void J6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J6ActionPerformed
            int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                   
          VerificandoCor(J6,J5,1);  
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
            VerificandoCor(J5,J4,J6,2); 
        }
        else if(ca==3 && this.getLimiteCa()==0){
          VerificandoCor(J6,J5,3);   
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(J4,J3,J6,J5,4); 
           
        }
     
    }//GEN-LAST:event_J6ActionPerformed

    private void J7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J7ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
              VerificandoCor(J6,J7,1);       
          
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
            VerificandoCor(J5,J7,J6,2); 
        }
        else if(ca==3 && this.getLimiteCa()==0){
            
            VerificandoCor(J6,J7,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(J4,J7,J6,J5,4); 
           
        }
     
    }//GEN-LAST:event_J7ActionPerformed

    private void J8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J8ActionPerformed
            
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                  
          VerificandoCor(J8,J7,1);  
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
            VerificandoCor(J8,J7,J6,2);
        }
        else if(ca==3 && this.getLimiteCa()==0){
             
               VerificandoCor(J8,J7,3);   
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(J8,J7,J6,J5,4); 
           
        }
     
    }//GEN-LAST:event_J8ActionPerformed

    private void J9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J9ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
               VerificandoCor(J9,J8,1);        
          
        }
        else if(nav==2 && this.getLimiteNav()==0){
            
            VerificandoCor(J9,J8,J7,2); 
        }
        else if(ca==3 && this.getLimiteCa()==0){
            
             VerificandoCor(J9,J8,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(J9,J8,J7,J6,4); 
           
        }
        
     
    }//GEN-LAST:event_J9ActionPerformed

    private void SubmarinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmarinoActionPerformed
      
         this.setSub(1);
        
        
        
    }//GEN-LAST:event_SubmarinoActionPerformed

    private void NavioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NavioActionPerformed
       
        this.setNav(2);
        
         
    }//GEN-LAST:event_NavioActionPerformed

    private void CacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CacaActionPerformed
        
        this.setCa(3);
        
         
    }//GEN-LAST:event_CacaActionPerformed

    private void A0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A0ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(A0,A1,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(A0,A1,A2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(A0,A1,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(A0,A1,A2,A3,4); 
           
        } // TODO add your handling code here:
    }//GEN-LAST:event_A0ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(A2,A3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(A1,A3,A2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(A2,A3,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(A4,A1,A2,A3,4); 
        }
         // TODO add your handling code here:
    }//GEN-LAST:event_A2ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
          int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(A4,A3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(A4,A3,A2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(A4,A3,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(A4,A1,A2,A3,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_A4ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
         int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(A5,A4,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(A5,A4,A3,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(A5,A4,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(A4,A5,A2,A3,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_A5ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
       int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(A6,A5,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(A6,A5,A4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(A6,A5,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(A6,A5,A4,A3,4); 
        } // TODO add your handling code here:
    }//GEN-LAST:event_A6ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(A7,A6,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(A7,A6,A5,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(A7,A6,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(A7,A6,A5,A4,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_A7ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(A8,A7,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(A8,A7,A6,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(A8,A7,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(A8,A7,A6,A5,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_A8ActionPerformed

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A9ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(A9,A8,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(A9,A8,A7,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(A9,A8,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(A9,A8,A7,A6,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_A9ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
           int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(B0,B1,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(B0,B1,B2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(B0,B1,3);  
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(B0,B1,B2,B3,4); 
        }//  TODO add your handling code here:
    }//GEN-LAST:event_B0ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(B2,B1,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(B3,B1,B2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
                        VerificandoCor(B2,B1,3); 

        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(B4,B1,B2,B3,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
              int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(B2,B3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(B2,B3,B4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(B2,B3,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(B4,B5,B2,B3,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
              int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(B3,B2,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(B3,B1,B2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(B3,B2,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(B0,B1,B2,B3,4); 
        }          // TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
             int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(B4,B3,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(B4,B3,B2,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(B4,B3,1); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(B4,B1,B2,B3,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
              int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(B5,B4,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(B5,B4,B3,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(B5,B4,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(B5,B4,B2,B3,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
              int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(B6,B5,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(B6,B5,B4,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
            VerificandoCor(B6,B5,3);
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(B6,B5,B4,B3,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
              int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(B7,B6,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(B7,B6,B5,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
             VerificandoCor(B7,B6,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(B7,B6,B5,B4,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
             int sub= this.getSub();
        int nav= this.getNav();
        int ca= this.getCa();
        int porta= this.getPorta();
        
        if(sub==1 && this.getLimiteSub()==0){ 
                    
           VerificandoCor(B8,B7,1); 
        }
        else if(nav==2 && this.getLimiteNav()==0){
           
          VerificandoCor(B8,B7,B6,2);   
        }
        else if(ca==3 && this.getLimiteCa()==0){
           VerificandoCor(B8,B7,3); 
        }
        else if(porta==4 && this.getLimitePorta()==0){
            VerificandoCor(B8,B7,B6,B5,4); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_B8ActionPerformed

    private void PortaAviaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PortaAviaoActionPerformed
        
        this.setPorta(4);
        
    }//GEN-LAST:event_PortaAviaoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PosBarco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PosBarco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PosBarco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PosBarco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        PosBarco temp= new PosBarco();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PosBarco().setVisible(true);
            }
        });
        
        JButton[][] botoes= new JButton[10][10];
        //A
        botoes[0][0]= temp.A0 ;
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
    private javax.swing.JButton Caca;
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
    private javax.swing.JButton Navio;
    private javax.swing.JButton PortaAviao;
    private javax.swing.JButton Submarino;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   
}
