package org.example.color;

import java.awt.*;

public final class ColorUtil {
    private static final String ANSI_RESET = "\u001B[0m";

    public static String colorText(ShapeColor color, String text) {

        String ansiColor = "";
        switch (color) {
            case RED: ansiColor += "\u001B[31m";
            break;

            case BLUE:  ansiColor += "\u001B[34m";
            break;

            case GREEN: ansiColor += "\u001B[32m";
            //TODO add more options
        }

        return ansiColor + text + ANSI_RESET;
    }


//    public static final String ANSI_YELLOW = "\u001B[33m";
//    public static final String ANSI_PURPLE = "\u001B[35m";
//    public static final String ANSI_CYAN = "\u001B[36m";
//    public static final String ANSI_WHITE = "\u001B[37m";
}
