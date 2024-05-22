package Juego;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MovimientosPJ2 extends Thread {
    // Variables de la clase
    private JLabel FigFicha;
    private JLabel SigTurno;
    private JLabel nombreTurno;
    private JButton botongirar6;
    private int dinero;
     public int restante;
    public int cero;
    // Constructor para los Movimientos
    public MovimientosPJ2(JLabel FigFicha, JLabel SigTurno, JButton botongirar, JLabel nombreTurno) {
        this.FigFicha = FigFicha;
        this.SigTurno = SigTurno;
        this.botongirar6 = botongirar;
        this.nombreTurno = nombreTurno;
        this.dinero=88000;
       this.cero=0;
    }

    // Método para hacer mover las fichas
    @Override
    public void run() {
        int positionX = FigFicha.getX();
        int positionY = FigFicha.getY();

        // Para convertir a un integer la cantidad de casillas que pueda avanzar
        String numDadoCasilla = TablerodeJuego.NumDado.getText();
        int entero = Integer.parseInt(numDadoCasilla);

        // Variables adicionales para contar y sumar posiciones
        int contadorUso = 0;
        int sumaPosiciones = 0;

        int casillaAncho = 89;  // Ancho de cada casilla en píxeles
        int casillaAlto = 72;   // Alto de cada casilla en píxeles

        for (int i = 0; i < entero; i++) {
            // Incrementar el contador de uso y sumar la posición actual
            contadorUso++;
            sumaPosiciones += entero;

            if (positionY == 650 && positionX > 0) { // Parte inferior, moviendo a la izquierda
                positionX -= casillaAncho;
            } else if (positionX == 0 && positionY > 0) { // Parte izquierda, moviendo hacia arriba
                positionY -= casillaAlto;
            } else if (positionY == 0 && positionX < 730) { // Parte superior, moviendo a la derecha
                positionX += casillaAncho;
            } else if (positionX == 730 && positionY < 650) { // Parte derecha, moviendo hacia abajo
                positionY += casillaAlto;
            }

            // Ajustar si se pasa del borde
            if (positionX > 730) positionX = 730;
            if (positionX < 0) positionX = 0;
            if (positionY > 650) positionY = 650;
            if (positionY < 0) positionY = 0;

            FigFicha.setLocation(positionX, positionY);
            
        }
        
      

         switch (sumaPosiciones % 40) { // Utilizamos módulo 40 para que se repita en un tablero circular
            case 0:
                // Acción para la posición 0 (por ejemplo, "GO")
                System.out.println("Posición: GO");
                break;
            case 1:
                // Acción para la posición 1
              int opcion1 =   JOptionPane.showConfirmDialog(null,"avenida mediterrane =60$ Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion1 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );
        }
               
                break;
            case 2:
                // Acción para la posición 2
                
               JOptionPane.showMessageDialog(null, "arca comunal");                break;
            case 3:
                // Acción para la posición 3
                   int opcion2 =   JOptionPane.showConfirmDialog(null,"avenida maltica =60$ Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion2 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             int restante=dinero-60;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
            case 4:
                // Acción para la posición 4
               JOptionPane.showMessageDialog(null, "IMPUESTO SOBRE INGRESOS\n" +
                                                                    "PÁGUESE -$200");  
               int restante=dinero-200;
               break;
            case 5:
                // Acción para la posición 5
          int opcion3 =   JOptionPane.showConfirmDialog(null,"FERROCARRIL READING\n" +
                                                                      "-$200"+JOptionPane.YES_NO_OPTION);
        if (opcion3 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
            restante=dinero-200;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
               
            case 6:
                // Acción para la posición 6
                 int opcion4 =   JOptionPane.showConfirmDialog(null,"AVENIDA ORIENTAL\n" +
                                                                     "$100\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion4 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-100;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
                   
                   
            case 7:
                // Acción para la posición 7
                
                JOptionPane.showMessageDialog(null, "CASUALIDAD");                break;
            case 8:
                // Acción para la posición 8
                  int opcion5 =   JOptionPane.showConfirmDialog(null,"AVENIDA VERMONT\n" +
                                                                  "$100\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion5 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-100;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
             case 9:
                 
                // Acción para la posición 9
               int opcion6 =   JOptionPane.showConfirmDialog(null,"AVENIDA CONNECTICUT\n" +
                                                                 "$120\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion6 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-120;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
                   
            case 10:
                // Acción para la posición 10 (por ejemplo, "Jail/Just Visiting")
                 JOptionPane.showMessageDialog( null,"Posición: Jail/Just Visiting");
                break;
            case 11:
                // Acción para la posición 11
                int opcion7 =   JOptionPane.showConfirmDialog(null,"PLAZA SAN CARLOS\n" +
                                                                 "$140\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion7 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-140;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
            case 12:
                // Acción para la posición 12
               JOptionPane.showMessageDialog(null, "COMPAÑIA DE ELCTRICIDAD\n" +
                                                                 "-$150\n");     
                restante=dinero-150;
                break;
            case 13:
                // Acción para la posición 13
                
                int opcion8 =   JOptionPane.showConfirmDialog(null,"PLAZA ESTADOS\n" +
                                                                 "$140\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion8 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-140;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
                   
            case 14:
                  // Acción para la posición 11
                int opcion9 =   JOptionPane.showConfirmDialog(null,"AVENIDA VIRGINIA\n" +
                                                                 "$140\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion9 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-140;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
            case 15:
                // Acción para la posición 15
                JOptionPane.showMessageDialog(null, "FERROCARRIL DE PENSILVANIA\n" +
                                                                 "-$200\n");  
                 restante=dinero-200;
                break;
            case 16:
                // Acción para la posición 16
                 // Acción para la posición 11
                int opcion10 =   JOptionPane.showConfirmDialog(null,"PLAZA SANTIAGO\n" +
                                                                 "$180\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion10 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-180;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
            case 17:
                // Acción para la posición 17
                    JOptionPane.showMessageDialog(null, "ARCA COMUNAL");                  break;
            case 18:
                  // Acción para la posición 11
                int opcion11 =   JOptionPane.showConfirmDialog(null,"AVENIDA TENESSE\n" +
                                                                 "$180\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion11 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-180;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break; 
            case 19:
               // Acción para la posición 11
                int opcion12 =   JOptionPane.showConfirmDialog(null,"AVENIDA NEW YORK\n" +
                                                                 "$200\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion12 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-200;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;    
            case 20:
                // Acción para la posición 20 (por ejemplo, "Free Parking")
                  JOptionPane.showMessageDialog( null,"Posición: Free Parking");
                break;
            case 21:
                  // Acción para la posición 11
                int opcion13 =   JOptionPane.showConfirmDialog(null,"AVENIDA KENTUKY\n" +
                                                                 "$220\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion13 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-220;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
            case 22:
                // Acción para la posición 22
               JOptionPane.showMessageDialog(null,"CASUALIDAD");
                break;
            case 23:
                   // Acción para la posición 11
                int opcion14 =   JOptionPane.showConfirmDialog(null,"AVENIDA IDIANA\n" +
                                                                 "$220\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion14 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-220;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
            case 24:
                 // Acción para la posición 11
                int opcion15 =   JOptionPane.showConfirmDialog(null,"AVENIDA ILLLINOYS\n" +
                                                                 "$240\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion15 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-240;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
            case 25:
                // Acción para la posición 25
                 JOptionPane.showMessageDialog(null, "FERROCARRIL B y O\n" +
                                                                 "-$200\n");
                  restante=dinero-200;
                break;
            case 26:
                   // Acción para la posición 11
                int opcion16 =   JOptionPane.showConfirmDialog(null,"AVENIDA ATLANTICO\n" +
                                                                 "$260\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion16 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-260;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
            case 27:
                  // Acción para la posición 11
                int opcion17 =   JOptionPane.showConfirmDialog(null,"AVENIDA VENTNOR\n" +
                                                                 "$260\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion17 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-260;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
            case 28:
                // Acción para la posición 28
               JOptionPane.showMessageDialog(null, "COMPAÑIA DE AGUA\n" +
                                                                 "-$150\n");
                restante=dinero-150;
                break;
            case 29:
                  // Acción para la posición 11
                int opcion18 =   JOptionPane.showConfirmDialog(null,"JARDINES MARVIN\n" +
                                                                 "$260\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion18 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-260;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
            case 30:
                // Acción para la posición 30 (por ejemplo, "Go to Jail")
               JOptionPane.showMessageDialog(null, "VAS A LA CARCEL"); 
                break;
            case 31:
                  // Acción para la posición 11
                int opcion19 =   JOptionPane.showConfirmDialog(null,"AVENIDA PACIFICO\n" +
                                                                 "$300\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion19 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-300;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
            case 32:
                   // Acción para la posición 11
                int opcion20 =   JOptionPane.showConfirmDialog(null,"JARDINES CAROLINA EL NORTE\n" +
                                                                 "$300\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion20 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-300;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
            case 33:
                // Acción para la posición 33
                 JOptionPane.showMessageDialog(null, "ARCA COMUNAL");  
                break;
            case 34:
                // Acción para la posición 34
                  // Acción para la posición 11
                int opcion21 =   JOptionPane.showConfirmDialog(null,"AVENIDA PENSILVANIA\n" +
                                                                 "$320\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion21 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-320;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
            case 35:
                // Acción para la posición 35
               JOptionPane.showMessageDialog(null, "FERROCARRIL Y VIA RAPIDA\n" +
                                                                 "-$200\n");
                restante=dinero-200;
                break;
            case 36:
                // Acción para la posición 36
              JOptionPane.showMessageDialog(null,"CASUALIDAD");                break;
            case 37:
                   // Acción para la posición 11
                int opcion22 =   JOptionPane.showConfirmDialog(null,"PLAZA PARK\n" +
                                                                 "$320\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion22 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-320;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
            case 38:
                // Acción para la posición 38
             JOptionPane.showMessageDialog(null, "IMPUESTO SOBRE POSESIONES DE LUJO\n" +
                                                                   "PÁGUENSE -$100\n");    
              restante=dinero-100;
              break;
            case 39:
                   // Acción para la posición 11
                int opcion23 =   JOptionPane.showConfirmDialog(null,"PLA\n" +
                                                                 "$320\n"+"Desea comprar una propiedad?"+JOptionPane.YES_NO_OPTION);
        if (opcion23 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             restante=dinero-320;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
            default:
                 // Acción para la posición 11
                int opcion24 =   JOptionPane.showConfirmDialog(null,"CÓBRESE\n" +
                                                              "$200 DE SUELDO\n" +
                                                                     "\n" +
                                                                  "AL PASAR\n" +
                                                                      "\n" +
                                                                      "\n" +
                                                                   "SALIDA\n" +
                                                                       "←"+JOptionPane.YES_NO_OPTION);
        if (opcion24 == JOptionPane.YES_OPTION) {
            // Lógica para comprar la propiedad
             int restantetotal=dinero-200;
            JOptionPane.showMessageDialog(null ,"Has comprado " );
        } else {
            // Lógica si el jugador decide no comprar
            JOptionPane.showMessageDialog(null ,"No has comprado " );}
                   break;
        }
         
        SigTurno.setText("Es el turno de: " + this.nombreTurno.getText());
        botongirar6.setVisible(true);
    }
        
        
        void restarDinero(int restantetotal, int dinero) {
        int cantidad = 0;

        switch (dinero) {
            case 4:
                cantidad = 200; // IMPUESTO SOBRE INGRESOS
                break;
            case 5:
                cantidad = 200; // FERROCARRIL READING
                break;
            case 12:
                cantidad = 150; // COMPAÑIA DE ELECTRICIDAD
                break;
            case 15:
                cantidad = 200; // FERROCARRIL DE PENSILVANIA
                break;
            case 25:
                cantidad = 200; // FERROCARRIL B y O
                break;
            case 28:
                cantidad = 150; // COMPAÑIA DE AGUA
                break;
            case 35:
                cantidad = 200; // FERROCARRIL Y VIA RAPIDA
                break;
            case 38:
                cantidad = 100; // IMPUESTO SOBRE POSESIONES DE LUJO
                break;
            default:
                break;
        }

        if (cantidad > 0) {
            restantetotal -= cantidad;
            JOptionPane.showMessageDialog(null, "Has pagado $" + cantidad + ". Dinero restante: $" + restantetotal);
            if (restantetotal<=0){
         JOptionPane.showMessageDialog(null ,"ha perdido el jugador 1 " );
         }else{}
        }
    }

   
    

    

    private void delay() {
        try {
            Thread.sleep(80);
        } catch (InterruptedException ex) {
            Logger.getLogger(MovimientosPJ1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
