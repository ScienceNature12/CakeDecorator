//Author Tyler Bolen
package cake_decorations;

public class Topper extends CakeDecorations
{

	static MyCake mycake;
	private static Topper uniqueInstance= new Topper(mycake);
 
	public Topper(MyCake mycake) 
	{
  
		Topper.mycake= mycake;
		
	}//end Topper constructor 
	
	public static synchronized Topper getInstance()
	{
  
		return uniqueInstance;
		
	}//end getInstance 
	
	@Override
	public String getDescription()
	{
  
		return mycake.getDescription() + "decorated with a topper ";
		
	}//end getDescription

	@Override
	public double cost() 
	{
  
		return 4.00 + mycake.cost();
		
	}//end cost
	
}//end Topper class
