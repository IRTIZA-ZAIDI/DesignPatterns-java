package Factory;

public class VehicleFactory {
    public static Vehicle create(VehicleType type){
        if(VehicleType.VT_TwoWheeler.compareTo(type)==0){
            return new TwoWheeler();
        }
        else if(VehicleType.VT_ThreeWheeler.compareTo(type)==0){
            return new ThreeWheeler();
        }
        else if(VehicleType.VT_FourWheeler.compareTo(type)==0){
            return new FourWheeler();
        }
        else {
            System.out.println("Wrong type");
        }
        return null;
    }
}
