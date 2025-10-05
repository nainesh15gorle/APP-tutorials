class Mobile{
    String Brand;
    int Model;
    int Price;
    Mobile(String b,int m,int p){
        Brand=b;
        Model=m;
        Price=p;
    }
    void showDetails(){
        System.out.println("Brand:"+ Brand+"\t Model:"+ Model+"\tPrice :"+Price);
    }
}

public class MobileDetails{
    public static void main(String[] args){
        Mobile m1=new Mobile("Samsung",123,23456797);
        Mobile m2=new Mobile("Googlepixel",40,4559809);
        Mobile m3=new Mobile("Vivo",23,310000);
        m1.showDetails();
        m2.showDetails();
        m3.showDetails();
    }
}