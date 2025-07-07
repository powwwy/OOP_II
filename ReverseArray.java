import java.util.Arrays;

import java.util.Collections;

import java.util.List;



public class ReverseArray {

    public static void main(String[] args) {

        String[] pallets = {"A35","B99","A12","B23"};



        System.out.println("Sorted Array: ");

        Arrays.sort(pallets);

        for (String pallet : pallets){

            System.out.println("--" + pallet);

        }



        System.out.println("\nSorted Reverse: ");

        List<String> palletList = Arrays.asList(pallets);

        Collections.reverse(palletList);

        for (String pallet : palletList){

            System.out.println("--" + pallet);

        }

    }

}
