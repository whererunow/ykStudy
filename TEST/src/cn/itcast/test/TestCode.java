package cn.itcast.test;

import java.util.Arrays;

public class TestCode {
    public static void main(String[] args) {
        //Test01
        /*
        int a = 50;
        int b =30;
        int c = 80;
        getMin(a,b,c);*/

        //Test02
        /*
        int[] arrayA = {1, 3, 4, 7, 9, 8, 15};
        int x = 2;
        int y = 5;
        System.out.println("调换前x号和y号对应的元素是：" + arrayA[x] + "\t" + arrayA[y]);
        int[] arrayB = swap(arrayA, x, y);
        System.out.println("调换后x号和y号对应的元素是：" + arrayA[x] + "\t" + arrayA[y]);
        */

        //Test03
        /*int[] array = {23, 55, 32, 18, 67, 75, 97, 12, 78, 89};
        int min = getMin(array);
        System.out.println("最小值：" + min);
        int max = getMax(array);
        System.out.println("最大值：" + max);
        int sum = getSum(array);
        System.out.println("总和：" + sum);
        int avg = getAvg(array);
        System.out.println("平均值：" + avg);*/

        //Test04
        int count = printNum();
        System.out.println("符合条件的有" + count + "个");

        //Test05
        /*int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr = union(arr1, arr2);
        System.out.println(Arrays.toString(arr));*/
    }

    public static void getMin(int a, int b, int c) {//Test01
        int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.println(min);
    }

    public static int[] swap(int[] array, int x, int y) {//Test02
        array[x] = array[x] ^ array[y];
        array[y] = array[x] ^ array[y];
        array[x] = array[x] ^ array[y];
        return array;
    }

    public static int getMin(int[] arr) {//Test03
        Arrays.sort(arr);
        return arr[0];
    }

    public static int getMax(int[] arr) {//Test03
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static int getSum(int[] arr) {//Test03
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getAvg(int[] arr) {//Test03
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static int printNum() {//Test04
        int count = 0;
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print(i + "  ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            } else {
                continue;
            }
        }
        System.out.println();
        return count;
    }

    public static int[] union(int[] arr1, int[] arr2) {//Test05
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr.length; i++) {
            if (i < arr1.length) {
                arr[i] = arr1[i];
            } else {
                arr[i] = arr2[i - arr1.length];
            }
        }
        return arr;
    }
}
