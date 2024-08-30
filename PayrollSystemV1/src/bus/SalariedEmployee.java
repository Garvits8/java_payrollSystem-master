package bus;

public class SalariedEmployee extends Employee {

	private double weeklySalary;
	
	public SalariedEmployee() {
		super();
		this.weeklySalary = 0.00;
	}
	
	public SalariedEmployee(String fn, String ln, String ssn, double weeklySalary) {
		super(fn, ln, ssn);
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return this.weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [" + super.toString() + ", " + weeklySalary + "]";
	}

	@Override
	public double calcPayment() {
		return this.getWeeklySalary();
	}
}
