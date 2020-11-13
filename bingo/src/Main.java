import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Canvas extends JPanel {

    private void setupBoard(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
                g2d.setStroke(new BasicStroke(5));
                g2d.setFont(new Font("Open Sans", Font.BOLD, 20));


        g2d.drawString("Bingo thing", 180, 50);
        for (int i = 100; i <= 600; i += 100) {
            g2d.drawLine(0, i, 500, i);
            g2d.drawLine(i - 100, 100, i - 100, 600);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        setupBoard(g);
    }
}

public class Main extends JFrame {

    public Main() {

        initUI();
    }

    private void initUI() {
        add(new Canvas());

        setTitle("Bingo thing");
        setSize(517, 640);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Main ex = new Main();
            ex.setVisible(true);
        });
    }
}