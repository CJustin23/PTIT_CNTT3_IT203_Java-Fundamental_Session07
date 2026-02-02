class StudentBai2 {
    String ten;
}

public class BAi02 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        StudentBai2 sv1 = new StudentBai2();
        sv1.ten = "An";

        StudentBai2 sv2 = sv1;
        sv2.ten = "Binh";

        System.out.println("sv1.ten = " + sv1.ten);
        System.out.println("sv2.ten = " + sv2.ten);
    }
}