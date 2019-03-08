/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;
public class TestUserProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String username;
        String usergenre;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please insert your name ");
        username = input.next();
        
        System.out.println("Please insert your favorite genre");
        System.out.println("Our list of genre are : ");
        System.out.println("Comedy / Drama / Action / Mystery");
        usergenre = input.next();
        
        UserProfile user = new UserProfile(username, usergenre);
        
        System.out.println("User Profile has been created !");
        System.out.println("Your User ID is : " + username);
        System.out.println("Your favorite genre is : " + usergenre);
        
    }
    
}
