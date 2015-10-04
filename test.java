
public class test {
    public static void main(String args[]) {
        System.out.println("Initial data:");
        int[] mas = {33, 27, 9, 12, 14, 27, 64, 42, 15, 58};

        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + "; ");


        for (int i = 0; i <= mas.length; i++){
            int j = mas.length-1;
            boolean control_sorting = true;

            while (j > i){
                if (mas[j-1] > mas[j]){
                    int a = mas[j-1];
                    mas[j-1] = mas[j];
                    mas[j] = a;
                    control_sorting = false;
                }
                j--;
            }
            if (control_sorting){
                break;
            }
        }

        System.out.println("After sorting:");
        for (int i=0; i<mas.length; i++ )
        System.out.print(mas[i]+ "; ");

    }
}
