package verini.bcs345.labfive.fileio;

public class main {

	public static void main(String[] args) {
		
		YearlySales ys = new YearlySales();
		
		double average = ys.Average();
		
		//System.out.printf("Average = %f\n", average);
		
		ys.ShowReport();

	}

}
