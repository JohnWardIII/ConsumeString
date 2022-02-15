public class consumeString {
    // # Write a function named 'consume_string' that will take 2 input values:
// #
// # input: A string
// # n: an Integer
// #
// # the function will print to STDOUT.
// # output will be the consumption(removal of that char) of every nth character in the string on a new line for each pass
// # until the string is fully consumed at which point it should return 0
// #
// # eg:
// # Input = "abcdefghijk"
// # n = 2
// # output:
// #
// # bdfhj
// # cgk
// # e
// # i
// #
// # Input = "abcdefghijk"
// # n = 3
// # output:
// #
// # cfi
// # dh
// # ek
// # g
// # j
// #
    public static void main(String[] args) {
        consume_String("abcdefghijk", 2);
    }
    public static void consume_String (String input, Integer n){
        String output = "";
        for (int i=0; i<input.length(); i++){
            output = "";
            for (int j=0; j<output.length(); j++){
                output = output.substring(0,n)+output.substring(n+1, output.length());
            }
            System.out.println(input);
        }
    }
}
