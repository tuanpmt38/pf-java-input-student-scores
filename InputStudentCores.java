public class InputStudentCores {
    public static void main(String[] args) {
        float marth, physical, chemistry, sum, medium;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Nhập điểm môn Toán:");
        marth = sc.nextFloat();
        System.out.println("Nhập điểm môn lý:");
        physical = sc.nextFloat();
        System.out.println("Nhập điểm môn hóa:");
        chemistry = sc.nextFloat();
        sum = marth + physical + chemistry;
        System.out.println("Tổng điểm 3 môn:" + sum);
        medium = (marth + physical + chemistry) / 3;
        System.out.println("Điểm trung bình 3 môn:" + medium);
    }
}
