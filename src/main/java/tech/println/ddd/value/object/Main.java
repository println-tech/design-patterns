package tech.println.ddd.value.object;


public class Main {

    public static void main(String[] args) {

        Dollar five = new Dollar(5);
        Dollar doubledFive = five.sum(5);
        Dollar ten = new Dollar(10);
        System.out.println("Objects is equals " + ten.equals(doubledFive));
        System.out.println("Five object " + five);
        System.out.println("Ten object " + doubledFive);
    }
}
