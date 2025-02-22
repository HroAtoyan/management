import java.util.*;

public class Test {
    public static void main(String[] args) {

        // Task 21
        int a = 2, b = 9, c = 8;

        if (a >= b && a >= c) {
            System.out.println("Task 21. " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Task 21. " + b);
        } else {
            System.out.println("Task 21. " + c);
        }

        // Task 22
        if (a <= b && a <= c) {
            System.out.println("Task 22. " + a);
        } else if (b <= a && b <= c) {
            System.out.println("Task 22. " + b);
        } else {
            System.out.println("Task 22. " + c);
        }
        // Task 23

        if (a == 1 || b == 1 || c == 1) {
            System.out.println("Task 23. " + true);
        } else {
            System.out.println("Task 23. " + false);
        }

        //Task 24
        if (a == 2 && b == 2 || b == 2 && c == 2 || a == 2 && c == 2) {
            System.out.println("Task 24. " + true);
        } else {
            System.out.println("Task 24. " + false);
        }

        // Task 25
        if (a + b > c || b + c > a || c + a > b) {
            System.out.println("Task 25. " + "Y = 1");
        } else {
            System.out.println("Task 25. " + "Y = 2");
        }


        // Task 26
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            System.out.println("Task 26. " + "1");
        } else {
            System.out.println("Task 26. " + "2");
        }

        // Task 27
        int i = 2;
        if (a + i == b && b + i == c || c + i == b && b + i == a || b + i == c && c + i == a || b + i == a && a + i == c) {
            System.out.println("Task 27. " + true);
        } else {
            System.out.println("Task 27. " + false);
        }

        // Task 28
        if (a * i == b && b * i == c) {
            System.out.println("Task 28. " + true);
        } else {
            System.out.println("Task 28. " + false);
        }

        // Task 29
        if (a < b && b < c) {
            System.out.println("Task 29. " + a + ", " + b + ", " + c);
        } else if (a < c && c < b) {
            System.out.println("Task 29. " + a + ", " + c + ", " + b);
        } else if (b < a && a < c) {
            System.out.println("Task 29. " + b + ", " + a + ", " + c);
        } else if (b < c && c < a) {
            System.out.println("Task 29. " + b + ", " + c + ", " + a);
        } else if (c < a && a < b) {
            System.out.println("Task 29. " + c + ", " + a + ", " + b);
        } else if (c < b && b < a) {
            System.out.println("Task 29. " + c + ", " + b + ", " + a);
        }

        // Task 30
        if (a > b && b > c) {
            System.out.println("Task 30. " + a + ", " + b + ", " + c);
        } else if (a > c && c > b) {
            System.out.println("Task 30. " + a + ", " + c + ", " + b);
        } else if (b > a && a > c) {
            System.out.println("Task 30. " + b + ", " + a + ", " + c);
        } else if (b > c && c > a) {
            System.out.println("Task 30. " + b + ", " + c + ", " + a);
        } else if (c > a && a > b) {
            System.out.println("Task 30. " + c + ", " + a + ", " + b);
        } else if (c > b && b > a) {
            System.out.println("Task 30. " + c + ", " + b + ", " + a);
        }

        System.out.println("--------------------------------");
        //Task 31
        int x = 3, y = 7, z = 8, w = 14;
        if (x > y && x > z && x > w) {
            System.out.println("Task 31. " + x);
        } else if (y > x && y > z && y > w) {
            System.out.println("Task 31. " + y);
        } else if (z > x && z > y && z > w) {
            System.out.println("Task 31. " + z);
        } else {
            System.out.println("Task 31. " + w);
        }

        // Task 32
        if (x < y && x < z && x < w) {
            System.out.println("Task 32. " + x);
        } else if (y < x && y < z && y < w) {
            System.out.println("Task 32. " + y);
        } else if (z < x && z < y && z < w) {
            System.out.println("Task 32. " + z);
        } else {
            System.out.println("Task 32. " + w);
        }

        // Task 33
        if (x == 1 || y == 1 || z == 1 || w == 1) {
            System.out.println("Task 33. " + true);
        } else {
            System.out.println("Task 33. " + false);
        }

        // Task 34
        if (x + y == z + w || y + z == x + w || x + z == y + w) {
            System.out.println("Task 34. " + true);
        } else {
            System.out.println("Task 34. " + false);
        }

        // Task 35
        if (x == y + z + w || y == x + z + w || z == x + y + w || w == x + y + z) {
            System.out.println("Task 35. " + true);
        } else {
            System.out.println("Task 35. " + false);
        }

        // Task 36
        if (x % 2 != 0 && y % 2 != 0 || x % 2 != 0 && z % 2 != 0 || x % 2 != 0 && w % 2 != 0) {
            System.out.println("Task 36. " + "1");
        } else if (y % 2 != 0 && z % 2 != 0 || y % 2 != 0 && w % 2 != 0) {
            System.out.println("Task 36. " + "1");
        } else if (z % 2 != 0 && w % 2 != 0) {
            System.out.println("Task 36. " + "1");
        } else {
            System.out.println("Task 36. " + "2");
        }

        // Task 37
        int h = 2;
        if (x + h == y && y + h == z && z + h == w) {
            System.out.println("Task 37. " + true);
        } else if (x + h == z && z + h == y && y + h == w) {
            System.out.println("Task 37. " + true);
        } else if (x + h == w && w + h == y && y + h == z) {
            System.out.println("Task 37. " + true);
        } else if (x + h == z && z + h == w && w + h == y) {
            System.out.println("Task 37. " + true);
        } else if (y + h == x && x + h == z && z + h == w) {
            System.out.println("Task 37. " + true);
        } else if (y + h == z && z + h == x && x + h == w) {
            System.out.println("Task 37. " + true);
        } else if (y + h == w && w + h == x && x + h == z) {
            System.out.println("Task 37. " + true);
        } else if (y + h == w && w + h == z && z + h == x) {
            System.out.println("Task 37. " + true);
        } else if (z + h == w && w + h == y && y + h == x) {
            System.out.println("Task 37. " + true);
        } else if (z + h == y && y + h == w && w + h == x) {
            System.out.println("Task 37. " + true);
        } else if (z + h == y && y + h == x && x + h == w) {
            System.out.println("Task 37. " + true);
        } else if (z + h == x && x + h == y && y + h == w) {
            System.out.println("Task 37. " + true);
        } else if (w + h == z && z + h == y && y + h == x) {
            System.out.println("Task 37. " + true);
        } else if (w + h == z && z + h == x && y + h == y) {
            System.out.println("Task 37. " + true);
        } else if (w + h == x && x + h == z && z + h == y) {
            System.out.println("Task 37. " + true);
        } else if (w + h == x && x + h == y && y + h == z) {
            System.out.println("Task 37. " + true);
        }else {
            System.out.println("Task 37. " + false);
        }


        // Task 38
        if (x * h == y && y * h == z && z * h == w) {
            System.out.println("Task 38. " + true);
        } else if (x * h == z && z * h == y && y * h == w) {
            System.out.println("Task 38. " + true);
        } else if (x * h == w && w * h == y && y * h == z) {
            System.out.println("Task 38. " + true);
        } else if (x * h == z && z * h == w && w * h == y) {
            System.out.println("Task 38. " + true);
        } else if (y * h == x && x * h == z && z * h == w) {
            System.out.println("Task 38. " + true);
        } else if (y * h == z && z * h == x && x * h == w) {
            System.out.println("Task 38. " + true);
        } else if (y * h == w && w * h == x && x * h == z) {
            System.out.println("Task 38. " + true);
        } else if (y * h == w && w * h == z && z * h == x) {
            System.out.println("Task 38. " + true);
        } else if (z * h == w && w * h == y && y * h == x) {
            System.out.println("Task 38. " + true);
        } else if (z * h == y && y * h == w && w * h == x) {
            System.out.println("Task 38. " + true);
        } else if (z * h == y && y * h == x && x * h == w) {
            System.out.println("Task 38. " + true);
        } else if (z * h == x && x * h == y && y * h == w) {
            System.out.println("Task 38. " + true);
        } else if (w * h == z && z * h == y && y * h == x) {
            System.out.println("Task 38 " + true);
        } else if (w * h == z && z * h == x && y * h == y) {
            System.out.println("Task 38. " + true);
        } else if (w * h == x && x * h == z && z * h == y) {
            System.out.println("Task 38. " + true);
        } else if (w * h == x && x * h == y && y * h == z) {
            System.out.println("Task 38. " + true);
        }else {
            System.out.println("Task 38. " + false);
        }

        // Task 39
        if (x < y && y < z && z < w) {
            System.out.println("Task 39. " + x + ", " + y + ", " + z + ", " + w);
        } else if (x < z && z < y && y < w) {
            System.out.println("Task 39. " + x + ", " + z + ", " + y + ", " + w);
        } else if (x < w && w < z && z < y) {
            System.out.println("Task 39. " + x + ", " + w + ", " + z + ", " + y);
        } else if (x < y && y < w && w < z) {
            System.out.println("Task 39. " + x + ", " + y + ", " + w + ", " + z);
        } else if (y < x && x < z && z < w) {
            System.out.println("Task 39. " + y + ", " + x + ", " + z + ", " + w);
        } else if (y < x && x < w && w < z) {
            System.out.println("Task 39. " + y + ", " + x + ", " + w + ", " + z);
        } else if (y < w && w < z && z < x) {
            System.out.println("Task 39. " + y + ", " + w + ", " + z + ", " + x);
        } else if (y < z && z < w && w < x) {
            System.out.println("Task 39. " + y + ", " + z + ", " + w + ", " + x);
        } else if (z < w && w < x && x < y) {
            System.out.println("Task 39. " + z + ", " + w + ", " + x + ", " + y);
        } else if (z < w && w < y && y < x) {
            System.out.println("Task 39. " + z + ", " + w + ", " + y + ", " + x);
        } else if (z < y && y < w && w < x) {
            System.out.println("Task 39. " + z + ", " + y + ", " + w + ", " + x);
        } else if (z < x && x < w && w < y) {
            System.out.println("Task 39. " + z + ", " + x + ", " + w + ", " + y);
        } else if (w < z && z < y && y < x) {
            System.out.println("Task 39. " + w + ", " + z + ", " + y + ", " + x);
        } else if (w < z && z < x && x < y) {
            System.out.println("Task 39. " + w + ", " + z + ", " + x + ", " + y);
        } else if (w < x && x < z && z < y) {
            System.out.println("Task 39. " + w + ", " + x + ", " + z + ", " + y);
        } else if (w < y && y < z && z < x) {
            System.out.println("Task 39. " + w + ", " + y + ", " + z + ", " + x);
        }

        // Task 40
        if (x > y && y > z && z > w) {
            System.out.println("Task 40. " + x + ", " + y + ", " + z + ", " + w);
        } else if (x > z && z > y && y > w) {
            System.out.println("Task 40. " + x + ", " + z + ", " + y + ", " + w);
        } else if (x > w && w > z && z > y) {
            System.out.println("Task 40. " + x + ", " + w + ", " + z + ", " + y);
        } else if (x > y && y > w && w > z) {
            System.out.println("Task 40. " + x + ", " + y + ", " + w + ", " + z);
        } else if (y > x && x > z && z > w) {
            System.out.println("Task 40. " + y + ", " + x + ", " + z + ", " + w);
        } else if (y > x && x > w && w > z) {
            System.out.println("Task 40. " + y + ", " + x + ", " + w + ", " + z);
        } else if (y > w && w > z && z > x) {
            System.out.println("Task 40. " + y + ", " + w + ", " + z + ", " + x);
        } else if (y > z && z > w && w > x) {
            System.out.println("Task 40. " + y + ", " + z + ", " + w + ", " + x);
        } else if (z > w && w > x && x > y) {
            System.out.println("Task 40. " + z + ", " + w + ", " + x + ", " + y);
        } else if (z > w && w > y && y > x) {
            System.out.println("Task 40. " + z + ", " + w + ", " + y + ", " + x);
        } else if (z > y && y > w && w > x) {
            System.out.println("Task 40. " + z + ", " + y + ", " + w + ", " + x);
        } else if (z > x && x > w && w > y) {
            System.out.println("Task 40. " + z + ", " + x + ", " + w + ", " + y);
        } else if (w > z && z > y && y > x) {
            System.out.println("Task 40. " + w + ", " + z + ", " + y + ", " + x);
        } else if (w > z && z > x && x > y) {
            System.out.println("Task 40. " + w + ", " + z + ", " + x + ", " + y);
        } else if (w > x && x > z && z > y) {
            System.out.println("Task 40. " + w + ", " + x + ", " + z + ", " + y);
        } else if (w > y && y > z && z > x) {
            System.out.println("Task 40. " + w + ", " + y + ", " + z + ", " + x);
        }
    }
}
