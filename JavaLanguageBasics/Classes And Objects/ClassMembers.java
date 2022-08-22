public class ClassMembers {
    //constants
    static final double PI = 3.141592653589793;

    public static void main(String[] args) {
        
    }
}
// public class Bicycle {
        
//     private int cadence;
//     private int gear;
//     private int speed;
        
//     // add an instance variable for the object ID
//     private int id;
    
//     // add a class variable for the
//     // number of Bicycle objects instantiated
//     private static int numberOfBicycles = 0;
//         ...
// }

// public class Bicycle {
        
//     private int cadence;
//     private int gear;
//     private int speed;
//     private int id;
//     private static int numberOfBicycles = 0;
        
//     public Bicycle(int startCadence, int startSpeed, int startGear){
//         gear = startGear;
//         cadence = startCadence;
//         speed = startSpeed;

//         // increment number of Bicycles
//         // and assign ID number
//         id = ++numberOfBicycles;
//     }

    // public static int getNumberOfBicycles() {
    //     return numberOfBicycles;
    // }

//     // new method to return the ID instance variable
//     public int getID() {
//         return id;
//     }
//         ...
// }


class Bicycle {
        
    private int cadence;
    private int gear;
    private int speed;
        
    private int id;
    
    private static int numberOfBicycles = 0;

        
    public Bicycle(int startCadence,
                   int startSpeed,
                   int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        id = ++numberOfBicycles;
    }

    public int getID() {
        return id;
    }

    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    public int getCadence() {
        return cadence;
    }
        
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public int getGear(){
        return gear;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public int getSpeed() {
        return speed;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
}
