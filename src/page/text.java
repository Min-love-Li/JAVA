package page;

import java.util.*;

public class text {
	
	public static void main(String args[]) {
		
		Car car1=new Car("BMW","black",1500,5);
		Car car2=new Car("BENZ","black",1500,5);
		Car car3=new Car("VOLVO","black",1500,5);
		Car car4=new Car("Hong","black",1500,5);
		List<Car>list=new ArrayList<Car>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(car4);
		for(Car car:list) {
			System.out.println(car);
		}
	}
}
