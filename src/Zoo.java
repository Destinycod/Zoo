import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String name;
    private String city;
    private int operatingHours;
    private double admissionPrice;

    private List<Animals> animals = new ArrayList<Animals>();

    public Zoo(){

    }

    public Zoo(String name, String city, int operatingHours){
        this.name = name;
        this.city = city;
        this.operatingHours = operatingHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(int operatingHours) {
        this.operatingHours = operatingHours;
    }

    public double getAdmissionPrice() {
        return admissionPrice;
    }

    public void setAdmissionPrice(double admissionPrice) {
        this.admissionPrice = admissionPrice;
    }

    public int numberOfAnimals(){
        return animals.size();
    }

    public void addAnimal(Animals animals){
        this.animals.add(animals);
    }

    public void removeAnimal(Animals animals){
        this.animals.remove(animals);
    }

    public void admissionPrice(String weekday){
        if(weekday == "Saturday" || weekday == "Sunday"){
            setAdmissionPrice(25.99);
        }
        else if(weekday == "Wednesday"){
            setAdmissionPrice(9.99);
        }
        else{
            setAdmissionPrice(19.99);
        }
    }

}
/*
1. Create a Class that represents a Zoo that you own. Here are some following characteristics of the Zoo Class:
a. Holds the following information about the zoo:
Name
City
Operating Hours
b. Can keep track of one or more Animals that currently live in the Zoo. This includes:
Ability to print out how many Animals are currently in the zoo
Ability to add an Animal to the Zoo
Ability to remove an Animal from the Zoo
Ability to print out descriptions of all the Animals that currently live in the zoo
Ability to determine, depending on the current day of the week, the current Admission Price. Price is based on the following:
    Monday & Tuesday: $19.99
    Wednesday: $9.99
    Thursday & Friday: $19.99
    Saturday & Sunday: $25.99

 */