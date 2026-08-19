package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//q1.============================================================================================

        Scanner scanner = new Scanner(System.in);
  try {
      System.out.print("please enter the first number :");
      int first_number = scanner.nextInt();

      System.out.print("please enter the second number :");
      int second_number = scanner.nextInt();

      System.out.println(first_number+" + "+second_number+ " = "+ (first_number+second_number)+ "\n"
              + first_number +" - "+second_number + " = "+(first_number - second_number)+
              "\n" + first_number +" * "+second_number +" = "+ (first_number * second_number)+
              "\n" + first_number +" / "+second_number+" = "+(first_number/second_number)+"\n"
              +first_number +" mod "+ second_number +" = "+ (first_number%second_number));
  }catch (InputMismatchException e){
      System.out.println("wrong input ");
  }catch (ArithmeticException e){
      System.out.println(e.getMessage());
  }catch (Exception e){
      System.out.println(e.getMessage());
  }
//q2.===============================================================================================

        System.out.print("please enter the number you want its multiplication table :");
        scanner.nextLine();
        try {
            int multNum = scanner.nextInt();

            for(int i =1;i<=10;i++){
                System.out.println(multNum +" * "+i+"= "+(multNum*i));
            }
        }catch (InputMismatchException e){
            System.out.println("wrong input");
        }


//q3.==========================================================================================

        System.out.print("please enter the radios :");
        try {
            double radios = scanner.nextDouble();
            checkRedios(radios);
            double pi = 3.14;

            System.out.println("the area = " + (pi * (radios * radios)));
            System.out.println("the Perimeter =" + (2 * pi * radios));
        }catch (InputMismatchException e){
            System.out.println("wrong input");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
//q4.==========================================================================================

        System.out.print("Enter the count of numbers :");
        double sum = 0;
        double count=0;
        try {
            count = scanner.nextDouble();
            int num;

            for (int i = 0; i < count; i++) {
                System.out.print("enter the number :");
                num = scanner.nextInt();
                sum += num;
            }
        }catch (InputMismatchException e){
            System.out.println("wrong input ");
        }
        try {
            double average = (sum / count);
            System.out.println("the average = " + average);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
//q5=================================================================================================

try {
    System.out.print("enter the first number :");
    int fNum = scanner.nextInt();

    System.out.print("Enter the socend number :");
   int sNum = scanner.nextInt();
    System.out.print("enter the third number : ");
   int thNum = scanner.nextInt();

   istrue(fNum,sNum,thNum);
}catch (InputMismatchException e){
    System.out.println("Wrong input");
}

//q.6================================================================================================

        System.out.print("please enter the word : ");
        scanner.nextLine();
        String word = scanner.nextLine();

        System.out.print("reversed word : ");

        for(int i = word.length()-1;i>=0;i--){
            System.out.print(word.charAt(i));
        }
        System.out.println(" ");
//q.7================================================================================================

        int num1;
        boolean continuo = true;
        while(continuo){
            try {
                System.out.print("Enter the number :");
                num1 = scanner.nextInt();

                ckeckeven(num1);

                System.out.println("do you want to continue (true /false)");
                continuo = scanner.nextBoolean();
            }catch (InputMismatchException e){
                System.out.println("wrong input");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
//q.8==================================================================================
try {
    System.out.print("Enter temperature in centigrade : ");
    double temp = scanner.nextDouble();

    System.out.println("temptiture in fehrinhite :  " + ((temp * 1.8) + 32));
}catch (InputMismatchException e){
    System.out.println("wrong input");
}
//q.9===================================================================================
        System.out.print("input String : ");
        scanner.nextLine();
        String str = scanner.nextLine();
try {
    System.out.print("enter index : ");
    int index = scanner.nextInt();

    System.out.println(str.charAt(index));
}catch (InputMismatchException e){
    System.out.println("wrong input");
}catch (StringIndexOutOfBoundsException e){
    System.out.println(e.getMessage());
}catch (Exception e){
    System.out.println(e.getMessage());
}
//q.10====================================================================================
try {

    System.out.print("Enter the width :");
    double width = scanner.nextDouble();

    System.out.print("enter the height :");
    double height = scanner.nextDouble();

    checkWidithAndHeight(width,height);
    System.out.println("Area is :" + width + "*" + height + "=" + (width * height));
    System.out.println("Perimeter  is : 2*(" + width + "+" + height + ")=" + (2 * (width + height)));
}catch (InputMismatchException e){
    System.out.println("wrong input");
}catch (Exception e){
    System.out.println(e.getMessage());
}

//q.11========================================================================================
try {
    System.out.print("please input the first integer :");
    int num2 = scanner.nextInt();

    System.out.print("please enter the socend integer :");
    int num3 = scanner.nextInt();

    if (num2 == num3) {
        System.out.println(num2 + "==" + num3);
    } else {
        System.out.println(num2 + "!=" + num3);
    }

    if (num2 < num3) {
        System.out.println(num2 + "<" + num3);
    } else {
        System.out.println(num2 + ">" + num3);
    }

    if (num2 <= num3) {
        System.out.println(num2 + "<=" + num3);
    } else if (num2 >= num3) {
        System.out.println(num2 + ">=" + num3);
    }
}catch (InputMismatchException e){
    System.out.println("wrong input");
}catch (Exception e){
    System.out.println(e.getMessage());
}
//q.12===========================================================================================
        System.out.print("input seconds :");
try {
    int seconds = scanner.nextInt();
    checksecond(seconds);
    int hours = seconds / 3600;
    int munits = ((seconds % 3600) / 60);
    int rsecound = (seconds / 60);
    System.out.println(hours + ":" + munits + ":" + rsecound);
}catch (InputMismatchException e){
    System.out.println("wrong input");
}catch (Exception e){
    System.out.println(e.getMessage());
}
//q.13============================================================================================
        try {
            System.out.print("enter the first number :");
            int num9 = scanner.nextInt();

            System.out.print("enter the second number :");
            int num4 = scanner.nextInt();

            System.out.print("enter the third number :");
            int num5 = scanner.nextInt();

            System.out.print("enter the forth number :");
            int num6 = scanner.nextInt();

            if (num9 == num4 && num9 == num5 && num9 == num6) {
                System.out.println("all four are equal");
            } else {
                System.out.println("all four are not equal");
            }
        }catch (InputMismatchException e){
            System.out.println("wrong input");
        }
//q.14=========================================================================================
       try {
           System.out.print("please enter integer : ");
           int num7 = scanner.nextInt();

           if (num7 > 0) {
               System.out.println("number is positive ");
           } else if (num7 < 0) {
               System.out.println("number is negative ");
           } else {
               System.out.println("number is zero");
           }
       }catch (InputMismatchException e){
           System.out.println("wrong input");
       }

//q15==================================================================================================
        int nump;
        int count_positive=0;
        int count_negative=0;
        int count_zero =0;
        try {
        do{

                System.out.print("please enter number , if you want to stop -1 :");
                nump = scanner.nextInt();

                if (nump > 0) {
                    count_positive++;
                } else if (nump != -1 && nump < 0) {
                    count_negative++;
                } else if (nump == 0) {
                    count_zero++;
                } else {
                    break;
                }
        }while (nump != -1);
        }catch (InputMismatchException e){
            System.out.println("wrong input");
        }
        System.out.println("cont of positives ="+count_positive);
        System.out.println("cont of negative ="+count_negative);
        System.out.println("cont of zero ="+count_zero);
//q.16=================================================================================================

        try {
           System.out.print("please enter an integr : ");
         int number_to_reverse = scanner.nextInt();

           String revnum = Integer.toString(number_to_reverse);
            for(int i =revnum.length()-1;i>=0;i--){
                System.out.print(revnum.charAt(i));
            }
            System.out.println(" ");
       }catch (InputMismatchException e){
           System.out.println("wromg input");
       }catch (Exception e){
            System.out.println(e.getMessage());
        }
//q.17=====================================================================================================
        int inum;
        int max ;
        int min ;
        boolean con = true;
        try {
            System.out.print("enter the number : ");
            inum = scanner.nextInt();
            max = inum;
            min = inum;

            while (con) {
                System.out.print("enter the number : ");
                inum = scanner.nextInt();

                if (inum > max) {
                    max = inum;
                } else if (inum < min) {
                    min = inum;
                }
                System.out.print("do you wont to continue  : (true /false)");
                con = scanner.nextBoolean();
            }
            System.out.println("the large number is : "+max);
            System.out.println("the small number is : "+min);
        }catch (InputMismatchException e){
            System.out.println("wrong input");
        }


//q.18===========================================================================================
        int counter = 0;
        System.out.print("enter String : ");
        scanner.nextLine();
        String str1 = scanner.nextLine();

        for(int i=0;i<str1.length();i++){
            if(str1.toLowerCase().charAt(i) == 'a'){
                counter++;
            }
        }
        System.out.println("number of a's = "+counter);



    }

    public static void checkRedios(double redios) throws Exception{
        if(redios<0){
            throw new Exception("redis cant be negative ");
        }
    }
    public static void checkWidithAndHeight(double width,double height){
        try {
            if (width < 0 || height < 0) {
                throw new Exception("width and height cant be negative");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void ckeckeven(int num) throws Exception{
        if(num%2==0){
            throw new Exception("the number is even");
        }else {
            throw new Exception("the number is odd");
        }
    }

    public static void istrue (int num1,int num2 ,int num3){
        try{
        if((num1 + num2) == num3){
            throw new Exception("the resoult is true");
        }else {
            throw new Exception("the resoult is false");
        }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void checksecond(int seconds) throws Exception{
        if(seconds<0){
            throw new Exception("seconds cant be negative");

        }
    }
}