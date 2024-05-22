package Juego;

import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.TransferHandler;

public class Jugadores extends javax.swing.JFrame {

    TablerodeJuego Jugar = new TablerodeJuego();
   
//Enlazar la clase TablerodeJuego
    //--------------Variables para el Cronometro---------------------------------
    boolean Suspendido;
    boolean Crono;
    int minutos;
    int segundos;
    //------------------------------------------------------
    String Tablero[][];
    //Declarar la Variable Tablero

    /**
     * Creates new form Jugadores_201212925
     */

    public Jugadores() {
        initComponents();
        //--------------Efecto Dragdrop--------------------------------------
        ficha1.setTransferHandler(new TransferHandler("icon"));
        ficha2.setTransferHandler(new TransferHandler("icon"));
        ficha3.setTransferHandler(new TransferHandler("icon"));
        ficha4.setTransferHandler(new TransferHandler("icon"));
        ficha5.setTransferHandler(new TransferHandler("icon"));
        ficha6.setTransferHandler(new TransferHandler("icon"));
        
        FichaPJ1.setTransferHandler(new TransferHandler("icon"));
        FichaPJ2.setTransferHandler(new TransferHandler("icon"));
        
        FichaPJ3.setTransferHandler(new TransferHandler("icon"));
        FichaPJ4.setTransferHandler(new TransferHandler("icon"));
        
        FichaPJ5.setTransferHandler(new TransferHandler("icon"));
        FichaPJ6.setTransferHandler(new TransferHandler("icon"));

        //---------------------------------------Declarar el Tablero 10x10 con el nombre de las casillas----------------------------------
    

        
                }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Escojer4 = new javax.swing.JLabel();
        Escojer5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Escojer = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        ficha1 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        ficha2 = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        ficha3 = new javax.swing.JLabel();
        Panel4 = new javax.swing.JPanel();
        ficha4 = new javax.swing.JLabel();
        Panel5 = new javax.swing.JPanel();
        ficha5 = new javax.swing.JLabel();
        Panel6 = new javax.swing.JPanel();
        ficha6 = new javax.swing.JLabel();
        namePJ1 = new javax.swing.JTextField();
        PanelFicha1 = new javax.swing.JPanel();
        FichaPJ1 = new javax.swing.JLabel();
        jugar10x10 = new javax.swing.JButton();
        namePJ2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        Escojer7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Escojer9 = new javax.swing.JLabel();
        Escojer8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Escojer6 = new javax.swing.JLabel();
        PanelFicha2 = new javax.swing.JPanel();
        FichaPJ2 = new javax.swing.JLabel();
        namePJ3 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        Escojer10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Escojer11 = new javax.swing.JLabel();
        Escojer12 = new javax.swing.JLabel();
        PanelFicha3 = new javax.swing.JPanel();
        FichaPJ3 = new javax.swing.JLabel();
        namePJ4 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        Escojer13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        Escojer14 = new javax.swing.JLabel();
        Escojer15 = new javax.swing.JLabel();
        PanelFicha4 = new javax.swing.JPanel();
        FichaPJ4 = new javax.swing.JLabel();
        namePJ5 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        Escojer16 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        Escojer17 = new javax.swing.JLabel();
        Escojer18 = new javax.swing.JLabel();
        PanelFicha5 = new javax.swing.JPanel();
        FichaPJ5 = new javax.swing.JLabel();
        namePJ6 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        Escojer19 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        Escojer20 = new javax.swing.JLabel();
        Escojer21 = new javax.swing.JLabel();
        PanelFicha6 = new javax.swing.JPanel();
        FichaPJ6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Jugadores");
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        Titulo.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 255, 51));
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images (1).jpeg"))); // NOI18N
        getContentPane().add(Titulo);
        Titulo.setBounds(20, 30, 295, 190);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        Escojer4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Escojer4.setForeground(new java.awt.Color(255, 255, 0));
        Escojer4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Escojer4.setText("Jugador 1:");

        Escojer5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer5.setForeground(new java.awt.Color(255, 255, 0));
        Escojer5.setText("Nombre:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Escojer4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Escojer4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escojer5)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 270, 140, 80);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        Escojer.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer.setForeground(new java.awt.Color(255, 255, 0));
        Escojer.setText("arrastra una ficha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Escojer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(740, 60, 180, 50);

        Panel1.setBackground(new java.awt.Color(0, 51, 51));
        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_domo.png"))); // NOI18N
        ficha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel1);
        Panel1.setBounds(620, 20, 104, 104);

        Panel2.setBackground(new java.awt.Color(0, 51, 51));
        Panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_gato.png"))); // NOI18N
        ficha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel2);
        Panel2.setBounds(480, 20, 104, 104);

        Panel3.setBackground(new java.awt.Color(0, 51, 51));
        Panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_marciano.png"))); // NOI18N
        ficha3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel3);
        Panel3.setBounds(350, 20, 104, 104);

        Panel4.setBackground(new java.awt.Color(0, 51, 51));
        Panel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_peludito.png"))); // NOI18N
        ficha4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel4);
        Panel4.setBounds(420, 150, 104, 104);

        Panel5.setBackground(new java.awt.Color(0, 51, 51));
        Panel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_cocodrilo.png"))); // NOI18N
        ficha5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel5Layout = new javax.swing.GroupLayout(Panel5);
        Panel5.setLayout(Panel5Layout);
        Panel5Layout.setHorizontalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel5Layout.setVerticalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel5);
        Panel5.setBounds(540, 150, 104, 104);

        Panel6.setBackground(new java.awt.Color(0, 51, 51));
        Panel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_pyong.png"))); // NOI18N
        ficha6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha6MousePressed(evt);
            }
        });
        ficha6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ficha6KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Panel6Layout = new javax.swing.GroupLayout(Panel6);
        Panel6.setLayout(Panel6Layout);
        Panel6Layout.setHorizontalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel6Layout.setVerticalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel6);
        Panel6.setBounds(670, 150, 104, 104);

        namePJ1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        namePJ1.setMinimumSize(new java.awt.Dimension(300, 30));
        namePJ1.setPreferredSize(new java.awt.Dimension(300, 30));
        namePJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namePJ1ActionPerformed(evt);
            }
        });
        getContentPane().add(namePJ1);
        namePJ1.setBounds(10, 360, 140, 30);

        PanelFicha1.setBackground(new java.awt.Color(255, 255, 0));
        PanelFicha1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PanelFicha1.setForeground(new java.awt.Color(153, 0, 0));

        FichaPJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FichaPJ1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FichaPJ1MouseReleased(evt);
            }
        });
        FichaPJ1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FichaPJ1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FichaPJ1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout PanelFicha1Layout = new javax.swing.GroupLayout(PanelFicha1);
        PanelFicha1.setLayout(PanelFicha1Layout);
        PanelFicha1Layout.setHorizontalGroup(
            PanelFicha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFicha1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FichaPJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelFicha1Layout.setVerticalGroup(
            PanelFicha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FichaPJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );

        getContentPane().add(PanelFicha1);
        PanelFicha1.setBounds(10, 450, 110, 100);

        jugar10x10.setBackground(new java.awt.Color(0, 153, 255));
        jugar10x10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jugar10x10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Play-button-icon-in-yellow-color-on-transparent-background-PNG.png"))); // NOI18N
        jugar10x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugar10x10ActionPerformed(evt);
            }
        });
        getContentPane().add(jugar10x10);
        jugar10x10.setBounds(290, 570, 340, 130);

        namePJ2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        namePJ2.setMinimumSize(new java.awt.Dimension(300, 30));
        namePJ2.setPreferredSize(new java.awt.Dimension(300, 30));
        getContentPane().add(namePJ2);
        namePJ2.setBounds(160, 360, 140, 30);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        Escojer7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer7.setForeground(new java.awt.Color(0, 51, 204));
        Escojer7.setText("Ficha:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(Escojer7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer7)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(160, 400, 80, 40);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        Escojer9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Escojer9.setForeground(new java.awt.Color(51, 51, 255));
        Escojer9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Escojer9.setText("Jugador 2:");

        Escojer8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer8.setForeground(new java.awt.Color(0, 51, 204));
        Escojer8.setText("Nombre:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Escojer9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Escojer9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escojer8)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(160, 270, 140, 80);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        Escojer6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer6.setForeground(new java.awt.Color(255, 255, 0));
        Escojer6.setText("Ficha:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(Escojer6)
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 400, 80, 40);

        PanelFicha2.setBackground(new java.awt.Color(0, 51, 204));
        PanelFicha2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        FichaPJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FichaPJ2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FichaPJ2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout PanelFicha2Layout = new javax.swing.GroupLayout(PanelFicha2);
        PanelFicha2.setLayout(PanelFicha2Layout);
        PanelFicha2Layout.setHorizontalGroup(
            PanelFicha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FichaPJ2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        PanelFicha2Layout.setVerticalGroup(
            PanelFicha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFicha2Layout.createSequentialGroup()
                .addComponent(FichaPJ2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(PanelFicha2);
        PanelFicha2.setBounds(160, 450, 104, 100);

        namePJ3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        namePJ3.setMinimumSize(new java.awt.Dimension(300, 30));
        namePJ3.setPreferredSize(new java.awt.Dimension(300, 30));
        getContentPane().add(namePJ3);
        namePJ3.setBounds(310, 360, 140, 30);

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        Escojer10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer10.setForeground(new java.awt.Color(51, 255, 51));
        Escojer10.setText("Ficha:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(Escojer10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer10)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(310, 400, 80, 40);

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));

        Escojer11.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Escojer11.setForeground(new java.awt.Color(102, 255, 51));
        Escojer11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Escojer11.setText("Jugador 3:");

        Escojer12.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer12.setForeground(new java.awt.Color(51, 255, 51));
        Escojer12.setText("Nombre:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Escojer11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(Escojer11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escojer12)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8);
        jPanel8.setBounds(310, 270, 140, 80);

        PanelFicha3.setBackground(new java.awt.Color(51, 255, 0));
        PanelFicha3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        FichaPJ3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FichaPJ3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FichaPJ3MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout PanelFicha3Layout = new javax.swing.GroupLayout(PanelFicha3);
        PanelFicha3.setLayout(PanelFicha3Layout);
        PanelFicha3Layout.setHorizontalGroup(
            PanelFicha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FichaPJ3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        PanelFicha3Layout.setVerticalGroup(
            PanelFicha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFicha3Layout.createSequentialGroup()
                .addComponent(FichaPJ3, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(PanelFicha3);
        PanelFicha3.setBounds(310, 450, 104, 100);

        namePJ4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        namePJ4.setMinimumSize(new java.awt.Dimension(300, 30));
        namePJ4.setPreferredSize(new java.awt.Dimension(300, 30));
        getContentPane().add(namePJ4);
        namePJ4.setBounds(470, 360, 140, 30);

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));

        Escojer13.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer13.setForeground(new java.awt.Color(255, 0, 0));
        Escojer13.setText("Ficha:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(Escojer13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer13)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel9);
        jPanel9.setBounds(470, 400, 80, 40);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

        Escojer14.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Escojer14.setForeground(new java.awt.Color(255, 0, 0));
        Escojer14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Escojer14.setText("Jugador 4:");

        Escojer15.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer15.setForeground(new java.awt.Color(255, 0, 51));
        Escojer15.setText("Nombre:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Escojer14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(Escojer14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escojer15)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel10);
        jPanel10.setBounds(470, 270, 140, 80);

        PanelFicha4.setBackground(new java.awt.Color(255, 0, 0));
        PanelFicha4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        FichaPJ4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FichaPJ4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FichaPJ4MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout PanelFicha4Layout = new javax.swing.GroupLayout(PanelFicha4);
        PanelFicha4.setLayout(PanelFicha4Layout);
        PanelFicha4Layout.setHorizontalGroup(
            PanelFicha4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FichaPJ4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        PanelFicha4Layout.setVerticalGroup(
            PanelFicha4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFicha4Layout.createSequentialGroup()
                .addComponent(FichaPJ4, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(PanelFicha4);
        PanelFicha4.setBounds(470, 450, 104, 100);

        namePJ5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        namePJ5.setMinimumSize(new java.awt.Dimension(300, 30));
        namePJ5.setPreferredSize(new java.awt.Dimension(300, 30));
        getContentPane().add(namePJ5);
        namePJ5.setBounds(620, 360, 140, 30);

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));

        Escojer16.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer16.setForeground(new java.awt.Color(102, 0, 204));
        Escojer16.setText("Ficha:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(Escojer16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer16)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel11);
        jPanel11.setBounds(620, 400, 80, 40);

        jPanel12.setBackground(new java.awt.Color(102, 102, 102));

        Escojer17.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Escojer17.setForeground(new java.awt.Color(102, 0, 255));
        Escojer17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Escojer17.setText("Jugador 5:");

        Escojer18.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer18.setForeground(new java.awt.Color(102, 0, 255));
        Escojer18.setText("Nombre:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Escojer17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(Escojer17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escojer18)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel12);
        jPanel12.setBounds(620, 270, 140, 80);

        PanelFicha5.setBackground(new java.awt.Color(102, 0, 204));
        PanelFicha5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        FichaPJ5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FichaPJ5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FichaPJ5MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout PanelFicha5Layout = new javax.swing.GroupLayout(PanelFicha5);
        PanelFicha5.setLayout(PanelFicha5Layout);
        PanelFicha5Layout.setHorizontalGroup(
            PanelFicha5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FichaPJ5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        PanelFicha5Layout.setVerticalGroup(
            PanelFicha5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFicha5Layout.createSequentialGroup()
                .addComponent(FichaPJ5, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(PanelFicha5);
        PanelFicha5.setBounds(620, 450, 104, 100);

        namePJ6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        namePJ6.setMinimumSize(new java.awt.Dimension(300, 30));
        namePJ6.setPreferredSize(new java.awt.Dimension(300, 30));
        getContentPane().add(namePJ6);
        namePJ6.setBounds(770, 360, 140, 30);

        jPanel13.setBackground(new java.awt.Color(102, 102, 102));

        Escojer19.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer19.setForeground(new java.awt.Color(255, 102, 0));
        Escojer19.setText("Ficha:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(Escojer19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer19)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel13);
        jPanel13.setBounds(770, 400, 80, 40);

        jPanel14.setBackground(new java.awt.Color(102, 102, 102));

        Escojer20.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Escojer20.setForeground(new java.awt.Color(255, 102, 51));
        Escojer20.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Escojer20.setText("Jugador 6:");

        Escojer21.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer21.setForeground(new java.awt.Color(255, 102, 0));
        Escojer21.setText("Nombre:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Escojer20, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(Escojer20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escojer21)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel14);
        jPanel14.setBounds(770, 270, 140, 80);

        PanelFicha6.setBackground(new java.awt.Color(255, 102, 0));
        PanelFicha6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        FichaPJ6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FichaPJ6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FichaPJ6MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout PanelFicha6Layout = new javax.swing.GroupLayout(PanelFicha6);
        PanelFicha6.setLayout(PanelFicha6Layout);
        PanelFicha6Layout.setHorizontalGroup(
            PanelFicha6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FichaPJ6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        PanelFicha6Layout.setVerticalGroup(
            PanelFicha6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFicha6Layout.createSequentialGroup()
                .addComponent(FichaPJ6, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(PanelFicha6);
        PanelFicha6.setBounds(770, 450, 104, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/monopoly-board-games-card-games-mousetrap-hd-wallpaper-preview.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(643, 643, 643))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 930, 720);

        setSize(new java.awt.Dimension(931, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ficha1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha1MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha1MousePressed

    private void ficha2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha2MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha2MousePressed

    private void ficha3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha3MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha3MousePressed

    private void ficha4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha4MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha4MousePressed

    private void ficha5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha5MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha5MousePressed

    private void ficha6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ficha6KeyPressed

    }//GEN-LAST:event_ficha6KeyPressed

    private void ficha6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha6MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha6MousePressed


    private void jugar10x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugar10x10ActionPerformed
       // Obtener los nombres de los jugadores
String nombre1 = namePJ1.getText();
String nombre2 = namePJ2.getText();
String nombre3 = namePJ3.getText();
String nombre4 = namePJ4.getText();
String nombre5 = namePJ5.getText();
String nombre6 = namePJ6.getText();

// Verificar si hay nombres de jugadores repetidos
Set<String> nombresSet = new HashSet<>(Arrays.asList(nombre1, nombre2, nombre3, nombre4, nombre5, nombre6));
if (nombresSet.size() < 6) {
    JOptionPane.showMessageDialog(null, "Hay nombres de jugadores repetidos");
} else {
    // Obtener las fichas de los jugadores
    String ficha1 = FichaPJ1.getIcon().toString();
    String ficha2 = FichaPJ2.getIcon().toString();
    String ficha3 = FichaPJ3.getIcon().toString();
    String ficha4 = FichaPJ4.getIcon().toString();
    String ficha5 = FichaPJ5.getIcon().toString();
    String ficha6 = FichaPJ6.getIcon().toString();

    // Verificar si hay fichas repetidas
    Set<String> fichasSet = new HashSet<>(Arrays.asList(ficha1, ficha2, ficha3, ficha4, ficha5, ficha6));
    if (fichasSet.size() < 6) {
        JOptionPane.showMessageDialog(null, "Hay fichas repetidas");
    } else {
        this.setVisible(false); // Cerrar la ventana jugadores
        this.Jugar.setVisible(true); // Mostrar la ventana de juego

        nombrarPJ(); // Escribir los nombres de los jugadores
        escojerFicha(); // Escoger las fichas
        
        Cronometro reloj = new Cronometro(Jugar.ContadorNum, Crono);
        reloj.start();
    }
}
    }//GEN-LAST:event_jugar10x10ActionPerformed

    private void FichaPJ1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FichaPJ1KeyReleased

    }//GEN-LAST:event_FichaPJ1KeyReleased

    private void FichaPJ1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FichaPJ1KeyPressed

    }//GEN-LAST:event_FichaPJ1KeyPressed

    private void FichaPJ2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FichaPJ2MouseReleased

    }//GEN-LAST:event_FichaPJ2MouseReleased

    private void FichaPJ1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FichaPJ1MouseReleased

    }//GEN-LAST:event_FichaPJ1MouseReleased

    private void FichaPJ3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FichaPJ3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_FichaPJ3MouseReleased

    private void FichaPJ4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FichaPJ4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_FichaPJ4MouseReleased

    private void FichaPJ5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FichaPJ5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_FichaPJ5MouseReleased

    private void FichaPJ6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FichaPJ6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_FichaPJ6MouseReleased

    private void namePJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namePJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namePJ1ActionPerformed

    public void nombrarPJ() { //Pasar los nombres al otro Form(TablerodeJuego)
        this.Jugar.PJ1.setText(this.namePJ1.getText());
        
          
          this.Jugar.PJ2.setText(this.namePJ2.getText());
         
        
        this.Jugar.PJ3.setText(this.namePJ3.getText());
        
          
          this.Jugar.PJ4.setText(this.namePJ4.getText());
         
          
          this.Jugar.PJ5.setText(this.namePJ5.getText());
         
          
          this.Jugar.PJ6.setText(this.namePJ6.getText());
      
          
       
        
        this.Jugar.Turno.setText("Es el turno de: " + this.namePJ1.getText());
    }

    public void escojerFicha() {//Pasar las fichas al otro Form(TablerodeJuego)
        
        
        
        this.Jugar.minFichaPJ2.setIcon(this.FichaPJ1.getIcon());
        this.Jugar.minFichaPJ1.setIcon(this.FichaPJ2.getIcon());
        this.Jugar.PJ1ficha1.setIcon(this.FichaPJ1.getIcon());
        this.Jugar.PJ1ficha2.setIcon(this.FichaPJ2.getIcon());
        
        
        
         this.Jugar.minFichaPJ3.setIcon(this.FichaPJ3.getIcon());
        this.Jugar.minFichaPJ4.setIcon(this.FichaPJ4.getIcon());
        this.Jugar.PJ1ficha3.setIcon(this.FichaPJ3.getIcon());
        this.Jugar.PJ1ficha4.setIcon(this.FichaPJ4.getIcon());
        
         this.Jugar.minFichaPJ5.setIcon(this.FichaPJ5.getIcon());
        this.Jugar.minFichaPJ6.setIcon(this.FichaPJ6.getIcon());
        this.Jugar.PJ1ficha5.setIcon(this.FichaPJ5.getIcon());
        this.Jugar.PJ1ficha6.setIcon(this.FichaPJ6.getIcon());
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
            java.util.logging.Logger.getLogger(Jugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugadores().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Escojer;
    private javax.swing.JLabel Escojer10;
    private javax.swing.JLabel Escojer11;
    private javax.swing.JLabel Escojer12;
    private javax.swing.JLabel Escojer13;
    private javax.swing.JLabel Escojer14;
    private javax.swing.JLabel Escojer15;
    private javax.swing.JLabel Escojer16;
    private javax.swing.JLabel Escojer17;
    private javax.swing.JLabel Escojer18;
    private javax.swing.JLabel Escojer19;
    private javax.swing.JLabel Escojer20;
    private javax.swing.JLabel Escojer21;
    private javax.swing.JLabel Escojer4;
    private javax.swing.JLabel Escojer5;
    private javax.swing.JLabel Escojer6;
    private javax.swing.JLabel Escojer7;
    private javax.swing.JLabel Escojer8;
    private javax.swing.JLabel Escojer9;
    public javax.swing.JLabel FichaPJ1;
    public javax.swing.JLabel FichaPJ2;
    public javax.swing.JLabel FichaPJ3;
    public javax.swing.JLabel FichaPJ4;
    public javax.swing.JLabel FichaPJ5;
    public javax.swing.JLabel FichaPJ6;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel PanelFicha1;
    private javax.swing.JPanel PanelFicha2;
    private javax.swing.JPanel PanelFicha3;
    private javax.swing.JPanel PanelFicha4;
    private javax.swing.JPanel PanelFicha5;
    private javax.swing.JPanel PanelFicha6;
    private javax.swing.JLabel Titulo;
    public javax.swing.JLabel ficha1;
    public javax.swing.JLabel ficha2;
    public javax.swing.JLabel ficha3;
    public javax.swing.JLabel ficha4;
    public javax.swing.JLabel ficha5;
    public javax.swing.JLabel ficha6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JButton jugar10x10;
    private javax.swing.JTextField namePJ1;
    private javax.swing.JTextField namePJ2;
    private javax.swing.JTextField namePJ3;
    private javax.swing.JTextField namePJ4;
    private javax.swing.JTextField namePJ5;
    private javax.swing.JTextField namePJ6;
    // End of variables declaration//GEN-END:variables

}
