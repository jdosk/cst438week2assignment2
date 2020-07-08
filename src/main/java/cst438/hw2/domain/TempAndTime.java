package cst438.hw2.domain;

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
    // Shortened this line up a little
    return Math.round((temp - 273.15) * 9.0 / 5.0 + 32.0);
  }


  // Converts the time into the correct string format and returns it
  public String convertTimeToString() {
    // Where are you adding in the time zone and adjusting for time offset?
    // Specifications request local time.
    Date date = new Date((this.time) * 1000);
    // Removed redundant variable here as well.
    return date.toString();
  }

}
