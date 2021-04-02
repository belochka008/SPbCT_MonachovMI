import java.awt.*;
import java.awt.event.*;
public class DrawCanvas extends Canvas {
    private int lastX, lastY;
    private int ex, ey;
    private boolean clear=false;

    public DrawCanvas () {
        super();
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                ex=e.getX();
                ey=e.getY();
                repaint();
            }
        });

        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar()==' ') {
                    clear = true;
                    repaint();
                }
            }
        });
    }

    public void update(Graphics g) {
        if (clear) {
            g.clearRect(0, 0, getWidth(), getHeight());
            clear = false;
        } else {
            g.drawLine(lastX, lastY, ex, ey);
            lastX=ex;
            lastY=ey;
        }
    }
    public static void main(String s[]) {
        //final Frame f = new Frame("Draw");
        final Frame f = new Frame("Border");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        f.setSize(1920, 1080);

        final Canvas c = new DrawCanvas();
        f.add(c);
        f.add(new Button("North"),
                BorderLayout.NORTH);
        f.add(new Button("South"),
                BorderLayout.SOUTH);
        f.add(new Button("West"),
                BorderLayout.WEST);
        f.add(new Button("East"),
                BorderLayout.EAST);
        f.add(new Button("Center"),
                BorderLayout.CENTER);
        f.setVisible(true);

    }
}