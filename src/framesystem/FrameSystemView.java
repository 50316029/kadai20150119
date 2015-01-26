package framesystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;
import lib.MM1_lib;
import lib.MMS_lib;

public class FrameSystemView extends Frame implements ActionListener,KeyListener,WindowListener {

	private TextField text1=new TextField("",10);
	private TextField text2=new TextField("",10);
	private TextField text3=new TextField("",10);
	private Button button1=new Button("�����Z");
	
	//M/M/1�p
	private TextField m1=new TextField("",10);
	private TextField m2=new TextField("",10);
	private TextField m3=new TextField("",10);
	private Button bm =new Button("M/M/1");
	
	//M/M/S�p
	private TextField ms1=new TextField("",10);
	private TextField ms2=new TextField("",10);
	private TextField ms3=new TextField("",10);
	private TextField ms4=new TextField("",10);
	private Button bms =new Button("M/M/S");
	
	
	public FrameSystemView(FrameSystemController controller) {
		// TODO Auto-generated constructor stub
		addWindowListener(this);
		setTitle("FrameSystem");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//Calculation
		add(text1);
		add(text2);
		add(button1);
		add(new Label("����"));
		add(text3);
		
		//M/M/1
		add(new Label("��"));
		add(m1);
		add(new Label("��"));
		add(m2);
		add(bm);
		add(new Label("���όn���l��"));
		add(m3);
		
		//M/M/S
		add(new Label("��"));
		add(ms1);
		add(new Label("��"));
		add(ms2);
		add(new Label("s"));
		add(ms3);
		add(bms);
		add(new Label("���όn���l��"));
		add(ms4);
		
		button1.addActionListener(this);
		bm.addActionListener(this);
		bms.addActionListener(this);
	}

	

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		//Calculation
		if(e.getSource()==button1){
			int val1=Integer.parseInt(text1.getText());
			int val2=Integer.parseInt(text2.getText());
			//text3.setText(String.valueOf(val1+val2));
			Calculation_lib clib=new Calculation_lib(val1,val2);
			text3.setText(String.valueOf(clib.getPlus()));
		}
		
		//M/M/1
		else if(e.getSource()==bm){
			double lambda=Double.parseDouble(m1.getText());
			double mu=Integer.parseInt(m2.getText());
			MM1_lib m1lib=new MM1_lib(lambda,mu); 
			m3.setText(String.valueOf(m1lib.getLength()));
		}
	
		//M/M/S
		else if(e.getSource()==bms){
			double lambdaS=Double.parseDouble(ms1.getText());
			double muS=Double.parseDouble(ms2.getText());
			int s=Integer.parseInt(ms3.getText());
			MMS_lib mSlib=new MMS_lib(lambdaS,muS,s); 
			ms4.setText(String.valueOf(mSlib.getL()));
			
		}
		
		}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
