package org.academiadecodigo.bootcamp.cowboyfatal;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Field {

    Enemy enemy;
    Player player;

    public Field() {
        enemy = new Enemy();
        player = new Player();
    }

    public void sandbox() {

        /**
         * x horizontal
         * y vertical
         */

        //canvas
        Rectangle rectangle = new Rectangle(10, 10, 600, 500);
        rectangle.setColor(Color.BLACK);
        rectangle.draw();

        Picture picture = new Picture(10, 10, "west.jpg");
        picture.draw();


        enemy.createEnemy();
        enemy.moveEnemy();

        player.createPlayer();
        player.movePlayer();
    }

}