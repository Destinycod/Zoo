public class GiantTortoise extends Animals{

    private int age;

    public GiantTortoise (int age){
        this.age = age;
    }

    public GiantTortoise (String name, String species, int numberOfLegs, String gender, int age){
        super(name, species, numberOfLegs, gender);
        this.age = age;
    }

    public String ageRange(){
        if(this.age>0 && this.age<50){
            return "young";
        }
        else if(this.age>49 && this.age <100){
            return "middle-aged";
        }
        else if(this.age>99){
            return "old";
        }
        else{
            return "The value entered is not valid";
        }
    }
}
/*
Giant Tortoise
-When a Giant Tortoise is created, define its current age
-Has a method to determine whether the Giant Tortoise is young, middle-aged, or old. For your reference:
Under 50 is young
Between 50 - 100 is middle-aged
Over 100 is old
 */
