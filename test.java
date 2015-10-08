
public class test {
    public static void main(String args[]) {
        System.out.println("Initial data:");
        String mas[] = {"for", "never", "was", "a",
                        "store", "of", "more", "woe",
                        "than", "this", "of", "juliet",
                        "and", "her", "romeo"};
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + "; ");
        for (int i = 0; i <= mas.length; i++){
            int j = mas.length-1;
            boolean controlSorting = true;
            	while (j > i){
                	if (mas[j-1].compareTo(mas[j]) > 0){
                    		String a = mas[j-1];
                    		mas[j-1] = mas[j];
                    		mas[j] = a;
                    		controlSorting = false;
                		}
            		j--;
            	}
            if (controlSorting){
                break;
            }
        }
        System.out.println("After sorting:");
        for (int i=0; i<mas.length; i++ )
        System.out.print(mas[i]+ "; ");
    }
}
