import java.util.*;

// 211, 214, 15, 16, 19, 20, 27, 28, 29, 32, 33, 34, 36, 38, 40, 41, 44, 48, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60
public class Test {
    public static void main(String[] args) {


//211
        int[] array = {10, 19, 3, 7, 3};

        int max = array[0];
        int min = array[0];
        int k = 2;
        int total = 1;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
                count++;
            }
        }
        System.out.println("Task 211. " + sum / count);


 //214
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
                count++;
            }
        }
        System.out.println("Task 214. " + sum / count);

 //215
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0){
                sum += array[i];
            }
        }
        System.out.println("Task 215, " + sum);
 //216

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0){
                total *= array[i];
            }
        }
        System.out.println("Task 216, " + total);
//219
        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        System.out.println("Task 219. " + count);

//220
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                count++;
            }
        }
        System.out.println("Task 220. " + count);


//227
        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                sum += array[i];
                count++;
            }
        }
        System.out.println("Task 227. " + sum / count);


//228
        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                sum += array[i];
            }
        }
        System.out.println("Task 228. " + sum);



//229
        for (int i = 0; i < array.length; i++) {
            if (array[i] - i > 0) {
                total *= array[i];
            }
        }
        System.out.println("Task 229. " + total);



//232
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Task 232. " + count);



//233
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
                total *= array[i];
            }
        }
        System.out.print("Task 233. " + "Sum = " + sum);
        System.out.println(", Total = " + total);



//234
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
                count++;
            }
        }
        System.out.println("Task 234. " + sum / count);




//236
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                total *= array[i];
                count++;
            }
        }
        System.out.print("Task 236. " + "Total = " + total);
        System.out.println(", Count = " + count);




//238
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                sum += array[i];
                count++;
            }
        }
        System.out.println("Task 238. " + sum / count);



//240
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 7 == 0) {
                count++;
            }
        }
        System.out.println("Task 240. " + count);




//244
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 2) {
                total *= array[i];
            }
        }
        System.out.println("Task 244. " + total);




//248
        for (int i = 0; i < array.length; i++) {
            if ((array[i] + i) * (array[i] + i) % k == 0) {
                sum += array[i];
            }
        }
        System.out.println("Task 248. " + sum);




//251

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Task 251. " + max);



//252

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Task 252. " + min);




//253
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print( "Task 253. ");
        System.out.println(max + min);





//254
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print( "Task 254. ");
        System.out.println(max * min);




//255
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                count = i;
            }
        }
        System.out.print("Task 255. ");
        System.out.println(max + count);



//256
                for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                count = i;
            }
        }
        System.out.print("Task 256. ");
        System.out.println(min + count);




//257
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                count++;
            }
        }
        System.out.println("Task 257. " + count);




//258
        for (int i = array.length - 1 ; i >= 0; i--) {
            if (array[i] > max) {
                max = array[i];
                count = i;
            }
        }
        System.out.println("Task 258. " + count);




//259
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                count = i;
            }
        }
        System.out.println("Task 259. " + count);




//260
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < min) {
                min = array[i];
                count = i;
            }
        }
        System.out.println("Task 260. " + count);

    }
}
