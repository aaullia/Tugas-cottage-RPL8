/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifdanelse;

import java.util.Scanner;

/**
 *
 * @author mokle
 */
public class bhaktialamcottage {
    public static void main(String[] args) {
        int harga = 0;
        String c;
        String d;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inputkan cottage yang anda mau");
        c = input.next();
        System.out.println("Inputkan hari anda");
        d = input.next();
        
        if(c.equals("duku")) {
            if(d.equals("weekday")) {
                harga = 915000;
            } else if(d.equals("weekend")) {
                harga = 1025000;
            } else {
                harga = 1225000;
            } 
        } else if(c.equals("jeruk")) {
            if(d.equals("weekday")) {
                harga = 915000;
            }
            else if(d.equals("weekend")) {
                harga = 1025000;
            }
            else {
                harga = 1225000;
            }       
    } else if(c.equals("alpukat")) {
        if(d.equals("weekday")) {
            harga = 575000;
        }
        else if(d.equals("weekend")) {
            harga = 695000;
        }
        else {
            harga = 895000;
        }
    } else if(c.equals("jambu air")) {
        if(d.equals("weekday")) {
            harga = 575000;
        }
        else if(d.equals("weekend")) {
            harga = 695000;
        }
        else {
            harga = 895000;
        }
    } else if(c.equals("durian")) {
        if(d.equals("weekday")) {
            harga = 595000;
    }
        else if(d.equals("weekend")) {
            harga = 715000;
    } 
        else {
            harga = 915000;
        }
       } else if(c.equals("melon")) {
           if(d.equals("weekday")) {
               harga = 595000;
           }
           else if(d.equals("weekend")) {
               harga = 715000;
           }
           else {
               harga = 915000;
           }
       } else if(c.equals("belimbing")) {
           if(d.equals("weekday")) {
               harga = 495000;
           }
           else if(d.equals("weekend")) {
               harga = 575000;
           }
           else {
               harga = 755000;
           }
       } else if(c.equals("mangga")) {
           if(d.equals("weekday")) {
               harga = 495000;
           }
           else if(d.equals("weekend")) {
               harga = 575000;
           }
           else {
               harga = 755000;
           }
       } else if(c.equals("kedondong")) {
           if(d.equals("weekday")) {
               harga = 495000;
           }
           else if(d.equals("weekend")) {
               harga = 575000;
           }
           else {
               harga = 755000;
           }
       } else if(c.equals("barrack")) {
           if(d.equals("weekend")) {
               harga = 25000;
           }
           else if(d.equals("weekday")) {
               harga = 25000;
           }
           else {
               harga = 25000;
           }
       }
         System.out.println("harga cottage " + c + " di hari " + d + " adalah : " +harga);
   }
}
