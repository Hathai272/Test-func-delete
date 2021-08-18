// s = "This is thailand"
// r = "ai"
// my_fun(s,r) = "Ths s thlnd"
public class Main {
    public static String delete(String a){
        String result = "";
        for(int i=0;i<a.length();i++){
                if (a.charAt(i) != 'a' && a.charAt(i) !='i'){
                    result += a.charAt(i);            
                }
            }
        return result;
    }
    public static void main(String[]args){
        String s = "This is thailand";
        System.out.print(delete(s));
    }
}