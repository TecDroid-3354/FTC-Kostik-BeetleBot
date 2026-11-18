package org.firstinspires.ftc.teamcode.subsystems.Hood

import com.qualcomm.robotcore.hardware.PIDFCoefficients
import org.firstinspires.ftc.teamcode.utils.Angle
import org.firstinspires.ftc.teamcode.utils.Voltage
import org.firstinspires.ftc.teamcode.utils.configurations.OpServoExConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.servoControlModeConfiguration.ServoRunToPositionModeConfiguration

object HoodConstants {
    object Identification {
        val HoodId = "hoodServo"
    }

    object Configuration {
        val positionTolerance = Angle.fromDegrees(1.0)
        val PID = PIDFCoefficients(1.0, 0.0, 0.5, 0.0)
        val absoluteMaxVoltage = Voltage.fromVolts(12.0)
        val absoluteId = Identification.HoodId
        val positionLimits = Angle.fromDegrees(0.0)..Angle.fromDegrees(180.0)
        val gearRatio = 1.0 / 1.0
        val isMotorInverted = false
        val encoderOffset = Angle.fromDegrees(0.0)

        val servoConfig = ServoRunToPositionModeConfiguration()
            .withPositionTolerance(positionTolerance)
            .withPIDFCoefficients(PID)
            .withAbsoluteMaxVoltage(absoluteMaxVoltage)
            .withAbsoluteId(absoluteId)
            .withPositionLimits(positionLimits)
            .withGearRatio(gearRatio)
            .withInverted(isMotorInverted)
            .withEncoderOffset(encoderOffset)

        val config = OpServoExConfiguration(servoConfig)
    }
}

