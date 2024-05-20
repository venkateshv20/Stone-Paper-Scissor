import java.util.*;
public class Stonepaper {
     //String[] play={"Stone","Paper","Siser"};
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] arr={"Stone","Paper","Siser"};
        System.out.println("1-stone\n 2-paper\n 3-siser");
       System.out.println("enter play1 1to3");
        int play1=scan.nextInt();
         System.out.println("enter play2 1to3");
         int play2=(int)(Math.random()*3+1);
         System.out.println(play2);
        if(arr[play1-1]=="Stone" && arr[play2-1]!="Siser"){
           System.out.println("player 1 is win");
        }
        else if(arr[play1-1]=="Paper" && arr[play2-1]!="Stone"){
           System.out.println("player 1 is win");
        }
        else if(arr[play1-1]=="Siser" && arr[play2-1]!="Paper"){
           System.out.println("player 1 is win");
        }
        else if(arr[play1-1]==arr[play2-1]){
           System.out.println("match draw");
        } 
        else{
            System.out.println("player 2 is win");
        }   
    } 
         
}


