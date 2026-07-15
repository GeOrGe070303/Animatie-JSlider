import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main {

    public static ImageIcon[] img = new ImageIcon[9];
    public static JSlider sld;
    public static int cadru = 1;
    public static void main(String[] args) {

        JFrame f = new JFrame("Frame");
        f.setSize(700, 450);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setLocationRelativeTo(null);

        for(int i = 1; i <= 8; i++){
            img[i] = new ImageIcon(i + ".png");
        }

        JPanel panel = new JPanel();
        panel.setBounds(20, 20, 640, 300);

        JLabel poza = new JLabel(img[1]);
        panel.add(poza);

        sld = new JSlider(1, 8, 1);
        sld.setBounds(100, 340, 500, 40);
        sld.setMajorTickSpacing(1);
        sld.setPaintTicks(true);
        sld.setPaintLabels(true);

        sld.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                cadru = sld.getValue();
                poza.setIcon(img[cadru]);
            }
        });

        f.add(panel);
        f.add(sld);
        f.setVisible(true);
    }

}