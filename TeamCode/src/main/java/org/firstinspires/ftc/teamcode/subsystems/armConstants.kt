package org.firstinspires.ftc.teamcode.subsystems.arm

import com.qualcomm.robotcore.hardware.PIDFCoefficients
import com.seattlesolvers.solverslib.hardware.motors.Motor
import org.firstinspires.ftc.teamcode.subsystems.Hood.HoodConstants
import org.firstinspires.ftc.teamcode.utils.Angle
import org.firstinspires.ftc.teamcode.utils.configurations.OpMotorExConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.genericConfigurations.GenericMotorConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.motorControlModeConfiguration.MotorPositionModeConfiguration

class armConstants {
    object identification {
        val ID = "armMotor"

    }

    object  armConfiguration{

        val mototInverted = false
        val gearRatio = 1.0 /5.0

        val minAngle : Angle = Angle.fromDegrees(0.0)
        val maxAngle : Angle = Angle.fromDegrees(45.0)

        private  val genericConfig = GenericMotorConfiguration()
            .withInverted(mototInverted)
            .withZeroPowerBehavior(Motor.ZeroPowerBehavior.FLOAT)
            .withGearRatio(gearRatio)

        private val armPositionConfig = MotorPositionModeConfiguration()
            .withPIDFCoefficients(PIDFCoefficients(1.0, 0.0, 0.5, 0.0))
            .withPositionLimits(minAngle..maxAngle)
            .withPositionTolerance(Angle.fromDegrees(1.0).rotations)


        val config = OpMotorExConfiguration(genericConfig, armPositionConfig)




    }










    }