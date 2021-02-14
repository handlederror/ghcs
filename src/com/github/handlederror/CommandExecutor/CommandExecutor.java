package com.github.handlederror.CommandExecutor;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommandExecutor {
    public static String executeCommand(String[] command) throws IOException {
        StringBuilder strAppend = new StringBuilder();

        String line;
        Process p = Runtime.getRuntime().exec(command);
        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

        while ((line = in.readLine()) != null) {
            strAppend.append(line);
        }

        in.close();

        return strAppend.toString();
    }
}
