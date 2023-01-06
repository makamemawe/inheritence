public class Car{
    private int speed;
    private double regularPrice;
    private String color;

    public Car(int speed, double regularPrice, String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;

        public double getSalePrice(){
            return regularPrice;
        }

    }
}

public class Truck extends Car{
    super();
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight){
        super(speed, regularPrice, color);
        this.weight = weight;
    } 

    public double getSalePrice(){
        if (weight > 2000){
            return super.getSalePrice() = (0.1 * super.getSalePrice());
        }
        else{
            return super.getSalePrice();
        }
    }   
}

public class Ford extends Car {     
    private int year; 
    private int manufacturerDiscount; 
     
    public Ford (int Speed,double regularPrice,String color, int year, int manufacturerDiscount) { 
        super (Speed,regularPrice,color);         this.year = year; 
        this.manufacturerDiscount = manufacturerDiscount; 
    }      
    public double getSalePrice() { 
        return (super.getSalePrice() - manufacturerDiscount); 
    } 
} 

public class Sedan extends Car {     private int length; 
     
    public Sedan (int Speed,double regularPrice,String color, int length) {         super (Speed,regularPrice,color);         this.length = length; 
    }      
    public double getSalePrice() {         
        if(length > 20) { 
            return super.getSalePrice() - (0.05 * super.getSalePrice()); 
        }         else { 
            return super.getSalePrice() - (0.1 * super.getSalePrice()); 
        } 
    } 
}

public class MyOwnAutoShop { 
(int Speed,double regularPrice,String color, int year, int manufacturerDiscount)  
 
    public static void main(String[] args) { 
        Sedan mySedan = new Sedan(200, 10000, "Red", 30); 
        Ford myFord1 = new Ford (156,13450.0,"Black",500, 23); 
        Ford myFord2 = new Ford (3200,40000.0,"Pink",2003, 5); 
        Car myCar - new Car (432, 65000.0, "Red"); 
 
        System.out.printf("MySedan Price ", mySedan.getSalePrice()); 
        System.out.printf("MyFord1 Price ", myFord1.getSalePrice()); 
        System.out.printf("MyFord2 Price ", myFord2.getSalePrice()); 
        System.out.printf("MyCar Price ", myCar.getSalePrice()); 
 
    } 
 
} 



