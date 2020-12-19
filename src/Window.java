import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;


public  class Window extends JFrame implements ActionListener{

        Button bred , blue ,bgreen , gray;
        String text ;

       public  Window() {
    		 JTextArea text = new JTextArea( "bienvenue !!");
           bred = new Button("change background to Red");
           blue = new Button("change background to blue");
           bgreen = new Button("change background to green ");
           gray = new Button("change background to gray ");

           setLayout(new FlowLayout()); // set layout to Flowlayout
            //  6) add button on frame
           text.setBounds(60,100, 100,60); 
   		text.setFont(new Font("Book Antiqua", Font.ITALIC, 35));
           add(text);
           add(gray);
            add(bred);
            add(blue);
            add(bgreen);

            // 7) add action listener on button
            gray.addActionListener(this);
            bred.addActionListener(this);
            blue.addActionListener(this);
            bgreen.addActionListener(this);
       }

       public static void main (String[] args) {
           Window c = new Window();
           GridLayout experimentLayout = new GridLayout(0,2);
           c.setTitle("change background color of frame");
           c.setSize(300,300);
           c.setVisible(true);
 		  c.setDefultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }

    private void setDefultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		  setDefultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
         String clickDbuton = e.getActionCommand();
           System.out.println("ur button has been clicked " + clickDbuton );

if(e.getSource() == gray) {
	setBackground(Color.gray);
}
       if(e.getSource() == bred) {
           setBackground(Color.red);

       }else if (e.getSource() == blue) {
           setBackground(Color.blue);
    }
       else if (e.getSource() == bgreen) {
           setBackground(Color.green);
       }
    }
}