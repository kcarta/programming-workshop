 import javax.swing.JOptionPane;

  public class FormCalculator {

         public static void main(String args[])
         {
         String first,second;
         double  choice ;
     double    radius,width,area, length;
         String value=" ";   //intialize the string

            value  =JOptionPane.showInputDialog("Please chose one of the options:"+"\n" +
                                               "a)Enter 1 to calculate the area of the Circle"+ "\n"+
                                               "b)Enter 2 to calculate the area of the Triangle"+ "\n"+
                                               "c)Enter 3 to calculate the area of the Square"+ "\n"+
                                               "d)Enter 4 to calculate the area of the Rectangle"+"\n"+
                                               "e)Enter 5 to calculate the area of the Cube"+"\n"+
                                               "f)Enter 6 to exit the program");
           choice=Double.parseDouble(value);

          while(choice!=6)
               {
             //if(choice!=1||choice!=2||choice!=3||choice!=4||choice!=5)
               // JOptionPane.showMessageDialog(null,"Wrong option entered",  " error",
               // JOptionPane.ERROR_MESSAGE);

                if(choice==1)
                      {//calculate the area of circle
          first  =      JOptionPane.showInputDialog("Enter the value of radius");
                 radius = Double.parseDouble(first);
                 area   =  Math.PI*radius*radius;
                 //print out the result
                 JOptionPane.showMessageDialog(null,"The area of the Circle:    "+area,"result",
                 JOptionPane.INFORMATION_MESSAGE);
                      }

               else if(choice==2)
                     { //calculate the area of triangle
            first=JOptionPane.showInputDialog("Enter the value of lenght");
          second=JOptionPane.showInputDialog("Enter the value of width");
                 length =       Double.parseDouble(first);
                  width=Double.parseDouble(second);
                  area= (width*length)/2;
                  JOptionPane.showMessageDialog(null,"The area of triangle:     "+ area,"result",
                  JOptionPane.INFORMATION_MESSAGE);
                     }

               else if(choice==3)
                     {//calculate the area of square
             first = JOptionPane.showInputDialog("Enter the value of length");
                 length = Double.parseDouble(first);//ge string into integer
                 area=length*length;
                 JOptionPane.showMessageDialog(null,"The area of the square:    "+ area," result",
                 JOptionPane.INFORMATION_MESSAGE);
                     }

                else if(choice==4)
                      {//calculate the area of rectangle
                first=JOptionPane.showInputDialog("Enter the value of length");
              second=JOptionPane.showInputDialog("Enter the value of width");
                     length=Double.parseDouble(first);
                     width=Double.parseDouble(second);
                     area=width*length;
                     JOptionPane.showMessageDialog(null,"The area of the rectangle:     "+   area,"result",
                     JOptionPane.INFORMATION_MESSAGE);
                      }

                 else if(choice==5)
                  {//calculat the area of cube
                first=JOptionPane.showInputDialog("Enter the value of length");
         length=Double.parseDouble(first);
                     area=6*length;
                     JOptionPane.showMessageDialog(null,"The area of the cube:  "+ area,"result",
                     JOptionPane.INFORMATION_MESSAGE);
                       }
            value  =JOptionPane.showInputDialog("Please chose one of the options:"+"\n" +
                                               "a)Enter 1 to calculate the area of the Circle"+ "\n"+
                                               "b)Enter 2 to calculate the area of the Triangle"+ "\n"+
                                               "c)Enter 3 to calculate the area of the Square"+ "\n"+
                                               "d)Enter 4 to calculate the area of the Rectangle"+"\n"+
                                               "e)Enter 5 to calculate the area of the Cube"+"\n"+
                                               "f)Enter 6 to exit the program");

             choice=Double.parseDouble(value);
               }//end of while loop
                     System.out.println("Program terminated\n");
                     System.exit(0);


         }}//end of main
