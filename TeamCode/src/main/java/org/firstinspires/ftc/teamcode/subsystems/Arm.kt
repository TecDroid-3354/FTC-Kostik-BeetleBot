package org.firstinspires.ftc.teamcode.subsystems.arm

import com.qualcomm.robotcore.hardware.HardwareMap
import com.seattlesolvers.solverslib.command.Command
import com.seattlesolvers.solverslib.command.InstantCommand
import org.firstinspires.ftc.teamcode.utils.Angle
import org.firstinspires.ftc.teamcode.utils.devices.OpMotorEx




    class Arm(hardwareMap: HardwareMap) {
        val motor: OpMotorEx = OpMotorEx(hardwareMap, armConstants.identification.ID)

        init {
            configureMotor()
        }

        fun configureMotor() {
            motor.applyConfigurationAndResetEncoder(armConstants.armConfiguration.config)
        }

        fun setAnglePickup(angle: Angle) {

            // SOLELY FOR 0° and 45 °
            motor.setAngle(angle)
        }

        fun setAngleCMD(angle: Angle): Command {
            return InstantCommand({ setAnglePickup(angle) })
        }
    }



