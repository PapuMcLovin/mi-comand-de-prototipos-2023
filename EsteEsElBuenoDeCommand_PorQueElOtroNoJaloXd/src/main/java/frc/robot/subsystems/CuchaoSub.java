package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CuchaoSub extends SubsystemBase {

//Motores del Chasis
  static WPI_VictorSPX Md1 = new WPI_VictorSPX (1);
  static WPI_VictorSPX Md2 = new WPI_VictorSPX (2);
  static WPI_VictorSPX Md3 = new WPI_VictorSPX (3);

  static WPI_VictorSPX Mi1 = new WPI_VictorSPX (6);
  static WPI_TalonSRX Mi2 = new WPI_TalonSRX(4);
  static WPI_TalonSRX Mi3 = new WPI_TalonSRX(5);


//Agrupaciones de los Motores del Chasis
  static MotorControllerGroup MD = new MotorControllerGroup(Md1, Md2, Md3);
  static MotorControllerGroup MI = new MotorControllerGroup(Mi1, Mi2, Mi3);

//Agrupacion diferencial de los motores
  DifferentialDrive Cuchao = new DifferentialDrive(MI, MD);

  public CuchaoSub() {}

  public void motores (double velocidad, double giro){

    Cuchao.arcadeDrive(velocidad, giro);
    
  }

  @Override
  public void periodic() {}

  @Override
  public void simulationPeriodic() {}

  public static void invertir () {

    MD.setInverted(false);
    MI.setInverted(true);
  }
}
