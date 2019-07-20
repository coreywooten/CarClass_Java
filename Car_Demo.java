package car;

/**
 * This program demonstrates the creation of a Car
 * object in the Car class. 
 * @author CoreyWooten
 *
 */

public class Car_Demo 
{
	public static void main(String[] args) 
	{
		Car myCar = new Car("Hyundai", 2014);
		
		// Call the accelerate method 5 times.
		
		{
			myCar.accelerate();
			System.out.println("Current Speed: " + myCar.getSpeed());
		}
		
		{
			myCar.accelerate();
			System.out.println("Current Speed: " + myCar.getSpeed());
		}
		
		{
			myCar.accelerate();
			System.out.println("Current Speed: " + myCar.getSpeed());
		}
		
		{
			myCar.accelerate();
			System.out.println("Current Speed: " + myCar.getSpeed());
		}
		
		{
			myCar.accelerate();
			System.out.println("Current Speed: " + myCar.getSpeed());
		}
		
		// Call the brake method 5 times. 
		
		{
			myCar.brake();
			System.out.println("Current Speed: " + myCar.getSpeed());
		}
		
		{
			myCar.brake();
			System.out.println("Current Speed: " + myCar.getSpeed());
		}
		
		{
			myCar.brake();
			System.out.println("Current Speed: " + myCar.getSpeed());
		}
		
		{
			myCar.brake();
			System.out.println("Current Speed: " + myCar.getSpeed());
		}
		
		{
			myCar.brake();
			System.out.println("Current Speed: " + myCar.getSpeed());
		}
		
		System.out.print("Session is complete.");
		
	}

}
