package main;

import object.OBJ_Cigarette;
import object.OBJ_Key;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp) {

        this.gp = gp;

    }

    public void setObject() {

        gp.obj[0] = new OBJ_Cigarette();
        gp.obj[0].worldX = 23 * gp.tileSize;
        gp.obj[0].worldY = 7 * gp.tileSize;

        gp.obj[1] = new OBJ_Key();
        gp.obj[1].worldX = 23 * gp.tileSize;
        gp.obj[1].worldY = 40 * gp.tileSize;

        gp.obj[2] = new OBJ_Cigarette();
        gp.obj[2].worldX = 5 * gp.tileSize;
        gp.obj[2].worldY = 5 * gp.tileSize;

    }

}
