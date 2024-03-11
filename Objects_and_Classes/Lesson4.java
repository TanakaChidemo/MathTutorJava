public class Lesson4 {
    public static void main(String[] args){
        aircraft cessna172 = new aircraft();
        aircraft piperSaratoga = new aircraft();
        groceryStore houstonStore =  new groceryStore();
        groceryStore seattleStore =  new groceryStore();
        groceryStore orlandoStore = new groceryStore();

        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelCapacity = 56.5;
        cessna172.fuelBurnRate = 9.5;

        System.out.println("Cessna 172 passengers: " + cessna172.passengers);
        System.out.println("Cessna 172 cruise speed: " + cessna172.cruiseSpeed);
        System.out.println("Cessna 172 fuel capacity: " + cessna172.fuelCapacity);
        System.out.println("Cessna 172 fuel burn rate: " + cessna172.fuelBurnRate);
        System.out.println("Cessna 172 range: " + cessna172.range());

        System.out.println(" ");

        piperSaratoga.passengers = 6;
        piperSaratoga.cruiseSpeed = 201;
        piperSaratoga.fuelCapacity = 102.5;
        piperSaratoga.fuelBurnRate = 20.5;

        System.out.println("Piper Saratoga passengers: " + piperSaratoga.passengers);
        System.out.println("Piper Saratoga cruise speed: " + piperSaratoga.cruiseSpeed);
        System.out.println("Piper Saratoga fuel capacity: " + piperSaratoga.fuelCapacity);
        System.out.println("Piper Saratoga fuel burn rate: " + piperSaratoga.fuelBurnRate);
        System.out.println("Piper Saratoga range: " + piperSaratoga.range());
    }
}

class aircraft {
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;
    double range(){
        return fuelCapacity / fuelBurnRate;
    
    }
}

class groceryStore {
    int applesSoldPerYear;
    double retailPriceApple;
    int orangesSoldPerYear;
    double retailPriceOrange;
}