import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStreams12 {
    public static void main(String[] args) throws IOException {
        int a=10;
        int b=20;
        int c=a+b;
        char d[]={'d','e','b'};
       FileOutputStream fos=new FileOutputStream("abc",true);
       fos.write(d[0]);
        fos.write(c);
        fos.write(100);
        fos.close();

    }
}
