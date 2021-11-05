
public class Cost_Calc_Bib {


public static double CostEasy(double KDSI){
	double Cost_EasyProjectMode = 2.4 * Math.pow((KDSI),1.05);
	return Cost_EasyProjectMode;
	}
	
public static double CostIntermediate(double KDSI){
	double Cost_IntermediateProjectMode = 3.0 * Math.pow((KDSI),1.12);
	return Cost_IntermediateProjectMode;
	}

public static double CostHard(double KDSI){
	
	 double Cost_HardProjectMode = 3.6 * Math.pow((KDSI),1.20);
	 return Cost_HardProjectMode;
}

public static double TimeEasy(double CalCost) {
	double Time_EasyProjectMode = 2.5 * Math.pow((CalCost),0.38);
	return Time_EasyProjectMode;
	
}

public static double TimeIntermediate(double CalCost) {
	double Time_IntermediateProjectMode = 2.5 * Math.pow((CalCost),0.35);
	return Time_IntermediateProjectMode;
	
}

public static double TimeHard(double CalCost) {
	double Time_HardProjectMode = 2.5 * Math.pow((CalCost),0.32);
	return Time_HardProjectMode;
	
}
}
