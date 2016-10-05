import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> list = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++)
        {
            String a = list.remove(list.size() - 1);
            list.add(0, a);
        }
        for (String v : list)
        {
            System.out.println(v);
        }
    }
}
