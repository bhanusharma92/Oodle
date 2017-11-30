import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Oddle {
    public static void main(String args[]) {
        System.out.println("Hello");
        String inputLine;
        URLConnection con;
        StringBuffer sb = new StringBuffer();
        try {
            URL url = new URL("https://google.com");
            con = url.openConnection();
            HttpURLConnection http = (HttpURLConnection) con;
            http.setRequestMethod("GET"); // PUT is another valid option
            http.setDoOutput(true);
            http.setDoInput(true);
            http.connect();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(http.getInputStream()));
            while ((inputLine = br.readLine()) != null) {
                //System.out.println(inputLine);
                sb.append(inputLine);
            }
            System.out.println(sb);
            PrintWriter out = new PrintWriter("web-content.txt");
            out.println(sb.toString());
            out.close();
        } catch (Exception e) {
            System.out.println("Exception e: " + e);
        }


    }
}
