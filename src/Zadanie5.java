public class Zadanie5 {

    public static void main(String[] args) {

        int sum = 0;
        int i = 0;
        while (i <= 100) {

            if (i % 2 != 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;

        }

        for (i = 1; i <= 100; i++)
            if (i % 2 == 0)
                sum = sum + i++;

        System.out.println("Suma liczb parzystych:" + sum);

    }


}






