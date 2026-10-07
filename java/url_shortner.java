import java.util.*;

public class Main {

    static HashMap<String, String> urlMap = new HashMap<>();
    static HashMap<String, String> SmalltoLarge = new HashMap<>();
    static HashMap<String, String> LargetoSmall = new HashMap<>();
    static int counter = 1;

    public static void main(String[] args) {

        String url = "https://www.google.com";

        String sUrl = process1(url);

        System.out.println(sUrl);
        System.out.println(urlMap.get(sUrl));
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

        String key = UUID.randomUUID()
                .toString()
                .substring(0, 6);

        while (urlMap.containsKey(key)) {
            key = UUID.randomUUID()
                    .toString()
                    .substring(0, 6);
        }

        urlMap.put(key, url);

        return key;
    }

    // Approach 3 - o(1) faster.
    private static String process3(String url)
    {
        if (LargetoSmall.containsKey(url)) {
            return LargetoSmall.get(url);
        }

        String key = UUID.randomUUID()
                .toString()
                .substring(0, 6);

        SmalltoLarge.put(key, url);
        LargetoSmall.put(url, key);

        return key;
    }
}