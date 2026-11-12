package org.firstinspires.ftc.teamcode.subsystems.Intake

import com.qualcomm.robotcore.hardware.PIDCoefficients
import com.seattlesolvers.solverslib.command.Subsystem
import com.seattlesolvers.solverslib.controller.wpilibcontroller.SimpleMotorFeedforward
import com.seattlesolvers.solverslib.hardware.motors.Motor
import org.firstinspires.ftc.teamcode.utils.AngularVelocity
import org.firstinspires.ftc.teamcode.utils.configurations.OpMotorExConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.genericConfigurations.GenericMotorConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.motorControlModeConfiguration.MotorPositionModeConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.motorControlModeConfiguration.MotorVelocityModeConfiguration

object IntakeConstants  {
    object Identification {
        val intakeId = "intakeMotor"
    }

    object Configuration {
        private val isMotorInverted = false
        private val zeroPowerBehaviour = Motor.ZeroPowerBehavior.BREAK
        private val gearRatio = 1.0 / 1.0

        private val genericConf = GenericMotorConfiguration()
            .withInverted(isMotorInverted)
            .withZeroPowerBehavior(zeroPowerBehaviour)
            .withGearRatio(gearRatio)

        private val PID = PIDCoefficients(1.0, 0.0, 0.5)
        private val maxRPM = 200.0
        private val feedForward = SimpleMotorFeedforward(1.0, 0.0)


        private val controlConf = MotorVelocityModeConfiguration()

            .withVelocityCoefficients(PID)
            .withFeedforwardCoefficients(feedForward)


        val config = OpMotorExConfiguration(genericConf, controlConf)
        val targetRPM = AngularVelocity.fromRpm(maxRPM)



    }
}
