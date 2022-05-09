package by.academy.lesson15;

import java.io.*;

public class CatTextDemo2 {
    public static void main(String[] args) throws IOException {

//        File f = new File("cat.txt");
//if(!f.exists()){
//    f.createNewFile();
//}
//        System.out.println(f.exists());

        try (OutputStream output = new FileOutputStream("cat2.txt");
                InputStream input = new FileInputStream("cat.txt")) {
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead=input.read(buf))!=-1){
                output.write(buf,0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //            String str = "Васька";
//            for (int i=0;i<str.length();i++){
//                input.(
//            }

    }
}
