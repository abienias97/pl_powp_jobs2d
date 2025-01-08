package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
    private final ArrayList<DriverCommand> commands;

    public ComplexCommand() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(DriverCommand command) {
        this.commands.add(command);
    }

    @Override
    public void execute() {
        for (DriverCommand command : commands) {
            command.execute();
        }
    }
}
