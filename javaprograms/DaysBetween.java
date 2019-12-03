package javaprograms;

public class DaysBetween {
	static int months[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int years;
	int month;
	int day;

	public DaysBetween(int y, int m, int d) {
		this.years = y;
		this.month = m;
		this.day = d;
	}

	public static void main(String[] args) {
		DaysBetween dt = new DaysBetween(2019, 11, 18);
		DaysBetween dt1 = new DaysBetween(1997, 2, 7);
		System.out.println(getDiff(dt, dt1));
	}

	private static int getDiff(DaysBetween dt, DaysBetween dt1) {
		int n1 = 0, n2 = 0;
		n1 = dt.years * 365 + dt.day;
		for (int i = 0; i < dt.month - 1; i++) {
			n1 += months[i];
		}
		n1 += countleap(dt);
		n2 = dt1.years * 365 + dt1.day;
		for (int i = 0; i < dt1.month - 1; i++) {
			n2 += months[i];
		}
		n2 += countleap(dt1);
		return (n1 - n2);
	}

	private static int countleap(DaysBetween dt) {
		int years = dt.years;
		if (dt.month <= 2) {
			years--;
		}
		return years / 4 - years / 100 + years / 400;
	}

}
