/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitest;

/**
 *
 * @author TEE FO YO
 */
public class driverMember {
    
    public static void main(String[] args) {
        
        member member1=new member();
        member1.setMemberID("WMD2004776");
        member1.setMemberShipDuration(120);
        member1.setName("Fo Yo");
        member member2=new member("WMD204675","Bung seng",180);
        member2.toString();
        
    }
}