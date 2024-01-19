package frc.robot;

import frc.robot.commands.MecaCmd;
import frc.robot.subsystems.MecaSub;
import frc.robot.commands.CuchaoCmd;
import frc.robot.subsystems.CuchaoSub;
import edu.wpi.first.wpilibj.Joystick;


public class RobotContainer {

  private final MecaSub mecaSub = new MecaSub();
  private final CuchaoSub cuchaoSub = new CuchaoSub();

  private final Joystick control = new Joystick(0);

  public RobotContainer() {

    configureBindings();

  }

  private void configureBindings() {    
    
    cuchaoSub.setDefaultCommand(new CuchaoCmd(cuchaoSub, () -> control.getRawAxis(4), () -> control.getRawAxis(1)));
  
    mecaSub.setDefaultCommand(new MecaCmd(mecaSub, () -> control.getRawAxis(2)-control.getRawAxis(3)));
  }

  public CuchaoCmd getAutonomousCommand() {
    
    return null;

  }
}