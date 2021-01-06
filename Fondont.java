//Author Tyler Bolen 
package cake_decorations;

public class Fondant extends CakeDecorations 
{
	MyCake mycake;
	
	public Fondant(MyCake mycake)
	{
		this.mycake= mycake;
		
	}//end Fondant constructor 

	@Override
	public String getDescription()
	{
		return mycake.getDescription() + "decorated with Fondont, ";
		
	}//end getDescription 

	@Override
	public double cost() 
	{
		return 10.00 + mycake.cost();
		
	}//end cost

}//end Fondant class
