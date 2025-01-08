package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.AbstractDriverAdapter;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureOptionRectangleListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionRectangleListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(0, 0, driverManager.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand(100, 0, driverManager.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand(100, 100, driverManager.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand(0, 100, driverManager.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand(0, 0, driverManager.getCurrentDriver()));
        complexCommand.execute();
    }
}
