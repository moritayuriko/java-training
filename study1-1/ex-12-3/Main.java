public class Main {
    public static void main(String[] args) {
        Y[] z = new Y[2];
        z[0] = new A();
        z[1] = new B();
        for (Y roop : z) {
            // for(int i=0;i<b.length;i++){
            // z[i].b()
            roop.b();
        }
    }
}
