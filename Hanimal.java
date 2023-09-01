public class Hanimal {
        int numLegs;
        int numArms;
        int numEyes;
    public Hanimal(int legs , int eyes , int arms) {
        numLegs = legs;
        numArms = arms;
        numEyes = eyes;
    }
    public static void main(String[] args) {
        Hanimal penguin = new Hanimal(2,2,2);
        System.out.println("here we have a penguin");
        System.out.println("it has " + penguin.numLegs + " legs " + penguin.numArms + " arms & " + penguin.numEyes + "eyes");

    }
    //object.atribute 

    public void loseLeg(int detached) {
        numLegs = numLegs - detached;
    }
}
