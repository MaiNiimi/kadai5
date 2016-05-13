package kadai5;
import java.util.Scanner;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }
    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String result = translatedEng(n);
        return result;
    }
    //何桁かを判断するメソッド
    static String translatedEng(int n){
    	String result = "";
    	if(n/100 == 0){
    		int futaketa = n % 100;
    		int ten = futaketa / 10;
    		result = translatedEngTen(ten);
    	}
    	if(n/10 == 0) result = translatedEngOne(n%10);
    	return result;
    }
    //十の位を処理するメソッド
    static String translatedEngTen(int ten){
    	String result = "";
    	if(ten==0) result = "";
    	else if(ten==1) result = "";
    	else if(ten==2) result = "twenty";
    	else if(ten==3) result = "thirty";
    	else if(ten==4) result = "forty";
    	else if(ten==5) result = "fifty";
    	else if(ten==6) result = "sixty";
    	else if(ten==7) result = "seventy";
    	else if(ten==8) result = "eighty";
    	else result = "ninety";
    	return result;
    }
    //一の位を処理するメソッド
    static String translatedEngOne(int one){
    	String result = "";
    	if(one==0) result = "zero";
    	else if(one==1) result = "one";
    	else if(one==2) result = "two";
    	else if(one==3) result = "three";
    	else if(one==4) result = "four";
    	else if(one==5) result = "five";
    	else if(one==6) result = "six";
    	else if(one==7) result = "seven";
    	else if(one==8) result = "eight";
    	else result = "nine";
    	return result;
    }
    
    
    
}
