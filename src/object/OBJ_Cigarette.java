package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Cigarette extends SuperObject {

    public OBJ_Cigarette() {

        name = "Cigarette";
        try {

            image = ImageIO.read(getClass().getResourceAsStream("/objects/cigarette.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
