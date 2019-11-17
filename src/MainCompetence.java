import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;

public class MainCompetence extends Competence {
	
	private JPanel p1, p2, p3;
	private JPanel cP1, cP2, cP3;
	
	private JLabel projectName;
	
	private JLabel c1data, c3Label;
	
	private JButton more, c2, c3, c4;
	
	private Frame f = new Frame();
		
	public void init() {
		
		projectName = new JLabel("팀명");
		c1data = new JLabel("------data--------");
		c3Label = new JLabel("날짜별");
		more = new JButton("더보기");
		more.setSize(new Dimension(30, 12));
		c2 = new JButton("지역별 대기오염물질 확인");
		c3 = new JButton("달력");
		c4 = new JButton("오염물질 정보");
		
		cP1 = new JPanel();
		cP1.setLayout(new BorderLayout());
		cP1.add(c1data, BorderLayout.NORTH);
		cP1.add(more, BorderLayout.SOUTH);
		
		cP2 = new JPanel();
		cP2.add(c2);
		
		cP3 = new JPanel();
		cP3.setLayout(new FlowLayout());
		cP3.add(c3Label);
		cP3.add(c3);
		cP3.add(c4);
		
		p1 = new JPanel();
		p1.add(projectName);
		
		p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		p2.add(cP1, BorderLayout.NORTH);	p2.add(cP2, BorderLayout.CENTER);	p2.add(cP3, BorderLayout.SOUTH);
		
		p3 = new JPanel();
		
		
		
	}
	
	public MainCompetence() {
		//super();
		//Container cont = getContentPane();
		//cont.setLayout(new FlowLayout());
		
		Container cont = f.getContentPane();
		
		f.setTitle("냐하하항");
		f.setSize(700, 1000);
		
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
