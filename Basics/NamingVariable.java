package Basics;

public class NamingVariable {
    public static void main(String[] args) {
        
        // 1. A variable name can consist of capital (A - Z), lowercase letters (a - z), digit (0 - 9)
        //    and two special characters such as underscore (_) and dollar sign ($).
        // 2. The first character must not be a digit.
        // 3. Blank spaces cannot be used as variable names.
        // 4. Java keywords cannot be used as variable names.
        // 5. Variable names are case sensitive.
        // 6. There is no limit on the length of const variable name, but by convention, it should be
        //    between 4 to 15 chars.
        // 7. true, false, null look like keywords, but in actual they are literals. However,
        //    they are still cannot be used as a variable.
        // NOTE : The keywords 'const' and 'goto' are reversed, even they are not currently in use.
        //        Currently they are no longer supported in java.
        int _value1 = 5;
        System.out.println(_value1); 
        int $value2 = 10;
        System.out.println($value2); 
        int value3 = 15;
        System.out.println(value3);
        int Value4 = 20;
        System.out.println(Value4); 
        // Invalid Variable Names: 12value, value 1, double, true, const, @result, result@, etc. 
    }
}
