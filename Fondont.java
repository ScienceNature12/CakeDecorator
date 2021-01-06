//Author Tyler Bolen 
package cake_decorations;

public class Fondont extends CakeDecorations 
{
	MyCake mycake;
	
	public Fondont(MyCake mycake)
	{
		this.mycake= mycake;
		
	}//end Fondont constructor 

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

}//end Fondont class
