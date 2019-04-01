<<<<<<< HEAD
package ie.dit;

import processing.core.PVector;

public class Ship
{
    private PVector pos;
    private float speed;
    private float size;
    private YASC yasc;
    private float rotation;

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
        if (yasc.checkKey('w'))
        {
            pos.y -= speed;
        }
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

    
=======
package ie.dit;

import processing.core.PVector;

public class Ship extends GameObject
{
    private float size;

    public int fireRate;

    private float toPass;
    private float ellapsed;

    public Ship(YASC yasc, float x, float y, float speed, float size)
    {
        super(yasc, x, y, 0, speed);
        this.size = size;
        fireRate = 20;
        toPass = 1 / (float) fireRate;

    }

    public void render()
    {
        yasc.pushMatrix();
        yasc.translate(pos.x, pos.y);
        yasc.rotate(rotation);
        
        float halfSize = size / 2;
        yasc.stroke(0);
        yasc.line(- halfSize, halfSize, 0, - halfSize);
        yasc.line(0, - halfSize
        , halfSize, halfSize);

        yasc.line(halfSize, halfSize
            ,0, 0);
        yasc.line(0, 0, -halfSize, halfSize);
        yasc.popMatrix();
    }

    public void update()
    {

        forward.x = (float) Math.sin(rotation);
        forward.y = - (float) Math.cos(rotation);
        if (yasc.checkKey('w'))
        {
            pos.add(forward);
        }

        if (yasc.checkKey('s'))
        {
            pos.x -= forward.x;
            pos.y -= forward.y;
        }

        if (yasc.checkKey('a'))
        {
            rotation -= 0.1f;
        }

        if (yasc.checkKey('d'))
        {
            rotation += 0.1f;
        }

        if (yasc.checkKey(' ') && ellapsed >= toPass)
        {
            PVector spawnPoint = PVector.add(pos, PVector.mult(forward, 25));
            Bullet b = new Bullet(yasc, spawnPoint.x, spawnPoint.y, rotation + yasc.random(-0.1f, 0.1f));
            yasc.gameObjects.add(b);
            ellapsed = 0;
        }
        ellapsed += yasc.timeDelta;
        yasc.text("Ellapsed: "+ ellapsed, 10, 200);
    }

    public void setSize(float size) {
        this.size = size;
    }

    
>>>>>>> 51acfd7ae55f1ba358822aa7cc2102e3144503d0
}