class StrBuff {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("KARUNA ");

        char Surname[] = {'B','H','A','T','T'};
        System.out.println("Before !" + sb);
        sb.append(Surname);
        System.out.println("After !" + sb);

    }
}
