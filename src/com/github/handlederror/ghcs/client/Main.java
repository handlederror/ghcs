package com.github.handlederror.ghcs.client;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import com.github.handlederror.ghcs.server.Error;
import com.github.handlederror.ghcs.server.Configuration;
import static com.github.handlederror.JColored.Colored.bg;
import static com.github.handlederror.JColored.Colored.fg;
import static com.github.handlederror.JColored.Colored.stylize;
import com.github.handlederror.CommandExecutor.CommandExecutor;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean getInput = true;
        Scanner scanner = new Scanner(System.in);
        Configuration configuration = new Configuration();

        String input;
        int line = 1;

        while (getInput) {
            System.out.print(stylize(" " + line, fg("yellow")) + stylize(" ~  ", fg("reset")));
            System.out.print(stylize("", fg("green"), false));
            input = scanner.nextLine();

            if (input.equals("exit")) {
                getInput = false;
            } else {
                if (input.equals("new file")) {
                    System.out.print(stylize("File ", fg("yellow")) + stylize("? ", fg("green")));
                    System.out.print(stylize("", fg("reset"), false));
                    input = scanner.nextLine();
                    
                    if (configuration.serverLocation != null) {
                        File file = new File(configuration.serverLocation + "/" + input);

                        Boolean fileCreate = file.createNewFile();
                        fileCreate = null;

                        System.gc();
                    } else {
                        Error.raise("ServerNotFound", "Initialize server with command `new server' or can't run command", line, 1);
                    }
                } else {
                    if (input.equals("new server")) {
                        System.out.print(stylize("Directory ", fg("yellow")) + stylize("? ", fg("green")));
                        System.out.print(stylize("", fg("reset"), false));
                        input = scanner.nextLine();

                        CommandExecutor.executeCommand(new String[]{"git", "init", input});

                        configuration.serverLocation = input;
                    } else {
                        if (input.equals("load server")) {
                            System.out.print(stylize("Directory ", fg("yellow")) + stylize("? ", fg("green")));
                            System.out.print(stylize("", fg("reset"), false));
                            input = scanner.nextLine();

                            configuration.serverLocation = input;
                        }
                    }
                }
            }

            line++;
        }

        System.out.println(stylize(" [ ", fg("reset")) + stylize("exit", fg("red")) + stylize(" ] ", fg("reset")));
        System.exit(0);
    }
}
