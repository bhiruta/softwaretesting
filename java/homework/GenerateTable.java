package homework;

public class GenerateTable {
    public static void main(String[] args) {
        int row, column;
        System.out.println("Multiplication Table\n");
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.println(i * j + "\t");
                j++;

            } while (j <= 10);
            i++;
            System.out.println();
        }while(i<=10);



    }
}