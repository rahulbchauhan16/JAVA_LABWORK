class Vehicle {
    void vehicleInfo() {
        System.out.println("This is a vehicle.");
    }
}


interface Electric {
    void chargeBattery();
}

interface Fuel {
    void fillFuel();
}


class HybridCar extends Vehicle implements Electric, Fuel {

    public void chargeBattery() {
        System.out.println("Charging the battery.");
    }

    public void fillFuel() {
        System.out.println("Filling the fuel tank.");
    }

    void hybridInfo() {
        System.out.println("This is a hybrid car.");
    }
}

class MultipleInheritance {
    public static void main(String[] args) {
        HybridCar car = new HybridCar();
        car.vehicleInfo();  
        car.hybridInfo();   
        car.chargeBattery();
        car.fillFuel();     
    }
}