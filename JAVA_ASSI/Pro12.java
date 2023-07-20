class A {
    
    int i=0;

    A()
    {
            i++;
        System.out.println("This Is Default Constructer Object:"+i);
    }

    A(int z)
    {
        this.i=z;
        System.out.println("This Is Perameterize Constructer Object: "+i);
    }

    void show()
    {
        i++;
        System.out.println("This Is Show Method Object:"+i);
    }

    public static void main(String[] args)
    {
       
        A obj1 = new A();
        A obj2 = new A(2);
        A obj3 = new A();
        obj3.show();

        
    }
}
