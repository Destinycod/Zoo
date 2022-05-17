public class Animals {

    private String species;
    private String name;
    private int numberOfLegs;
    private String gender;

    public Animals(){

    }

    public Animals(String name, String species, int numberOfLegs, String gender){
        this.name = name;
        this.species = species;
        this.numberOfLegs = numberOfLegs;
        this.gender = gender;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String animalDescription(){
        return "The name of the animal is " + getName() + ", the species is " + getSpecies() + ", the number of legs is "
                + getNumberOfLegs() + ", and the gender is " + getGender();
    }


}

/*
2.Create another Class to represent an Animal that lives in the Zoo. Here are some following characteristics of the Animal Class:
a.Holds the following information about the Animal:
Animal Species
Name
Number of Legs
Gender
b.Has the ability to print out a description of the Animal using the class level information
3.Create at 3 additional Classes that extend the Animal Class and represent 3 different species:
a.Giraffe:
-When a Giraffe is created, define the current height (in meters)
-Has a method that can be used to compare how this Giraffe’s height compares to other Giraffes. For your reference:
Male giraffes are an average of 5.5 meters tall
Female giraffes are an average of 4.6 meters tall
b.Crocodile
-When a Crocodile is created, define the number of teeth it has
-Has a method that logs out its favorite food
c.Giant Tortoise
-When a Giant Tortoise is created, define its current age
-Has a method to determine whether the Giant Tortoise is young, middle-aged, or old. For your reference:
Under 50 is young
Between 50 - 100 is middle-aged
Over 100 is old

4. Run the program to demonstrate that you have accomplished all the requirements.

 */