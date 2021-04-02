import javax.swing.*;
import java.awt.*;

public class Main implements Runnable{

    MyFrame frame = new MyFrame();

    public static void main(String[] args) {

        new Thread(new Main()).start();

    }

    @Override
    public void run() {
        while(true){
            frame.repaint();
        }

    }
}
