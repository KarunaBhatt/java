class Wrapper {
    public static void main(String s[])
    {
        Integer obj1 = new Integer(500);
        Integer obj2 = new Integer(1500);
        Integer obj3 = new Integer(500);  
        
        System.out.println("Object 1 " + obj1);
        System.out.println("Object 2 " + obj2);
        System.out.println("Object 3 " + obj3);

        System.out.println("(obj1) Compare To (obj2) = " + obj1.compareTo(obj2));
        System.out.println("(obj2) Compare To (obj3) = " + obj2.compareTo(obj3));
        System.out.println("object 1 == object 2 ? :" + obj1.equals(obj2));
        System.out.println("object 2 == object 3 ? :" + obj2.equals(obj3));

        System.out.println("byte Value Of Object3 = " + obj3.intValue());
        int n = 999;

        System.out.println("Hex Decimal of " + n + " = " + Integer.toHexString(n));

        System.out.println("Minimum Value " + Integer.MIN_VALUE);
        System.out.println("Maximum Value " + Integer.MAX_VALUE);
    }
}
