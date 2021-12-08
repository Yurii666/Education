package java_10thEdition.chapter_13;
//copy file
import java.io.*;

public class CopyFile {
    public static void main(String[] args)throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        //first make sure the names of both files are specified
        if(args.length != 2){
            System.out.println("usage: CopyFile from where to where" );
            return;
        }
        //copy file
        try{
            //try open file
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            }while(i != -1);
        }catch (IOException e) {
            System.out.println("Error from where to where");
        }finally {
            try{
                if(fin != null) fin.close();
            }catch (IOException e2) {
                System.out.println("Error close input file");
            }
            try{
                if(fout != null) fin.close();
            }catch (IOException e2) {
                System.out.println("Error close output file");
            }
        }
    }
}
