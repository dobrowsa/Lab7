import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener{

  JLabel leftLabel;
  JLabel rightLabel; 
  int leftCount;
  int rightCount;

  Counter() {
    JFrame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
    frame.setSize(200,110);

    JButton left = new JButton("Left");
    JButton right = new JButton("Right");

    leftCount = 0;
    rightCount = 0;

    left.addActionListener(this);
    right.addActionListener(this);

    leftLabel.setText("Count " + leftLabel);
    rightLabel.setText("Count " + rightLabel);

    frame.add(left);
    frame.add(right);

    JButton reset;
    reset = new JButton("Reset");

    reset.addActionListener(this);

    frame.add(reset);

    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    if(ae.getActionCommand().equals("Left")) {
      leftCount++;
      leftLabel.setText("You pressed left");
    }
    else if (ae.getActionCommand().equals("Right")) {
      rightCount++;
      rightLabel.setText("You pressed right");
    }
    else if (ae.getActionCommand().equals("Reset")) {
      leftCount = 0;
      rightCount = 0;
      reset = JButton("Reset");
      leftLabel.setText("Count " + leftLabel);
      rightLabel.setText("Count " + rightLabel);
    }
  }
}

