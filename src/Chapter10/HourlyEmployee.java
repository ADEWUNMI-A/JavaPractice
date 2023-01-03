package Chapter10;


public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        if(wage < 0.0) {
            throw new IllegalArgumentException("Wage must be > 0.0");
        }
        if ((hours < 0) ||  (hours > 168 )) {
            throw new IllegalArgumentException("Hours worked must be > 0 and < 168");
        }
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0.0) {
            throw new IllegalArgumentException("Wage must be > 0.0");
        }
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if ((hours < 0) ||  (hours > 168 )) {
            throw new IllegalArgumentException("Hours worked must be >= 0 and <= 168");
        }
        this.hours = hours;
    }

    @Override
    public String toString() {
        return String.format( "%s%n%s: %.2f%n%s: %f",
                super.toString(),"Wage", getWage(), "Hours", getHours());
    }

    @Override
    public double earnings() {
        if (hours <= 40) {
            return getWage() * getHours();
        }
        return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }
}
