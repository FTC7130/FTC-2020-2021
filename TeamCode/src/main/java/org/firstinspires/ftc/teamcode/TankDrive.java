package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name = "Tank Drive")
public class TankDrive extends OpMode {

    DcMotor l_drive;
    DcMotor r_drive;

    @Override
    public void init() {
        l_drive = hardwareMap.get(DcMotor.class, "l_drive");
        r_drive = hardwareMap.get(DcMotor.class, "r_drive");

        l_drive.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop() {
        l_drive.setPower(1);
        r_drive.setPower(1);
    }
}
