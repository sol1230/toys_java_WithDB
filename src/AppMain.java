import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) throws Exception {
        System.out.println("설문을 참여 하시겠습니까?");
        Scanner scanner = new Scanner(System.in);
        String flag = "T";
        
        while(!flag.equals("Q")){   // 종료 flag 사용
            System.out.println("P.설문시작 | S.통계 | Q.종료");
            flag = scanner.nextLine();
            if (flag.equals("P")){   // 설문 시작
                Survey survey = new Survey();
                survey.Survey();
            } else if (flag.equals("S")){   // 통계
                Statistic statistic = new Statistic();
                statistic.Statistic();
            }
            // 종료 flag 사용
        System.out.println("종료");
        }
    }
}
