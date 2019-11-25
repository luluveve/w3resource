public class Exercitiu2 {
    public static void main(String[] args) {
        System.out.println("Introduceti numarul: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while (i <= 9) {
            System.out.println(i + "*" + n + "=" + i*n);
            i++;

        }
    }


}
