import java.util.*;
class calculator
{
    private static int add(int a,int b)
    {
        return a+b;
    }
    private static int substract(int a,int b)
    {
        return a-b;
    }
    private static int multiplication(int a,int b)
    {
        return a*b;
    }
    private static double division(double a,double b)
    {
        return a/b;
    }
    public static void main()
    {
        Scanner sn = new Scanner (System.in);
        String choise="";
        System.out.println("enter add for addition \nsubstraction for difference \nmultiplication for product \ndivision for division \nexit to end");
        choise = sn.nextLine();
        while(choise != "exit")
        {
         switch(choise)
         {
             case "add": {System.out.println("enter the values");
                          int first = sn.nextInt();
                          int second = sn.nextInt();
                          sn.nextLine();
                          System.out.println(calculator.add(first,second));
                         }break;
             case "substraction":{ System.out.println("enter the values");
                                  int first = sn.nextInt();
                                  int second = sn.nextInt();
                                  sn.nextLine();
                                  System.out.println(calculator.substract(first,second));
                                 }break;
             case "multiplication":{ System.out.println("enter the values");
                                    int first = sn.nextInt();
                                    int second = sn.nextInt();
                                    sn.nextLine();
                                    System.out.println(calculator.multiplication(first,second));
                                   }break;
             case "division":{ System.out.println("enter the values");
                              double first = sn.nextDouble();
                              double second = sn.nextDouble();
                              sn.nextLine();
                              System.out.println(calculator.division(first,second));
                             }break;
             case "exit": {System.exit(0);}
             default : System.out.println("wrong choise");
         }
         System.out.println("now?");
         choise = sn.nextLine();
        }
    }
}