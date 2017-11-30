import org.junit.Test;

import java.io.BufferedReader;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.io.FileReader;

public class TestOddle {
    static String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }

    @Test
    public void testMultiply() {
        // TestOddle tester = new TestOddle();
        // assertEquals("10 x 5 must be 50", 50, 10*4);
        try{
            assertTrue(readFile("web-content.txt").contains("google"));
        }catch (Exception e){
            System.out.println(e);
        }
    }
    /*public static void main(String args[]){
        try{
            System.out.println(readFile("web-content.txt"));
        }catch (Exception e){
            System.out.println(e);
        }

    }*/
}
