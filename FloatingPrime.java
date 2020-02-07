import java.util.*;
public class FloatingPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            float input = sc.nextFloat();
            if(input==0.0){
                break;
            }
            if(input>=1.0 && input<=10.0){
                boolean check = true;
                for(int i=10 ; i<=1000 ; i*=10){
                    check = true;
                    int test = (int)(input*i);
                    for (int j=2 ; j<=(test/2) ; j++){
                        if((test%j)==0){
                            check = false;
                            break;
                        }
                    }
                    if(check){
                        System.out.println("TRUE");   
                        break;
                    }
                }
                if(!check){
                    System.out.println("FALSE");   
                }
            }
            else{
                System.out.println("FALSE");
            }
        }
        sc.close();
    }
}