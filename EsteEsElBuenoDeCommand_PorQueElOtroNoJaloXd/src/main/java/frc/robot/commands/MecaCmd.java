package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.MecaSub;

public class MecaCmd extends CommandBase{

    private final MecaSub mecaSub;
    private Supplier<Double> FunActvr;

public MecaCmd (MecaSub mecaSub, Supplier<Double> FunActvr){

    this.FunActvr = FunActvr;
    this.mecaSub= mecaSub;
    addRequirements(mecaSub);

  }    

  @Override
  public void initialize() {

    MecaSub.invertirMeca();

  }

  @Override
  public void execute() {
    mecaSub.MecaMtr(FunActvr.get());
  }

  @Override
  public void end(boolean interrupted) {

    mecaSub.MecaMtr(0);

  }

  @Override
  public boolean isFinished() {

    return false;

  }
}
