/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class TablerodeJuego extends javax.swing.JFrame {

    int position1; //integer que sea el valor de la posicion X
     int altura1;
     int position2; //integer que sea el valor de la posicion X
     int altura2;
     boolean Crono;
    boolean TurnoPJ;
    Timer GDado;//Timer que controla el dado

    public TablerodeJuego() {
        //------------------------------------------Colocar una imagen al proyecto-----------------------------------
        Image Icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/unnamed.png"));
        setIconImage(Icono);
        //------------------------------------------------------------------------------------------------------
       
        initComponents();
        Girardado();//metodo de girar dado
        //---------------caras de los dados-------------------
        this.FigDado1.setVisible(false);
        this.FigDado2.setVisible(false);
        this.FigDado3.setVisible(false);
        this.FigDado4.setVisible(false);
        this.FigDado5.setVisible(false);
        this.FigDado6.setVisible(false);
        
        PausarDado1.setVisible(false);
        MoverFicha1.setVisible(false);
        
        GirarDado2.setVisible(false);
        PausarDado2.setVisible(false);
        MoverFicha2.setVisible(false);
        
        GirarDado3.setVisible(false);
        PausarDado3.setVisible(false);
        MoverFicha3.setVisible(false);
        
        GirarDado4.setVisible(false);
        PausarDado4.setVisible(false);
        MoverFicha4.setVisible(false);
        
        GirarDado5.setVisible(false);
        PausarDado5.setVisible(false);
        MoverFicha5.setVisible(false);
        
         GirarDado6.setVisible(false);
        PausarDado6.setVisible(false);
        MoverFicha6.setVisible(false);

        
        
        this.Turno.setText("Es el turno de: "+this.PJ1.getText());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PJ1 = new javax.swing.JLabel();
        PJ2 = new javax.swing.JLabel();
        PanelFicha1 = new javax.swing.JPanel();
        minFichaPJ1 = new javax.swing.JLabel();
        PanelFicha2 = new javax.swing.JPanel();
        minFichaPJ2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Dado = new javax.swing.JPanel();
        NumDado = new javax.swing.JLabel();
        FigDado1 = new javax.swing.JLabel();
        FigDado2 = new javax.swing.JLabel();
        FigDado3 = new javax.swing.JLabel();
        FigDado4 = new javax.swing.JLabel();
        FigDado5 = new javax.swing.JLabel();
        FigDado6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCierre = new javax.swing.JLabel();
        GirarDado1 = new javax.swing.JButton();
        PausarDado1 = new javax.swing.JButton();
        MoverFicha1 = new javax.swing.JButton();
        GirarDado2 = new javax.swing.JButton();
        PausarDado2 = new javax.swing.JButton();
        MoverFicha2 = new javax.swing.JButton();
        GirarDado3 = new javax.swing.JButton();
        PausarDado3 = new javax.swing.JButton();
        MoverFicha3 = new javax.swing.JButton();
        GirarDado4 = new javax.swing.JButton();
        PausarDado4 = new javax.swing.JButton();
        MoverFicha4 = new javax.swing.JButton();
        GirarDado5 = new javax.swing.JButton();
        PausarDado5 = new javax.swing.JButton();
        MoverFicha5 = new javax.swing.JButton();
        GirarDado6 = new javax.swing.JButton();
        PausarDado6 = new javax.swing.JButton();
        MoverFicha6 = new javax.swing.JButton();
        JuegoTablero = new javax.swing.JPanel();
        PJ1ficha1 = new javax.swing.JLabel();
        PJ1ficha2 = new javax.swing.JLabel();
        PJ1ficha3 = new javax.swing.JLabel();
        PJ1ficha4 = new javax.swing.JLabel();
        PJ1ficha5 = new javax.swing.JLabel();
        PJ1ficha6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Turno = new javax.swing.JLabel();
        PJ3 = new javax.swing.JLabel();
        PanelFicha3 = new javax.swing.JPanel();
        minFichaPJ3 = new javax.swing.JLabel();
        PJ4 = new javax.swing.JLabel();
        PanelFicha4 = new javax.swing.JPanel();
        minFichaPJ4 = new javax.swing.JLabel();
        PJ5 = new javax.swing.JLabel();
        PanelFicha5 = new javax.swing.JPanel();
        minFichaPJ5 = new javax.swing.JLabel();
        PJ6 = new javax.swing.JLabel();
        PanelFicha6 = new javax.swing.JPanel();
        minFichaPJ6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ContadorNum = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("monopoly");
        setMinimumSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        PJ1.setBackground(new java.awt.Color(0, 0, 0));
        PJ1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        PJ1.setForeground(new java.awt.Color(255, 255, 51));
        PJ1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PJ1.setText("Jugador 1");
        getContentPane().add(PJ1);
        PJ1.setBounds(990, 410, 170, 40);

        PJ2.setBackground(new java.awt.Color(0, 0, 0));
        PJ2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        PJ2.setForeground(new java.awt.Color(0, 51, 204));
        PJ2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PJ2.setText("Jugador 2");
        getContentPane().add(PJ2);
        PJ2.setBounds(990, 470, 170, 40);

        PanelFicha1.setBackground(new java.awt.Color(0, 51, 204));
        PanelFicha1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelFicha1.setPreferredSize(new java.awt.Dimension(43, 43));
        PanelFicha1.setLayout(new java.awt.GridLayout(1, 0));

        minFichaPJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minFichaPJ1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        minFichaPJ1.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelFicha1.add(minFichaPJ1);

        getContentPane().add(PanelFicha1);
        PanelFicha1.setBounds(940, 470, 43, 43);

        PanelFicha2.setBackground(new java.awt.Color(255, 255, 51));
        PanelFicha2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelFicha2.setPreferredSize(new java.awt.Dimension(43, 43));
        PanelFicha2.setLayout(new java.awt.GridLayout(1, 0));

        minFichaPJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minFichaPJ2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        minFichaPJ2.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelFicha2.add(minFichaPJ2);

        getContentPane().add(PanelFicha2);
        PanelFicha2.setBounds(940, 410, 43, 43);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(910, 90, 10, 570);

        Dado.setBackground(new java.awt.Color(148, 158, 129));
        Dado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Dado.setMaximumSize(new java.awt.Dimension(186, 186));
        Dado.setMinimumSize(new java.awt.Dimension(186, 186));
        Dado.setPreferredSize(new java.awt.Dimension(186, 186));
        Dado.setLayout(null);

        NumDado.setFont(new java.awt.Font("Modak", 0, 18)); // NOI18N
        NumDado.setForeground(new java.awt.Color(102, 102, 0));
        NumDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumDado.setToolTipText("");
        Dado.add(NumDado);
        NumDado.setBounds(160, 140, 40, 40);

        FigDado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FigDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dadocara1.png"))); // NOI18N
        Dado.add(FigDado1);
        FigDado1.setBounds(0, 0, 200, 190);

        FigDado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FigDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dadocara2.png"))); // NOI18N
        Dado.add(FigDado2);
        FigDado2.setBounds(0, 0, 200, 190);

        FigDado3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FigDado3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dadocara3.png"))); // NOI18N
        Dado.add(FigDado3);
        FigDado3.setBounds(0, 0, 200, 190);

        FigDado4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FigDado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dadocara4.png"))); // NOI18N
        Dado.add(FigDado4);
        FigDado4.setBounds(0, 0, 200, 190);

        FigDado5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FigDado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dadocara5.png"))); // NOI18N
        Dado.add(FigDado5);
        FigDado5.setBounds(0, 0, 200, 190);

        FigDado6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FigDado6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dadocara6.png"))); // NOI18N
        Dado.add(FigDado6);
        FigDado6.setBounds(0, 0, 200, 190);

        getContentPane().add(Dado);
        Dado.setBounds(940, 20, 210, 200);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(153, 0, 0));
        lblCierre.setText("REINICIAR JUEGO");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
        });
        jPanel2.add(lblCierre);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(950, 360, 200, 40);

        GirarDado1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        GirarDado1.setText("Girar Dado");
        GirarDado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirarDado1ActionPerformed(evt);
            }
        });
        getContentPane().add(GirarDado1);
        GirarDado1.setBounds(970, 260, 180, 40);

        PausarDado1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        PausarDado1.setText("Parar Dado");
        PausarDado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PausarDado1ActionPerformed(evt);
            }
        });
        getContentPane().add(PausarDado1);
        PausarDado1.setBounds(970, 260, 180, 40);

        MoverFicha1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        MoverFicha1.setText("Mover Ficha");
        MoverFicha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoverFicha1ActionPerformed(evt);
            }
        });
        getContentPane().add(MoverFicha1);
        MoverFicha1.setBounds(970, 260, 180, 40);

        GirarDado2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        GirarDado2.setText("Girar Dado");
        GirarDado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirarDado2ActionPerformed(evt);
            }
        });
        getContentPane().add(GirarDado2);
        GirarDado2.setBounds(970, 260, 180, 40);

        PausarDado2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        PausarDado2.setText("Parar Dado");
        PausarDado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PausarDado2ActionPerformed(evt);
            }
        });
        getContentPane().add(PausarDado2);
        PausarDado2.setBounds(970, 260, 180, 40);

        MoverFicha2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        MoverFicha2.setText("Mover Ficha");
        MoverFicha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoverFicha2ActionPerformed(evt);
            }
        });
        getContentPane().add(MoverFicha2);
        MoverFicha2.setBounds(970, 260, 180, 40);

        GirarDado3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        GirarDado3.setText("Girar Dado");
        GirarDado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirarDado3ActionPerformed(evt);
            }
        });
        getContentPane().add(GirarDado3);
        GirarDado3.setBounds(970, 260, 180, 40);

        PausarDado3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        PausarDado3.setText("Parar Dado");
        PausarDado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PausarDado3ActionPerformed(evt);
            }
        });
        getContentPane().add(PausarDado3);
        PausarDado3.setBounds(970, 260, 180, 40);

        MoverFicha3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        MoverFicha3.setText("Mover Ficha");
        MoverFicha3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoverFicha3ActionPerformed(evt);
            }
        });
        getContentPane().add(MoverFicha3);
        MoverFicha3.setBounds(970, 260, 180, 40);

        GirarDado4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        GirarDado4.setText("Girar Dado");
        GirarDado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirarDado4ActionPerformed(evt);
            }
        });
        getContentPane().add(GirarDado4);
        GirarDado4.setBounds(970, 260, 180, 40);

        PausarDado4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        PausarDado4.setText("Parar Dado");
        PausarDado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PausarDado4ActionPerformed(evt);
            }
        });
        getContentPane().add(PausarDado4);
        PausarDado4.setBounds(970, 260, 180, 40);

        MoverFicha4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        MoverFicha4.setText("Mover Ficha");
        MoverFicha4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoverFicha4ActionPerformed(evt);
            }
        });
        getContentPane().add(MoverFicha4);
        MoverFicha4.setBounds(970, 260, 180, 40);

        GirarDado5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        GirarDado5.setText("Girar Dado");
        GirarDado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirarDado5ActionPerformed(evt);
            }
        });
        getContentPane().add(GirarDado5);
        GirarDado5.setBounds(970, 260, 180, 40);

        PausarDado5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        PausarDado5.setText("Parar Dado");
        PausarDado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PausarDado5ActionPerformed(evt);
            }
        });
        getContentPane().add(PausarDado5);
        PausarDado5.setBounds(970, 260, 180, 40);

        MoverFicha5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        MoverFicha5.setText("Mover Ficha");
        MoverFicha5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoverFicha5ActionPerformed(evt);
            }
        });
        getContentPane().add(MoverFicha5);
        MoverFicha5.setBounds(970, 260, 180, 40);

        GirarDado6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        GirarDado6.setText("Girar Dado");
        GirarDado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirarDado6ActionPerformed(evt);
            }
        });
        getContentPane().add(GirarDado6);
        GirarDado6.setBounds(970, 260, 180, 40);

        PausarDado6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        PausarDado6.setText("Parar Dado");
        PausarDado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PausarDado6ActionPerformed(evt);
            }
        });
        getContentPane().add(PausarDado6);
        PausarDado6.setBounds(970, 260, 180, 40);

        MoverFicha6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        MoverFicha6.setText("Mover Ficha");
        MoverFicha6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoverFicha6ActionPerformed(evt);
            }
        });
        getContentPane().add(MoverFicha6);
        MoverFicha6.setBounds(970, 260, 180, 40);

        JuegoTablero.setBackground(new java.awt.Color(0, 153, 153));
        JuegoTablero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JuegoTablero.setMinimumSize(new java.awt.Dimension(380, 380));
        JuegoTablero.setPreferredSize(new java.awt.Dimension(380, 380));
        JuegoTablero.setLayout(null);

        PJ1ficha1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PJ1ficha1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JuegoTablero.add(PJ1ficha1);
        PJ1ficha1.setBounds(790, 630, 60, 60);

        PJ1ficha2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JuegoTablero.add(PJ1ficha2);
        PJ1ficha2.setBounds(780, 640, 60, 60);

        PJ1ficha3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PJ1ficha3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JuegoTablero.add(PJ1ficha3);
        PJ1ficha3.setBounds(790, 640, 60, 60);

        PJ1ficha4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PJ1ficha4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JuegoTablero.add(PJ1ficha4);
        PJ1ficha4.setBounds(790, 640, 60, 60);

        PJ1ficha5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PJ1ficha5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JuegoTablero.add(PJ1ficha5);
        PJ1ficha5.setBounds(770, 640, 60, 60);

        PJ1ficha6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PJ1ficha6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JuegoTablero.add(PJ1ficha6);
        PJ1ficha6.setBounds(790, 640, 60, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura de pantalla 2024-05-20 a la(s) 8.04.34 p. m..png"))); // NOI18N
        JuegoTablero.add(jLabel3);
        jLabel3.setBounds(92, 67, 690, 500);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura de pantalla 2024-05-20 a la(s) 7.49.17 p. m..png"))); // NOI18N
        JuegoTablero.add(jLabel1);
        jLabel1.setBounds(0, 0, 870, 710);

        getContentPane().add(JuegoTablero);
        JuegoTablero.setBounds(20, 10, 870, 710);

        Turno.setBackground(new java.awt.Color(0, 0, 0));
        Turno.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Turno.setForeground(new java.awt.Color(242, 242, 242));
        Turno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Turno.setText("Es el Turno de: ");
        getContentPane().add(Turno);
        Turno.setBounds(20, 750, 640, 40);

        PJ3.setBackground(new java.awt.Color(0, 0, 0));
        PJ3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        PJ3.setForeground(new java.awt.Color(51, 255, 0));
        PJ3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PJ3.setText("Jugador 3");
        getContentPane().add(PJ3);
        PJ3.setBounds(990, 530, 170, 40);

        PanelFicha3.setBackground(new java.awt.Color(102, 255, 0));
        PanelFicha3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelFicha3.setPreferredSize(new java.awt.Dimension(43, 43));
        PanelFicha3.setLayout(new java.awt.GridLayout(1, 0));

        minFichaPJ3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minFichaPJ3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        minFichaPJ3.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelFicha3.add(minFichaPJ3);

        getContentPane().add(PanelFicha3);
        PanelFicha3.setBounds(940, 530, 43, 43);

        PJ4.setBackground(new java.awt.Color(0, 0, 0));
        PJ4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        PJ4.setForeground(new java.awt.Color(255, 0, 0));
        PJ4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PJ4.setText("Jugador 4");
        getContentPane().add(PJ4);
        PJ4.setBounds(990, 590, 170, 40);

        PanelFicha4.setBackground(new java.awt.Color(255, 0, 51));
        PanelFicha4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelFicha4.setPreferredSize(new java.awt.Dimension(43, 43));
        PanelFicha4.setLayout(new java.awt.GridLayout(1, 0));

        minFichaPJ4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minFichaPJ4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        minFichaPJ4.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelFicha4.add(minFichaPJ4);

        getContentPane().add(PanelFicha4);
        PanelFicha4.setBounds(940, 590, 43, 43);

        PJ5.setBackground(new java.awt.Color(0, 0, 0));
        PJ5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        PJ5.setForeground(new java.awt.Color(153, 0, 255));
        PJ5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PJ5.setText("Jugador 5");
        getContentPane().add(PJ5);
        PJ5.setBounds(990, 640, 170, 40);

        PanelFicha5.setBackground(new java.awt.Color(153, 0, 255));
        PanelFicha5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelFicha5.setPreferredSize(new java.awt.Dimension(43, 43));
        PanelFicha5.setLayout(new java.awt.GridLayout(1, 0));

        minFichaPJ5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minFichaPJ5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        minFichaPJ5.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelFicha5.add(minFichaPJ5);

        getContentPane().add(PanelFicha5);
        PanelFicha5.setBounds(940, 640, 43, 43);

        PJ6.setBackground(new java.awt.Color(0, 0, 0));
        PJ6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        PJ6.setForeground(new java.awt.Color(255, 102, 0));
        PJ6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PJ6.setText("Jugador 6");
        getContentPane().add(PJ6);
        PJ6.setBounds(990, 700, 170, 40);

        PanelFicha6.setBackground(new java.awt.Color(255, 102, 0));
        PanelFicha6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelFicha6.setPreferredSize(new java.awt.Dimension(43, 43));
        PanelFicha6.setLayout(new java.awt.GridLayout(1, 0));

        minFichaPJ6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minFichaPJ6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        minFichaPJ6.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelFicha6.add(minFichaPJ6);

        getContentPane().add(PanelFicha6);
        PanelFicha6.setBounds(940, 700, 43, 43);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(51, 153, 0));
        jPanel1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        ContadorNum.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ContadorNum.setForeground(new java.awt.Color(255, 255, 255));
        ContadorNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContadorNum.setText("00:00:00");
        ContadorNum.setToolTipText("");
        jPanel1.add(ContadorNum);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(970, 310, 190, 34);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallpaper-mono-de-juegos-agricola-desktop.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(2, -3, 1170, 810);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(110, 70, 690, 510);

        setSize(new java.awt.Dimension(1169, 834));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GirarDado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirarDado1ActionPerformed

        GDado.start(); //Parar dado
        GirarDado1.setVisible(false);
        PausarDado1.setVisible(true);
    }//GEN-LAST:event_GirarDado1ActionPerformed

    private void PausarDado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PausarDado1ActionPerformed
        GDado.stop(); //Iniciar Dado
        MoverFicha1.setVisible(true);
        PausarDado1.setVisible(false);      
    }//GEN-LAST:event_PausarDado1ActionPerformed

    private void GirarDado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirarDado2ActionPerformed
        GDado.start(); //Parar dado
        GirarDado2.setVisible(false);
        PausarDado2.setVisible(true);
    }//GEN-LAST:event_GirarDado2ActionPerformed

    private void PausarDado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PausarDado2ActionPerformed
        GDado.stop(); //Iniciar Dado
        MoverFicha2.setVisible(true);
        PausarDado2.setVisible(false);
    }//GEN-LAST:event_PausarDado2ActionPerformed

    private void MoverFicha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoverFicha1ActionPerformed
        MovimientosPJ6 Player1 = new MovimientosPJ6(PJ1ficha1,Turno,GirarDado2, PJ2);
        Player1.start();
        MoverFicha1.setVisible(false);
    }//GEN-LAST:event_MoverFicha1ActionPerformed

    private void MoverFicha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoverFicha2ActionPerformed
        MovimientosPJ5 Player2 = new MovimientosPJ5(PJ1ficha2,Turno,GirarDado1,PJ2);
        Player2.start();
        MoverFicha2.setVisible(false);
    }//GEN-LAST:event_MoverFicha2ActionPerformed

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        // TODO add your handling code here:
        Jugadores inicio =new Jugadores ();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCierreMouseClicked

    private void MoverFicha3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoverFicha3ActionPerformed
        // TODO add your handling code here:
       MovimientosPJ4 Player3 = new MovimientosPJ4(PJ1ficha3,Turno,GirarDado4, PJ3);
        Player3.start();
        MoverFicha3.setVisible(false);
    }//GEN-LAST:event_MoverFicha3ActionPerformed

    private void MoverFicha4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoverFicha4ActionPerformed
         MovimientosPJ3 Player4 = new MovimientosPJ3(PJ1ficha4,Turno,GirarDado3,PJ4);
        Player4.start();
        MoverFicha4.setVisible(false);
    }//GEN-LAST:event_MoverFicha4ActionPerformed

    private void MoverFicha5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoverFicha5ActionPerformed
        // TODO add your handling code here:
        MovimientosPJ2 Player5 = new MovimientosPJ2(PJ1ficha5,Turno,GirarDado6, PJ5);
        Player5.start();
        MoverFicha5.setVisible(false);
    }//GEN-LAST:event_MoverFicha5ActionPerformed

    private void MoverFicha6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoverFicha6ActionPerformed
        MovimientosPJ1 Player6 = new MovimientosPJ1(PJ1ficha6,Turno,GirarDado5,PJ6);
        Player6.start();
        MoverFicha6.setVisible(false);
    }//GEN-LAST:event_MoverFicha6ActionPerformed

    private void GirarDado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirarDado3ActionPerformed
        // TODO add your handling code here:
         GDado.start(); //Parar dado
        GirarDado3.setVisible(false);
        PausarDado3.setVisible(true);
    }//GEN-LAST:event_GirarDado3ActionPerformed

    private void GirarDado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirarDado4ActionPerformed
        // TODO add your handling code here:
         GDado.start(); //Parar dado
        GirarDado4.setVisible(false);
        PausarDado4.setVisible(true);
    }//GEN-LAST:event_GirarDado4ActionPerformed

    private void GirarDado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirarDado5ActionPerformed
        // TODO add your handling code here:
         GDado.start(); //Parar dado
        GirarDado5.setVisible(false);
        PausarDado5.setVisible(true);
    }//GEN-LAST:event_GirarDado5ActionPerformed

    private void GirarDado6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirarDado6ActionPerformed
        // TODO add your handling code here:
         GDado.start(); //Parar dado
        GirarDado6.setVisible(false);
        PausarDado6.setVisible(true);
    }//GEN-LAST:event_GirarDado6ActionPerformed

    private void PausarDado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PausarDado3ActionPerformed
        // TODO add your handling code here:
          GDado.stop(); //Iniciar Dado
        MoverFicha3.setVisible(true);
        PausarDado3.setVisible(false); 
    }//GEN-LAST:event_PausarDado3ActionPerformed

    private void PausarDado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PausarDado4ActionPerformed
        // TODO add your handling code here:
          GDado.stop(); //Iniciar Dado
        MoverFicha4.setVisible(true);
        PausarDado4.setVisible(false); 
    }//GEN-LAST:event_PausarDado4ActionPerformed

    private void PausarDado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PausarDado5ActionPerformed
        // TODO add your handling code here:
          GDado.stop(); //Iniciar Dado
        MoverFicha5.setVisible(true);
        PausarDado5.setVisible(false); 
    }//GEN-LAST:event_PausarDado5ActionPerformed

    private void PausarDado6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PausarDado6ActionPerformed
        // TODO add your handling code here:
          GDado.stop(); //Iniciar Dado
        MoverFicha6.setVisible(true);
        PausarDado6.setVisible(false); 
    }//GEN-LAST:event_PausarDado6ActionPerformed

    public final void Girardado(){
        GDado = new Timer(80, new ActionListener ()
         {
             public void actionPerformed(ActionEvent arg0)
             {
                int CaraDado = (int) (Math.random()*6+1);
                String strinNum = Integer.toString(CaraDado);
                NumDado.setText(strinNum); 
                if(CaraDado == 1){
                   FigDado1.setVisible(true);
                   FigDado2.setVisible(false);
                   FigDado3.setVisible(false);
                   FigDado4.setVisible(false);
                   FigDado5.setVisible(false);
                   FigDado6.setVisible(false);
                }
                if(CaraDado == 2){
                   FigDado1.setVisible(false);
                   FigDado2.setVisible(true);
                   FigDado3.setVisible(false);
                   FigDado4.setVisible(false);
                   FigDado5.setVisible(false);
                   FigDado6.setVisible(false);
                }
                if(CaraDado == 3){
                   FigDado1.setVisible(false);
                   FigDado2.setVisible(false);
                   FigDado3.setVisible(true);
                   FigDado4.setVisible(false);
                   FigDado5.setVisible(false);
                   FigDado6.setVisible(false);
                }
                if(CaraDado == 4){
                   FigDado1.setVisible(false);
                   FigDado2.setVisible(false);
                   FigDado3.setVisible(false);
                   FigDado4.setVisible(true);
                   FigDado5.setVisible(false);
                   FigDado6.setVisible(false);
                }
                if(CaraDado == 5){
                   FigDado1.setVisible(false);
                   FigDado2.setVisible(false);
                   FigDado3.setVisible(false);
                   FigDado4.setVisible(false);
                   FigDado5.setVisible(true);
                   FigDado6.setVisible(false);
                }
                if(CaraDado == 6){
                   FigDado1.setVisible(false);
                   FigDado2.setVisible(false);
                   FigDado3.setVisible(false);
                   FigDado4.setVisible(false);
                   FigDado5.setVisible(false);
                   FigDado6.setVisible(true);
                }
             }
         });
    }
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
            java.util.logging.Logger.getLogger(TablerodeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablerodeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablerodeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablerodeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablerodeJuego().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel ContadorNum;
    private javax.swing.JPanel Dado;
    public javax.swing.JLabel FigDado1;
    public javax.swing.JLabel FigDado2;
    public javax.swing.JLabel FigDado3;
    public javax.swing.JLabel FigDado4;
    public javax.swing.JLabel FigDado5;
    public javax.swing.JLabel FigDado6;
    public static javax.swing.JButton GirarDado1;
    public javax.swing.JButton GirarDado2;
    public static javax.swing.JButton GirarDado3;
    public static javax.swing.JButton GirarDado4;
    public static javax.swing.JButton GirarDado5;
    public static javax.swing.JButton GirarDado6;
    public javax.swing.JPanel JuegoTablero;
    public javax.swing.JButton MoverFicha1;
    public javax.swing.JButton MoverFicha2;
    public javax.swing.JButton MoverFicha3;
    public javax.swing.JButton MoverFicha4;
    public javax.swing.JButton MoverFicha5;
    public javax.swing.JButton MoverFicha6;
    public static javax.swing.JLabel NumDado;
    public javax.swing.JLabel PJ1;
    public static javax.swing.JLabel PJ1ficha1;
    public static javax.swing.JLabel PJ1ficha2;
    public static javax.swing.JLabel PJ1ficha3;
    public static javax.swing.JLabel PJ1ficha4;
    public static javax.swing.JLabel PJ1ficha5;
    public static javax.swing.JLabel PJ1ficha6;
    public javax.swing.JLabel PJ2;
    public javax.swing.JLabel PJ3;
    public javax.swing.JLabel PJ4;
    public javax.swing.JLabel PJ5;
    public javax.swing.JLabel PJ6;
    private javax.swing.JPanel PanelFicha1;
    private javax.swing.JPanel PanelFicha2;
    private javax.swing.JPanel PanelFicha3;
    private javax.swing.JPanel PanelFicha4;
    private javax.swing.JPanel PanelFicha5;
    private javax.swing.JPanel PanelFicha6;
    public javax.swing.JButton PausarDado1;
    public javax.swing.JButton PausarDado2;
    public javax.swing.JButton PausarDado3;
    public javax.swing.JButton PausarDado4;
    public javax.swing.JButton PausarDado5;
    public javax.swing.JButton PausarDado6;
    public javax.swing.JLabel Turno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCierre;
    public javax.swing.JLabel minFichaPJ1;
    public javax.swing.JLabel minFichaPJ2;
    public javax.swing.JLabel minFichaPJ3;
    public javax.swing.JLabel minFichaPJ4;
    public javax.swing.JLabel minFichaPJ5;
    public javax.swing.JLabel minFichaPJ6;
    // End of variables declaration//GEN-END:variables


}
