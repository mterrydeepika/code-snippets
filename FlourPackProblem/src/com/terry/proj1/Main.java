package com.terry.proj1;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4)); //big*5 /goal ==0 && big*5>=goal false
        System.out.println(canPack(1,0,5)); //big*5 /goal ==0 && big*5>=goal true
        System.out.println(canPack(0,5,4)); // smallCount>=goal true
        System.out.println(canPack(2,2,11)); //(goal<=((bigCount*5)+smallCount)) true
        System.out.println(canPack(-3,2,12)); //false
        System.out.println(canPack(0,5,5)); //true
        System.out.println(canPack(4,18,19)); //true*/
        System.out.println(canPack(5, 2, 12)); //true


    }

    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        if ((bigCount<0) || (smallCount<0)|| (goal<=0))
            return false;



        if(goal<=((bigCount*5)+smallCount))
{

   if (((bigCount*5)%(goal)==0) && ((bigCount*5)>=(goal))) {
       System.out.println("hi1");
       return true;
   }
   else if(smallCount>=goal) {
       System.out.println("hi2");

       return true;
   }
   else if(smallCount!=0 && smallCount<goal && (bigCount*5)<(goal)) {
       System.out.println("hi3");

       return true;
   }
   else if(((bigCount*5)%(goal)!=0) && (((bigCount-1)*5)+smallCount>=goal)) {
       System.out.println("hi4");
       return true;
   }

}
return false;
    }




}




