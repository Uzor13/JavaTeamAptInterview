import java.util.*;
import java.io.*;

public class JavaClass
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("numbers.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        Dictionary providers = ProviderClass.main();
        Hashtable<String, Integer> report = new Hashtable<String, Integer>();
         while((line=br.readLine())!=null)  {
            String prefix = line.substring(0, 4);
            if (prefix.equals("0702")){
                prefix = line.substring(0, 5);
            }
            String provider = (String) providers.get(prefix);
            if (report.containsKey(provider)){
                report.put(provider, report.get(provider) + 1);
            }else{
                report.put(provider, 1);
            }
        }

        System.out.println(report);
    }   
}
