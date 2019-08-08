package src.com.company;

public class Main {

          public static void main(String []args){
              int x =2;
              int y=2;
              int z = (((x++) + (++y)) >5 && ((++x)+y)<10)?1:0;
              System.out.println(x+""+y+"" + z);

          }
    }

