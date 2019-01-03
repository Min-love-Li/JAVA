package ALU;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.text.*;
import javax.swing.border.*;
public class ALU {
	private int A;
	private int B;	
	private int f;
	JFrame frame =new JFrame ("������");
	JLabel label0 =new JLabel();
	JLabel label1 =new JLabel("����1");
	JLabel label2 =new JLabel("����2");
	JLabel label3 =new JLabel("S3S2S1S0");
	static String[] date= new String [] {" ","0000","0001","0010",
							"0011","0100","0101","0110","0111","1000",
							"1001","1010","1011","1100","1101","1110","1111"};
	static JComboBox <String> dateChooser=new JComboBox<>(date);//������	
	JTextField text1=new JTextField("",10);
	JTextField text2=new JTextField("",10);
	JButton buttonCn =new JButton("Cn=0");
	JButton buttonM =new JButton("M=1");
	JButton buttonQ =new JButton("ȷ��");
	JButton buttonC =new JButton("ȡ��");
	JTextArea F=new JTextArea(2,25);
	//������
	public static void main (String args[] )
	{
		ALU test=new ALU();
		test.go();
	}
	public void go()
	{
		JPanel jpane1=new JPanel();
		JPanel jpane2=new JPanel();
		JPanel jpane3=new JPanel();
		JPanel jpane4=new JPanel();
		JPanel jpane5=new JPanel();
		JPanel jpane23=new JPanel();
				
		JPanel jpanea=new JPanel();//�����������
		JPanel jpaneb=new JPanel();//ҳ�水ť
		JPanel jpaneall=new JPanel();//���еļ���
			
		jpane1.setLayout(new BorderLayout());//��һ�����
		jpane1.add(label0, BorderLayout.WEST);
		Border etched =BorderFactory.createEtchedBorder();
		Border border =BorderFactory.createTitledBorder(etched);
			
		dateChooser.setEditable(true);//�ɱ༭	
		jpane2.setLayout(new FlowLayout(FlowLayout.LEFT));	
		jpane3.setLayout(new FlowLayout(FlowLayout.LEFT));
		jpane2.add(label1);jpane2.add(text1);
		jpane2.add(label2);jpane2.add(text2);
		jpane3.add(label3);jpane3.add(dateChooser);
				
		JScrollPane jp=new JScrollPane(F);
		jpane4.add(jp);
		jpane5.setLayout(new GridLayout(1,1));
		jpane5.add(buttonCn);//�����зŰ�ť
		jpane5.add(buttonM);
		jpanea.add(jpane4);//�ı���ť
		jpanea.add(jpane5);
				
		border =BorderFactory.createTitledBorder(etched,"���");
		jpanea.setBorder(border);//���ñ߿�
				
		jpaneb.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jpaneb.add(buttonQ);//�Ű�ť
		jpaneb.add(buttonC);
				
		//���paneall
		jpane23.setLayout(new BorderLayout());
		jpane23.add(jpane2,BorderLayout.NORTH);
		jpane23.add(jpane3,BorderLayout.CENTER);
		jpaneall.setLayout(new BoxLayout(jpaneall,BoxLayout.Y_AXIS));
		jpaneall.add(jpane1);
		jpaneall.add(jpane23);
		jpaneall.add(jpanea);
		jpaneall.add(jpaneb);				
		     
		Container contpane=frame.getContentPane();
		contpane.setLayout(new FlowLayout());
		contpane.add(jpaneall);
		border=BorderFactory.createTitledBorder(etched, "ȡֵ");
		jpaneall.setBorder(border);
		//�¼������Լ���Ӧ
		ActionListener textlisten =new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//JTextField text=(JTextField)e.getSource();
			}
		};
		text1.addActionListener(textlisten);
		text2.addActionListener(textlisten);
		ActionListener boxlisten =new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//JComboBox boxS=(JComboBox)e.getSource();
				//if(boxS==dateChooser){}
			}
		};
		dateChooser.addActionListener(boxlisten);
		ActionListener a =new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton buttonX=(JButton)e.getSource();
				int index=dateChooser.getSelectedIndex();
				A=Integer.parseInt(text1.getText(),16);
				B=Integer.parseInt(text2.getText(),16);
				switch (index)
				{ 
				case 1:
					if(buttonX==buttonM)//���M ʹM=1
					{	    	
						f=qfan(A);
					}
					else if(buttonX==buttonQ)//Cn=1,M=0
					{
						f=A;
					}
				    else if(buttonX==buttonCn)//Cn=0
					{
						f=A+1;
					}
					break;
				case 2 :
					if(buttonX==buttonM)
					{
						f=qfan(A|B);
					}
					else if(buttonX==null)
					{
						f=A|B;
					}
				    else if(buttonX==buttonCn)
					{
						f=(A|B)+1;
					}
					break;
				case 3 :
					if(buttonX==buttonM)//���M ʹM=1
				    {
				    	
						f=qfan(A)&B;
					}
					else if(buttonX==buttonQ)//Cn=1,M=0
					{
						f=A|qfan(B);
					}
				    else if(buttonX==buttonCn)//Cn=0
				    {
						f=(A|qfan(B))+1;
					}
					break;
				case 4:
					if(buttonX==buttonM)//���M ʹM=1
					{			    	
						f=0;
					}
					else if(buttonX==buttonQ)//Cn=1,M=0
					{
						f=-1;
					}
				    else if(buttonX==buttonCn)//Cn=0
					{
						f=0;
					}
					break;
				case 5:
					if(buttonX==buttonM)//���M ʹM=1
				    {	    	
						f=qfan(A&B);
				    }
					else if(buttonX==buttonQ)//Cn=1,M=0
					{
						f=A+A&qfan(B);
					}
				    else if(buttonX==buttonCn)//Cn=0
				    {
						f=A+A&qfan(B)+1;
					}
					break;
				case 6:
					if(buttonX==buttonM)//���M ʹM=1
				    {    	
						f=qfan(B);
					}
					else if(buttonX==buttonQ)//Cn=1,M=0
					{
						f=(A|B)+A&qfan(B);
					}
				    else if(buttonX==buttonCn)//Cn=0
					{
						f=(A|B)+A&qfan(B)+1;
					}
					break;
				case 7:
					if(buttonX==buttonM)//���M ʹM=1
				    {	    	
						f=(qfan(A)&B|A&qfan(B));
					}
					else if(buttonX==buttonQ)//Cn=1,M=0
					{
						f=A-B-1;
					}
				    else if(buttonX==buttonCn)//Cn=0
					{
						f=A-B;
					}
					break;
				case 8:
					if(buttonX==buttonM)//���M ʹM=1
				    {	    	
						f=A&qfan(B);
					}
					else if(buttonX==buttonQ)//Cn=1,M=0
					{
						f=A&qfan(B)-1;
					}
				    else if(buttonX==buttonCn)//Cn=0
					{
						f=A&qfan(B);
					}
					break;
				case 9:
					if(buttonX==buttonM)//���M ʹM=1
				    {	    	
						f=qfan(A)|B;
					}
					else if(buttonX==buttonQ)//Cn=1,M=0
					{
						f=A+A&B;
					}
				    else if(buttonX==buttonCn)//Cn=0
					{
						f=A+A&B+1;
					}
					break;
				case 10:
					if(buttonX==buttonM)//���M ʹM=1
				    {
				    	
						f=qfan(qfan(A)&B|A&qfan(B));
				    }
					else if(buttonX==buttonQ)//Cn=1,M=0
					{
						f=A+B;
					}
				    else if(buttonX==buttonCn)//Cn=0
					{
						f=A+B+1;
					}
					break;
				case 11:
					if(buttonX==buttonM)//���M ʹM=1
				    {
						f=B;
					}
					else if(buttonX==buttonQ)//Cn=1,M=0
					{
						f=(A|qfan(B))+A&B;
					}
				    else if(buttonX==buttonCn)//Cn=0
					{
						f=(A|qfan(B))+A&B+1;
					}
					break;
				case 12:
					if(buttonX==buttonM)//���M ʹM=1
				    {
						f=A&B;
				    }
					else if(buttonX==buttonQ)//Cn=1,M=0
					{
						f=A&B-1;
					}
				    else if(buttonX==buttonCn)//Cn=0
					{
						f=A&B;
					}
					break;
				case 13:
					if(buttonX==buttonM)//���M ʹM=1
				    {
			    	
						f=1;
				    }
					else if(buttonX==buttonQ)//Cn=1,M=0
					{
						f=A+A;
					}
				    else if(buttonX==buttonCn)//Cn=0
					{
						f=A+A+1;
					}
					break;
				case 14:
					if(buttonX==buttonM)//���M ʹM=1
				    {
			    	
						f=A|qfan(B);
					}
					else if(buttonX==buttonQ)//Cn=1,M=0
					{
						f=(A|B)+A;
					}
				    else if(buttonX==buttonCn)//Cn=0
						{
							f=(A|B)+A+1;
						}
						break;
				case 15:
					if(buttonX==buttonM)//���M ʹM=1
				    {				    	
						f=A|B;
					}
					else if(buttonX==buttonQ)//Cn=1,M=0
					{
						f=(A|qfan(B))+A;
					}
				    else if(buttonX==buttonCn)//Cn=0
					{
						f=(A|qfan(B))+A+1;
					}
					break;
				case 16:
					if(buttonX==buttonM)//���M ʹM=1
				    {
				    	
						f=A;
					}
					else if(buttonX==buttonQ)//Cn=1,M=0
					{
						f=A-1;
					}
					else if(buttonX==buttonCn)//Cn=0
					{
						f=A;
					}
					break;
				}
				//����һ���
				int i,l;
				String f1;
				F.setText(null);
				//Integer.toHexString(f);
				f1=Integer.toBinaryString(f);
				l=f1.length();
				if(f1.length()<16)
					for(i = 0 ; i < 16 - l; i++)
						f1 = "0" + f1;
				else if(l==16||l==32);	
				else
					for(i = 0 ; i < 32 - l; i++)
						f1 = "0" + f1;
				f1=f1+"B";
				F.append("F="+f1);
			
				//������������
//				F.setText(null);
//				Integer.toHexString( (int) f);
//				F.append("F="+Integer.toBinaryString((int)f));//����Ϊ������
				if(buttonX==buttonC)
				{ 
					F.setText(null);
				}
			}
		};
		buttonCn.addActionListener(a);
		buttonM.addActionListener(a);
		buttonQ.addActionListener(a);
		buttonC.addActionListener(a);	
		
		frame.setSize(400, 400);//��ʾ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);     
	}  
	int qfan(int  A)//Ϊ�˴���Java���Զ�����ȡ�������
	{
		int a;
		int cc=text1.getText().length()>text2.getText().length()?text1.getText().length():text2.getText().length();//��λ���������λ��Ϊ��׼
		a=~A;
		int vv=0xf;
		for(int i=1;i<cc;i++)
		{
			vv=0xf+(vv << (4));
		}
		return a=a & vv;
	}
}