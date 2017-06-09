package strategy;

public class Client {
	public static void main(String[] args) {
		SalaryTemplate jilin = new JiLinSalary();
		SalaryTemplate hebei = new HeBeiSalary();
		
		jilin.computeSalary();
		jilin.computeInsurance();
		jilin.computeTax();
		
		hebei.computeSalary();
		hebei.computeInsurance();
		hebei.computeTax();
	}
}
