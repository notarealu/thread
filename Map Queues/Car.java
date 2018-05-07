import java.util.*;

public class Car {

	private String make;
	private String model;
	private String color;
		
	// public Car(String make, String model, String color) {
	// 	this.make = make;
	// 	this.model = model;
	// 	this.color = color;
	// }
	
	public String getMake() {
		
		return make;
	}
	
	
	public void setMake(String make) {
		
		this.make = make;
	}
	
	public String getModel() {
		
		return model;
	}
	
	public void setModel(String model) {
		
		this.model = model;
	}
	
	public String getColor() {
		
		return color;
	}
	
	public void setColor(String color) {
		
		this.color = color;
	}
	
	public void setRandomMake(int random, ArrayList carMake) {
		
		make = carMake.get(random).toString();
	}
	
	public void setRandomModel(int random, ArrayList carModel) {
		model = carModel.get(random).toString();
	}	
	
	public void setRandomColor(int random, ArrayList carColor) {
		color = carColor.get(random).toString();
	}	
	
}