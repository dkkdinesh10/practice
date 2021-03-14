package problems;

import java.io.*;

public class SerilizationDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       StringCompression sc=new StringCompression();

       String filename="C:\\Dinesh\\MyProject\\test.txt";


        FileOutputStream fos=new FileOutputStream(filename);
        ObjectOutputStream os=new ObjectOutputStream(fos);
        os.writeObject(sc);
        System.out.println("Done--------------------");


        FileInputStream fis=new FileInputStream(filename);
        ObjectInputStream oss=new ObjectInputStream(fis);
        StringCompression sadefe=(StringCompression)oss.readObject();
        sadefe.getI();
    }
}
