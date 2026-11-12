package org.firstinspires.ftc.teamcode.subsystems.shooter

import com.qualcomm.robotcore.hardware.PIDCoefficients
import com.qualcomm.robotcore.hardware.PIDFCoefficients
import com.seattlesolvers.solverslib.controller.wpilibcontroller.SimpleMotorFeedforward
import com.seattlesolvers.solverslib.hardware.motors.Motor
import org.firstinspires.ftc.teamcode.subsystems.hood.hoodConstants
import org.firstinspires.ftc.teamcode.utils.Angle
import org.firstinspires.ftc.teamcode.utils.AngularVelocity
import org.firstinspires.ftc.teamcode.utils.configurations.OpMotorExConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.genericConfigurations.GenericMotorConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.motorControlModeConfiguration.MotorPositionModeConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.motorControlModeConfiguration.MotorVelocityModeConfiguration

// Recuerda usar el mismo import de Motor que tienes en IntakeConstants.kt

object ShooterConstants {

    object Identification {
        const val shooterId = "shooterMotor"
    }

    object Configuration {
        const val isMotorInverted = false
        val zeroPowerBehavior = Motor.ZeroPowerBehavior.FLOAT
        const val gearRatio = 1.0 / 1.0
        const val maxRPM = 6000.0
        val targetRPM = AngularVelocity.fromRpm(4500.0)
        private val genericConfiguration = GenericMotorConfiguration()
            .withInverted(ShooterConstants.Configuration.isMotorInverted)
            .withZeroPowerBehavior(ShooterConstants.Configuration.zeroPowerBehavior)
            .withGearRatio(ShooterConstants.Configuration.gearRatio)



        private val PID = PIDCoefficients(1.0, 0.0, 0.5)

        private val feedforward = SimpleMotorFeedforward(1.0, 0.0)


        private val controlConfiguration = MotorVelocityModeConfiguration()
            .withVelocityCoefficients(PID)
            .withFeedforwardCoefficients(feedforward)

        val configuration = OpMotorExConfiguration(genericConfiguration, controlConfiguration)

    }

}

