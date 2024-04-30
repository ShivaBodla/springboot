public class ReversStringUsingStringbuffer {
    public static void main(String[] args){
        String s= "SHIVA";
        StringBuffer sb= new StringBuffer(s).reverse().insert(1,'h').replace(0,6,"Awshwant").reverse();
        System.out.println(sb);
    }
}
