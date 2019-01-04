package Test;

public class Car {
	public String name;
	public String color;
	public double weight;
	public int passenger;
	Car( String n, String c,double w, int p)
	{
		name = n;
		color = c;
		weight = w;
		passenger = p;
	}
	public static void  main(String [] args)
	{
		Car a=new Car("本田", "黑色", 1500, 5);
		System.out.println("颜色："+a.color+"\n"+"品牌："+a.name+"\n"+"搭乘人数："+a.passenger+"\n"+"自重："+a.weight);
	}
}
