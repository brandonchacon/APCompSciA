public class test{

	private char ch;

    public static void main(String args[]){
	char ch2 ='A';
	int a = ch2;//65
	int randomChar = 565;
	char ch3 = (char)randomChar;
	System.out.println(ch3);

System.out.println("everything else");



       
            for(int l = 35; l < 65; l++){

                char c = (char)l;
                System.out.println(c);
            }

            for(char l = '+'; l < '='; l++){

                int i = l;
                System.out.println(i);
            }

            String word = "tacocat";
            String reverse = "";
            int lastChar = word.length()-1;
            String msg = "";
            while(lastChar >=lastChar/2){
                if(word.charAt(lastChar) != word.charAt(word.length()-1-lastChar)){
                    msg = "NO!";
                    break;
                }else{
                    msg = "Palindrome!";
                }
                lastChar--;
            }
            System.out.println(msg);
/*
int max = (int)Math.pow(2, 16);

	    for(int l = 100; l < max;l++){
		char c = (char)l;
		System.out.print(c);

		}
*/

String w = "Code is Cool!";
String lc = "";
char chart = 0;

for(int c = 0; c < w.length(); c++){
	if(w.charAt(c)>=65 && w.charAt(c) <= 95){
		chart = (char)(w.charAt(c) + 32);
	}else{
		chart = w.charAt(c);
	}

	lc+=chart;

}
System.out.println(lc);

String result = "";

for(int c = 0; c < w.length(); c++){
	int n = w.charAt(c);

	result += n + " ";
}

System.out.println(result);

    }
}
