import java.util.Scanner;

public class week2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month and day: ");
        int m = in.nextInt();
        int d = in.nextInt();
        if (checkDate(m, d))
            System.out.println("It's a correct date.");
        else
            System.out.println("It's NOT a correct date.");
    }
    private static boolean checkDate(int m, int d){
        if(d < 0 || m <= 0) return false;
        boolean returnValue = false;
        switch(m){
            case 1:
                if(d<=31)returnValue=true; ;break;
            case 2:
                if(d<=29)returnValue=true; ;break;
            case 3:
                if(d<=31)returnValue=true; ;break;
            case 4:
                if(d<=30)returnValue=true; ;break;
            case 5:
                if(d<=31)returnValue=true; ;break;
            case 6:
                if(d<=30)returnValue=true; ;break;
            case 7:
                if(d<=31)returnValue=true; ;break;
            case 8:
                if(d<=31)returnValue=true; ;break;
            case 9:
                if(d<=30)returnValue=true; ;break;
            case 10:
                if(d<=31)returnValue=true; ;break;
            case 11:
                if(d<=30)returnValue=true; ;break;
            case 12:
                if(d<=31)returnValue=true; ;break;
            default: return false;
        }
        return returnValue;
    }
}
