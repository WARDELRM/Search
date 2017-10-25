import lejos.nxt.*;
import lejos.util.*;

public class search
{

  public static void main (String[] args) {

    UltrasonicSensor sonicL;
    UltrasonicSensor sonicR;
    TouchSensor touch;
    LightSensor light;

    sonicL = new UltrasonicSensor(SensorPort.S1);
    sonicR = new UltrasonicSensor(SensorPort.S3);
    touch = new TouchSensor(SensorPort.S4);
    light = new LightSensor(SensorPort.S2);

    while (!Button.ESCAPE.isPressed()) {
      float intensity = light.getLightValue();
      float distanceL = sonicL.getRange();
      float distanceR = sonicR.getRange();

      if (distanceL <= 15) {
        Motor.A.forward();
        Motor.C.forward();
        Motor.A.setSpeed(50);
        Motor.C.setSpeed(50);
      } else {
        Delay.msDelay(2100);
        Motor.A.forward();
        Motor.C.backward();
        Motor.A.setSpeed(50);
        Motor.C.setSpeed(50);
        Delay.msDelay(5500);
        Motor.A.forward();
        Motor.C.forward();
        Motor.A.setSpeed(150);
        Motor.C.setSpeed(150);
        Delay.msDelay(8000);
      }
    }

  }









}
