package java24june;

public class elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a=78;
           if((a>0) && (a<100))
            System.out.println("the number is 2 digit");
           else if((a>100) && (a<1000))
           {
             System.out.println("the number is 3 digit");
             
           }
           else if((a>1000) && (a>10000))
           {
        	   System.out.println("this is 4 digit number");
           }
           else
           {
        	   System.out.println("this is more than 5 digit ");
           }
           
        	   
	}

}
