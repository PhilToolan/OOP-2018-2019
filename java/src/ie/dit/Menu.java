package ie.dit;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Menu extends PApplet
{

    public void settings()
    {
        size(800,600);
    }

    public void setup()
    {
        loadData();

    }

    public void loadData()
    {
        Table table = loadTable("Cafe.csv", "header");
        
        for(int i = 0 ; i < table.getRowCount() ; i ++) { TableRow row =
        table.getRow(i); System.out.println(row.getString("Name"));
        System.out.println(row.getString("Price")); }
         
        
    }
}
