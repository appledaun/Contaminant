import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;

public class MainCompetence extends Competence {
	
	private JPanel p1, p2, p3;
	private JPanel cP1, cP2, cP3;
	private JPanel csP1;
	
	private JLabel projectName;
	
	private JLabel c1data, c3Label;
	
	private JButton more, c2, c3, c4;

	private JLabel c5;
	
	private Frame f = new Frame();
		
	public void init() {
		
		projectName = new JLabel("오주의 마법사");
		c1data = new JLabel("------data--------");	c1data.setHorizontalAlignment(JLabel.CENTER);
		c1data.setPreferredSize(new Dimension(f.getSize().width, 150)); 
		c3Label = new JLabel("날짜별");
		more = new JButton("더보기");
		more.setPreferredSize(new Dimension(50, 20));
		c2 = new JButton("지역별 대기오염물질 확인");
		c2.setPreferredSize(new Dimension(f.getSize().width, 70));
		c3 = new JButton("달력");	
		c3.setPreferredSize(new Dimension(90, 90));
		c4 = new JButton("오염물질 정보");
		c5 = new JLabel("애니메이션");	c5.setHorizontalAlignment(JLabel.CENTER);
		c5.setPreferredSize(new Dimension(f.getSize().width, 100));
		
		/*
		csP1= new JPanel();
		csP1.setLayout(new GridLayout(2, 1));
		csP1.add(c3Label);
		csP1.add(c3);
		*/
		
		cP1 = new JPanel();
		cP1.setLayout(new BorderLayout());
		cP1.add(c1data, BorderLayout.NORTH);
		cP1.add(more, BorderLayout.EAST);
		
		cP2 = new JPanel();
		cP2.add(c2);
		
		cP3 = new JPanel();
		cP3.setLayout(new FlowLayout());
		//cP3.add(c3Label);
		cP3.add(c3);
		//cP3.add(csP1);
		cP3.add(c4);
		
		p1 = new JPanel();
		p1.add(projectName);
		
		p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		p2.add(cP1, BorderLayout.NORTH);	p2.add(cP2, BorderLayout.CENTER);	p2.add(cP3, BorderLayout.SOUTH);
		
		p3 = new JPanel();
		p3.add(c5);
		
		
	}
	
	public MainCompetence() {
		//super();
		//Container cont = getContentPane();
		//cont.setLayout(new FlowLayout());
		
		Container cont = f.getContentPane();
		
		f.setTitle("냐하하항");
		f.setSize(400, 600);
		
		init();
		
		cont.setLayout(new BorderLayout());
		
		
		
		cont.add(p1, BorderLayout.NORTH);
		cont.add(p2, BorderLayout.CENTER);
		cont.add(p3, BorderLayout.SOUTH);
		
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		MainCompetence m = new MainCompetence();
		m.f.setVisible(true);
	}
	
}
