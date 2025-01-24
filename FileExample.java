package practice;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception{
        File dir = new File("/Users/leejaegwan/IdeaProjects/java-start/src/practice/images");
        File file1 = new File("/Users/leejaegwan/IdeaProjects/java-start/src/practice");
        File file2 = new File("/Users/leejaegwan/IdeaProjects/java-start/src/practice");
        File file3 = new File("/Users/leejaegwan/IdeaProjects/java-start/src/practice");

        if(dir.exists() == false) {dir.mkdirs();}
        if(file1.exists() == false) {file1.createNewFile();}
        if(file2.exists() == false) {file1.createNewFile();}
        if(file3.exists() == false) {file1.createNewFile();}

        File temp = new File("/Users/leejaegwan/IdeaProjects/java-start/src/practice");
        File[] contents = temp.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for(File file : contents){
            System.out.printf("%-25s",sdf.format(new Date(file.lastModified())));
            if(file.isDirectory()){
                System.out.printf("%-10s%-20s","<DIR>",file.getName());
            } else {
                System.out.printf("%-10s%-20s",file.length(),file.getName());
            }
            System.out.println();
        }
    }
}
