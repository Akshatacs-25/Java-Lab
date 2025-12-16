class WrongAge extends Exception{
    public WrongAge(String message){
        super(message);
    }
}
class father{
    int fatherAge;
    father(int age) throws WrongAge{
        if(age<0){
            throw new WrongAge("Father age cannot be less than zero");
        }
        fatherAge=age;
        System.out.println("Father age:"+age);
       
        }
    }
class Son extends father{
    int sonAge;
    Son(int fatherAge,int sonAge) throws WrongAge{
        super(fatherAge);
        if(sonAge>=fatherAge){
            throw new WrongAge("Son age cannot be greater than father age:");
        }
        this.sonAge=sonAge;
        System.out.println("SonAge:"+sonAge);
    }
}
public class exception1{
    public static void main(String args[]){
        try{
        Son s=new Son(30,15);
        Son s1=new Son(14,30);
        }
        catch(WrongAge e){
            System.out.println("Exception caught:"+e.getMessage());
        } 
    }
}
