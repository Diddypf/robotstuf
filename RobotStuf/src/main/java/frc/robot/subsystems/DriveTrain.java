package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants.DriveConstants;
import frc.robot.libraries.MAXSwerveModule;

public class DriveTrain extends SubsystemBase{
        private final MAXSwerveModule frontLeft = new MAXSwerveModule(
            DriveConstants.kFrontLeftDrivingCanId,
            DriveConstants.kFrontleftturningcanid,
            DriveConstants.kFrontLeftChassisAngularOffsetCanId);

            private final MAXSwerveModule frontRight = new MAXSwerveModule(
            DriveConstants.kFrontRightDrivingCanId,
            DriveConstants.kFrontRightturningcanid,
            DriveConstants.kFrontRightChassisAngularOffsetCanId);

            private final MAXSwerveModule rearRight = new MAXSwerveModule(
            DriveConstants.KRearRightDrivingCanId,
            DriveConstants.krearRightTurningCanid,
            DriveConstants.kRearLeftChassisAngularOffsetCanId);

            private final MAXSwerveModule rearleft = new MAXSwerveModule(
            DriveConstants.kRearLeftDrivingCanId,
            DriveConstants.kRearLeftTurningCanId,
            DriveConstants.kRearLeftChassisAngularOffsetCanId);


        private static DriveTrain Instance;

        public static DriveTrain getInstance() {
            if (Instance == null) {

                Instance = new DriveTrain();

            }
        return Instance;
        }
}
