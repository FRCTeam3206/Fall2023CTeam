package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import frc.robot.Constants;

public class Arm {
  private VictorSPX armMotor = new VictorSPX(Constants.DriveConstants.kArmCanId);

  public Arm() {
    armMotor.set(VictorSPXControlMode.PercentOutput, 0.1);
    // armMotor.setNeutralMode(NeutralMode.Brake);
  }

  /**
   * Moves arm in specific direction
   *
   * @param direction True = left, False = right
   */
  public void moveArm(boolean direction) {
    if (direction == true) {
      armMotor.set(VictorSPXControlMode.PercentOutput, 0.4);
    } else {
      armMotor.set(VictorSPXControlMode.PercentOutput, -0.4);
    }
  }

  public void resetArm() {
    armMotor.set(VictorSPXControlMode.PercentOutput, 0);
  }
}
