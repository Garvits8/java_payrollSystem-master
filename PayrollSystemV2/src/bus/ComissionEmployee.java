package bus;

public class ComissionEmployee extends Employee{

	private static final long serialVersionUID = 3956253229103042520L;
	private double grossSales;
	private double comissionRate;
	
	public ComissionEmployee() {
		super();
	}

	public ComissionEmployee(String fn, String ln, String ssn, double grossSales, double comissionRate) {
		super(fn, ln, ssn);
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
	}
	
	public ComissionEmployee(String fn, String ln, String ssn, EnumType type, double grossSales, double comissionRate) {
		super(fn, ln, ssn, type);
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
	}

	public double getGrossSales() {
		return this.grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getComissionRate() {
		return this.comissionRate;
	}

	public void setComissionRate(double comissionRate) {
		this.comissionRate = comissionRate;
	}

	@Override
	public String toString() {
		return "ComissionEmployee [" + super.toString() + ", grossSales = " + grossSales + ", comissionRate = " + comissionRate + "]";
	}

	@Override
	public double calcPayment() {
		return this.comissionRate * this.grossSales;
	}

}
