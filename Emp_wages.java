public class Emp_wages {

	public static void main(String[] args) {
		int Full_time = 1;
		int WagePerHr = 20;
		int FullDayHr = 8;
		int isPresent = 1, isAbsent = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == Full_time)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is Abscent");
        int Daily_wage = WagePerHr * FullDayHr;
        if (empCheck == isPresent)
        {
        	System.out.println("Employee Daily wager = " + Daily_wage);
        }
        else
        {
        	System.out.println("Employee Daily Wager" + isAbsent);
        }
	}

}

