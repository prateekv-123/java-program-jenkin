public class main {
    
public static void main(String[] args) {
    
String name = "My Name is Prateek Varshney";
int leng = name.length();
String rev = "";
for(int i = leng - 1; i >=0; i--){
    rev = rev + name.charAt(i);
}
System.out.println("The Reverse version of this String is:" + rev);
}
//Just doing my First Commit
}
