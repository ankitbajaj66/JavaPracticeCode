package enumexample;


// We can not use extends keyword with enum class
// We can use implement keyword with enum
enum Mobile {
    APPLE(100), SAMSUNG(30), HTC(50);

    Mobile(int price) {
        this.price = price;
    }

    private int price;

    public int getPrice() {
        return price;
    }
}

public class EnumMainClass {

    /*enum Mobile {
        APPLE, SAMSUNG, HTC
    }*/

    public static void main(String args[]) {

        System.out.println(Mobile.APPLE);

        // Enum usecase

        Mobile m = Mobile.SAMSUNG;

        switch (m) {
            case APPLE:
                System.out.println(Mobile.APPLE+" price: "+Mobile.APPLE.getPrice()+" ordinal: "+Mobile.APPLE.ordinal());
                break;
            case SAMSUNG:
                System.out.println(Mobile.SAMSUNG+" price: "+Mobile.SAMSUNG.getPrice()+" ordinal: "+Mobile.SAMSUNG.ordinal());
                break;
            case HTC:
                System.out.println(Mobile.HTC+" price: "+Mobile.HTC.getPrice()+" ordinal: "+Mobile.HTC.ordinal());
                break;
        }

        // fetch all the constent from enum
        Mobile arr[]= Mobile.values();
        for (Mobile mobile : arr)
        {
            System.out.println(mobile);
        }

    }
}
