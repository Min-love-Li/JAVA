package page;

public class ScopeTest {
	int x;
	static int m=0;
	void show()
	{
		int x=8,y;
		for(y=0;y<2;y++)
		{
			int z=5;//z的作用范围只在for内,局部变量
			System.out.println("z="+z);
			z=10;
			System.out.println("z="+z);
			System.out.println("方法域中的X="+x+"在快内显示");
		}
		//z=20;
		System.out.println("方法域中的X="+x+"在快外显示");
		System.out.println("方法域中的X="+this.x+"在快外显示");
		System.out.println("方法域中的m="+m+"在快外显示");
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
