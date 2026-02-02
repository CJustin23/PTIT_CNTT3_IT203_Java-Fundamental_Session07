public class BAi05 {
    static class Config {
        static final double MAX_SCORE = 10.0;
        static final double MIN_SCORE = 0.0;
    }
    public static void main(String[] args) {
        double score = 7.5;
        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ: " + score);
        } else {
            System.out.println("Điểm không hợp lệ");
        }
        System.out.println("Điểm tối đa: " + Config.MAX_SCORE);
        System.out.println("Điểm tối thiểu: " + Config.MIN_SCORE);
    }
}