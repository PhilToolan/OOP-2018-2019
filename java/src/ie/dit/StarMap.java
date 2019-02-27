<<<<<<< HEAD
package ie.dit;

import java.util.ArrayList;

import processing.core.*;
import processing.data.*;

public class StarMap extends PApplet
{
    public void settings()
    {
        size(800, 800);
    }

    ArrayList<Star> stars = new ArrayList<Star>();

    public void setup()
    {
        Table table = loadTable("HabHYG15ly.csv", "header");
        for(TableRow row:table.rows())
        {
            Star s = new Star(row);
            stars.add(s);
            
        }

        for(Star s:stars)
        {
            System.out.println(s);
        }
    }

    public void draw()
    {

    }
=======
package ie.dit;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet
{
    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
        loadData();
        printStars();
    }

    public void loadData()
    {
        Table table = loadTable("HabHYG15ly.csv", "header");
        
        /*
        for(int i = 0 ; i < table.getRowCount() ; i ++)
        {
            TableRow row = table.getRow(i);
            System.out.println(row.getString("Display Name"));
            System.out.println(row.getString("Hab?"));            
        }
        */

        for(TableRow row:table.rows())
        {
            Star star = new Star(row);
            stars.add(star);     
        }
    }

    public void printStars()
    {
        for(Star star:stars)
        {
            System.out.println(star);
        }
    }

    private ArrayList<Star> stars = new ArrayList<Star>();

>>>>>>> 3ed093fac32ca5d7e43a8b381fe443420b0b5755
}