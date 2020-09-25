import java.util.LinkedList;

public class SquareDigit {

    public int squareDigits(int n) {
        int result = 0;

        LinkedList<Integer> stack = new LinkedList<Integer>();

        int digit, square, m;
        while (n > 0) {
            // Calculate current digit and its square
            digit = n % 10;
            square = digit == 0 ? 0 : digit * digit;
            stack.push(square);

            // Prepare next iteration
            n /= 10;
        }

        // Reverse order
        while (!stack.isEmpty()) {
            square = stack.pop();

            m = square;
            if (m == 0) {
                // Handle 0
                result = result * 10;
            } else {
                // Shift result to left
                while (m > 0) {
                    result = result * 10;
                    m /= 10;
                }
            }

            // Append to result
            result += square;
        }

        return result;
    }
}