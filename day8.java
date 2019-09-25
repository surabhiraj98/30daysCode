import java.util.*;
import java.io.*;
 
class Solution{
    public static void main(String []argh){
        Map<String, Integer> map = new HashMap<String, Integer>();
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        for(int i = 0; i < s; i++){
            String name = scan.next();
            int phone = scan.nextInt();
            map.put(name, phone);
        }
        while(scan.hasNext()){
            String str = scan.next();
            
            if(map.containsKey(str))
                {
                System.out.println(str+"="+map.get(str));
            } else {
                System.out.println("Not found");
            }
        }
        scan.close();
    }
}
