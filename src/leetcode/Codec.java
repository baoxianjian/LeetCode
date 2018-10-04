package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sun.misc.BASE64Encoder;

public class Codec {
    String domain="https://leetcode.com/";
    Map<Integer, String> map = new HashMap<>();
    int index=0;
    public String encode(String longUrl) {
     map.put(index, longUrl.replaceAll(this.domain, ""));
     return this.domain+index++;
    }
    public String decode(String shortUrl) {
        return this.domain+this.map.get(Integer.parseInt(shortUrl.replaceAll(this.domain, "")));
    }
    
    public static void main(String[] args)
    {
        String url = "https://leetcode.com/problems/design-tinyurl";
        
        Codec c = new Codec();
        String shortUrl = c.encode("https://leetcode.com/problems/design-tinyurl");
        System.out.println(shortUrl);
        
        
        String longUrl = c.decode(shortUrl);
        System.out.println(longUrl);
    }
}
