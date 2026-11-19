
package org.firstinspires.ftc.teamcode.subsystems.arm

import com.qualcomm.robotcore.hardware.HardwareMap
import com.seattlesolvers.solverslib.command.Command
import com.seattlesolvers.solverslib.command.InstantCommand
import org.firstinspires.ftc.teamcode.utils.Angle
import org.firstinspires.ftc.teamcode.utils.devices.OpServoEx

class Arm(hardwareMap: HardwareMap) {
    var armServo: OpServoEx

    init {
        armServo = OpServoEx(hardwareMap, ArmConstants.Identification.ARM_SERVO_ID)
        configureServo()
    }

    private fun configureServo() {
        armServo.applyConfiguration(ArmConstants.Configuration.positionConfig)
    }

    fun setAnglePickup(angle: Angle) {
        armServo.setServoPosition(angle)
    }

    fun setAngleCMD(angle: Angle): Command {
        return InstantCommand({ setAnglePickup(angle) })
    }
}



