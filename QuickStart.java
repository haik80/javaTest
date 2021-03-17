import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class QuickStart implements ActionListener {
  private int clicks = 0;
  private JLabel label = new JLabel("Number of clicks:  0");
  private JFrame frame = new JFrame();


  public QuickStart(){
    
    JButton button = new JButton("click me");
    button.addActionListener(this);
    JPanel panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
    panel.setLayout(new GridLayout(0,1));
    panel.add(button);
    panel.add(label);

    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Our GUI");
    frame.pack();
    frame.setVisible(true);

  }

  public static void main(String[] args) {
      new QuickStart();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    clicks++;
    label.setText("Number of clicks:  " + clicks);
    
  }
}