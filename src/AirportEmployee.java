public class AirportEmployee extends Person {
    private String sec_work;
    private double salary;
    private float hour_work;
    private int holidays;
    public AirportEmployee()
    {}

    public AirportEmployee(int id, String name, float age, String gender, String nationality, String sec_work, double salary, float hour_work, int holidays) {
        super(id, name, age, gender, nationality);
        this.sec_work = sec_work;
        this.salary = salary;
        this.hour_work = hour_work;
        this.holidays = holidays;
    }

    public String getSec_work() {
        return sec_work;
    }

    public void setSec_work(String sec_work) {
        this.sec_work = sec_work;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public float getHour_work() {
        return hour_work;
    }

    public void setHour_work(float hour_work) {
        this.hour_work = hour_work;
    }

    public int getHolidays() {
        return holidays;
    }

    public void setHolidays(int holidays) {
        this.holidays = holidays;
    }

    @Override
    public String toString() {
        return "AirportEmployee{" +
                "sec_work='" + sec_work + '\'' +
                ", salary=" + salary +
                ", hour_work=" + hour_work +
                ", holidays=" + holidays +
                '}';
    }
}
