package org.example.processoremulatorfx;

import java.util.Arrays;

public class Command {
    private String command;
    private String[] args;

    @Override
    public String toString() {
        return "\n" + command + " " + Arrays.toString(args);
    }

    public Command(String command, String... args) {
        this.command = command;
        this.args = args;
    }

    public String getCommand() {
        return command;
    }

    public String getArgs(int indx) {
        if (args.length != 0)
            return args[indx];
        return "";
    }
}