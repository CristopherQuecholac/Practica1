package practica1_20084_competencias;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Practica1_20084_competencias extends JFrame{
    private JButton bRun, bPausa, bDetener;
    private JLabel estilo1, estilo2;
    private JTextArea areaHilo1, areaHilo2;
    private JScrollPane jspHilo1, jspHilo2;
    public Practica1_20084_competencias(){
        setSize(400, 400);
        setTitle("condiciones de competencias");
        MisComponentes();
    }
    private void MisComponentes(){
        bRun = new JButton("Run");
        bPausa = new JButton("Pausa");
        bDetener = new JButton("Detener");
        areaHilo1 = new JTextArea();
        areaHilo2 = new JTextArea();
        jspHilo1 = new JScrollPane(areaHilo1);
        jspHilo2 = new JScrollPane(areaHilo2);
        estilo1 = new JLabel("Hilo1");
        estilo2 = new JLabel("Hilo2");
        
        setLayout(null);
        
        bRun.setBounds(10, 100, 100, 25);
        bPausa.setBounds(10, 150, 100, 25);
        bDetener.setBounds(10, 200, 100, 25);
        estilo1.setBounds(150, 10, 100, 25);
        estilo2.setBounds(250, 10, 100, 25);
        jspHilo1.setBounds(150, 50, 100, 300);
        jspHilo2.setBounds(250, 50, 100, 300);
        
        add(bRun);
        add(bPausa);
        add(bDetener);
        add(estilo1);
        add(estilo2);
        add(jspHilo1);
        add(jspHilo2);
        bRun.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               Hilo1 t1 = new Hilo1(areaHilo1);
               Hilo1 t2 = new Hilo1(areaHilo2);
               t1.start();
               t2.start();
           } 
        });
    }
    
    public static void main(String[] args) {
        Practica1_20084_competencias fr = new Practica1_20084_competencias();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
