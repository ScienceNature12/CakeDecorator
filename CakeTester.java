//Author Tyler Bolen
package cake_decorations;


public class CakeTester
{

	public static void main(String[] args) 
	{
		
		MyCake mycake = new SheetCake();
		System.out.println(mycake.getDescription()
				+ "$" + mycake.cost());
		
		MyCake mycake2= new TieredCake();
		mycake2= new Frosting(mycake2);
		mycake2= new WritingOnCake(mycake2);
		mycake2= new Topper(mycake2);
		System.out.println(mycake2.getDescription()
				+ "$" + mycake2.cost());
		
		MyCake mycake3= new SheetCake();
		mycake3= new Frosting(mycake3);
		mycake3= new Fondant(mycake3);
		mycake3= new WritingOnCake(mycake3);
		mycake3= new Topper(mycake3);
		System.out.println(mycake3.getDescription()
				+ "$" + mycake3.cost());
		
		MyCake mycake4= new TieredCake();
		mycake4= new Frosting(mycake4);
		mycake4= new Fondant(mycake4);
		System.out.println(mycake4.getDescription()
				+ "$" + mycake4.cost());
		
	}//end main 

}//end CakeTester class
