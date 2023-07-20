class Str
{
	public static void main(String c[])
	{
		String r = "Vishal Rathod";
		String t = "vishal_rathod";
		System.out.println("The normal string :: - " + r);
		System.out.println("The length of string is :: - " + r.length());
		System.out.println("Check the Ra in string  :: - " + r.contains("Ra"));
		System.out.println("Check the end letter is 'd' in string :: - " + r.endsWith("d"));
		System.out.println("Check the Index of ('od') in string :: - " + r.indexOf("od"));
		System.out.println(" The Five character of string is :: - " + r.charAt(5));
		System.out.println(r.equals (c));
	}
}