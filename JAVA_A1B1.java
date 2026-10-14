class IntegerNumber {
    private int num;

    IntegerNumber(int num) {
        this.num = num;
    }

    int square() {
        return num * num;
    }

    int cube() {
        return num * num * num;
    }
}

public class JAVA_A1B1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        IntegerNumber obj = new IntegerNumber(n);

        System.out.println("Number = " + n);
        System.out.println("Square = " + obj.square());
        System.out.println("Cube = " + obj.cube());
    }
}