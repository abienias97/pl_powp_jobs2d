package edu.kis.powp.jobs2d.drivers.command;
import edu.kis.powp.jobs2d.Job2dDriver;


public class SetPositionCommand implements DriverCommand {
    private int x;
    private int y;
    private Job2dDriver job2ddriver;

    public SetPositionCommand(int x, int y, Job2dDriver driver) {
        this.x = x;
        this.y = y;
        this.job2ddriver = driver;
    }

    public void setDriver(Job2dDriver driver) {
        this.job2ddriver = driver;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        this.job2ddriver.setPosition(x, y);
    }
}
