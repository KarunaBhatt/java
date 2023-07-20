class Buff {
    
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("World ");
        System.out.println(sb);

        System.out.println("____________________________________________________________________________________________________________");

        sb.insert(5 ," Java" );
        System.out.println(sb);

        System.out.println("____________________________________________________________________________________________________________");


        sb.replace(5, 10, " PHP");
        System.out.println(sb);

        System.out.println("____________________________________________________________________________________________________________");

        sb.delete(5, 9);
        System.out.println(sb);

        System.out.println("____________________________________________________________________________________________________________");

        sb.reverse();
        System.out.println(sb);

        System.out.println("____________________________________________________________________________________________________________");
    }
}
