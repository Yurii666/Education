package java_10thEdition.chapter_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        if(args.length != 1){
            System.out.println("usage: ShowFile name_file" );
            return;
        }

        //trying to open a file
        try {
            fin = new FileInputStream(args[0]);
        }catch(FileNotFoundException e) {
            System.out.println("Impossible open a file");
            return;
        }

        //the file is now open and ready to read
        //Then the characters are read until the end of the file sign is encountered.
        try {
            do{
                i = fin.read();
                if(i != -1) System.out.println((char) i);
            }while (i != -1);
        }catch (IOException e){
            System.out.println("Error writing files");
        }

        //close file
        try {
            fin.close();
        }catch (IOException e) {
            System.out.println("Error closing file");
        }
    }
}
