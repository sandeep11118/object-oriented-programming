import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Armstrong {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int num = Integer.parseInt(br.readLine());
        int bkp = num;
        int len = String.valueOf(num).length();
        int sum = 0;

        while (num != 0) {
            int d = num % 10;
            sum += Math.pow(d, len);
            num /= 10;
        }

        String resultMessage = (sum == bkp) ? "Armstrong number" : "Not an Armstrong number";

        System.out.println(resultMessage);
        
    }
}
