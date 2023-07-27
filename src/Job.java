// Job Enum
// Salary and Hours per Week
// CalculateHourlyPay Method
// Raise Method. Increases Salary by 1%
// Switch through them - make something up

public enum Job {
    SMALL(38000, 40),
    MEDIUM(45000,40),
    LARGE(60000,40);

    private final double pay;
    private final int hoursPerWeek;

    Job(double pay, int hoursPerWeek) {
        this.pay = pay;
        this.hoursPerWeek = hoursPerWeek;
    }

    public double raise(){
        return pay*1.01;
    }

    public double calculateHourlyPay(){
        return (double) Math.round((pay/(40*52))*100)/100;
    }
}
