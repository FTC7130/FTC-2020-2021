package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "Tank Drive")
public class TankDrive extends OpMode {

    DcMotor lf_drive;
    DcMotor lb_drive;
    DcMotor rf_drive;
    DcMotor rb_drive;

    @Override
    public void init() {
        lf_drive = hardwareMap.get(DcMotor.class, "lf_drive");
        lb_drive = hardwareMap.get(DcMotor.class, "lb_drive");
        rf_drive = hardwareMap.get(DcMotor.class, "rf_drive");
        rb_drive = hardwareMap.get(DcMotor.class, "rb_drive");

        rf_drive.setDirection(DcMotorSimple.Direction.REVERSE);
        rb_drive.setDirection(DcMotorSimple.Direction.REVERSE);
    }


    @Override
    public void loop() {

        double lfp = gamepad1.left_stick_y - gamepad1.right_stick_x - gamepad1.left_stick_x;
        double lbp = gamepad1.left_stick_y - gamepad1.right_stick_x + gamepad1.left_stick_x;
        double rfp = gamepad1.left_stick_y + gamepad1.right_stick_x + gamepad1.left_stick_x;
        double rbp = gamepad1.left_stick_y + gamepad1.right_stick_x - gamepad1.left_stick_x;



        lf_drive.setPower(lfp);
        lb_drive.setPower(lbp);
        rf_drive.setPower(rfp);
        rb_drive.setPower(rbp);


    }
}
