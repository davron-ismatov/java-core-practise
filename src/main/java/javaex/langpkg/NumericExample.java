package javaex.langpkg;

public class NumericExample {
    public static void main(String[] args) {
        Integer integer = 1234514135;
        Float f = Float.NaN;
        System.out.println(f);


        Float f1 = 1f/0;

        System.out.println(Float.parseFloat("NaN"));


        System.out.println(f1);
        System.out.println(f1.isNaN());
    }
}
