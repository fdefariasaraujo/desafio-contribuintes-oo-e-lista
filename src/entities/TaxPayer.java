package entities;

public class TaxPayer {

	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;

	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {
		double month = salaryIncome / 12.0;
		if (month < 3000) {
			return 0.00;
		} else if (month < 5000) {
			return salaryIncome * 0.1;
		} else {
			return salaryIncome * 0.2;
		}
	}

	public double servicesTax() {
		if (servicesIncome > 0) {
			return servicesIncome * 0.15;
		} else {
			return 0.00;
		}

	}

	public double capitalTax() {
		return capitalIncome * 0.2;
	}

	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}

	public double taxRebate() {
		double sumOfExpenses = educationSpending + healthSpending;
		if (sumOfExpenses > (grossTax() * 0.3)) {
			return grossTax() * 0.3;
		} else {
			return sumOfExpenses;
		}

	}

	public double netTax() {
		return grossTax() - taxRebate();
	}

	public String toString() {
		return "Imposto bruto total: " + String.format("%.2f", grossTax()) + "\n" + "Abatimento: "
				+ String.format("%.2f", taxRebate()) + "\n" + "Imposto devido: " + String.format("%.2f", netTax());
	}

}