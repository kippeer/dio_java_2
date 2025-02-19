package com.aulas.demo.interfaces;

public class Main {

    public static void main(String[] args){
        var musicPlayer = new MusicPlayer() {
            @Override
            public void playMusic() {
                System.out.println("alouu");
            }

            @Override
            public void pauseMusic() {

            }

            @Override
            public void stopMusic() {

            }
        };
        musicPlayer.playMusic();
    }
}