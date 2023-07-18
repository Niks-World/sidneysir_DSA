public class forloop {
    public static void main(String[] args) {
            for(int count=1; count<= 10; count++){ //Q1 print hello 10 time
                System.out.println("Hello");
    }

        for(int i=2; i<=100; i=i*2){ // print power of 2 <= 100 (2*2=4*4=8*8=16*16=32*32=64*64=128 stop 100 se bada hai)
            System.out.println(i);
        }


        for(int r=1; r<=4; r++){        //Q3 print  1 2 3 4 5 in 4 row 
            for(int c=1; c<=5; c++){
                System.out.print(c+" ");
            };
              System.out.println();

        };


     for(int r=1; r<=5; r++){   //Q4 see the out put 
        for(int m=1; m<=r; m++){
            System.out.print(m+" ");
        }
        System.out.println();
     }
     /* 1   this will be the output 
        1 2 
        1 2 3 
        1 2 3 4 
        1 2 3 4 5  */


      int count=1;
      for (int r=1; r<=5; r++){
         for(int c=1; c<=5; c++){
             System.out.print(count+" ");
                   count++;
   
           }
          System.out.println(); 
         }
/* 1 2 3 4 5   printing for 1 to 25 
6 7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 
 */
int add=2;
for(int i=1; i<=5; i++){
   for(int j=1; j<=5;j++){
     System.out.print(add+" ");
       add+=2;

   }
  System.out.println();

}
/* printing the out put by incrment by 2 each time 
  2 4 6 8 10 
12 14 16 18 20 
22 24 26 28 30 
32 34 36 38 40 
42 44 46 48 50 
 */

         

    }

}
