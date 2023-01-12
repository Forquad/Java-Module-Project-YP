public class CorrectRub {
    static String getFormatRub(int number) {

        String correctRub = "рубл";
        if (number >= 11 && number <= 14) {
            correctRub = correctRub + "ей";
        } else {
            number %= 10;
            if (number == 1) {
                correctRub = correctRub + "ь";
            } else if (number >= 2 && number <= 4) {
                correctRub = correctRub + "я";
            } else {
                correctRub = correctRub + "ей";
            }
        }
        return correctRub;
    }
}
