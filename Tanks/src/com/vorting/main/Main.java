package com.vorting.main;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Timer;

import com.vorting.display.Display;
import com.vorting.game.Game;

public class Main {

    public static void main(String[] args) {

        Game tanks = new Game();
        tanks.start();

    }
}
//0123456789abcdef (int 0xffffffff)
//Как пишутся цвета в хексадецимальном формате