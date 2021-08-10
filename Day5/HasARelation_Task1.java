package com.techment.Day5;

class Car
{
	String name;
	String model;
	Engine engine;
	
	public Car(String name, String model, Engine engine) {
		super();
		this.name = name;
		this.model = model;
		this.engine = engine;
	}	
	void displayCarInfo()
	{
		System.out.println("Name: "+name);
		System.out.println("Model: "+model);
		System.out.println("Engine Id :"+engine.engineId);
		System.out.println("Engine Type: "+engine.engineType);

	}

}
class Engine
{
	int engineId;
	String engineType;
	
	public Engine(int engineId, String engineType) {
		super();
		this.engineId = engineId;
		this.engineType = engineType;
	}
		
}
public class HasARelation_Task1 {

	public static void main(String[] args) {
		
		Engine eng= new Engine(101,"Inline Engine");
		Car car=new Car("Hyundai","Grand-I10",eng);
		car.displayCarInfo();

	}

}
