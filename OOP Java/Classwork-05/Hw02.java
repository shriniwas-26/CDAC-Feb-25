interface Photosynthesis{
    abstract void absorbSunlight();
}
interface Respiration{
    abstract void releaseOxygen();
}

class Plant implements Photosynthesis, Respiration{
    private String plantName;
    Plant(String plantName){
        this.plantName = plantName;
    }
    String getPlantName(){
        return this.plantName;
    }

    public void absorbSunlight(){
        System.out.println("Plant is absorbing sunlight for photosynthesis.");
    }

    public void releaseOxygen(){
        System.out.println("Plant is releasing oxygen through respiration.");
    }
}
class Hw02{
    public static void main(String[] args){
        Plant mango = new Plant("Mango Tree");
        Plant fern = new Plant("Fern");

        System.out.println(mango.getPlantName()+": ");
        mango.absorbSunlight();
        mango.releaseOxygen();
        System.out.println(fern.getPlantName()+": ");
        fern.absorbSunlight();
        fern.releaseOxygen();
    }
}