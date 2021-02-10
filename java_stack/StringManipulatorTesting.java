public class StringManipulatorTesting {
    public static void main(String[] args){
        StringManipulator object  = new StringManipulator();
        String result = object.trimAndConcat("word", "baby");
        System.out.println(result);
        Integer result2 = object.getIndex("baby", 'z');
        System.out.println(result2);
        int result3 = object.getIndexOrNull("fboo", "boo");
        System.out.println(result3);
        String result4 = object.concatSubstring("cat", 1, 2, "dog");
        System.out.println(result4);


    }
}