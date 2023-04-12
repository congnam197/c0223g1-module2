package ss8_clean_code_va_refactoring.bai_tap.refactoring;

import java.util.Scanner;

public class TestTennisGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm người chơi 1: ");
        int score1 = sc.nextInt();
        System.out.println("Nhập điểm người chơi 2");
        int score2 = sc.nextInt();
        TennisGame.getScore(score1, score2);
    }
}
