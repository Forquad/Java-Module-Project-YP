public class CorrectRub {
    static String getFormatRub() {

        double personalCost = Main.sum/Main.quantity;
        String correctRub = "";
        if ((Math.floor(personalCost)%100) >= 11 && (Math.floor(personalCost)%100) <= 14) {
            correctRub = "рублей";
        } else {
            if ((Math.floor(personalCost) % 10) == 1) {
                correctRub = "рубль";
            } else if ((Math.floor(personalCost) % 10) > 1 && (Math.floor(personalCost) % 10) < 5) {
                correctRub = "рубля";
            } else {
                correctRub = "рублей";
            }
        }
        return correctRub;
    }
}
