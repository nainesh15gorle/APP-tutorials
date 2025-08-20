class Book{
    String title;
    String author;
    int price;
    Book(String t,String a,int p){
        title=t;
        author=a;
        price=p;
    }
    void Discountedprice(){
        double Discount=price-0.1*price;
        System.out.println(Discount);
    }

    void Display(){
        System.out.println("Title:\t"+ title + "\t Author: "+author + "\tprice: "+ price);
    }
}
class Bookdetails{
    public static void main(String[] args){
        Book b1=new Book("To kill a mockingbird" ,"Harper lee",120);
        b1.Display();
        System.out.println("The discounted  price is");
        b1.Discountedprice();
    }
}