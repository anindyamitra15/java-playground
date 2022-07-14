import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.anindya.collectionframework.LearnLists;

/**
 * This project was created in VS Code.
 * Press F5 to run/debug this project properly
 * Implement the code in main() function of the App class
 */
public class App {


    public static void main(String[] args) throws Exception {
        LearnLists ll = new LearnLists();
        ll.demonstrate();

    }




    /**
     * Implementation referenced from Codechef
     */
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
