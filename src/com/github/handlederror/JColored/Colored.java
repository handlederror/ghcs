package com.github.handlederror.JColored;

public class Colored {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";
    private static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    private static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    private static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    private static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    private static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    private static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static String stylize(String string, String color) {
        return color + string + ANSI_RESET;
    }

    public static String stylize(String string, String color, Boolean  reset) {
        if (reset) {
            return color + string + ANSI_RESET;
        } else {
            return color + string;
        }
    }

    public static String fg(String color) {
        String returnValue = ANSI_RESET;

        switch (color) {
            case "reset" -> returnValue = ANSI_RESET;
            case "black" -> returnValue = ANSI_BLACK;
            case "red" -> returnValue = ANSI_RED;
            case "green" -> returnValue = ANSI_GREEN;
            case "yellow" -> returnValue = ANSI_YELLOW;
            case "blue" -> returnValue = ANSI_BLUE;
            case "purple" -> returnValue = ANSI_PURPLE;
            case "cyan" -> returnValue = ANSI_CYAN;
            case "white" -> returnValue = ANSI_WHITE;
        }

        return returnValue;
    }

    public static String bg(String color) {
        String returnValue = ANSI_RESET;

        switch (color) {
            case "reset" -> returnValue = ANSI_RESET;
            case "black" -> returnValue = ANSI_BLACK_BACKGROUND;
            case "red" -> returnValue = ANSI_RED_BACKGROUND;
            case "green" -> returnValue = ANSI_GREEN_BACKGROUND;
            case "yellow" -> returnValue = ANSI_YELLOW_BACKGROUND;
            case "blue" -> returnValue = ANSI_BLUE_BACKGROUND;
            case "purple" -> returnValue = ANSI_PURPLE_BACKGROUND;
            case "cyan" -> returnValue = ANSI_CYAN_BACKGROUND;
            case "white" -> returnValue = ANSI_WHITE_BACKGROUND;
        }

        return returnValue;
    }
}
