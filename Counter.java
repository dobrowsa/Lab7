import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {
  int leftCount = 0;
  int rightCount = 0;

  JLabel leftLabel = new JLabel("Count: " + leftCount);
  JLabel rightLabel = new JLabel("Count: " + rightCount);

  // Creation of Constructor
  Counter() {
    // Frame Specifications
    JFrame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
    frame.setSize(200, 110);

    // Creation of Buttons
    JButton left = new JButton("Left");
    JButton right = new JButton("Right");

    // Creation of Action Listeners
    left.addActionListener(this);
    right.addActionListener(this);

    // Creation of Reset Button
    JButton reset = new JButton("Reset");
    reset.addActionListener(this);

    // Adding to Frame
    frame.add(left);
    frame.add(right);
    frame.add(leftLabel);
    frame.add(rightLabel);
    frame.add(reset);

    // Setting Frame to Visible
    frame.setVisible(true);
  }

  // Creation of Action Performed Method
  public void actionPerformed(ActionEvent ae) {
    if(ae.getActionCommand().equals("Left")) {
      leftCount++;
      leftLabel.setText("Count: " + leftCount);
    }
    else if (ae.getActionCommand().equals("Right")) {
      rightCount++;
      rightLabel.setText("Count: " + rightCount);
    }
    else if (ae.getActionCommand().equals("Reset")) {
      leftCount = 0;
      rightCount = 0;
      leftLabel.setText("Count: " + leftCount);
      rightLabel.setText("Count: " + rightCount);
    }
  }
}

