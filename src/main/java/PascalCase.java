import java.lang.StringBuilder;

public class PascalCase {

    static String toCamelCase(String s) {
        // Empty string
        if (s == null || s.isEmpty()) {
            return s;
        }

        // Convert string
        StringBuilder camelCase = new StringBuilder();
        boolean isDelimiter = false;
        char currentChar;
        for (int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);

            // The first word within the output should be capitalized only if the original word was capitalized
            if (i > 0) {
                if (currentChar == '_' || currentChar == '-') {
                    isDelimiter = true;
                } else {
                    if (isDelimiter) {
                        // Uppercase first char after delimiter
                        camelCase.append(Character.toUpperCase(currentChar));
                    } else {
                        // Subsequent char
                        camelCase.append(currentChar);
                    }

                    // Reset delimiter
                    isDelimiter = false;
                }
            } else {
                camelCase.append(currentChar);
            }
        }
        return camelCase.toString();
    }
}