/*
3. Implement ArrayIndexOutOfBoundsException
Create an array of 5 elements and try to access an index that does not exist (e.g., index 10). Handle the exception properly.
*/

class Hw03{
    public static void main(String[] args){
        int arr[] = new int[5];
        try{
            int c = arr[6];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: Cant access array at index 6");
        }
    }
}