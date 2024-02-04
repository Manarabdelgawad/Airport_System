import java.util.Scanner;

public class AirplaneEmployee extends Person {
    private double height,weight;
    private String maritalStatus,educationLevel,languages;
    private boolean health ,swimming,smoking;
    private double salary;


    public AirplaneEmployee()
    {}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public boolean isSwimming() {
        return swimming;
    }

    public void setSwimming(boolean swimming) {
        this.swimming = swimming;
    }

    public void setInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter this information: name, maritalStatus, educationLevel, languages, height, weight // boolean answer for health, swimming, smoking");
        setName(input.nextLine());
        maritalStatus = input.next();
        educationLevel = input.next();
        languages = input.next();
        height = input.nextDouble();
        weight = input.nextDouble();
        health = input.nextBoolean();
        swimming = input.nextBoolean();
        smoking = input.nextBoolean();
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        if (health == false) {
            salary += 1000;
        }
        if (swimming == true) {
            salary += 1000;
        }
        if (smoking == false) {
            salary += 1000;
        }
        return salary;
    }
}
