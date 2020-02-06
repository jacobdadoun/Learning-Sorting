package edu.touro.mco264;

public class Sorting {

    public static void bubbleSort(int list[]){
        for(int i =0; i < list.length - 1; i++){

            for(int j = 1; j < list.length ; j++){ // optimization 1: Dont need to go to n each time | //if already sorted break

                if(list[j-1] > list[j]) {// out of order

                    // SWAP
                    int temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public static void stringBubbleSort(String list2[]){

        for(int i =0; i < list2.length - 1; i++){

            for(int j = 1; j < list2.length ; j++){ // optimization 1: Dont need to go to n each time | //if already sorted break

                if(list2[j - 1].compareTo(list2[j]) > 0) {// out of order

                    // SWAP
                    String temp = list2[j-1];
                    list2[j-1] = list2[j];
                    list2[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] list = new int[] {7, 3, 0, -5, 12, 4};
        bubbleSort(list);

        for(int i: list){
            System.out.println(i);
        }

        //-----------

        System.out.println();
        String[] list2 = new String[]{"charlie", "foxtrot", "alpha", "zulu", "echo", "tango"};
        stringBubbleSort(list2);

        for(String i: list2){
            System.out.println(i);
        }
    }

}
