package ie.dit;

public class Main
{	

	public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
	}
	
	public void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
	}

	public void loops()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
		
	}
	
	public void arrays()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Arrays());
		
	}
	
	public void starMap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new StarMap());
		
	}
	
	public void cafeRubis()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new CafeRubis());
		
	}

	public void menu()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Menu());
		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
<<<<<<< HEAD
		main.menu();			
=======
		main.cafeRubis();			
>>>>>>> 564abae82e8d3f647640a971484e0adc3b32b6f0
	}
}