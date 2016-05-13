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
    	if(n/10 == 0) result = translatedEngOne(n%10);
    	else if(n/100 == 0){
    		int futaketa = n % 100;
    		int ten = futaketa / 10;
    		result = translatedEngTen(futaketa, ten);
    	}else if(n/1000 == 0){
    		int sanketa = n % 1000;
    		int hundred = sanketa/100;
    		result = translatedEngHundred(sanketa, hundred);
    	}else if(n/10000 == 0){
    		int yonketa = n % 10000;
    		int thousand = yonketa/1000;
    		result = translatedEngThousand(yonketa, thousand);
    	}
    	return result;
    }
    //四桁の数を処理するメソッド
    static String translatedEngThousand(int yonketa, int thousand){
    	String result = "";
    	String resultThousand = "";
    	String resultHundred = "";
    	resultThousand = translatedEngOne(thousand) + " thousand";
    	int sanketa = yonketa % 1000;
    	int hundred = sanketa / 100;
    	if(sanketa == 0) result = resultThousand;
    	else{
    		resultHundred = translatedEngHundred(sanketa, hundred);
    		result = resultThousand + " " + resultHundred;
    	}
    	return result;
    }
    //三桁の数を処理するメソッド
    static String translatedEngHundred(int sanketa, int hundred){
    	String result = "";
    	String resultHundred = "";
    	String resultTen = "";
    	String resultOne= "";

    	if(hundred == 0){
    		resultHundred = "";
    	} else {
    		resultHundred = translatedEngOne(hundred) + " hundred";
    	}
    	
    	int futaketa = sanketa % 100;
    	if(futaketa == 0) result = resultHundred;
    	else{
    		int ten = futaketa/10;
    		if(ten == 0){
    			resultOne = translatedEngOne(futaketa % 10);
    			result = resultHundred + " " + resultOne;
    		}else{
    			resultTen = translatedEngTen(futaketa, ten);
    			if(resultTen.equals("0")){
        			result = resultHundred;
        		}else{
        			result = resultHundred + " " + resultTen;
        		}
    			result = resultHundred + " " + resultTen;
    		}
    	}
    	return result;
    }

    //二桁の数を処理するメソッド
    static String translatedEngTen(int futaketa, int ten){
    	String result = "";
    	String resultTen = "";
    	String resultOne = "";
    	if(futaketa==10) {
    		resultTen = "ten";
    	} else if(futaketa==11) {
    		resultTen = "eleven";
    	} else if(futaketa==12) {
    		resultTen = "twelve";
    	} else if(futaketa==13) {
    		resultTen = "thirteen";
    	} else if(futaketa==14) {
    		resultTen = "fourteen";
    	} else if(futaketa==15) {
    		resultTen = "fifteen";
    	} else if(futaketa==16) {
    		resultTen = "sixteen";
    	} else if(futaketa==17) {
    		resultTen = "seventeen";
    	} else if(futaketa==18) {
    		resultTen = "eighteen";
    	} else if(futaketa==19) {
    		resultTen = "nineteen";
    	}
    	else if(ten==2) resultTen = "twenty";
    	else if(ten==3) resultTen = "thirty";
    	else if(ten==4) resultTen = "forty";
    	else if(ten==5) resultTen = "fifty";
    	else if(ten==6) resultTen = "sixty";
    	else if(ten==7) resultTen = "seventy";
    	else if(ten==8) resultTen = "eighty";
    	else resultTen = "ninety";
    	//一の位
    	//10,20,30,40,...
    	if(futaketa%10==0 || ten==1) result = resultTen;
    	else{//futaketa%10!=0
    		resultOne = translatedEngOne(futaketa % 10);
    		if(resultOne.equals("0")){
    			result = resultTen;
    		}else{
    			result = resultTen + " " + resultOne;
    		}
    	}
    	return result;
    }
    
    //一桁の数を処理するメソッド
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
