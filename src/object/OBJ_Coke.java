package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Coke extends SuperObject {

    public OBJ_Coke() {

        name = "Coke";
        try {

            image = ImageIO.read(getClass().getResourceAsStream("/objects/coke.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
