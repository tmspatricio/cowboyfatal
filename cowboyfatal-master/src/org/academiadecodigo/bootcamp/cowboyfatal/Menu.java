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

        Rectangle rectangle = new Rectangle(10, 10, 1200, 600);
        rectangle.setColor(Color.BLACK);
        rectangle.draw();

        Picture picture = new Picture(10, 10, "BackgroudMenu.jpg");
        picture.draw();


        Text text1 = new Text(575, 456, "PRESS SPACE TO START");
        text1.draw();
        text1.grow(160, 80);
        text1.setColor(Color.BLACK);

        Text text = new Text(580, 450, "PRESS SPACE TO START");
        text.draw();
        text.grow(160, 80);
        text.setColor(Color.YELLOW);

        Text quit1 = new Text(582, 566, "PRESS Q TO QUIT");
        quit1.draw();
        quit1.grow(100, 60);
        quit1.setColor(Color.BLACK);

        Text quit = new Text(587, 560, "PRESS Q TO QUIT");
        quit.draw();
        quit.grow(100, 60);
        quit.setColor(Color.YELLOW);


        kb = new Keyboard(this);

        KeyboardEvent dPressed = new KeyboardEvent();
        dPressed.setKey(KeyboardEvent.KEY_SPACE);
        dPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(dPressed);


        KeyboardEvent qPressed = new KeyboardEvent();
        qPressed.setKey(KeyboardEvent.KEY_Q);
        qPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(qPressed);


    }


    public void keyPressed(KeyboardEvent e) {

        if (e.getKey() == KeyboardEvent.KEY_SPACE) {
            goGame();
            System.out.println("GoGame");
        } else if (e.getKey() == KeyboardEvent.KEY_Q) {

            System.out.println("Quit");
            System.exit(1);
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

