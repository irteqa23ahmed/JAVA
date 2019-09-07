public class String_buffer {
public static void main(String args[]) {
StringBuffer str = new StringBuffer("Hello WOrld!"); 
System.out.println("str = "+str);
str.insert(5, "for"); 
System.out.println("str.insert(5,\"for\") = "+str);
str.reverse();
System.out.println("str.reverse() = "+str);
str.replace(0,15,"Hello WOrld!    ");
str.replace(5, 8, "are");
System.out.println("str.replace(5, 8, \"are\"); = "+str);
str.replace(0,15,"Hello WOrld!    ");
str.append("Space");
System.out.println("str.append(\"Space\"); = "+str);
str.replace(0,20,"Hello WOrld!    World");
System.out.println("str.substring(0,10); = "+str.substring(0,10));
}
}
