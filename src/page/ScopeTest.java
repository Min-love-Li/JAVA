package page;

public class ScopeTest {
	int x;
	static int m=0;
	void show()
	{
		int x=8,y;
		for(y=0;y<2;y++)
		{
			int z=5;//z�����÷�Χֻ��for��,�ֲ�����
			System.out.println("z="+z);
			z=10;
			System.out.println("z="+z);
			System.out.println("�������е�X="+x+"�ڿ�����ʾ");
		}
		//z=20;
		System.out.println("�������е�X="+x+"�ڿ�����ʾ");
		System.out.println("�������е�X="+this.x+"�ڿ�����ʾ");
		System.out.println("�������е�m="+m+"�ڿ�����ʾ");
	}
	void setx(int a)
	{
		this.x=a;
	}
	static void setm(int m)
	{
		ScopeTest.m=m;
	}
	public static void main(String[] args)

	{
		ScopeTest application =new ScopeTest();
		application.setx(2);
		setm(3);
		application.show();
		
	}
}
