import java.util.*;

// 211, 214, 15, 16, 19, 20(X2),(21 - 27), 28, 29, 32, 33, 34, 36, 38, 40, 41, 44, 48, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60
// 220 - 227, 231, 241 - 243, 249, 250,
public class Test {
    public static void main(String[] args) {


        int[] array = {13, -19, 2, 7, 6};

        int max = array[0];
        int min = array[0];
        int k = 2;
        int total = 1;
        int count = 0;
        int sum = 0;

//220
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            } else if (array[i] < 0) {
                count1++;
            }
        }
        System.out.println(count + ", " + count1);




//221
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);



//222
        for (int i = -5; i < 23; i++) {
            total += i;
        }
        System.out.println(total);





//223
        for (int i = -3; i < 21; i++) {
             count++;
        }
        System.out.println(count);





//224
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) < k) {
                sum += Math.pow(array[i], 3);
            }
        }
        System.out.println(sum);



//225
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) < k) {
                total *= array[i];
            }
        }
        System.out.println(total);



//226
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) < k) {
                count++;
            }
        }
        System.out.println(count);



//227
        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                sum += array[i];
                count++;
            }
        }
        System.out.println("Task 227. " + sum / count);



//231
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += Math.pow(array[i], 2);
            }
        }
        System.out.println(sum);



//241
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);




//242
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                total *= array[i];
            }
        }
        System.out.println(total);



//243
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                count++;
            }
        }
        System.out.println(count);




//249
        for (int i = 0; i < array.length; i++) {
            if (Math.pow(array[i] + i, 2) % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);




//250
        for (int i = 0; i < array.length; i++) {
            if ((array[i] * i) % 3 == 2) {
                total *= Math.pow(array[i], 2);
            }
        }
        System.out.println(total);
    }
}
