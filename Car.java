package car;

/**
 * The Car class represents a car.
 * @author CoreyWooten
 * 18 July 2019
 */

public class Car 
{
	// Fields
	private int yearModel = 2014;
	private String Make = "Hyundai"; 
	private int Speed = 0;
	
	/**
	 * The constructor accepts the arguments for
	 * the car's year model and make.
	 */
	
	public Car(String n, int Model)
	{
		Make = n;
		yearModel = Model; 
	}
	
	public int getyearModel()
	{
		return yearModel;
	}
	
	public String getMake()
	{
		return Make; 
	}
	
	public int getSpeed()
	{
		return Speed;
	}
	
	public void accelerate()
	{
		Speed = Speed + 5;
	}
	
	public void brake()
	{
		Speed = Speed - 5;
	}
}

