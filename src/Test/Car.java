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
		Car a=new Car("����", "��ɫ", 1500, 5);
		System.out.println("��ɫ��"+a.color+"\n"+"Ʒ�ƣ�"+a.name+"\n"+"���������"+a.passenger+"\n"+"���أ�"+a.weight);
	}
}
