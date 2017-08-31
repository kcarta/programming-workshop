
public class CmdCalc {

    public static void main(String[] args) {
        try
        {
            if (args.length == 0)
            {
                System.out.println("You didn't give me anything! :O");
            }
            else if (args.length == 1)
            {
                System.out.println(args[0]);
            }
            else if (args.length == 2)
            {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                System.out.println(a + b);
            }
            else if (args.length == 3)
            {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[2]);

                switch (args[1].charAt(0))
                {
                    case '+' :
                        System.out.println(a + b);
                        break;
                    case '-' :
                        System.out.println(a - b);
                        break;
                    case '*' :
                    case 'x' :
                        System.out.println(a * b);
                        break;
                    case '/' :
                    case '\\' :
                        System.out.println(a / b);
                        break;
                    default:
                        System.out.println("I don't know that sign");
                        break;
                }
            }
            else
            {
                System.out.println("Too many arguments!");
            }
        }
        catch (Exception e)
        {
            System.out.println("I failed! :o");
        }
    }
}
