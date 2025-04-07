package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean upPressed, downPressed, leftPressed, rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {    //Wird ausgelöst wenn Taste gedrückt wird

        int code = e.getKeyCode();  //ordnet int einer taste u

        if (code == KeyEvent.VK_W) {    //wenn taste w ist
            upPressed = true;
        }
        if (code == KeyEvent.VK_S) {    //wenn taste s ist
            downPressed = true;
        }
        if (code == KeyEvent.VK_A) {    //wenn taste a ist
            leftPressed = true;
        }
        if (code == KeyEvent.VK_D) {    //wenn taste d ist
            rightPressed = true;
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {       //Wird ausgelöst wenn Taste losgelassen wird

        int code = e.getKeyCode();  //ordnet int einer taste u

        if (code == KeyEvent.VK_W) {    //wenn taste w ist
            upPressed = false;
        }
        if (code == KeyEvent.VK_S) {    //wenn taste s ist
            downPressed = false;
        }
        if (code == KeyEvent.VK_A) {    //wenn taste a ist
            leftPressed = false;
        }
        if (code == KeyEvent.VK_D) {    //wenn taste d ist
            rightPressed = false;
        }

    }
}
