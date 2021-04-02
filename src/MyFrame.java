import Monsters.Monsters;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyFrame extends JFrame {
    JButton button1, button2, button3, button4, button5,button6;
    JPanel panel1,panel2,panel3;                              //Showing what you can play
    final int SUMMON_BUTTON_HEIGHT = 700;
    int MAGIC_USE_HEIGHT;
    final int SPACING = 2;
    int x = -100;
    int y = -100;


    public MyFrame() {

        button1 = new JButton(getName());
        button1.setBackground(new Color(0, 0, 100));
        button1.setBounds(1250+2, SUMMON_BUTTON_HEIGHT, 60, 60);

        button2 = new JButton(getName());
        button2.setBackground(new Color(0, 0, 100));
        button2.setBounds(1325+25, SUMMON_BUTTON_HEIGHT, 60, 60);

        button3 = new JButton(getName());
        button3.setBackground(new Color(0, 0, 100));
        button3.setBounds(1400+40, SUMMON_BUTTON_HEIGHT, 60, 60);

        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();

        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(9, 28, 201));
        panel1.setBounds(1240, SUMMON_BUTTON_HEIGHT - 100, 75, 75);


        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(new Color(9, 28, 201));
        panel2.setBounds(1240+100, SUMMON_BUTTON_HEIGHT - 100, 75, 75);


        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBackground(new Color(9, 28, 201));
        panel3.setBounds(1240+200, SUMMON_BUTTON_HEIGHT - 100, 75, 75);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1612, 840);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setBackground(Color.DARK_GRAY);


        Board board = new Board();
        this.setContentPane(board);
        board.setLayout(null);
        board.add(button1);
        board.add(button2);
        board.add(button3);
        board.add(panel1);
        board.add(panel2);
        board.add(panel3);


        MouseE event = new MouseE();
        this.addMouseListener(event);
        this.addMouseMotionListener(event);


    }

    public class Board extends JPanel {


        public void paintComponent(Graphics g) {
            g.setColor(new Color(165, 21, 21));
            g.fillRect(0, 0, 1200, 800);
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 8; j++) {

                    g.setColor(new Color(150, 93, 6));
                    g.fillRect(SPACING + i * 100, SPACING + j * 100, 100 - 2 * SPACING, 100 - 2 * SPACING);


                    if (x >= SPACING + i * 100 && x < SPACING + i * 100 - 2 * SPACING &&
                            y >= SPACING + j * 100 && y < SPACING + j * 100 + 100 - 2 * SPACING) {
                        g.setColor(Color.black);
                    }

                }
            }
        }
    }

    public class MouseE implements MouseMotionListener, MouseListener {


        @Override
        public void mouseClicked(MouseEvent e) {
            //Choosing the Monster and his Actions
            if (inFildX() != -1 && inFildY() != -1) {

            }
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

        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            x = e.getX();
            y = e.getY();
            System.out.println("x:" + x + "y" + y);

        }


        public int inFildX() {
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 8; j++) {
                    if (x >= SPACING + i * 100 && x < SPACING + i * 100 - 2 * SPACING &&
                            y >= SPACING + j * 100 && y < SPACING + j * 100 + 100 - 2 * SPACING) {
                        return i;
                    }
                }
            }
            return -1;
        }


            public int inFildY () {
                for (int i = 0; i < 12; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (x >= SPACING + i * 100 && x < SPACING + i * 100 - 2 * SPACING &&
                                y >= SPACING + j * 100 && y < SPACING + j * 100 + 100 - 2 * SPACING) {
                            return j;
                        }

                    }
                }
                return -1;

        }
    }
}






