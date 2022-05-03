public class Test {
    public static void main(String[] args) {
        int [] myArray = {1,2,2,3,4,4,5};

//        for (int i = 0; i < myArray.length;i++ ) {
//            for (int j = i +1; j < myArray.length; j++) {
//                if ( myArray[i] == myArray[j])
//                    System.out.println(myArray[j]);
//            }
//        }

        int i =0, j, array = 0;


        while ( i < myArray.length) {
            j = i + 1;
            while ( j < myArray.length){
                if (myArray[i]==myArray[j]){
                    array++;
                    break;
                }
                j++;
            }
            i++;
        }
        System.out.println(array);
    }
}
//test