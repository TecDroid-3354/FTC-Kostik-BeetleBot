package org.firstinspires.ftc.teamcode.subsystems.exampleSubsystem

import com.seattlesolvers.solverslib.hardware.motors.Motor
import org.firstinspires.ftc.teamcode.utils.configurations.OpMotorExConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.genericConfigurations.GenericMotorConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.motorControlModeConfiguration.MotorPercentageModeConfiguration

object ExampleConstants {

    object Identification {
        val motorId = "simpleMotor"
    }

    object Configuration {
        const val inverted = false
        val zeroPowerBehavior = Motor.ZeroPowerBehavior.FLOAT
        const val maxPower = 1.0

        private val genericConfiguration = GenericMotorConfiguration()
            .withInverted(inverted)
            .withZeroPowerBehavior(zeroPowerBehavior)

        private val controlModeConfiguration = MotorPercentageModeConfiguration()
            .withMaxPower(maxPower)

        val motorConfig = OpMotorExConfiguration()
            .withGenericMotorConfiguration(genericConfiguration)
            .withControlModeConfiguration(controlModeConfiguration)
    }
}