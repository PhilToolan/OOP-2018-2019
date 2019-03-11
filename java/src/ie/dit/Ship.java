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
}