/**
 * lion.java
 * buat lion
 * @author 18220014 Pavita Andrea
 */
public class Lion extends Animal{
    public Lion (){
        super(150, "LAND");
    }
    public Lion (int rawPower){
        super(rawPower, "LAND");
    }

    public void speak (){
        System.out.println("GRAWRRRR!!! I'm a Lion!" );
    }
}
