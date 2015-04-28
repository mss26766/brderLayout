import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BrderLayout {
private JFrame frame;
private JPanel panel;
private JTextField [] text = new JTextField [4];

public BrderLayout() {
	frame = new JFrame();
	
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	text [0] = new JTextField(20);
	text [1] = new JTextField(20);
	text [2] = new JTextField(20);
	text [3] = new JTextField(20);
	
	panel = new JPanel();
	panel.setBackground(Color.blue);
	panel.setLayout(new BorderLayout());
	panel.add(text [0], BorderLayout.PAGE_START);
	panel.add(text [1], BorderLayout.PAGE_END);
	panel.add(text [2], BorderLayout.LINE_START);
	panel.add(text [3], BorderLayout.LINE_END);
	panel.setVisible(true);
	
	frame.add(panel);
	
}
}