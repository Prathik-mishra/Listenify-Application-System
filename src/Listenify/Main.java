package Listenify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Album a1 = new Album("Moonchild Era","Diljit Dosanjh");
        a1.addNewSong("Champagne",3.02);
        a1.addNewSong("Lover",4.22);
        a1.addNewSong("Vibe",3.42);
        a1.addNewSong("Hoops",2.21);

        Album a2 = new Album("Arijit Songs","Arijit Singh");
        a2.addNewSong("Apna Bana Le", 3.4);
        a2.addNewSong("Agar Tum Saath ho",5.32);
        a2.addNewSong("Chaleya",5.34);
        a2.addNewSong("Heriye",3.33);
        a2.addNewSong("Channa Mereya",7.54);
        a2.addNewSong("Khairiyat",3.34);

        ArrayList<Song> playList = new ArrayList<>();

        a1.addToPlayList(playList,1);
        a1.addToPlayList(playList,3);

        a2.addToPlayList(playList,"Apna Bana Le");
        a2.addToPlayList(playList,"Heriye");
        a2.addToPlayList(playList,"Channa Mereya");


        printMenu();

        int currIdx = 0;

        System.out.println("Now Playing"+playList.get(currIdx).toString());

        playPlayList(playList);
    }
    public static void playPlayList(ArrayList<Song> playList){
        System.out.println("Enter your choice ");
        Scanner sc = new Scanner(System.in);


        int currIdx = 0;

        boolean quit = false;

        while(quit == false){
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    currIdx += 1;
                    if(currIdx % playList.size() == 0)
                        currIdx = 0;
                    System.out.println("Now Playing"+playList.get(currIdx).toString());
                    break;
                case 2:
                    currIdx -= 1;
                    if(currIdx == -1){
                        currIdx = 0;
                    }
                    System.out.println("Now Playing"+playList.get(currIdx).toString());
                    break;
                case 3:
                    System.out.println("Now Playing"+playList.get(currIdx).toString());
                    break;
                case 4:
                    Collections.shuffle(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    printPlayList(playList);
                    break;
                case 7:
                   playList.remove(currIdx);
                    System.out.println("The current Song is removed from playList");
                    break;
                case 8:
                    quit = true;
                    break;
            }
        }
    }

    public static void printPlayList(ArrayList<Song> playList){
        for(Song song : playList){
            System.out.println(song.toString());
        }
    }
    public static void printMenu(){
        System.out.println("<<<--------------------->>>");
        System.out.println("1. Play the next Song");
        System.out.println("2. Play the previous Song");
        System.out.println("3. Repeat this Song");
        System.out.println("4. Shuffle the playList");
        System.out.println("5. Print the menu !!");
        System.out.println("6. Print PlayList");
        System.out.println("7. Delete the current Song");
        System.out.println("8. Exit the system");
        System.out.println("<<<--------------------->>>");
    }
}
