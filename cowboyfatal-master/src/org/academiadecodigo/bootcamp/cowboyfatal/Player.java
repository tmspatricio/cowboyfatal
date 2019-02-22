package org.academiadecodigo.bootcamp.cowboyfatal;


import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Player implements KeyboardHandler {

    //TODO: create a class to implement player´s movement(because we are repeating code)

    private Picture picture;
    private Keyboard kb;
    private Enemy enemy;

    public void createPlayer() {
        picture = new Picture(-10, 400, "player.png");
        picture.draw();
    }

    public void movePlayer() {
        kb = new Keyboard(this);

        //move right
        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKey(KeyboardEvent.KEY_RIGHT);
        rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(rightPressed);

        //move left
        KeyboardEvent leftPressed = new KeyboardEvent();
        leftPressed.setKey(KeyboardEvent.KEY_LEFT);
        leftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(leftPressed);

    }

    public void moveRight() {
        picture.translate(10, 0);
    }

    public void moveLeft() {
        picture.translate(-10, 0);
    }


    @Override
    public void keyPressed(KeyboardEvent e) {
        if (e.getKey() == KeyboardEvent.KEY_RIGHT) {
            moveRight();
            System.out.println("Test: moving right");
        }

        if (e.getKey() == KeyboardEvent.KEY_LEFT) {
            moveLeft();
            System.out.println("Test: moving left");
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }

}
