import java.util.ArrayList;

public class BasicsTest {
    public static void printNum(int num){
        if(num < 255){
            System.out.println(num + "");
            printNum(num + 1);
        }
    }
    // print odd numbers between 1-255
    public static void printNum2(int num){
        for(int n = 1; n<255; n++){
            if(n % 2 != 0){
                System.out.println(n);
            }
        }
    }

    public static void printNum3(){
        int sum = 0;
        for(int n = 0; n<255; n++){
            sum = sum + n;
            System.out.println("new number:" + n + "sum:" + sum);
        }
    }
    public static void iterateArray(int[] arr){
        // [1,3,4,5,6] => loop through this array.
        // int[] = arr;
        // arr = new int[5];
        // int[] myArray = {1,3,4,5,6};
        for(int n=0; n<arr.length; n++){
            System.out.println(arr[n]);
        }
    }
    public static void findTheMax(int[] arr){
        int max = arr[0];
        for(int n = 0; n<arr.length; n++){
            if(arr[n] > max){
                max = arr[n];
            }
        }
        System.out.println("this is the max " + max); 
    }
    public static void getAverage(int[] arr){
        int avg = 0;
        int sum = 0;
        for(int n = 0; n<arr.length; n++){
            sum += arr[n];
            avg = sum / arr.length;
        }
        System.out.println("this is the avg " + avg);
    }
    public static void getOddNumbers() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int n = 0; n<255; n++){
            if(n % 2 == 0){
                list.add(n);
            }
        }
        System.out.println(list);
        // return list;

    }
    public static int greaterThanY (int[] arr, int y) {
        // ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        // arr = new int[5]; --> this is resetting arr to a new array!
        for(int n = 0; n<arr.length; n++){
            if(arr[n] > y){
                count = count + 1;
            }

        }
        return count;

    }
    public static int[] squareTheValues(int[] arr){
        for(int n = 0; n<arr.length; n++){
            arr[n] = arr[n] * arr[n];
        }
        return arr;
    }
    public static int[] negativeNumbers(int[] arr){
        for(int n = 0; n<arr.length; n++){
            if(arr[n] < 0){
                arr[n] = 0;
            }
        }
        return arr;
        
    }
    public static ArrayList<Integer> maxMinAvg(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int avg = 0;
        int sum = 0;
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int n=0; n<arr.length; n++){
            if(arr[n] > max){
                max = arr[n];
                // newArr.add(arr[n]);
            }
            else if(arr[n] < min){
                min = arr[n];
                // newArr.add(min);
            }
            sum = sum + arr[n];


        }
        avg = sum / arr.length;
        newArr.add(avg);
        newArr.add(min);
        newArr.add(max);
        return newArr;
    }
    public static int[] shiftValues(int[] arr){
        // ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int n = arr.length - 1; n >= 0; n--){
            arr[n+1] = arr[n];



        }
        return arr;

    }






    public static void main(String[] args){
        int n = 1;
        int[] arr  = {-10,3,4,5,6};
        int[] arr2 = {-10,2,3,4,3};
        int[] arr3 = {10,11,12};
        printNum(n);
        printNum2(n);
        printNum3();
        iterateArray(arr);
        findTheMax(arr);
        getAverage(arr);
        //  getOddNumbers();
        System.out.println(greaterThanY(arr, 3));
        System.out.println(java.util.Arrays.toString(squareTheValues(arr)));
        System.out.println(java.util.Arrays.toString(negativeNumbers(arr2)));
        System.out.println((maxMinAvg(arr3)));
        System.out.println(java.util.Arrays.toString(shiftValues(arr3)));
    }


}

