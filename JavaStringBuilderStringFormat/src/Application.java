
public class Application
    {
    public static void main(String[] args)
        {
        //worst way to create string as this is creating new object with each call.
        String info = "";
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder";
        System.out.println(info);

        //Better method
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        s.append("My name is Roger")
                .append(" ")
                .append("I am a skydiver.");
        System.out.println(s.toString());

        //////// Formatting ////////////////////////
        System.out.println(
                "Here is a some text.\tThat was a tab.\nThat was a newline");
        System.out.println("  More text");
        //formating integer
        System.out.printf("Total cost %10d; quantity is %d\n", 5, 120);

        for (int i = 0; i < 20; i++)
            {
            System.out.printf("%-2d:  %s\n", i, "here is some text");
            }
        //formating floating point value
        System.out.printf("Total value %.2f \n", 5.6789);
        // the 6 will give the spacing for the number to be output.
        System.out.printf("Total value %6.1f \n", 343.6789);
        }

    }
