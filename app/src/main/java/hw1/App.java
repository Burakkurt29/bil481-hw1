/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hw1;

import java.util.ArrayList;

public class App {
    /**
     * 
     * @param sayiUzayi sayi arrayi bu sayilar gruplanacak
     * @param tane sayiUzayina eklenecek yeni sayilarin sayisi
     * @param kucuk gruplandirmada kullanilacak kucuk sayi
     * @param buyuk gruplandirmada kullanilacak buyuk sayi
     */

    public String getGreeting(){
        return "Hello World";
    }


    public static int[] groupByTwoInt(ArrayList<Integer> sayiUzayi,int tane,int kucuk,int buyuk) {
        ArrayList<Integer> grup=new ArrayList<Integer>();
        
        if(kucuk>buyuk){
            System.out.println("kucuk sayi buyuk sayidan buyuk olamaz");
            return null;
        }

        if(sayiUzayi.size()==0){
            System.out.println("sayiUzayi bos olamaz");
            return null;
        }
        
        if(tane<0){
            System.out.println("eklenecek sayi negatif olamaz");
            return null;
        }
        


        for(int i=0;i<tane-1;i++){
            sayiUzayi.add((int)(Math.random()*100));
        }
        
        for(int sayi : sayiUzayi){
            
            if(sayi>kucuk && sayi<buyuk){
                grup.add(sayi);
            }

        }

        int[] arr=new int[grup.size()];
        grup.sort(null);
        
        for(int i=0;i<grup.size();i++)
            arr[i]=grup.get(i);
        
            

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
