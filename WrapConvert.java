public class WrapperClassConvert{
    public static Object convertToWrapper(int obj){
        Integer object = obj;
        try{
            return object;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return object;
    }
    public static void main(String[] args) {
        int obj = 10;
        System.out.println(convertToWrapper(obj));
    }
}
