
package org.firstinspires.ftc.teamcode.subsystems.arm

import com.qualcomm.robotcore.hardware.HardwareMap
import com.seattlesolvers.solverslib.command.Command
import com.seattlesolvers.solverslib.command.InstantCommand
import org.firstinspires.ftc.teamcode.utils.Angle
import org.firstinspires.ftc.teamcode.utils.devices.OpServoEx

class Arm(hardwareMap: HardwareMap) {
    val servo: OpServoEx = OpServoEx(hardwareMap, armConstants.identification.ID)

    init {
        configureServo()
    }

    private fun configureServo() {
        servo.applyConfiguration(armConstants.armConfiguration.config)
    }

    fun setAnglePickup(angle: Angle) {
        servo.setServoPosition(angle)
    }

    fun setAngleCMD(angle: Angle): Command {
        return InstantCommand({ setAnglePickup(angle) })
    }
}



