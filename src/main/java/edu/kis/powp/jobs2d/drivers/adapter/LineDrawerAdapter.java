package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.CustomLineFeature;
import edu.kis.powp.jobs2d.features.DrawerFeature;

import java.awt.*;

/**
 * driver adapter to drawer with several bugs.
 */
public class LineDrawerAdapter implements Job2dDriver {
    private int startX = 0, startY = 0;
    private final DrawPanelController drawController = DrawerFeature.getDrawerController();

    protected Color color = Color.BLACK;
    protected float thickness = 3.0F;

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        CustomLineFeature customLineFeature = new CustomLineFeature();
        Color color = Color.green;
        customLineFeature.setLineAttributes(color, 5.0F);
        ILine line = customLineFeature.getLine();
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        this.setPosition(x, y);
        drawController.drawLine(line);
    }

    @Override
    public String toString() {
        return "Now using dotted line adapter";
    }
}