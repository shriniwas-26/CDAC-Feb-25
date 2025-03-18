/*
5. Implement IllegalArgumentException
Write a Java method setAge(int age) that throws an IllegalArgumentException if the age is negative or greater than 150.
*/

class Hw05 {
    void setAge(int age) throws IllegalArgumentException{
        if(age<0 || age>150){
            throw new IllegalArgumentException();
        }
    }
    public static void main(String[] args){
        try{
            Hw05 h = new Hw05();
            h.setAge(151);
        }catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException : the age is negative or greater than 150.");
        }
    }
}