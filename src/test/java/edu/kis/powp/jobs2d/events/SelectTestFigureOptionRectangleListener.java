package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.drivers.adapter.AbstractDriverAdapter;

public class SelectTestFigureOptionAlternativeListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionAlternativeListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AbstractDriverAdapter abstractDriver = new AbstractDriverAdapter(driverManager.getCurrentDriver());
        FiguresJane.figureScript(abstractDriver);
    }
}
