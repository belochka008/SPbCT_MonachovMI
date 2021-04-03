package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
public class Main {
    public static void main(String[] args) {
        JFrame fr=new JFrame("Вращение прямоугольника вокруг своего центра тяжести");
        fr.setPreferredSize( new Dimension(500,500));
        final JPanel pan= new JPanel();
        fr.add(pan);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        Timer tm= new Timer(500, new ActionListener(){
            int i=0;
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Graphics2D gr=(Graphics2D)pan.getRootPane().getGraphics();
                pan.update(gr);
                int x = 10, y = 20, w = 100, h = 50;
                GeneralPath path=new GeneralPath();
                path.append(new Rectangle(x, y, w, h),true);
                int x2=x;
                int y2=y;
                int w2 = w;
                int h2 = h;
                gr.translate(150, 150);
                AffineTransform tranforms = AffineTransform.getRotateInstance((i++)*0.07, x2 + w2/2, y2+ h2/2);
                gr.transform(tranforms);
                gr.draw(path);
            }});
        tm.start();
    }
}
