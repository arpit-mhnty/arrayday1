import java.util.*;
public class findminmaxinanarray {
    public static void main(String aegsp[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[3];
        for(int i=0;i<3;i++){
            ar[i]=sc.nextInt();
        }
//        int max=ar[0];
//        int min=ar[0];
//        for(int i=0;i<3;i++){
//            if(max<ar[i]){
//                max=ar[i];
//            }
//            if(min>ar[i]){
//                min=ar[i];
//            }
//        }
        Arrays.sort(ar);
        System.out.println(ar[0]+""+ar[2]);
    }
}
