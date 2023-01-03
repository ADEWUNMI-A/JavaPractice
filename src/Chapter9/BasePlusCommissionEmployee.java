package Chapter9;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if(baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be > 0.0");
        }
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be > 0.0");
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + (commissionRate * grossSales);
    }

    @Override
    public String toString() {
        return String.format("%s%n%s", super.toString(), baseSalary);
    }
}
