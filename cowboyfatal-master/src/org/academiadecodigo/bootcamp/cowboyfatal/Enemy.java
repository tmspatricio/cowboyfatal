package org.academiadecodigo.bootcamp.cowboyfatal;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;;

public class Enemy implements KeyboardHandler{

    //TODO: create a class to implement player´s movement(because we are repeating code)
    //TODO: create a randomize class to implement player´s movement automatically

    private Picture picture;
    private Keyboard kb;

    public void createEnemy() {
        picture = new Picture(100, 610, "Human_180.png");
        picture.draw();
    }


   public void moveEnemy() {
        kb = new Keyboard(this);

        //move right
        KeyboardEvent dPressed = new KeyboardEvent();
        dPressed.setKey(KeyboardEvent.KEY_D);
        dPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(dPressed);

        //move left
        KeyboardEvent aPressed = new KeyboardEvent();
        aPressed.setKey(KeyboardEvent.KEY_A);
        aPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(aPressed);
    }

    public void moveRight() {
        picture.translate(10, 0);
    }

    public void moveLeft(){
        picture.translate(-10,0);
    }


    @Override
    public void keyPressed(KeyboardEvent e) {
        if (e.getKey() == KeyboardEvent.KEY_D) {
            moveRight();
            System.out.println("Test Enemy: moving right");
        }

        if (e.getKey() == KeyboardEvent.KEY_A) {
            moveLeft();
            System.out.println("Test Enemy: moving left");
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}