package org.firstinspires.ftc.teamcode.subsystems.exampleSubsystem

import com.qualcomm.robotcore.hardware.HardwareMap
import com.seattlesolvers.solverslib.command.SubsystemBase
import org.firstinspires.ftc.teamcode.utils.configurations.OpMotorExConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.genericConfigurations.GenericMotorConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.motorControlModeConfiguration.MotorPercentageModeConfiguration
import org.firstinspires.ftc.teamcode.utils.devices.OpMotorEx

class ExampleSubsystem(hardwareMap: HardwareMap): SubsystemBase() {

    private val motor: OpMotorEx

    init {
        motor = OpMotorEx(hardwareMap, ExampleConstants.Identification.motorId)
        motor.applyConfigurationAndResetEncoder(ExampleConstants.Configuration.motorConfig)
    }

    fun enableMotor() {
        motor.setPower(1.0)
    }

    fun disableMotor() {
        motor.stopMotor()
    }
}