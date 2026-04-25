package com.thinksworks.device.external;

import com.thinksworks.device.functional.Camera;
import com.thinksworks.device.functional.Gps;
import com.thinksworks.device.functional.MusicPlayer;

public class SmartPhone implements Camera, MusicPlayer, Gps {
    @Override
    public void clickPhoto() {
        System.out.println("SmartPhone Camera");
    }

    @Override
    public void playMusic() {
        System.out.println("SmartPhone PlayMusic");
    }

    @Override
    public void navigate() {
        System.out.println("SmartPhone Gps");
    }
}
