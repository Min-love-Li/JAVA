package page;
public class Car {
	private String name;
	private String color;
	private double weight;
	private int passenger;
	public Car(String name, String color, double weight, int passenger) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.passenger = passenger;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getPassenger() {
		return passenger;
	}
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
//	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", weight=" + weight + ", passenger=" + passenger + "]";
	}
}


