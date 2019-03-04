<<<<<<< HEAD
<<<<<<< HEAD
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

=======
package ie.dit;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet {
    public void settings() {
        size(800, 800);
        border = width * 0.05f;
    }

    public void setup() {
        loadData();
        printStars();
    }

    public void loadData() {
        Table table = loadTable("HabHYG15ly.csv", "header");

        /*
         * for(int i = 0 ; i < table.getRowCount() ; i ++) { TableRow row =
         * table.getRow(i); System.out.println(row.getString("Display Name"));
         * System.out.println(row.getString("Hab?")); }
         */

        for (TableRow row : table.rows()) {
            Star star = new Star(row);
            stars.add(star);
        }
    }

    void drawGrid() {
        fill(255, 0, 255);
        stroke(255, 0, 255);
        float border = width * 0.05f;
        textAlign(CENTER, CENTER);
        for (float x = -5; x <= 5; x++) {
            float lx = map(x, -5, 5, border, width - border);
            line(lx, border, lx, height - border);
            fill(255);
            text((int) x, lx, 10);
        }

        for (float y = -5; y <= 5; y++) {
            float ly = map(y, -5, 5, border, height - border);
            line(border, ly, width - border, ly);
            fill(255);
            text((int) y, 10, ly);
        }
    }

    public void drawStars() {
        noFill();
        float border = width * 0.05f;
        for (Star star : stars) {
            float x = map(star.getxG(), -5, 5, border, width - border);
            float y = map(star.getyG(), -5, 5, border, width - border);
            stroke(255, 255, 0);
            line(x - 2, y, x + 2, y);
            line(x, y - 2, x, y + 2);
            stroke(255, 0, 0);
            noFill();
            ellipse(x, y, star.getAbsMag(), star.getAbsMag());

            textAlign(LEFT, CENTER);
            fill(255);
            text(star.getDisplayName(), x + 10, y - 2);

        }

    }

    public void printStars() {
        for (Star star : stars) {
            System.out.println(star);
        }
    }

    int selected1 = -1;
    int selected2 = -1;
    float border;

    public void mousePressed() {
        for (int i = 0; i < stars.size(); i++) {
            Star star = stars.get(i);
            float x = map(star.getxG(), -5, 5, border, width - border);
            float y = map(star.getyG(), -5, 5, border, width - border);
            if (dist(mouseX, mouseY, x, y) < star.getAbsMag() / 2) {
                if (selected1 == -1) {
                    selected1 = i;
                } else if (selected2 == -1) {
                    selected2 = i;
                } else {
                    selected1 = i;
                    selected2 = -1;
                }
            }
        }
    }

    public void draw() {
        background(0);
        drawGrid();
        drawStars();
    }

    private ArrayList<Star> stars = new ArrayList<Star>();

>>>>>>> 78bcdcd4e85974dbfe85c4872e25b51d90e3d128
=======
package ie.dit;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet
{

    int selected1 = -1;
    int selected2 = -1;

    public void settings()
    {
        size(500, 500);
    }

    public void setup()
    {
        loadData();
        printStars();
        border = width * 0.05f;
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

    float border;

    private void drawGrid()
    {
        textAlign(CENTER, CENTER);
        for(int i = -5 ; i <= 5 ; i ++)
        {
            float x = map(i, -5, 5, border, width - border);
            stroke(0, 0, 255);
            line(x, border, x, height - border);
            fill(255);
            text(i, x, border / 2);
            stroke(0, 0, 255);
            line(border, x, width - border, x);
            fill(255);            
            text(i, border / 2, x);
        }
    }

    public void drawStars()
    {
        textAlign(LEFT, CENTER);
        for(Star s:stars)
        {
            float x = map(s.getxG(), -5, 5, border, width - border);
            float y = map(s.getyG(), -5, 5, border, height - border);

            stroke(255, 255, 0);
            noFill();
            ellipse(x, y, s.getAbsMag(), s.getAbsMag());

            stroke(0, 255, 255);
            line(x, y - 5, x, y + 5);
            line(x - 5, y, x + 5, y);
            fill(255);
            text(s.getDisplayName(), x + 20, y);
            
            

        }
    } 

    public void mouseClicked()
    {
            
    }

    public void draw()
    {
        background(0);
        drawGrid();
        drawStars();
    }

    private ArrayList<Star> stars = new ArrayList<Star>();

>>>>>>> d85640236ecd5b7cc0c4b1632cfc8cc97e76eb0c
}