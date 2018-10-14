import javax.swing.*;
import java.util.Arrays;

class MassiveMethods <T>{

    public void toStringElements(T [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ":" + arr[i].toString());
        }
    }

    public void swapElements(T [] arr) {
        T [] tempMassive = Arrays.copyOf(arr,arr.length);
        T temp;
        if (arr.length>1){
                temp = tempMassive[0];
                tempMassive[0] = tempMassive[1];
                tempMassive[1] = temp;
                for(int i = 0; i<tempMassive.length;i++){
                    System.out.println(i+":"+tempMassive[i]);
                }
            }
            else {System.out.println("kek");}
        }

        public void reverseMassive(T [] arr){
            for(int i = arr.length - 1; i>= 0;i--)
            {
                System.out.println(arr[i]);
            }

        }


    }













public class Main {

    public static void main(String[] args) {

        System.out.println("type : String");
        MassiveMethods<String> obj = new MassiveMethods<String>();
        String[] myArr = {"lol","kek","cheburek"};
        System.out.println("Method 1: print  elements toString");
        obj.toStringElements(myArr);
        System.out.println("Method 2: print swap  elements");
        obj.swapElements(myArr);
        System.out.println("Method 3: print reverse massive");
        obj.reverseMassive(myArr);

        System.out.println("type : Integer");
        MassiveMethods<Integer> obj2 = new MassiveMethods<Integer>();
        Integer [] myArr2 = {1,2,3,4};
        System.out.println("Method 1: print  elements toString");
        obj2.toStringElements(myArr2);
        System.out.println("Method 2: print swap  elements");
        obj2.swapElements(myArr2);
        System.out.println("Method 3: print reverse massive");
        obj2.reverseMassive(myArr2);




    }
}
