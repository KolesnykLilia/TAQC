package com.company;
import java.util.Arrays;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть число n: ");
        //а)
        int n = scan.nextInt();
        int n1 = n;
        int sguare = n * n;
        String s = Integer.toString(sguare);
        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = sguare % 10;
            sguare /= 10;
        }
        System.out.println(Arrays.toString(arr));
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 3) temp++;
        }
        if (temp == 0)
            System.out.println("Не містить числа 3!");
        else
            System.out.println("Містить число 3!");
        //б)
        s = Integer.toString(n);
        String s1 = s.substring(s.length()-1);
        for (int i = s.length() - 2; i >= 0; i--){
            s1 = s1.concat(s.substring(i, i+1));
        }
        System.out.println("Зворотнє число: " + s1);

        //в)
        String result = s.substring(s.length()-1);
        for (int i = s.length() - 2; i >= 0; i--){
            result = result.concat(s.substring(i, i+1));
        }
        n = Integer.parseInt(result);
        System.out.println("Зміна першої цифри на останню: " + n);
        //г)
        String y = "1" + (n) + "1";
        System.out.print("Додавання одиниці: " + y);

    }


}
