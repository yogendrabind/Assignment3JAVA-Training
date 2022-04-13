public class StringBufferStringBuilder{
 public static void main(String args[]) {
 String firstname = "Yogendra";
 String lastname = "Bind"; 
 String name = firstname + " " + lastname; 
System.out.println(name); 
StringBuilder sb = new StringBuilder(16);
 sb.append(firstname).append(" ").append(lastname);
 System.out.println(sb.toString());
 StringBuffer sBuffer = new StringBuffer(20); 
sBuffer.append(firstname).append(" ").append(lastname); 
System.out.println(sBuffer.toString()); } 
} 
