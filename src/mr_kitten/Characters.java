/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mr_kitten;

/**
 *
 * @author Noëmie
 */
public class Characters {
    
    private String name;
    private int ennemiHP;
    private int ennemiAD;
    private String talk;
    private String room;
    
    public Characters(String n, int hp, int ad, String t, String r){
        name=n;
        ennemiHP=hp;
        ennemiAD=ad;
        talk=t;
        room=r;
    }
    
    public String getName(){
        return name;
    }
    
    public int getEnnemiHP(){
        return ennemiHP;
    }
    
    public int getEnnemiAD() {
        return ennemiAD;
    }
    public String getTalk() {
        return talk;
    }
    
}
