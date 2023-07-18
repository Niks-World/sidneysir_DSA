public class hello {
    public static void main(String[] args) {
        // print hello 10 times
        System.out.println("Hello Nik"); //Hello Nik
        System.out.println("Hello Nik"); //Hello Nik
        System.out.println("Hello Nik");
        System.out.println("Hello Nik");       
        System.out.println("Hello Nik");        
        System.out.println("Hello Nik");       
        System.out.println("Hello Nik");
// Print using FOR loop
        for(int i=1; i<=10;i++){
          System.out.println("Hello Nik");
        }
// op => Hllo NIk is 10 time
System.out.println("---------");
// print using while loop
        int count =1;
        while(count <=10){
            System.out.println("Hello Nik");
            count =count +1;
        }

// running 100 m race can only take step 5m at a time        
        int pos=0;
        while( pos <= 100){
            pos = pos +5 ;
            System.out.println("Reached position " + pos);
        }
/*Reached position 5  output 
Reached position 10
Reached position 15
Reached position 20  untill 100 */














    }
}
