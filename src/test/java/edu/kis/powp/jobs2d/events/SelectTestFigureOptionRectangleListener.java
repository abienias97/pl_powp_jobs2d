package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.factory.ComplexCommandFactory;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureOptionRectangleListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionRectangleListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DriverCommand rectangleCommand = ComplexCommandFactory.getRectangle(this.driverManager.getCurrentDriver(), 0, 0, 150, 100);
        rectangleCommand.execute();
    }
}
