import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Time {
    public static void main(String[] args){
        Time time = new Time();
        int h = time.getHours();
        int m = time.getMinSec();
        int s = time.getMinSec();
        int t = time.inputTimeinHMS(h,m,s);
    }
    private int getHours(){
        System.out.println("Enter the time to be converted: ");
        Scanner sc = new Scanner(System.in);
        int hours;
        do {
            hours = sc.nextInt();
        } while (hours > 0 && hours > 24);
        return hours;
    }
    private int getMinSec(){
        int x;
        Scanner sc = new Scanner(System.in);
        do {
            x = sc.nextInt();
        } while (x > 0 && x > 60);
        return x;
    }

    private int inputTimeinHMS(int h,int m, int s){
        return (((60 * h) + m) * 60) + s;
    }
    private void getTime(){}

    
}
