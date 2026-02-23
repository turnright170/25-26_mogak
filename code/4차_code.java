public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;  // 5는 건너뛰기
            }

            if (i == 9) {
                break;  // 9에서 반복 종료
            }

            System.out.println(i);
        }
    }
}
