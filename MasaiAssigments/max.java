package MasaiAssigments;

public class max {
    public static void main(String[] args) {

         String s = "masaiisverygoodinsitute";
    int n = s.length(); // Get the length of the string
    int count=0;

    for (int i = 0; i < n; i++) {
        for (int j = i; j <n; j++) { 
          for(int k=i;k<=j;k++){
            System.out.print(s.charAt(k));
            
          }
          System.out.println();
          
            // System.out.println(s.substring(i, j));
         count++;
        }
         
    }
    System.out.println(count);
}
        
    }

