package org.firstinspires.ftc.teamcode.subsystems.arm

import com.qualcomm.robotcore.hardware.PIDFCoefficients
import org.firstinspires.ftc.teamcode.utils.Angle
import org.firstinspires.ftc.teamcode.utils.Voltage
import org.firstinspires.ftc.teamcode.utils.configurations.OpServoExConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.servoControlModeConfiguration.ServoControlModeConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.servoControlModeConfiguration.ServoPositionModeConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.servoControlModeConfiguration.ServoRunToPositionModeConfiguration

class ArmConstants {
    object Identification {
        const val ARM_SERVO_ID = "armServo"
    }

    object Configuration {
        //private val minAngle: Angle = Angle.fromDegrees(0.0)
        //private val maxAngle: Angle = Angle.fromDegrees(45.0)
        private val isServoInverted = false
        private val gearRatio = 1.0
        private val positionLimit = Angle.fromDegrees(0.0)..Angle.fromDegrees(45.0)
        private val positionTolerance = Angle.fromDegrees(0.3)
        private val absoluteId = Identification.ARM_SERVO_ID
        private val encoderOffset = Angle.fromDegrees(0.0)
        private val maxVoltage = Voltage.fromVolts(12.0)
        private val PIDF = PIDFCoefficients(1.0, 0.0, 0.5, 0.3)


        val positionConfig = ServoRunToPositionModeConfiguration()
            .withInverted(isServoInverted)
            .withGearRatio(gearRatio)
            .withPositionLimits(positionLimit)
            .withPositionTolerance(positionTolerance)
            .withAbsoluteId(absoluteId)
            .withEncoderOffset(encoderOffset)
            .withAbsoluteMaxVoltage(maxVoltage)
            .withPIDFCoefficients(PIDF)


        val armConfig = OpServoExConfiguration()
            .withServoModeConfiguration(positionConfig)
    }
}

