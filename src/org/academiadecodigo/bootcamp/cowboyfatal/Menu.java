package org.academiadecodigo.bootcamp.cowboyfatal;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Menu implements KeyboardHandler {

    private Keyboard kb;

    public Menu() {

        Rectangle rectangle = new Rectangle(10, 10, 600, 500);
        rectangle.setColor(Color.BLACK);
        rectangle.draw();

        Picture picture = new Picture(10, 10, "wild-west.jpg");
        picture.draw();

        Text text = new Text(250, 100, "PRESS SPACE TO START");
        text.draw();
        text.grow(80, 40);
        text.setColor(Color.RED);


        kb = new Keyboard(this);

        KeyboardEvent dPressed = new KeyboardEvent();
        dPressed.setKey(KeyboardEvent.KEY_SPACE);
        dPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(dPressed);


    }


    public void keyPressed(KeyboardEvent e) {
        if (e.getKey() == KeyboardEvent.KEY_SPACE) {
            goGame();
            System.out.println("GoGame");
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public void goGame() {

        Field field = new Field();
        field.sandbox();
    }
}

