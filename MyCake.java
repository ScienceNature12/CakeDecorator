//Author Tyler Bolen 
package cake_decorations;

public abstract class MyCake 
{
	String description= "unknow cost";
	
	public  String getDescription() 
	{
		return description;
		
	}//end getDescription
	
	public abstract double cost();

}//end MyCake class
