package Stack.ex03;

public class BalancedParentheses {
    public static void main(String[] args) {

        resultPrint("(5 + 3) * (2 + 4))");
    }

    public static void resultPrint(String expression){
        System.out.println("Is this" + expression + " balanced? " + checkBalancedSymbols(expression));
    }

    final static String open = "([{";
    final static String close = ")]}";

    public static boolean checkBalancedSymbols(String expression){
        GenericStack<Character> stack = new GenericStack<>();
        int index = 0;
        char symbol, top;

        while (index < expression.length()){
            symbol = expression.charAt(index);

            if (open.indexOf(symbol) > -1){
                stack.push(symbol);
            } else if (close.indexOf(symbol) > -1) {
                if(stack.isEmpty()){
                    return false;
                } else {
                    top = stack.pop();

                    if (open.indexOf(top) != close.indexOf(symbol)){
                        return false;
                    }
                }
            }

            index++;
        }
        return true;
    }
}
