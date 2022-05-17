public class Giraffe extends Animals implements Comparable<Giraffe>{

    private double height;

    public Giraffe(String name, String species, int numberOfLegs, String gender, double height){
        super(name, species, numberOfLegs, gender);
        this.height = height;
    }

    public Giraffe(double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int compareTo(Giraffe giraffe) {
        int equality=-1;
        if(this.getHeight() == giraffe.getHeight()){
            return equality = 0;
        }
        else if(giraffe.getHeight() > this.getHeight()) {
            return equality = 1;
        }
        return equality;
    }
}
/*
Giraffe:
-When a Giraffe is created, define the current height (in meters)
-Has a method that can be used to compare how this Giraffe’s height compares to other Giraffes. For your reference:
Male giraffes are an average of 5.5 meters tall
Female giraffes are an average of 4.6 meters tall
 */