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
    		result = translatedEngTen(futaketa, ten);
    	}
    	if(n/10 == 0) result = translatedEngOne(n%10);
    	return result;
    }
    //十の位を処理するメソッド
    static String translatedEngTen(int futaketa, int ten){
    	String result = "";
    	String resultTen = "";
    	String resultOne = "";
    	if(futaketa==10) {
    		resultTen = "ten";
    	} else if(futaketa==11) {
    		result = "eleven";
    	} else if(futaketa==12) {
    		result = "twelve";
    	} else if(futaketa==13) {
    		result = "thirteen";
    	} else if(futaketa==14) {
    		result = "fourteen";
    	} else if(futaketa==15) {
    		result = "fifteen";
    	} else if(futaketa==16) {
    		result = "sixteen";
    	} else if(futaketa==17) {
    		result = "seventeen";
    	} else if(futaketa==18) {
    		result = "eighteen";
    	} else if(futaketa==19) {
    		result = "nineteen";
    	}
    	else if(ten==2) resultTen = "twenty";
    	else if(ten==3) resultTen = "thirty";
    	else if(ten==4) resultTen = "forty";
    	else if(ten==5) resultTen = "fifty";
    	else if(ten==6) resultTen = "sixty";
    	else if(ten==7) resultTen = "seventy";
    	else if(ten==8) resultTen = "eighty";
    	else resultTen = "ninety";
    	//一桁の数
    	if(futaketa%10==0) result = resultTen;
    	else{
    		resultOne = translatedEngOne(futaketa % 10);
    		result = resultTen + " " + resultOne;
    	}
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
