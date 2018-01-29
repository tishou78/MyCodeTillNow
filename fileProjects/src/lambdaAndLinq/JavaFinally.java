package lambdaAndLinq;

import java.util.Scanner;

public class JavaFinally {


        public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            int x = Integer.parseInt(sc.nextLine());


            try{

                System.out.println(x + "1");
                System.out.println("2");
            }catch (Exception e){
                System.out.println("3" + e);
                System.out.println("4");
            }finally {
                System.out.println(5);
            }


        }

}
