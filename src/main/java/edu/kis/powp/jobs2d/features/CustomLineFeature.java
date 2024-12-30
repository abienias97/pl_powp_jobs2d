package edu.kis.powp.jobs2d.features;

import edu.kis.legacy.drawer.shape.line.AbstractLine;
import edu.kis.legacy.drawer.shape.ILine;

import java.awt.*;

public class CustomLineFeature extends AbstractLine{


    private Color color = Color.BLACK;
    private float thickness = 3.0F;

    public void setLineAttributes(Color color, float thickness) {
        this.color = color;
        this.thickness = thickness;
    }

    public ILine getLine() {
        return new CustomLine(this.color, this.thickness);
    }

    private static class CustomLine extends AbstractLine {
        public CustomLine(Color color, float thickness) {
            this.color = color;
            this.thickness = thickness;
            this.dotted = true;
        }

    }
}

