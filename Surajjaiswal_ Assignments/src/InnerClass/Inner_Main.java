package InnerClass;

class car
{
	String carName;
	String carType;
	
	//assign values using constructor
	car (String name , String type)
	{
		this.carName=name;
		this.carType=type;
	}
	
	//private method
	private String getcarName()
	{
		return this.carName;
	}
	
	class engine
	{
		String engineType;
		
		public void setEngine()
		{
			
			//Accessing the carType property of car
			if(car.this.carType.equals("4WD"))
			{
			
				//Invoking method getcarName() of car
				if(car.this.carName.equals("Crysler"))
				{
					this.engineType = "Smaller";
				}
				else
				{
					this.engineType = "Bigger";
				}
			}else
			{
				this.engineType ="Bigger";
			}
			
		}
		String getEngineType()
		{
			return this.engineType;
		}
	}
	
	
}



public class Inner_Main 
{

	public static void main(String[] args)
	{
		car c = new car("Mazda", "8wd");
		
		car.engine eng = c.new engine();
		eng.setEngine();
		System.out.println("Engine Type for 8wd = "+eng.getEngineType());
		
		
		car c2 = new car("Crysler", "4WD");
		car.engine eng2 = c2.new engine();
		eng2.setEngine();
		System.out.println("Engine Type for 4wd = "+eng.getEngineType());
		

	}

}
