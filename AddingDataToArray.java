
public class AddingDataToArray {

    public static void main(String[] args) {

        String[] myArray = {"value"};
        printArray(myArray);

        myArray = add(myArray, "new value");
        printArray(myArray);

    }

    public static String[] add (String[] array, String value) {

        String[] newArray = new String[array.length+1];
        for (int i=0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[array.length] = value;
        return  newArray;

    }

    public static void printArray(String[] array) {

        System.out.println("myArray:");
        for (String element: array) {
            System.out.println(element);
        }
        System.out.println();

    }

}
