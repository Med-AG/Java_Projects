package str_test;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Str_test {
    
    public static void main(String[] args) throws IOException {
        
        String str = "5 3";
        String[] split = str.split(" ");
        int sum = 0;
        for (int i = 0; i < split.length; i++) {
            sum += Integer.parseInt(split[i]);
            
            
        }
        System.out.println(sum);
    }
    
}
