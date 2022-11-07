public class U4L7ARunner {
    public static void main(String[] args) {

        int result = 0;
        int k = 0;
        while (k < 4)
        {
            int m = 0;
            while (m < 3)
            {
                result++;
                m++;
                System.out.print("k: " + k);
                System.out.println(", m: " + m);
            }
            k++;
        }
        System.out.println("result: " + result);

    }


}
