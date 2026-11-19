package org.firstinspires.ftc.teamcode.subsystems.Hood

import com.qualcomm.robotcore.hardware.HardwareMap
import com.seattlesolvers.solverslib.command.Command
import com.seattlesolvers.solverslib.command.InstantCommand
import org.firstinspires.ftc.teamcode.utils.Angle
import org.firstinspires.ftc.teamcode.utils.devices.OpServoEx



class Hood(hardwareMap: HardwareMap) {
    val motor: OpServoEx
    init { motor = OpServoEx(hardwareMap, HoodConstants.Identification.HoodId)
        configureMotor()
    }

    fun configureMotor() {
        motor.applyConfiguration(HoodConstants.Configuration.servoConfig)
    }

    fun setPosition(angle: Angle) {
        motor.runToPosition(angle)
    }
//yet to know shoot angle
    fun setPositionCMD(angle: Angle): Command {
        return InstantCommand({ setPosition(angle) })
    }
}

