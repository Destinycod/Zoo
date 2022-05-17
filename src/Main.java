import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Name","Capital Federal", 9);

        List<Animals> animals = new ArrayList<Animals>();

        System.out.println("The name of the Zoo is " + zoo.getName() + ", from " + zoo.getCity() + "city"
                + " is open " + zoo.getOperatingHours()+" hours");

        zoo.admissionPrice("Sunday");
        System.out.println("Today the admission price is: " + zoo.getAdmissionPrice());

        Giraffe giraffe1 = new Giraffe("Sussi","Mammal",4,"Female",4.6);
        Giraffe giraffe2 = new Giraffe("Jack","Mammal",4,"Male",5.2);

        System.out.println(giraffe1.animalDescription());

        if(giraffe1.compareTo(giraffe2)==0){
            System.out.println(giraffe1.getName() + " is as high as " + giraffe2.getName());
        }
        else if(giraffe1.compareTo(giraffe2)==1){
            System.out.println(giraffe2.getName() + " is higher than " + giraffe1.getName());
        }
        else{
            System.out.println(giraffe1.getName() + " is higher than " + giraffe2.getName());
        }

        Cocodrile cocodrile1 = new Cocodrile("Coco", "Reptile", 4, "Male", 80, "Chicken");
        System.out.println("The favorite food of " + cocodrile1.getName() + " is " + cocodrile1.getFavoriteFood());

        GiantTortoise tortoise = new GiantTortoise("Cleo", "Reptile", 4, "Female", 95);
        System.out.println("The Giant Tortoise " + tortoise.getName() + " is " + tortoise.ageRange());

        zoo.addAnimal(giraffe1);
        zoo.addAnimal(giraffe2);
        zoo.addAnimal(cocodrile1);
        zoo.addAnimal(tortoise);

        System.out.println("Number of animals in the zoo: " + zoo.numberOfAnimals());

        zoo.removeAnimal(giraffe1);

        System.out.println("Number of animals in the zoo: " + zoo.numberOfAnimals());
    }
}
