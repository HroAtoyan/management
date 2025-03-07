import java.util.*;

//291 - 310. 5 hat obyekti nkaragrutyun
public class Test {
    public static void main(String[] args) {


        int[] array = {13, -19, 2, 7, 6};

        int max = array[0];
        int min = array[0];
        int k = 2;
        int total = 1;
        int count = 0;
        int sum = 0;

//291
        for (int x : array) {
            if (x > 0) {
                System.out.print(x + ", ");
            }
        }


//292
        for (int x : array) {
            if (x % 7 == 0) {
                System.out.print(x + ", ");
            }
        }



//293
        for (int i = 3; i < 23; i++) {
            if (i >= 3 && i <= 23) {
                System.out.print(i + ", ");
            }
        }



//294
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.print(array[i] + ", ");
            }
        }



//295
        for (int i = 0; i < array.length; i+=2) {
            System.out.print(array[i] + ", ");
        }



//296
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 2) {
                System.out.println(array[i] + ", ");
            }
        }



//297
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) > k) {
                System.out.println(array[i] + ", ");
            }
        }



//298
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + ", ");
            }
        }



//299
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i] + ", ");
            }
        }



//300
        for (int x : array) {
            if (Math.pow(x, 2) < k) {
                System.out.println(x + ", ");
            }
        }



//301
        for (int j : array) {
            if (j % k == 0 && j > 9 && j < 100) {
                System.out.println(j + ", ");
            }
        }



//302
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 2 && array[i] > 99 && array[i] < 1000){
                System.out.println(array[i] + ", ");
            }
        }



//303
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                System.out.println(array[i] + ", ");
            }
        }



//304
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 2) {
                System.out.println(array[i] + ", ");
            }
        }



// 305
        for (int j : array) {
            if (j % 3 == 0 && j % 5 == 0 && j > 999 && j < 10000) {
                System.out.println(j + ", ");
            }
        }


//306
        for (int i = 0; i < array.length; i++) {
            int a = array[i] % 10;
            int b = array[i] / 10;
            if (a + b > 5 && array[i] > 9 && array[i] < 100) {
                System.out.println(array[i] + ", ");
            }
        }


//307
        for (int i = 0; i < array.length; i++) {
            int a = array[i] % 10;
            int b = (array[i] % 100) / 10;
            int c = array[i] / 100;
            if (a + b + c == 9 && array[i] > 99 && array[i] < 1000) {
                System.out.println(array[i] + ", ");
            }
        }




//308
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0 && array[i] > 9 && array[i] < 1000) {
                System.out.println(array[i] + ", ");
            }
        }



//309
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] % 3 != 0) {
                System.out.println(array[i] + ", ");
            }
        }



//310
        for (int i = 0; i < array.length; i++) {
            int a = array[i] % 10;
            int b = (array[i] % 100) / 10;
            if (a == b) {
                System.out.println(array[i] + ", ");
            }
        }



//311


    }
}