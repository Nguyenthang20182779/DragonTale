package Entity;

import java.awt.image.BufferedImage;

public class Animation {
    private BufferedImage[] frames;
    private int currentFrame;
    private long startTime;
    private long delay;
    private boolean playedOnce;

    public void Animation(){
        playedOnce = false;
    }


}