import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        String str=n.nextLine();
        switch(str)
        {
            case "red":
                System.out.println("Stop");
                break;
            case "green":
                System.out.println("Go");
                break;
            case "yellow":
                System.out.println("Get Ready");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
