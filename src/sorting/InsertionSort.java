package sorting;

/**
 * Created by Sarah on 26/12/2017.
 */
public class InsertionSort {


    public static void main(String[] args) {

        //sort integers
        int[] unsorted = {2,1,9,23,1,5,2,8,15,2};

        for (int j = 1; j< unsorted.length; j++) {
            int key = unsorted[j];

            for (int i = j; i>=1; i--) {

                if(unsorted[i] < unsorted[i-1]){
                    unsorted[i] = unsorted[i-1];
                    unsorted[i-1] = key;
                }
            }
        }

        for(int i=0; i<unsorted.length; i++) {
            System.out.println(unsorted[i]);
        }

    }


}
