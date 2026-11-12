package org.firstinspires.ftc.teamcode.subsystems.shooter

import com.qualcomm.robotcore.hardware.HardwareMap
import com.seattlesolvers.solverslib.command.Command
import com.seattlesolvers.solverslib.command.InstantCommand
import com.seattlesolvers.solverslib.command.SubsystemBase
import org.firstinspires.ftc.teamcode.utils.AngularVelocity
import org.firstinspires.ftc.teamcode.utils.devices.OpMotorEx


class Shooter(hardwareMap: HardwareMap) : SubsystemBase() {

    private val motor = OpMotorEx(hardwareMap, ShooterConstants.Identification.shooterId)

    init {
        configMotor()
    }

    private fun configMotor() {
        motor.applyConfigurationAndResetEncoder(ShooterConstants.Configuration)
    }

    fun turnOnShooter() {
        motor.setVelocity(ShooterConstants.Configuration.targetRPM)
    }

    fun turnOffShooter() {
        motor.setVelocity(AngularVelocity.fromRpm(0.0))
    }

    fun turnOnShooterCMD(): Command {
        return InstantCommand({ turnOnShooter() })
    }

    fun turnOffShooterCMD(): Command {
        return InstantCommand({ turnOffShooter() })
    }
}
