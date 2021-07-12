package in.bala.crmapp.app;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> serialNumber=new ArrayList<Integer>();
        int a=10;
        serialNumber.add(a);
        serialNumber.add(20);
        serialNumber.add(32);
        serialNumber.add(5);
        serialNumber.add(7);

        System.out.println( serialNumber);





//        File file=new File("emp.txt");
//        Scanner scan=null;
//        try{
//            scan=new Scanner(file);
//            while (scan.hasNextLine()){
//                System.out.println("data line : "+scan.nextLine());
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        finally {
//            scan.close();
//        }
    }
}
