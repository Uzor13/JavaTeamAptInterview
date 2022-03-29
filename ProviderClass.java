import java.util.*;
import java.io.*;

public class ProviderClass {
    public static Dictionary main() throws IOException
    {
        Dictionary provider = new Hashtable();
        File file = new File("providers.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null)  
            {  
                String[] providersArray = line.split(",");
                provider.put(providersArray[1].strip(), providersArray[0]);
            }

        return provider;
    }
}
