package ie.dit;

import ddf.minim.AudioInput;
import ddf.minim.Minim;
import ddf.minim.analysis.FFT;
import processing.core.PApplet;

public class Audio2 extends PApplet
{
    public static int SAMPLE_RATE = 44100;
    public static int RESOLUTION = 16;
    public static int FRAME_SIZE = 1024;

    Minim minim;
    AudioInput ai;
    FFT fft;

    public void settings()
    {
        size(FRAME_SIZE, 800);
        minim = new Minim(this);
        ai = minim.getLineIn(Minim.MONO, FRAME_SIZE, SAMPLE_RATE, RESOLUTION);
        fft = new FFT(FRAME_SIZE, SAMPLE_RATE);
    }

    float lerpedaverage = 0;
    int maxIndex = -1;
    float max = Float.MIN_VALUE;

    public void draw()
    {
        background(0);
       // stroke(random(0, 255), random(0, 255), random(0, 255));
        colorMode(HSB);
        float halfH = height / 2;
        float total = 0;
        for(int i = 0; i < ai.bufferSize(); i++)
        {
            stroke(map(i, 0, FRAME_SIZE, 0, 255), 255, 255);
            line(i, halfH, i, halfH + ai.left.get(i) * halfH);
            total += ((float) Math.abs(ai.left.get(i)));
        }
        float average = total / (float) FRAME_SIZE;
        //move lerped average 10% towards average every frame
        lerpedaverage = lerp(lerpedaverage, average, 0.1f);
        noStroke();
        fill(map(average, 0, 1, 0, 255), 255, 255);
        ellipse(width / 2, 100, lerpedaverage * 1000, lerpedaverage * 1000);

        fft.forward(ai.left);
        for( int i = 0; i < fft.specSize(); i++)
        {
            stroke(map(i, 0, fft.specSize(), 0, 255), 255, 255);
            line(i, 0, i, fft.getBand(i) * 50);
            if()
            {
                
            }
        }
    }
}