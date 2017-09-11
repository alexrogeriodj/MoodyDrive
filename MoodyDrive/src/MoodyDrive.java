/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Rogério
 */
public class MoodyDrive {
    public final static void main(String[] args) {
        SadObject sadObject = new SadObject();
        HappyObject happyObject = new HappyObject();
        
        sadObject.queryMood();
        sadObject.cry();
        happyObject.queryMood();
        happyObject.laugh();
    }
}
