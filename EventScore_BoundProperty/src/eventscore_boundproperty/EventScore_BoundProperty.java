/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventscore_boundproperty;

import java.util.Scanner;

/**
 *
 * @author 64050030 Kitipum Nornua
 */
public class EventScore_BoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean source = new LiveScoreBean();
        Listener listener1 = new Listener();
        Listener listener2 = new Listener();
        source.addPropertyChangeListener(listener1);
        source.addPropertyChangeListener(listener2);
        
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter Score ");
            String msg = sc.nextLine();
            if(msg.equals("")){
                break;
            }else{
                source.setSampleProperty(msg);
            }            
        }

    }
    
}
