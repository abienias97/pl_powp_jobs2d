package edu.kis.powp.jobs2d.drivers.factory;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class FigureFactory {

    public static ComplexCommand getFigureScript1(Job2dDriver driver) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(-120, -120, driver));
        complexCommand.addCommand(new OperateToCommand(120, -120, driver));
        complexCommand.addCommand(new OperateToCommand(120, 120, driver));
        complexCommand.addCommand(new OperateToCommand(-120, 120, driver));
        complexCommand.addCommand(new OperateToCommand(-120, -120, driver));
        complexCommand.addCommand(new OperateToCommand(120, 120, driver));
        complexCommand.addCommand(new SetPositionCommand(120, -120, driver));
        complexCommand.addCommand(new OperateToCommand(-120, 120, driver));
        return complexCommand;
    }

    public static ComplexCommand getFigureScript2(Job2dDriver driver) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(0, 0, driver));
        complexCommand.addCommand(new OperateToCommand(233, -23, driver));
        complexCommand.addCommand(new OperateToCommand(24, 90, driver));
        complexCommand.addCommand(new OperateToCommand(-104, 80, driver));
        complexCommand.addCommand(new OperateToCommand(11, -22, driver));
        complexCommand.addCommand(new OperateToCommand(-33, 44, driver));
        complexCommand.addCommand(new OperateToCommand(-66, -88, driver));
        complexCommand.addCommand(new OperateToCommand(128, 256, driver));
        return complexCommand;
    }
}