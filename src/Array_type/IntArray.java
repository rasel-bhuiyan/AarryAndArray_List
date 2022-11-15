package Array_type;

public class IntArray {

    public static void main(String[] args) {

        int ar[] = new int[10];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = i;

        }

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

        Integer array[] = new Integer[4];
        array[0] = 33;
        array[1] = 33;
        array[2] = 33;
        
        int c  =0;
        for (Integer i : array) {
            System.out.println(i);
            
        }

    }
}
