package Listenify;

import java.util.ArrayList;

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


    }
}
