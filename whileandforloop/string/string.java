package whileandforloop.string;

public class string {
    public static void main(String[] args) {
        String password = "abc1234"; 

        if(password.length() > 6 ){
            System.out.print("Vaild password");
        }
        else {
            System.out.println("Invalid password : must more than 6");
        }
        // op => Vaild password 

System.out.println();
//-----------------------------------------------------------
        String name = "Masai School";

        for(int i=0; i<name.length() ; i++){
            System.out.println(name.charAt(i));
      
        }

        //-----------------------------------------------------------

        String name1 = "NIkhil";

        for(int i=name1.length()-1; i>= 0 ; i--){
            System.out.print(name1.charAt(i));
        }
 System.out.println();
//----------------------------------------------

        String m = "Masai School";
        String mnew ="";
        
        for(int i=0; i <m.length(); i++){
            mnew = mnew + m.charAt(i);
        }
        System.out.println(mnew);

//----------------------------------------------------------
//Q print and count the vovel in given string 

        




    }
}
