package com.github.handlederror.ghcs.server;

import static com.github.handlederror.JColored.Colored.fg;
import static com.github.handlederror.JColored.Colored.stylize;

public class Error {
    public static void raise(String errorName, String errorDescription, Integer errorLine, Integer exitCode) {
        System.out.println(stylize(errorName, fg("red")) + ": " + stylize(errorDescription, fg("white")) + " at " + stylize(errorLine.toString(), fg("yellow")) + ".");

        System.exit(exitCode);
    }
}
