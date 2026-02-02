class ScoreUtils {

    public static boolean checkScore(double score) {
        return score >= 5;
    }

    public static double avg(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }
}

public class Bai03 {
    public static void main(String[] args) {
        double s1 = 7.0;
        double s2 = 6.5;
        double s3 = 4.5;

        double avg = ScoreUtils.avg(s1, s2, s3);
        System.out.println("Điểm trung bình cả lớp: " +avg);

        System.out.println(+s1 + ": " +(ScoreUtils.checkScore(s1) ? "Đạt":  "Trượt"));
        System.out.println(+s2+ ": " + (ScoreUtils.checkScore(s2) ? "Đạt":  "Trượt"));
        System.out.println(+s3 + ": " +(ScoreUtils.checkScore(s3) ? "Đạt":  "Trượt"));

    }
}