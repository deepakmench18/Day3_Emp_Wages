
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
        double Check = Math.floor(Math.random() * 10) % 3;
        if (Check == isPresent)
        {
        	System.out.println("Employee Full Day Wage " + Daily_wage);
        }
        else if(Check == isParttime)
        {
        	System.out.println("Employee Part time wage" + Parttimewage);
        }
        else
        {
        	System.out.println("Employee Daily Wages " + isAbsent);
        }
        int cases = (int)Check;
        switch (cases)
        {
        case 1:
        	System.out.println("Employee Full Day Wage" + Daily_wage);
        	break;
        case 2:
        	System.out.println("Employee Part time wages" + Parttimewage);
        	break;
        default:
        	System.out.println("Employee is Absent");
        }
        int Totalwage = 0;
        for(int d = 1; d <=20; d++)
        {
        	switch (cases)
            {
            case 1:
            	Totalwage = Totalwage + Daily_wage;
            	break;
            case 2:
            	Totalwage = Totalwage + Parttimewage + Daily_wage;
            	break;
            default:
            	Totalwage += 0;
            }
        }
        System.out.println("Employee Monthly Wager" + Totalwage);
 		int TotalWage = 0, d = 0, Workinghour = 0;
 		while( d <= 20 || Workinghour <= 100 )
 		{
 			switch (cases) {
 			case 1:
 				d++;
 				Workinghour += 8;
 				TotalWage +=  Daily_wage;
 				break;
 			case 2:
 				d++;
 				Workinghour += 4;
 				TotalWage += Parttimewage + Daily_wage;
 				break;

 			default:
 				d++;
    				Workinghour += 0;
                                TotalWage += 0;
 			}
 		}

 		System.out.println(" Employee Monthly wager = "+TotalWage);

	}
        	}

}

