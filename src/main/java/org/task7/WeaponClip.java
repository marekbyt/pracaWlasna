package org.task7;

import java.util.Stack;

public class WeaponClip {
    private final Stack<String> weaponClip = new Stack<>();

    private final int clipCapacity;

    public WeaponClip(int clipCapacity) {
        this.clipCapacity = clipCapacity;
    }
     public void loadBullet(String bullet){
        if(clipCapacity == weaponClip.size()){
            throw new IllegalArgumentException("Clip is fill");

        }
        weaponClip.push(bullet);

     }
     public boolean isLoaded (){
        return weaponClip.size() >= 1;

     }
     public void shot(){
        if (!isLoaded()) {
            System.out.println("Clip is empty");
        } else {
            System.out.println(weaponClip.pop());
        }
     }
}

