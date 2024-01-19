package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MecaSub extends SubsystemBase {

//Motores del Elevador
  static WPI_TalonSRX ME1 = new WPI_TalonSRX (7);
  static WPI_TalonSRX ME2 = new WPI_TalonSRX (8);

//Agrupacion de los Motores del Elevador
  MotorControllerGroup ME = new MotorControllerGroup(ME1, ME2);

  public MecaSub() {}

  public void MecaMtr (double VelMeca){

   ME.set(VelMeca);
    
  }

  @Override
  public void periodic() {}

  @Override
  public void simulationPeriodic() {}

  public static void invertirMeca () {

//Motores Invertidos del Elevador
  ME1.setInverted(true);
  ME2.setInverted(false);

  }
}