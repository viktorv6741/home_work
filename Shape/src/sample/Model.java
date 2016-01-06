package sample;

public class Model {

    private String strA;
    private String strB;


    public Model(){
    }

    public Model(String strA, String strB){
        this.strA = strA;
        this.strB = strB;
    }


    public int areaCalculation(){
        return Integer.valueOf(strA) * Integer.valueOf(strB);
    }

    public int perimeterCalculation(){
        return 2 * (Integer.valueOf(strA) + Integer.valueOf(strB));
    }
}
