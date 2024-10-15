class Tester {
    
   public static int[] findLeapYears(int year){
      
       //Implement your code here and change the return value accordingly
       int leapyear[] = new int[15],i,j=0,cnt=0;
       i=0;
       
       while(true)
       {
           if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )
           {
               leapyear[j]=year;
               cnt++;
               j++;
           }
           
           if(cnt == 15)
           {
              break;
           }
           
           i++;
           year++;
       }
       
        return leapyear;
   }
    
   public static void main(String[] args) {
       int year = 2000;
	   int[] leapYears;
	   leapYears=findLeapYears(year);
	   for ( int index = 0; index<leapYears.length; index++ ) {
	       System.out.println(leapYears[index]);
	   }
    }
}