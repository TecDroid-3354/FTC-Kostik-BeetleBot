package org.firstinspires.ftc.teamcode.subsystems.arm

import org.firstinspires.ftc.teamcode.utils.Angle
import org.firstinspires.ftc.teamcode.utils.configurations.OpServoExConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.servoControlModeConfiguration.ServoPositionModeConfiguration

class armConstants {
    object identification {
        const val ID = "armServo"
    }

    object armConfiguration {
        val minAngle: Angle = Angle.fromDegrees(0.0)
        val maxAngle: Angle = Angle.fromDegrees(45.0)

        val config = OpServoExConfiguration()
            .withServoModeConfiguration(
                ServoPositionModeConfiguration()
                    .withRange(maxAngle - minAngle)
            )
    }
}

