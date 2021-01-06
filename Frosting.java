//Author Tyler Bolen
package cake_decorations;

public class Frosting extends CakeDecorations
{
	MyCake mycake;
	
	public Frosting(MyCake mycake)
	{
		this.mycake= mycake;
		
	}//end Frosting constructor

	@Override
	public String getDescription()
	{
		return mycake.getDescription() + "decorated with Frosting, ";
		
	}//end getDescriton

	@Override
	public double cost() 
	{
		return 5.00 + mycake.cost();
		
	}//end cost

}//end Frosting class
