package pet.artplancom;


public class Main {
    public static void main(String[] args) {
        if(args.length == 0){
            throw new RuntimeException("You need to enter the line like:\n\t\"java -jar JavaExercise-1.1-SNAPSHOT.jar {some string}\"");
        }
        String input = args[0];

        System.out.println("Input string:\t" + input);
        System.out.println("Output string:\t" +  StringReverseVar1(input));

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; ++i){
            StringReverseVar1(input);
            if (i + 1 == 1000 || i + 1 == 10000 || i + 1 == 100000) {
                System.out.println((i + 1) + ":\t" + (double)(System.currentTimeMillis() - start) + " ms.");
            }
        }
    }

    //Faster than StringReverseVar2
    public static String StringReverseVar1 ( String inputStr ) {
        return new StringBuffer(inputStr).reverse().toString();
    }

    public static String StringReverseVar2 ( String inputStr ) {
        char[] InputCharArray = inputStr.toCharArray();
        StringBuilder resultString = new StringBuilder();
        for (int i = InputCharArray.length - 1; i >= 0; i--) {
            resultString.append(InputCharArray[i]);
        }
        return resultString.toString();
    }
}
