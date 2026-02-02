class ClassRoom{
    private String studentName;

    private static double classFund = 0;

    ClassRoom(String name){
        this.studentName=name;
    }

    public void donateClassFund (double amount) {
        if (amount > 0) {
            classFund += amount;
            System.out.println(studentName + " đã đóng " +amount + " VNĐ");
        }
    }

    public static void getClassFund() {
        System.out.println("Tổng quỹ lớp: " + classFund);
    }
}

public class BAi04 {
    public static void main(String[] args) {
        ClassRoom s1 = new ClassRoom("An");
        ClassRoom s2 = new ClassRoom("Thành");
        ClassRoom s3 = new ClassRoom("Tú");

        s1.donateClassFund(10000);
        s2.donateClassFund(20000);
        s3.donateClassFund(30000);

        ClassRoom.getClassFund();
    }
}