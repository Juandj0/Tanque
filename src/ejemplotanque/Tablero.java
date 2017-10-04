/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotanque;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Juandavidjaime Huerfano
 * Jpanel dado que voy a pintar en el Canvas
 * ActionListener: Para poder ejecutar el escenario cada ciertos milisegundos
 */
public class Tablero extends JPanel implements ActionListener,MouseListener{
    private Timer timer ;
    private Tanque tanque;
//    private int xref;
//    private int yref;
//    private int x1ref;
//    private int y1ref;
    public Tablero(){
        this.tanque=new Tanque();
//       this.xref=0;
//       this.yref=0;
//       this.y1ref=100;
//       this.x1ref=0;
        //Lanza un evento de tipo ActionListener cada 25 Milisegundo
        //Se hace referencia a this porque la misma clase (Tablero) procesa el evento
        this.timer = new Timer(25, this);
        //Registrar evento del Teclado
        setFocusable(true); //Debe estar en modo Focus para que puede detectar el evento
        addKeyListener(new EventosTeclado()); //Inner class que procesa los eventos del teclado
        addMouseListener(this);
          
        this.timer.start(); //Inicio con el escenario
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//         Point mp = e.getPoint();
//         Rectangle cuadrado=new Rectangle(this.xref,this.yref ,20, 20);
//         if(cuadrado.contains(mp)){
//             System.out.println("Click sobre el rectangulo");
//         }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
         
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
        
    //Inner class Que captura los eventos del teclado
     private class EventosTeclado extends KeyAdapter {
        //Cuando se suelta una tecla
         
         @Override
         
        public void keyReleased(KeyEvent e) {
          int key = e.getKeyCode();
         
            if(key== KeyEvent.VK_LEFT){
           // xref-=20;
            }
//        if (key == KeyEvent.VK_SPACE) {
//            System.out.println("VK_SPACE"); //Se  va usar posteriormente 
//           }
System.out.println("oprimi una tecla");
        }
        //Cuando se presiona una tecla
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
//            if(key== KeyEvent.VK_LEFT){
//            xref-=1;
//            }
//              if(key== KeyEvent.VK_UP){
//                  yref-=1;
//            System.out.println("oprimi una tecla");
//            }
//                if(key== KeyEvent.VK_DOWN){
//            System.out.println("oprimi una tecla");
//            yref+=1;
//            }
//                  if(key== KeyEvent.VK_RIGHT){
//                       xref+=1;
//            System.out.println("oprimi una tecla");
//            }
//                   if(key== KeyEvent.VK_A){
//            x1ref-=1;
//            }
//              if(key== KeyEvent.VK_W){
//                  y1ref-=1;
//            System.out.println("oprimi una tecla");
//            }
//                if(key== KeyEvent.VK_S){
//            System.out.println("oprimi una tecla");
//            y1ref+=1;
//            }
//                  if(key== KeyEvent.VK_D){
//                       x1ref+=1;
//            System.out.println("oprimi una tecla");
//            }
            
        }
    }
    
    //Metodo donde se pintan los objetos 
     @Override
    public void paintComponent(Graphics g){
       super.paintComponent(g);
      
//        g.setColor(Color.red);
//        g.drawRect(this.xref,this.yref ,20, 20);
//        Rectangle carro = new Rectangle(this.xref,this.yref ,20, 20);
//        
//        g.fillOval(this.x1ref, this.y1ref, 15, 15);
//        Rectangle oval = new Rectangle(this.x1ref, this.y1ref, 15, 15);
//        
//        if(carro.intersects(oval)){
//          this.timer.stop();
//        }
//    
       
Image imgTanque= loadImage(tanque.getImagenes()[tanque.getAngulo()]);
g.drawImage(imgTanque, tanque.getX(), tanque.getY(), this);
    }
public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
    //Metodo que se ejecuta cada vez que se lanza un ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Repaint");
        repaint();
        
    }
}
