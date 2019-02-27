<<<<<<< HEAD
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
=======
package ie.dit;

import processing.data.TableRow;

public class Star
{
    private String displayName;
    private int hab;
    private float xG;
    private float yG;
    private float zG;
    private float absMag;

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    /**
     * @return the hab
     */
    public int getHab() {
        return hab;
    }

    /**
     * @param hab the hab to set
     */
    public void setHab(int hab) {
        this.hab = hab;
    }

    /**
     * @return the xG
     */
    public float getxG() {
        return xG;
    }

    /**
     * @param xG the xG to set
     */
    public void setxG(float xG) {
        this.xG = xG;
    }

    /**
     * @return the yG
     */
    public float getyG() {
        return yG;
    }

    /**
     * @param yG the yG to set
     */
    public void setyG(float yG) {
        this.yG = yG;
    }

    /**
     * @return the zG
     */
    public float getzG() {
        return zG;
    }

    /**
     * @param zG the zG to set
     */
    public void setzG(float zG) {
        this.zG = zG;
    }

    /**
     * @return the absMag
     */
    public float getAbsMag() {
        return absMag;
    }

    /**
     * @param absMag the absMag to set
     */
    public void setAbsMag(float absMag) {
        this.absMag = absMag;
    }

    public String toString()
    {
        return displayName + "\t" + hab + "\t" + xG + "\t" + yG + "\t" + zG + "\t" + absMag;  
    }

    public Star(TableRow row)
    {
        displayName = row.getString("Display Name");
        hab = row.getInt("Hab?");
        xG = row.getFloat("Xg");
        yG = row.getFloat("Yg");
        zG = row.getFloat("Zg");
        absMag = row.getFloat("AbsMag");
    }

}
>>>>>>> 3ed093fac32ca5d7e43a8b381fe443420b0b5755
