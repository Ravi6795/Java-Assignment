
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIWork
{
	public static void main(String[] args)
	{
		BorderLayoutStyle bl = new BorderLayoutStyle();
		
	}
}

class BorderLayoutStyle implements ActionListener
{

	static JPanel northPanel;
	static JPanel southPanel;
	static JPanel westPanel;
	static JPanel eastPanel;
	static JPanel centerPanel;
	
	public int center;
	public int north;
	public int south;
	public int west;
	public int east;
	
	public BorderLayoutStyle()
	{
		JFrame jfr = new JFrame();
		int windowWidth = 600; // Window width in pixels
		int windowHeight = 600; // Window height in pixels
		jfr.setBounds(50, 100, // Set position
		windowWidth, windowHeight); // and size
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfr.setTitle("My JFrame");
		
		
		Dimension d = new Dimension(100,100);
		
		jfr.setMinimumSize(d);
		
		jfr.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		
		Container con = jfr.getContentPane();
		con.setLayout(new BorderLayout(5, 5));

		JPanel p = new JPanel(null);
		
		JButton button;
		JCheckBox checkBox;
		
		// For West
		
		button = new JButton("Blue");
		button.setBounds(10,30,90,40);
		button.setText("Blue");
		button.addActionListener(this);
		p.add(button);
		
		button = new JButton("Orange");
		button.setBounds(10,90,90,40);
		button.setText("Orange");
		button.addActionListener(this);
		p.add(button);
		
		button = new JButton("White");
		button.setBounds(10,150,90,40);
		button.setText("White");
		button.addActionListener(this);
		p.add(button);
		
		button = new JButton("Green");
		button.setBounds(10,210,90,40);
		button.setText("Green");
		button.addActionListener(this);
		p.add(button);
		
		button = new JButton("Black");
		button.setBounds(10,270,90,40);
		button.setText("Black");
		button.addActionListener(this);
		p.add(button);
		
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setPreferredSize(new Dimension(150, 200));
		checkBox = new JCheckBox("Color Me");
		checkBox.setBounds(10, 10, 20, 20);
		checkBox.setName("West");
		checkBox.addActionListener(this);
		
		p.add(checkBox);
		
		con.add(p, BorderLayout.WEST);
		
		westPanel = p;
		
		//---------------------------------------
		
		
		// For East
		p = new JPanel(null);
		
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setPreferredSize(new Dimension(150, 200));
		checkBox = new JCheckBox("Color Me");
		checkBox.setBounds(10, 10, 20, 20);
		checkBox.setName("East");
		checkBox.addActionListener(this);
		
		p.add(checkBox);
		con.add(p, BorderLayout.EAST);
		
		eastPanel = p;
		//---------------------------------------
		
		// For North
		p = new JPanel(null);
		
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setPreferredSize(new Dimension(400, 100));
		checkBox = new JCheckBox("Color Me");
		checkBox.setBounds(10, 10, 20, 20);
		checkBox.setName("North");
		checkBox.addActionListener(this);
		
		p.add(checkBox);
		
		con.add(p, BorderLayout.NORTH);
		
		northPanel = p;
		//---------------------------------------
		
		// For South
		p = new JPanel(null);
		
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setPreferredSize(new Dimension(400, 100));
		checkBox = new JCheckBox("Color Me");
		checkBox.setBounds(10, 10, 20, 20);
		checkBox.setName("South");
		checkBox.addActionListener(this);
		
		p.add(checkBox);
		con.add(p, BorderLayout.SOUTH);
		
		southPanel = p;
		//---------------------------------------
		
		// For Center
		p = new JPanel(null);
		
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setPreferredSize(new Dimension(400, 400));
		
		checkBox = new JCheckBox("Color Me");
		checkBox.setBounds(10, 10, 20, 20);
		checkBox.setName("Center");
		checkBox.addActionListener(this);
		
		p.add(checkBox);
		
		con.add(p, BorderLayout.CENTER);
		
		centerPanel = p;
		//---------------------------------------
		
		center = 0;
		north = 0;
		south  = 0;
		west = 0;
		east = 0;
		
		jfr.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
	
		if(event.getSource() instanceof JButton)
		{
			JButton c = (JButton)event.getSource();
			Color selectedColor = Color.WHITE;
		
			if(c.getText().equals("Blue"))
				selectedColor = Color.BLUE;
			else if(c.getText().equals("Orange"))
				selectedColor = Color.ORANGE;
			else if(c.getText().equals("White"))
				selectedColor = Color.WHITE;
			else if(c.getText().equals("Green"))
				selectedColor = Color.GREEN;
			else if(c.getText().equals("Black"))
				selectedColor = Color.BLACK;
				
				
			if(center == 1)
				centerPanel.setBackground(selectedColor);
			if(south==1)
				southPanel.setBackground(selectedColor);
			if(east==1)
				eastPanel.setBackground(selectedColor);
			if(west==1)
				westPanel.setBackground(selectedColor);
			if(north==1)
				northPanel.setBackground(selectedColor);
			
			
		}
		else if(event.getSource() instanceof JCheckBox)
		{
			JCheckBox checkBox = (JCheckBox)event.getSource();
			if(checkBox.getName().equals("Center"))
			{
				if(checkBox.isSelected())
					center = 1;
				else
					center = 0;
			}
			if(checkBox.getName().equals("South"))
			{
				if(checkBox.isSelected())
					south = 1;
				else
					south = 0;
			}
			if(checkBox.getName().equals("East"))
			{
				if(checkBox.isSelected())
					east = 1;
				else
					east = 0;
			}
			if(checkBox.getName().equals("West"))
			{
				if(checkBox.isSelected())
					west = 1;
				else
					west = 0;
			}
			if(checkBox.getName().equals("North"))
			{
				if(checkBox.isSelected())
					north = 1;
				else
					north = 0;
			}

		}
	}
}