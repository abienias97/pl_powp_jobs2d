package edu.kis.powp.jobs2d.drivers.factory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class ComplexCommandFactory {
    public static DriverCommand getRectangle(Job2dDriver driver, int x, int y, int x2, int y2) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(x, y, driver));
        complexCommand.addCommand(new OperateToCommand(x2, y, driver));
        complexCommand.addCommand(new OperateToCommand(x2, y2, driver));
        complexCommand.addCommand(new OperateToCommand(x, y2, driver));
        complexCommand.addCommand(new OperateToCommand(x, y, driver));
        return complexCommand;
    }
    public static DriverCommand getTriangle(Job2dDriver driver, int x, int y, int x2, int y2, int x3, int y3) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(x, y, driver));
        complexCommand.addCommand(new OperateToCommand(x2, y2, driver));
        complexCommand.addCommand(new OperateToCommand(x3, y3, driver));
        complexCommand.addCommand(new OperateToCommand(x, y, driver));
        complexCommand.execute();
        return complexCommand;
    }
}
