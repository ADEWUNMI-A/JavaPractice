package Chapter4;

import java.math.BigDecimal;

public class Citizen {
    private String firstName;
    private String surname;
    private BigDecimal earning;

    public Citizen() {
    }

    public Citizen(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public Citizen(String firstName, String surname, BigDecimal amount) {
        this(firstName, surname);
        earning = amount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getEarning() {
        return earning;
    }

    public void setEarning(BigDecimal earning) {
        this.earning = earning;
    }
}
