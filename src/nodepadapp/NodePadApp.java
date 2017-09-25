package nodepadapp;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class NodePadApp {

    public static void main(String[] args) {
        NotePad np = new NotePad();
        np.setTitle("NotePad Test");
        np.setSize(900, 700);
        np.setVisible(true);
         ImageIcon icon = new ImageIcon("C:\\Users\\lenovo\\Desktop\\week1\\red.png");
         np.setIconImage(icon.getImage());
         np.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
