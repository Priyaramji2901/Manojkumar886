package demo.java;

public class typecast {
    public static void main(String[] args)
    {
        //widening
        //double to char
        double myvalue=69.9;
        char myasciivalue=(char)myvalue;
        System.out.println("my value:"+myasciivalue);

        //widening
        //double to int
        double d=10.97;
        int i=(int)d;
        System.out.println("d:"+i);

        //narrowing
        //int to char
        int a=72;
        char ascii=(char)a;
        System.out.println("VALUE:"+ascii);


    }

}

