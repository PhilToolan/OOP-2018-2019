<<<<<<< HEAD
package ie.dit;

public class YASC extends PApplet
{
    public void settings()
    {
        size(800, 800);

    }

    public void setup()
    {

    }

    public void draw()
    {
        
    }
=======
package ie.dit;

import processing.core.PApplet;

public class YASC extends PApplet
{
    Ship s;

    public void settings()
    {
        size(800, 800);

    }

    public void setup()
    {
        s = new Ship(this, width / 2, height / 2, 5, 50);
    }

    public void draw()
    {
        s.render();
        s.update();
    }


>>>>>>> 5222c2b2cb02421e630edcdcd8e305863f2ffd80
}