/**
 * created by gp
 */
public class Main {
    public static void main(String[] args){


       int[] table = new int[]{123, -234, 50, -12, 98};

       for (int i = 0; i < table.length-1; i++){

           int place = i;

           int temp;

           for (int j = i+1; j< table.length; j ++){

               if (table[j]<table[place]){

                   place = j;
               }
           }

           if (place != i) {
               temp = table[place];

               table[place] = table[i];

               table[i] = temp;
           }
       }

        for (int i : table) {
            System.out.println(i);
        }

    }
}