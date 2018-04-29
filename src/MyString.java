import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

public class MyString {

    char[] value = "srujan".toCharArray();
    int hash;
    public int myHashCode()
    {
        int h = hash;
        if(hash !=0) {
            return hash;
        }
        else
        {
            for(int i =0; i<value.length;i++)
            {
                h = h*31 + value[i];
            }
            hash =h;
        }
        return hash;
    }
    public static void main(String[] args) {


    }

    private static boolean equal(String str, String str2) {
        char[] v1 = str.toCharArray();
        char[] v2 = str2.toCharArray();

        if(str == str2)
        {
            return true;
        }
        else if(!(str.getClass().equals(str2.getClass())))
        {
            return false;
        }
        else if (v1.length == v2.length)
        {
            int count = v1.length;
            while(count-- >=0)
            {
                if(v1[count] != v2[count])
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
