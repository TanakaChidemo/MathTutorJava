public class Lesson13 {
    public static void main(String[] args){
        aircraft cessna172 = new aircraft(4, 140, 56.5, 9.5);
        aircraft piperSaratoga = new aircraft(6, 201, 102.5, 20.5);


        System.out.println("Cessna 172 cruise speed: " + cessna172.cruiseSpeed);
        System.out.println("Cessna 172 fuel capacity: " + cessna172.fuelCapacity);
        System.out.println("Cessna 172 fuel burn rate: " + cessna172.fuelBurnRate);
        System.out.println("Cessna 172 range: " + cessna172.range());
        System.out.println("Cessna 172 fuel needed for 2 hours: " + cessna172.fuelNeeded(2));

        System.out.println(" ");


        System.out.println("Piper Saratoga cruise speed: " + piperSaratoga.cruiseSpeed);
        System.out.println("Piper Saratoga fuel capacity: " + piperSaratoga.fuelCapacity);
        System.out.println("Piper Saratoga fuel burn rate: " + piperSaratoga.fuelBurnRate);
        System.out.println("Piper Saratoga range: " + piperSaratoga.range());
        System.out.println("Piper Saratoga fuel needed for 2 hours: " + piperSaratoga.fuelNeeded(2));

        cessna172.setPassengers(12);



    }
}

class aircraft {
    private int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;

    aircraft(int p, int c, double fc, double fbr){
        passengers = p;
        cruiseSpeed = c;
        fuelCapacity = fc;
        fuelBurnRate = fbr;
    }

    double range(){
        return fuelCapacity / fuelBurnRate;
    }
    double fuelNeeded(double time){
        return fuelBurnRate * time;
    }
    void setPassengers(int p){
        if ((p>0) && (p<=10)){
            passengers = p;
        System.out.println("Passengers set to " + passengers);
        }
            else {
                System.out.println("Invalid number of passengers");
            }
    }
}
