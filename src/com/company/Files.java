package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Files {
    public static void main(String[] args) throws IOException {

        File file = new File("fileWrite.txt");
        FileReader fileReader = new FileReader(file);

//        char[] chars = new char[(int)(file.length())];
//        System.out.println(fileReader.read(chars));
//        for (char c : chars) {
//            System.out.println(c);
//        }

        int charUnicodeValue = fileReader.read();
        while(charUnicodeValue != -1) {
            System.out.println((char)charUnicodeValue);
            charUnicodeValue = fileReader.read();
        }



//        File fileSource = new File("C:\\Users\\Developer\\Documents\\Documents");
//        File[] files = fileSource.listFiles();
//        System.out.println("================== Files ===================");
//        Arrays.stream(files).filter(file -> file.isFile()).forEach(file -> System.out.println(file.getName()));
//        System.out.println("================== Directories ===================");
//        Arrays.stream(files).filter(file -> file.isDirectory()).forEach(file -> System.out.println(file.getName()));

//        File javaFile = new File("test.txt");
//        javaFile.createNewFile();
//        boolean isFileRenamed = javaFile.renameTo(new File("renamedTest.txt"));
//        System.out.println(isFileRenamed);
//
//        FileWriter fileWriter = new FileWriter("fileWrite.txt", true);
//        fileWriter.write(97);
//        fileWriter.write('\n');
//        fileWriter.write("I love java");
//        fileWriter.write('\n');
//        char[] chars = {'a', 'e', 'i', 'o', 'u'};
//
//        fileWriter.write(chars);
//        fileWriter.write('\n');
//        fileWriter.flush();
//        fileWriter.close();
    }
}
