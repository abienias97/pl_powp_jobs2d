package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.factory.ComplexCommandFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureOptionTriangleListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionTriangleListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DriverCommand triangleCommand = ComplexCommandFactory.getTriangle(this.driverManager.getCurrentDriver(), 0, 0, 150, 100, 100, 150);
        triangleCommand.execute();
    }
}
