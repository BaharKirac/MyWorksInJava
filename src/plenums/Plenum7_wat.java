package plenums;

public class Plenum7_wat {
    public static void main(String[] args) {
        // addition of integers and strings
        System.out.print("\"4\" + 4 = ");
        System.out.println("4" + 4 );

        // math with char hint: ascii
        System.out.print("'1' + '1' = ");
        System.out.println('1' + '1');

        // comparing strings hint: .equals
        String foo = "foo";
        System.out.println(foo == "foo");
        System.out.println(foo + "bar" == "foo" + "bar");

        //going too far with int
        System.out.print("2147483647 * 2 = ");
        System.out.println(2147483647 * 2);

        //floating point cant represent some numbers
        //hint: https://www.youtube.com/watch?v=PZRI1IfStY0
        System.out.println(0.1+0.2);

        //too big and too precise floating point number problem
        System.out.println(1000000 + 0.0000000001);
        System.out.println(1000000 + 0.0000000002);
        System.out.println(1000000 + 0.0000000003);
        System.out.println(1000000 + 0.0000000004);
        System.out.println(1000000 + 0.0000000005);

        System.out.println("wat!");
    }
}
