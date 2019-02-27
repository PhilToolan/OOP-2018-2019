package ie.dit;

import processing.core.PVector;
import processing.data.TableRow;

public class Star 
{
    private int hab;
    private String displayName;

    private float distance;

    private PVector coords;
    private float absMag;


    public Star(TableRow row)
    {
        displayName = row.getString("Display Name");
        absMag = row.getFloat("AbsMag");
        coords = new PVector(row.getFloat("Xg"), row.getFloat("Yg"), row.getFloat("Zg"));
        distance = row.getFloat("Distance");
        hab = row.getInt("Hab");
    }


    public int getHab()
    {
        return hab;
    }

    public void setHab(int hab)
    {
        this.hab = hab;
    }

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public void setdistance(float distance)
    {
        this.distance = distance;

    }

    public float getdistance()
    {
        return distance;
    }

    public void setCoords(float xG, float yG, float zG)
    {
        coords = new PVector(xG, yG, zG);
    }

    public PVector getCoords()
    {
        return coords;
    }

    public void setAbsMag(float absMag)
    {
        this.absMag = absMag;
    }

    public float getAbsMag()
    {
        return absMag;
    }

    public String toString()
    {
        
    }
}
