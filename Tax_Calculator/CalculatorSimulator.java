package labc4;

public class CalculatorSimulator {

	public static void main(String[] args) {
		
        TaxCalculator calculator = new TaxCalculator();
        
        // Case 1: Calculate Tax using calculateTax Method
        
		try {
			 double tax = calculator.calculateTax("ABC", true, 50000);
			 System.out.println("Tax amount is " + tax);
		} catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
			
			e.printStackTrace();
		}
       
        
        
        // Case 2:  a) Country Not Valid
        try {
            double tax = calculator.calculateTax("XYZ", false, 50000);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            e.printStackTrace();
        }
        

        // Case 2: b) Employee name not valid
        try {
            double tax = calculator.calculateTax("", true, 30000);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
           e.printStackTrace();
        }

        
        //  Case 2: c) Not eligible for Tax Calculation
        try {
            double tax = calculator.calculateTax("PQR", true, 1000);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            e.printStackTrace();
        }



	}

}
