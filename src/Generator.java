import java.security.SecureRandom;

public class Generator {
    public static String generatePassword() {
        StringBuilder generatedPassword = new StringBuilder();
        SecureRandom random = new SecureRandom();

        String digits = "0123456789";
        char[] digitsArray = digits.toCharArray();

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] upperCaseArray = upperCase.toCharArray();

        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        char[] lowerCaseArray = lowerCase.toCharArray();

        String specialChars = "!@#$%^&*()_+-=[]{}|;:<>/?~";
        char[] specialCharsArray = specialChars.toCharArray();

        for (int i = 1; i <= 10; i++) {
            int caseRandomIndex = random.nextInt(4) + 1;
            switch (caseRandomIndex) {
                case 1 -> {
                    int randomIndexDigits = random.nextInt(digitsArray.length);
                    generatedPassword.append(digitsArray[randomIndexDigits]);
                }
                case 2 -> {
                    int randomIndexUpperCase = random.nextInt(upperCaseArray.length);
                    generatedPassword.append(upperCaseArray[randomIndexUpperCase]);
                }
                case 3 -> {
                    int randomIndexLowerCase = random.nextInt(lowerCaseArray.length);
                    generatedPassword.append(lowerCaseArray[randomIndexLowerCase]);
                }
                case 4 -> {
                    int randomIndexSpecialChars = random.nextInt(specialCharsArray.length);
                    generatedPassword.append(specialCharsArray[randomIndexSpecialChars]);
                }
            }
        }

        return String.valueOf(generatedPassword);
    }


}