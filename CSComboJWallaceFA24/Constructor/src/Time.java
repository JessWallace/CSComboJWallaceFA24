
public class Time {
	
	private int hour;
	private int minute;
	private double second;
	
	
	public Time() {
		super();
		this.hour = 0;
		this.minute = 0;
		this.second = 0.0;
	}
	
	public Time(int hour, int minute, double second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public double getSeconds() {
		return second;
	}

	public void setSeconds(double seconds) {
		this.second = seconds;
	}
	
	public static void convert(Time time) {
		if(time.getHour() > 12) time.setHour(time.getHour() - 12);
		
	}
	
	public String toString() {
		String str = "Time is: ";
		if(hour < 10) str += "0";
		str += hour;
		str += ":";
		if(minute < 10) str += "0";
		str += minute;
		str += ":";
		if(second < 10) str +="0";
		str += second;
		return str;
	}
	
	public int timeDifference(Time that) {
		return Math.abs(this.getHour() - that.getHour());
		
	}
	
	
	
}
