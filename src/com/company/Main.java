package src.com.company;

public class Main {  // TODO ane: delete or move to a package called test. also rename to test or something

    public static void main(String []args){
        int x =2;
        int y=2;
        int z = (((x++) + (++y)) >5 && ((++x)+y)<10)?1:0;
        System.out.println(x+""+y);

    }
}