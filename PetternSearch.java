import java.util.*;
public class PetternSearch {
    public static void main(String[] args) {
        String s="geeksforgeeks";
        String s2 = "geeks";
        int pos = s.indexOf(s2);
        while(pos>=0){
            System.out.println("pos "+pos);
            pos =  s.indexOf(s2,pos+1);
        }
    }
}
