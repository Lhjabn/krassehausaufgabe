package h1;

public class Zahl {
    public boolean even = false;
    public boolean small = true;
    public boolean positive = false;
    public int num = -160;

    public void seteven() {
        if(num%2==0){
            even = true;
        }
        else{
            even = false;
        }
        System.out.println(even);

    }
    public void setSmall() {
        if(num<100){
            small = true;
        }
        else{
            small = false;
        }
        System.out.println(small);
    }
    public void setPositive() {
        if(num>0){
            positive = true;
        }
        else{
            positive = false;
        }
        System.out.println(positive);
    }



}
