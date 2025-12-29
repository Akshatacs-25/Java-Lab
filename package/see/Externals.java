package see;
import cie.Personal;
public class Externals extends Personal{
    public int externalmarks[]=new int[5];

   public Externals(String u,String n,int s,int[] marks){
        super(u,n,s);
        for(int i=0;i<5;i++){
            externalmarks[i]=marks[i];
        }
    }
}
