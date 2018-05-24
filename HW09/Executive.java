public class Executive extends Employee {
  private double bonus;
  private int extraDays = 5;

  public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
    super(eName, eAddress, ePhone, socSecNumber, rate);
    bonus = 0;
  }

  public void awardBonus(double execBonus) throws BonusTooHighException {
    if (execBonus > 10000) {
      throw new BonusTooHighException("Entered bonus must be less than 10000.");
    }

    bonus = execBonus;
  }

  public double pay() {
    double payment = super.pay() + bonus;
    bonus = 0;
    return payment;
  }

  public double getBonus() {
    return bonus;
  }

  public double getVacationDays() {
    return super.getVacationDays() + extraDays;
  }
}
