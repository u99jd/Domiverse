package entity;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Healthbar {

    BufferedImage image;
    int health;
    Graphics2D g2;


    public Healthbar(BufferedImage healthbar, int defaultHealth) {

        image = healthbar;
        health = defaultHealth;
        g2.drawImage(image, 0, 0, 40, 40, null);

    }

}
