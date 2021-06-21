
public class Emp_wages {

	public static void main(String[] args) {
		int Full_time = 1;
		int WagePerHr = 20;
		int FullDayHr = 8;
		int ParttimeHr = 4;
		int isPresent = 1, isAbsent = 0, isParttime = 2;
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
        int Parttimewage = WagePerHr * ParttimeHr;
        if (empCheck == isPresent)
        {
        	System.out.println("Employee Full Day Wage " + Daily_wage);
        }
        else if(empCheck == isParttime)
        {
        	System.out.println("Employee Part time wage" + Parttimewage);
        }
        else
        {
        	System.out.println("Employee Daily Wages " + isAbsent);
        }
	}

}

