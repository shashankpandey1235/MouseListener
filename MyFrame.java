import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
    JLabel jLabel;
    ImageIcon dizzy;
    ImageIcon pain;
    ImageIcon smile ;
    ImageIcon nervous;
    MyFrame(){
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(700,700);

      jLabel = new JLabel();
      this.addMouseListener(this);


      smile = new ImageIcon("smile.png");
      pain = new ImageIcon("pain.jpeg");
      nervous = new ImageIcon("nervous.jpeg");
      dizzy = new ImageIcon("dizzy.png");

      this.setLocationRelativeTo(null);

      this.setLayout(new FlowLayout());
      this.add(jLabel);
      this.setVisible(true);
      
    }
    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println("You Clicked The Mouse");
//        jLabel.setBackground(Color.BLUE);
        jLabel.setIcon(smile);


    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

        System.out.println("You Pressed The Mouse ");
//        jLabel.setBackground(Color.CYAN);
        jLabel.setIcon(nervous);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        System.out.println("You Released The Mouse ");
//        jLabel.setBackground(Color.DARK_GRAY);
        jLabel.setIcon(pain);

    }
    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

        System.out.println("You Entered the Component");
        jLabel.setBackground(Color.GRAY);
        jLabel.setIcon(dizzy);

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

        System.out.println("You exited the component");
        jLabel.setBackground(Color.GREEN);
        jLabel.setIcon(pain);
    }
}
