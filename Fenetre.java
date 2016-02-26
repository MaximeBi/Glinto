import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.Graphics;
import javax.swing.JLabel;
import javax.swing.BoxLayout;

public class Fenetre extends JFrame{

  private JPanel container = new JPanel();
  private JLabel label;

  public Fenetre(Enigme e){

    super("Glinto");
    this.setVisible(true);
    this.setSize(500,500);
    this.setLocationRelativeTo(null);
    Question q = e.askQuestion(1);
    this.label = new JLabel(q.getColorToString());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.container.setLayout(new BoxLayout(this.container, BoxLayout.PAGE_AXIS));
    this.container.add(this.label);
    this.setContentPane(container);
    //this.repaint();

  }


}
