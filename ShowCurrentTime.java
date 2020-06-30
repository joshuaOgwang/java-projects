/*	
	A program that displays the current time in GMT
	Author: Joshua Ogwang
*/

public class ShowCurrentTime {
	public static void main(String[] args) {
		// Obtain the total milliseconds since 1/1/1970
		long totalMilliSeconds = System.currentTimeMillis();

		// Obtain the total seconds since 1/1/1970
		long totalSeconds = totalMilliSeconds / 1000;

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute the current hour
		long currentHour = totalHours % 24;

		// Display results
		System.out.println("Current time is " + currentHour + " : " + currentMinute + " : " + currentSecond + " GMT");
	}
}
