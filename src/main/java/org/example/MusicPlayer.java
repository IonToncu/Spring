package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    public List<Music> musicList = new ArrayList<>();

    MusicPlayer(List<Music> musicList){
        musicList.forEach(x -> musicList.add(x));
    }
    MusicPlayer(){
        System.out.println("work");
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "musicList=" + musicList +
                '}';
    }
}
