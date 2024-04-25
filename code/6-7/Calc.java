package clacapp.main;

public class Calc {

    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int total = clacapp.logics.CalcLogic.hiku(a, b);
        int delta = clacapp.logics.CalcLogic.hiku(a, b);
        System.out.println("足すと" + total + "、引くと" + delta);

    }
}