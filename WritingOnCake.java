//Author Tyler Bolen
package cake_decorations;

public class WritingOnCake extends CakeDecorations 
{

	MyCake mycake;
	
	public WritingOnCake(MyCake mycake)
	{
		this.mycake= mycake;
		
	}//end WritingOnCake constructor

	@Override
	public String getDescription()
	{
		return mycake.getDescription() + "decorated with Writing on cake, ";
		
	}//end getDescription

	@Override
	public double cost() 
	{
		return 2.00 + mycake.cost();
		
	}//end cost

}//end WritingOnCake class
