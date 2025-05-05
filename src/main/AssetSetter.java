package main;

import object.OBJ_Cigarette;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp) {

        this.gp = gp;

    }

    public void setObject() {

        gp.obj[0] = new OBJ_Cigarette();
        gp.obj[0].worldX = 23 * gp.tileSize;
        gp.obj[0].worldY = 7 * gp.tileSize;

        gp.obj[1] = new OBJ_Cigarette();
        gp.obj[1].worldX = 23 * gp.tileSize;
        gp.obj[1].worldY = 40 * gp.tileSize;

        gp.obj[2] = new OBJ_Cigarette();
        gp.obj[2].worldX = 24 * gp.tileSize;
        gp.obj[2].worldY = 40 * gp.tileSize;

        gp.obj[3] = new OBJ_Cigarette();
        gp.obj[3].worldX = 25 * gp.tileSize;
        gp.obj[3].worldY = 40 * gp.tileSize;


    }

}
