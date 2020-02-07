import java.util.*;
public class DigitHangman {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] question = input.split(" ");
        String[] output = new String[question.length];
        String[] fail = new String[5];
        int cfail = 0;
        int count = 0;
        for(int i=0 ; i<question.length ; i++){
            output[i] = "_";
        }
        for(int i=0 ; i<(output.length-1) ; i++){
            System.out.print(output[i]+" ");
        }
        System.out.println(output[output.length-1]);
        for(int i = 1 ; i<=5 ; i++){
            String check = sc.nextLine();
            boolean result = false;
            for(int j = 0 ; j<question.length ; j++){
                if(check.compareTo(question[j])==0){
                    output[j]= check;
                    result=true;
                    count+=1;
                }
            }
            if(!result){
                fail[cfail++] = check;
            }
            for(int j=0 ; j<(output.length-1) ; j++){
                System.out.print(output[j]+" ");
            }
            if(fail[0]!=null){
                System.out.print(output[output.length-1]+" ");
                for(int j=0 ; j<(fail.length-1) ; j++){
                    if(fail[j+1]==null){
                        System.out.println(fail[j]);
                        break;
                    }
                    else if(j==(fail.length-2) && (fail[j+1]!=null)){
                        System.out.println(fail[j]+" "+fail[j+1]);
                    }
                    else {
                        System.out.print(fail[j]+" ");
                    }
                }
            }
            else{
                System.out.println(output[output.length-1]);
            }
        }
        System.out.println(count);
        sc.close();
    }
}