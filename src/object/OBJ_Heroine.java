package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Heroine extends SuperObject {

    public OBJ_Heroine() {

        name = "Heroine";
        try {

            image = ImageIO.read(getClass().getResourceAsStream("/objects/heroine.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
