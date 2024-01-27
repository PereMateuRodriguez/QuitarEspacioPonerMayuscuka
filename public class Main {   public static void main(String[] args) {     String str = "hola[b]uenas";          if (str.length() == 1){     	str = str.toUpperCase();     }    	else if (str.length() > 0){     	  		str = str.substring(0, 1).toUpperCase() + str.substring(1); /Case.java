public class Main {
  public static void main(String[] args) {
    String str = "hola[b]uenas";
    
    if (str.length() == 1){
    	str = str.toUpperCase();
    }
   	else if (str.length() > 0){
    	 
		str = str.substring(0, 1).toUpperCase() + str.substring(1); // J + avatpoint  
        String r1 = " ";
        String r2 = " ";
        String r3 = " ";
        
        String espa = " ";
        String cara = "[";
    for (int i = 0;  i < str.length()-1; i++){
    	if(str.charAt(i) == espa.charAt(0)){
			if(str.charAt(i+1)== espa.charAt(0)){
            	str = str.replaceFirst(" ", "");
                r1 = str.substring(0, i);
                r2 = str.substring(i);
                r3 = r2.substring(0,1).toUpperCase();
                r2 = str.substring(i+2);
                str = r1 + r3 + r2;
            }
            
            else{
                r1 = str.substring(0, i);
                r2 = str.substring(i+1);
                r3 = r2.substring(0,1).toUpperCase();
                r2 = str.substring(i+2);
                str = r1 + r3 + r2;
            }
         	}
            else if(str.charAt(i)== cara.charAt(0)){
            	r1 = str.substring(0, i+1);
                r2 = str.substring(i+1);
                r3 = r2.substring(0,1).toUpperCase();
                r2 = str.substring(i+2);
                str = r1 + r3 + r2;
            }
    }
    System.out.println(str);}
   
  }
}
