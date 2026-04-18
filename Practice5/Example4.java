import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
       double                 leftOperand, result, rightOperand;
       String                 expression, leftString, operator, rightString;
       StringTokenizer        expressionTokenizer, tokenizer;
       Scanner in = new Scanner(System.in);

       expressionTokenizer = new StringTokenizer(in.nextLine());

       while (expressionTokenizer.hasMoreTokens())
       {
          expression = expressionTokenizer.nextToken();
          tokenizer = new StringTokenizer(expression, "+-*/", true);

          try
          {
             leftString   = tokenizer.nextToken();
             operator     = tokenizer.nextToken();
             rightString  = tokenizer.nextToken();

             if (tokenizer.hasMoreTokens())
                throw new NoSuchElementException();

             try
             {
                leftOperand = Double.parseDouble(leftString);
             }
             catch (NumberFormatException nfe)
             {
                System.out.println("Left operand is not a number: " + leftString);
                continue;
             }

             try
             {
                rightOperand = Double.parseDouble(rightString);
             }
             catch (NumberFormatException nfe)
             {
                System.out.println("Right operand is not a number: " + rightString);
                continue;
             }

             if (operator.equals("+"))
                result = leftOperand + rightOperand;
             else if (operator.equals("-"))
                result = leftOperand - rightOperand;
             else if (operator.equals("*"))
                result = leftOperand * rightOperand;
             else if (operator.equals("/"))
                result = leftOperand / rightOperand;
             else
             {
                System.out.println("Invalid operator: " + operator);
                continue;
             }

             System.out.println("Result: " + result);
          }
          catch (NoSuchElementException nsee)
          {
             System.out.println("Invalid syntax");
          }
       }
    }
}
