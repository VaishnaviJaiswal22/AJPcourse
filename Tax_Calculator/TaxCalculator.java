package labc4;

 class TaxCalculator {
	
	//Method To calculate tax
	public double calculateTax(String empname,boolean isIndian,double empSal) throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException {
		
		// Check if the employee is Indian or not
		if(!isIndian) {
			throw new CountryNotValidException("The Employee should be Indian for calculating tax.");
		}
		
		// Check if employee name is null or empty
		if(empname == null || empname.isEmpty()) {
			throw new EmployeeNameInvalidException("The employee name cannot be null or empty");
		}
		
		// Calculate tax base on salary of employee
		double taxAmount = 0;
		if(empSal>100000) {
			taxAmount = empSal * 8/100;
		}else if (empSal>=50000 && empSal<=100000) {
			taxAmount = empSal * 6/100;
		}else if(empSal>=30000 && empSal<50000) {
			taxAmount = empSal * 5/100;
		}else if(empSal>=10000 && empSal<30000) {
			taxAmount = empSal * 4/100;
		}else { 
			// if the salary of employee is less than 10000 he/she is not eligible for tax
			throw new TaxNotEligibleException("The Employee doesn't need to pay tax");
		}
		
		return taxAmount;
	}
	

}
