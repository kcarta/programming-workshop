
public class Repeat {

    public static void main(String[] args)
    {
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
            else if (args.length >= 2)
            {
                int num = Integer.parseInt(args[1]);
                String text = args[0];
                for (int i = 0; i < num; i++)
                {
                    System.out.println(text);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("I failed! :o");
        }
    }
}
