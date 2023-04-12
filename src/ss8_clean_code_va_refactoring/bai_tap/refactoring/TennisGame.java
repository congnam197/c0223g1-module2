package ss8_clean_code_va_refactoring.bai_tap.refactoring;

public class TennisGame {
    public static String getScore(int scoreOfPlayer1, int scoreOfPlayer2) {
        String score = "";
        if (scoreOfPlayer1 == scoreOfPlayer2) {
            displayPoint(scoreOfPlayer1);
        } else if (scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4) {
            int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
            underPoint(minusResult);
        } else {
            score = displayPoint(scoreOfPlayer1) + "-" + displayPoint(scoreOfPlayer2);
        }
        return score;
    }

    public static String displayPoint(int score) {
        String result;
        switch (score) {
            case 0:
                result = "Love";
                break;
            case 1:
                result = "Fifteen";
                break;
            case 2:
                result = "Thirty";
                break;
            case 3:
                result = "Forty";
                break;
            default:
                result = "Deuce";
                break;
        }
        return result;
    }

    public static String underPoint(int minusResult) {
        String result;
        if (minusResult == 1) {
            result = "Advantage player1";
        } else if (minusResult == -1) {
            result = "Advantage player2";
        } else if (minusResult >= 2) {
            result = "Win for player1";
        } else {
            result = "Win for player2";
        }
        return result;
    }
}

