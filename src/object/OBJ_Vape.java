package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Vape extends SuperObject {

    public OBJ_Vape() {

        name = "Vape";
        try {

            image = ImageIO.read(getClass().getResourceAsStream("/objects/vape.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
