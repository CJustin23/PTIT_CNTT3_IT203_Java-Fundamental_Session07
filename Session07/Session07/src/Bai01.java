class StudentBai1 {
    private String maSV;
    private String tenSV;

    public static int totalStudent = 0;

    public StudentBai1(String maSV, String tenSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        totalStudent++;
    }

    public void hienThiThongTin() {
        System.out.println("Ma SV: " + maSV + " | Ten SV: " + tenSV);
    }
}

public class Bai01 {
    public static void main(String[] args) {
        StudentBai1 sv1 = new StudentBai1("SV01", "Nguyen Van A");
        StudentBai1 sv2 = new StudentBai1("SV02", "Tran Thi B");
        StudentBai1 sv3 = new StudentBai1("SV03", "Le Van C");

        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        sv3.hienThiThongTin();

        System.out.println("Tong so sinh vien da tao: " + StudentBai1.totalStudent);
    }
}