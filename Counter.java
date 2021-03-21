import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener{

  JLabel leftLabel;
  JLabel rightLabel; 
  int leftCount;
  int rightCount;

  // Creation of Constructor
  Counter() {
    //Frame Specifications
    JFrame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
    frame.setSize(200,110);

    //Creation of Buttons
    JButton left = new JButton("Left");
    JButton right = new JButton("Right");

    //Setting counts to 0
    leftCount = 0;
    rightCount = 0;

    //Creation of Action Listeners
    left.addActionListener(this);
    right.addActionListener(this);

    leftLabel.setText("Count " + leftLabel);
    rightLabel.setText("Count " + rightLabel);

    //Adding to Frame
    frame.add(left);
    frame.add(right);

    //Creation of Reset Button
    JButton reset;
    reset = new JButton("Reset");

    reset.addActionListener(this);

    frame.add(reset);

    //Setting Frame to Visible
    frame.setVisible(true);
  }

  //Creation of Action Performed Method
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

