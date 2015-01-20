package org.usfirst.frc.team1559.robot;

import edu.wpi.first.wpilibj.AnalogInput;

public class MaxSonar {
     AnalogInput sensor;
     double conversionFactor;
     double dist;
     public MaxSonar(int channel)
     {
         sensor = new AnalogInput(channel);
         conversionFactor = 8.4;
     }
     public double getInches()
     {
         return ((sensor.getVoltage()*conversionFactor/12));
     }
     public double getFeet()
     {
         return ((sensor.getVoltage()*conversionFactor));
     }
     public double getVoltage()
     {
         return (sensor.getVoltage());
     }
     public boolean isInAutoZone(){
    	 if (getInches() >= 142){
    		 return true;
    	 }
    	 else {
    		 return false;
    	 }
     }
}

