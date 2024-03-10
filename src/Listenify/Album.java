package Listenify;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumName;
    private String artistName;
    private ArrayList<Song> songList;

    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songList = new ArrayList<>();
    }

    public Album(String albumName, String artistName, ArrayList<Song> songList) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songList = songList;
    }

    public boolean findSong(String title){
        for(Song s : songList){
            if(s.getSongTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    public String addNewSong(String title, double duration){
        if(findSong(title) == false){
            Song newSong = new Song(title,duration);
            songList.add(newSong);
            return "The new song has been added to the album list";
        }else{
            return "The song is already present in the album List";
        }
    }

    public void addToPlayList(List<Song> playList,int songNo){
        int idx = songNo-1;
        if(idx < songList.size()){
            Song song = songList.get(idx);
            playList.add(song);
        }
    }

    public String addToPlayList(List<Song> playList,String title){
        for(Song song : songList){
            if(song.getSongTitle().equals(title)){
                playList.add(song);
                return "Song added to the playList successfully";
            }
        }
        return "No song Found";
    }
}
