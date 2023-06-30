package loopPractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopMultiply {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int multiply = 0;
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d * %d = %d%n", N, i, N * i);
        }
            bufferedReader.close();
        }

    }

