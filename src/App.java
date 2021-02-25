import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;

public class App {
 
    public static void main(String[] args) throws Exception {
        
        Scanner completed = new Scanner(Paths.get("compeltedquests.csv"));
        Scanner wiki = new Scanner(Paths.get("wikiquests.csv"));
        Scanner full = new Scanner(Paths.get("fullquestsheet.csv"));
        Scanner scan = new Scanner(System.in);
        System.out.print("level?");
        int level = Integer.valueOf(scan.nextLine());
        String completedRaw = "hi";
        while (completed.hasNextLine()) {
            completedRaw=(completed.nextLine());
            
        }
        String[] strParts = completedRaw.split(",");

        ArrayList<String> completedQuests = 
        new ArrayList<String>( Arrays.asList(strParts) );

        /*System.out.println("Print Arraylist using for loop");
        for(int i=0; i < completedQuests.size(); i++){
            System.out.println( completedQuests.get(i) );
    }*/

//not in use
/*
    String wikiString = "hi";
        while (wiki.hasNextLine()) {
            wikiString=(wiki.nextLine());
            
        }
        String[] strParts2 = wikiString.split(",");

        ArrayList<String> wikiArray = 
        new ArrayList<String>( Arrays.asList(strParts2) );

        /*System.out.println("Print Arraylist using for loop2");
        for(int i=0; i < wikiArray.size(); i++){
            System.out.println( wikiArray.get(i) );
    }*/


    while(full.hasNextLine()){
        String wikiString = full.nextLine();
        String[] strParts2 = wikiString.split(",");
    }

    ArrayList<String> wikiArray = 
        new ArrayList<String>( Arrays.asList(strParts2) );

    ArrayList<String> undoneQuests = new ArrayList<>();

    for(int i = 0; i < wikiArray.size(); i++){
        if(!completedQuests.contains(wikiArray.get(i))){
            if(Integer.valueOf(wikiArray.get(i+1)) >= level){
            undoneQuests.add(wikiArray.get(i)+","+ wikiArray.get(i));}

        }

       

    }

    System.out.println("Print Arraylist using for loop3");
    for(int i=0; i < undoneQuests.size(); i++){
        System.out.println( undoneQuests.get(i) );
}
}

}
