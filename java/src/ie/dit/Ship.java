<<<<<<< HEAD
package ie.dit;

import processing.core.PVector;

public class Ship
{
    private PVector pos;
    private float speed;
    private float size;
    private YASC yasc;

    public Ship(float x, float y, float speed, float size)
    {
        this.yasc = yasc;
        pos = new PVector(x, y);
        this.speed = speed;
        this.size = size;
    }

    public void render() //draws the ship
    {
        float halfSize = size / 2;
        yasc.line(pos.x - halfSize, pos.y + halfSize, pos.x, pos.y - halfSize);
        yasc.line(pos.x, pos.y - halfSize, pos.x + halfSize, pos.y + halfSize);
        yasc.line(pos.x + halfSize, pos.y + halfSize, pos.x, pos.y);
        yasc.line(pos.x, pos.y, pos.x - halfSize, pos.y + halfSize);
    }

    public void update() //updates the ship position 
    {
        s = new Ship(this, width / 2, height / 2, 5, 50)
    }


    /**
     * @return the pos
     */
    public Pvector getPos()
    {
        return pos;
    }
=======
package ie.dit;

import processing.core.PVector;

public class Ship
{
    private PVector pos;
    private float speed;
    private float size;
    private YASC yasc;

    public Ship(YASC yasc, float x, float y, float speed, float size)
    {
        this.yasc = yasc;
        pos = new PVector(x, y);
        this.speed = speed;
        this.size = size;

    }

    public void render()
    {
        
    }

    public void update()
    {

    }


    /**
     * @return the pos
     */
    public PVector getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(PVector pos) {
        this.pos = pos;
    }

    /**
     * @return the speed
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    /**
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(float size) {
        this.size = size;
    }

    
>>>>>>> 5222c2b2cb02421e630edcdcd8e305863f2ffd80
}