import java.util.*;
public class SortingAcronym {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = Integer.parseInt(sc.nextLine());
        String output[] = new String[line];
        for (int i = 0 ; i<line ; i++){
            String input = sc.nextLine();
            String[] check = input.split(" ");
            String choose = "";
            for(int j = 0 ; j<check.length ; j++){
                String x = check[j];
                if((x.charAt(0))>='A' && (x.charAt(0))<='Z'){
                choose+=(x.charAt(0));
                }
            }
            output[i] = choose;
        }
        for (int i=0 ; i<(output.length-1) ; i++){
            for (int j=(i+1) ; j<output.length ; j++) {
                String test1 = output[i];
                String test2 = output[j];
                if (test1.length()<test2.length()){
                    String temp = output[j];
                    output[j] = output[i];
                    output[i] = temp;
                }
                else if(test1.length()==test2.length()){
                    if(test1.compareTo(test2)>0){
                        String temp = output[i];
                        output[i] = output[j];
                        output[j] = temp;
                    }
                }
            }
        }
        for (int k=0  ; k <output.length ; k++){
            System.out.println(output[k]);
        }
        sc.close();
    }
}