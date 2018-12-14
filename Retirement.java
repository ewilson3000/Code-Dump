package pkgCore;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	//TODO: Build the contructor, getters and setters for the attributes above.
	
	public Retirement(int iYearsToWork, double dAnnualReturnWorking, int iYearsRetired, double dAnnualReturnRetired
	 double dRequiredIncome, double dMonthlySSI)
	{
		this.iYearsToWork = iYearsToWork;
		this.dAnnualReturnWorking = dAnnualReturnWorking;
		this.iYearsRetired = iYearsRetired;
		this.dAnnualReturnRetired = dAnnualReturnRetired;
		this.dRequiredIncome = dRequiredIncome;
		this.dMonthlySSI = dMonthlySSI;
	}
	public int getIYearsToWork()
	{
		return iYearsToWork;
	}
	
	public double getDAnnualReturnWorking()
	{
		return dAnnualReturnWorking;
	}
	
	public int getIYearsRetired()
	{
		return iYears Retired;
	}
	
	public double getDAnnualReturnRetired()
	{
		return dAnnualReturnRetired;
	}
	
	public double getDRequiredIncome()
	{
		return dRequiredIncome;
	}
	
	public double getDMonthlySSI()
	{
		return dMonthlySSI;
	}
	
	
	
	
	
	
	public double AmountToSave()
	{
		//TODO: Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		//		and Annual return while working
		
		
		return 0;
	}
	
	public double TotalAmountSaved()
	{
		//	TODO: Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		//		and number of years retired.
		//
		return 0;
	}
}
