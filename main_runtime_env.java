
import java.util.Scanner;

public class main_runtime_env {

	
	public static void main(String[] args) {
		
		double CalCost = 0;
		double TimeCost = 0;
		
		System.out.println("Constructive Cost Model Calculator \n");
		
		System.out.println("Please state the estimated difficulty of your Project \n { 1 for Easy | 2 for Intermediate | 3 for Hard }  ");
		Scanner myObj = new Scanner(System.in);
		int userInput = myObj.nextInt();
		System.out.println("Please enter the estimated amount of Code Lines (KDSI) for your Project \n");
		int KdsiInt = myObj.nextInt() / 1000;
		
		
		if(userInput == 1) {
			
			CalCost = Cost_Calc_Bib.CostEasy(KdsiInt);
			TimeCost = Cost_Calc_Bib.TimeEasy(CalCost);
			
		}
		
		if(userInput == 2){
			
			CalCost = Cost_Calc_Bib.CostIntermediate(KdsiInt);
			TimeCost = Cost_Calc_Bib.TimeIntermediate(CalCost);
			
		}
		
		if(userInput == 3){
			
			CalCost = Cost_Calc_Bib.CostHard(KdsiInt);
			TimeCost = Cost_Calc_Bib.TimeHard(CalCost);
			
		}
		
	double Productivity = KdsiInt / CalCost;
	double neededManpower = CalCost / TimeCost;
		
	System.out.println("\nCalculated Parameters by CoCoMo\n");
	System.out.printf("Project Cost is estimated to be: %f PM \n",Math.ceil(CalCost) );
	System.out.printf("Project Duration is estimated at  : %f Months",Math.ceil(TimeCost) );
	System.out.printf("\n");
	System.out.printf("Calculated Productivity: %f \n",Math.ceil(Productivity));
	System.out.printf("Calculated needed Manpower for the Project : %f Workers",Math.ceil(neededManpower) );
		
	myObj.close();
		

	}

}
