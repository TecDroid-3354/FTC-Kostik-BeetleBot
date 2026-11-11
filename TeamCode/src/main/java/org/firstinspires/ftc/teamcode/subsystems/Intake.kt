package org.firstinspires.ftc.teamcode.subsystems.Intake

import com.qualcomm.robotcore.hardware.HardwareMap
import com.seattlesolvers.solverslib.command.Command
import com.seattlesolvers.solverslib.command.InstantCommand
import org.firstinspires.ftc.teamcode.utils.AngularVelocity
import org.firstinspires.ftc.teamcode.utils.devices.OpMotorEx

class Intake(hardwareMap: HardwareMap) {
    //
    val motor : OpMotorEx

    init {
        motor = OpMotorEx(hardwareMap, IntakeConstants.Identification.intakeId)

        configureMotor()
    }

    fun configureMotor(){
        motor.applyConfigurationAndResetEncoder(IntakeConstants.Configuration.config)
    }

    private fun turnOnIntake(){
        motor.setVelocity(IntakeConstants.Configuration.targetRPM)
    }

    private fun turnOffIntake(){
        motor.setVelocity(AngularVelocity.fromRpm(0.0))
    }

    fun turnOnIntakeCMD() : Command {
        return InstantCommand({turnOnIntake()})
    }

    fun turnOffIntakeCMD() : Command {
        return InstantCommand({ turnOffIntake() })
    }
}