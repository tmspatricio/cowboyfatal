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

        Picture picture = new Picture(10, 10, "firstmenu.png");
        picture.draw();

        Text text = new Text(250, 450, "PRESS SPACE TO START");
        text.draw();
        text.grow(80, 40);
        text.setColor(Color.BLACK);

        Text quit = new Text(300, 550, "PRESS Q TO QUIT");
        quit.draw();
        quit.grow(80, 40);
        quit.setColor(Color.BLACK);


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

