import java.io.*;
abstract class plan
{
    protected double rate;
    abstract void getrate();
    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}


