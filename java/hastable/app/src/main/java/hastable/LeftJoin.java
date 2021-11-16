package hastable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeftJoin {

  public static HashMap<String, String[]> leftJoin(HashMap<String, String> h1, HashMap<String, String> h2) {

    HashMap<String, String[]> result = new HashMap<>();
    ArrayList<String> result2 =new ArrayList<>();

    for (String key : h1.keySet()) {
      String[] s = new String[2];
      s[0] = h1.get(key);
      s[1] = h2.containsKey(key) ? h2.get(key) : null;
      result.put(key,s);
      System.out.println(key+":"+" "+ Arrays.toString(s));


    }
    return result;
  }
  public static void FrequentWord(String array[])
  {
    Map<String,Integer> hshmap = new HashMap<String, Integer>();
    for (String str : array)
    {
      if (hshmap.keySet().contains(str))
        hshmap.put(str, hshmap.get(str) + 1);
      else
        hshmap.put(str, 1);
    }
    String maxStr = "";
    int maxVal = 0;
    for (Map.Entry<String,Integer> entry : hshmap.entrySet())
    {
      String key = entry.getKey();
      Integer count = entry.getValue();
      if (count > maxVal)
      {
        maxVal = count;
        maxStr = key;
      }
      else if (count == maxVal){
        if (key.length() < maxStr.length())
          maxStr = key;
      }
    }
    System.out.println("Most frequent word: "+ maxStr);
    System.out.println("Count: "+ maxVal);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
