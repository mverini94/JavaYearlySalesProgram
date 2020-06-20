package verini.bcs345.labfive.fileio;

public class YearlySales {
	public double[] salesForEachMonth;
	public String[] m_Months = { "Jan", "Feb", "March", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" };

	public YearlySales() {
		salesForEachMonth = new double[12];

		salesForEachMonth[0] = 100;
		salesForEachMonth[1] = 50;
		salesForEachMonth[2] = 100;
		salesForEachMonth[3] = 50;
		salesForEachMonth[4] = 100;
		salesForEachMonth[5] = 50;
		salesForEachMonth[6] = 100;
		salesForEachMonth[7] = 50;
		salesForEachMonth[8] = 100;
		salesForEachMonth[9] = 50;
		salesForEachMonth[10] = 100;
		salesForEachMonth[11] = 50;
	}

	public double GetSales(int month) {
		int index = month - 1;
		return salesForEachMonth[index];
	}
	
	public void SetSales(int month, double value)
	{
		int index = month - 1;
		
		salesForEachMonth[index] = value;
	}
	
	public double Average() {
		double total = 0.0;
		double avg = 0.0;
		for (int i = 0; i < salesForEachMonth.length; i++) {
			total = total + salesForEachMonth[i];
		}

		avg = total/salesForEachMonth.length;

		return avg;
	}
	
	public void ShowReport()
	{
		double total = 0.0;
		for (int i = 0; i < salesForEachMonth.length; i++) 
		{
			System.out.printf("%10s %10.2f\n",m_Months[i], salesForEachMonth[i]);
			total = total + salesForEachMonth[i];
		}
		System.out.printf("%10s %10.2f\n", "Avg", total/salesForEachMonth.length);
		System.out.printf("%10s %10.2f\n", "Total", total);
	}

}
