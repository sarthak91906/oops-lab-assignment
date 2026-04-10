class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;
    
    public void GetCar(int CarId, String CarType) {
        this.CarId = CarId;
        this.CarType = CarType;
        this.Rent = GetRent();
    }
    
    public float GetRent() {
        switch (CarType.toLowerCase()) {
            case "small car":
                return 1000;
            case "van":
                return 800;
            case "suv":
                return 2500;
            default:
                return 0;
        }
    }
    
    public void ShowCar() {
        System.out.println("Car ID: " + CarId + ", Type: " + CarType + ", Rent: " + Rent);
    }
}

public class Question3_CARRENTAL {
    public static void main(String[] args) {
        CARRENTAL car1 = new CARRENTAL();
        CARRENTAL car2 = new CARRENTAL();
        CARRENTAL car3 = new CARRENTAL();
        
        car1.GetCar(101, "Small Car");
        car2.GetCar(102, "Van");
        car3.GetCar(103, "SUV");
        
        car1.ShowCar();
        car2.ShowCar();
        car3.ShowCar();
    }
}
