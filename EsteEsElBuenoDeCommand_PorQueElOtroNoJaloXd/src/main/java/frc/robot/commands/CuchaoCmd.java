package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.CuchaoSub;

public class CuchaoCmd extends CommandBase {

  private final CuchaoSub cuchaoSub;
  private Supplier<Double> FunGrr, FunMvr;

  public CuchaoCmd (CuchaoSub cuchaoSub, Supplier<Double> FunMvr, Supplier<Double> FunGrr){
    
    this.FunGrr = FunGrr;
    this.FunMvr = FunMvr;
    this.cuchaoSub = cuchaoSub;
    addRequirements(cuchaoSub);

  }
  
  @Override
  public void initialize() {

    CuchaoSub.invertir();

  }

  @Override
  public void execute() {

    cuchaoSub.motores(FunGrr.get(), FunMvr.get());

  }

  @Override
  public void end(boolean interrupted) {

    cuchaoSub.motores(0, 0);

  }

  @Override
  public boolean isFinished() {

    return false;

  }
}
