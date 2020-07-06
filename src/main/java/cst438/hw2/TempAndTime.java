package cst438.hw2;

import java.util.Date;

public class TempAndTime {
  public double temp;
  public long time;
  public int timeZone;

  public TempAndTime(double temp, long time, int timeZone) {
    this.temp = temp;
    this.time = time;
    this.timeZone = timeZone;
  }

  // Converts temp form Kelvin to Farenheit and returns new value
  public double ConvertTempToFahrenheit() {
    double tempF = Math.round((temp - 273.15) * 9.0 / 5.0 + 32.0);
    return tempF;
  }

  // TODO: Set date to correct format
  // Converts the time into the correct string format and returns it
  public String convertTimeToString() {
    Date date = new Date((this.time) * 1000);
    String convertedTime = date.toString();
    return convertedTime;
  }

}
