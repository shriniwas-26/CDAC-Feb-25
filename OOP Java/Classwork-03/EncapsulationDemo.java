class Student{
    private int id;
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
class EncapsulationDemo{
    public static void main(String[] args){
        Student s = new Student();
        s.setName("Shriniwas");
        System.out.println("Your name : "+ s.getName());
    }
}