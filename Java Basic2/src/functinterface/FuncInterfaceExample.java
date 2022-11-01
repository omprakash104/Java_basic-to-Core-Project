package functinterface;

@FunctionalInterface
interface FuncInterfaceE {
    void getData(int x);
}


public class FuncInterfaceExample {
    public static void main(String args[]) {
        FuncInterfaceE intf = (int x) -> System.out.println(x*2);
        intf.getData(14);
    }
}
