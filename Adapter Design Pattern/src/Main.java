import Adaptee.ChildWeightMachine;
import Adapter.KilogramAdapter;
import Adapter.KilogramAdapterImpl;

public class Main {
    public static void main(String[] args) {
        KilogramAdapter adapter=new KilogramAdapterImpl(new ChildWeightMachine());

        System.out.println("Weight in kg is "+adapter.getWeightInKg());
    }
}