import java.util.*;

public class Main {

    static HashMap<String, String> urlMap = new HashMap<>();
    static int counter = 1;

    public static void main(String[] args) {

        String url = "https://www.google.com";

        String shortUrl = process1(url);

        System.out.println("Short URL: " + shortUrl);
        System.out.println("Original URL: " + urlMap.get(shortUrl));
    }

    // Approach 1 - o(1)
    private static String process1(String url)
    {
        String key = "url" + counter++;

        urlMap.put(key, url);

        return key;
    }

    // Approach 2 - o(1) average
    private static String process2(String url)
    {
        String key;

        do {
            key = UUID.randomUUID()
                    .toString()
                    .substring(0, 6);
        } while (urlMap.containsKey(key));

        urlMap.put(key, url);

        return key;
    }

    // Approach 3 - o(1) faster.
    private static String process3(String url)
    {
        if (longToShort.containsKey(url)) {
            return longToShort.get(url);
        }

        String key = UUID.randomUUID()
                .toString()
                .substring(0, 6);

        shortToLong.put(key, url);
        longToShort.put(url, key);

        return key;
    }
}