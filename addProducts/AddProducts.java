package AdddProducts;
import java.util.*;
public class AddProducts
{
    public static void entt()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Existing category(n)\n2. Enter new category\(E)n3. Add product(A)");
        System.out.println("Enter your choice: ");
        char choice = sc.next().charAt(0);
        while(choice == 'E' || choice=='N' || choice = 'A' ||choice == 'e' || choice=='n' || choice = 'a')
        {
            if(choice == 'N'||choice == 'n')
            {
                AddCategoryHelper.display();
                break;
            }
            else if(choice == 'E'||choice == 'e')
            {
                AddCategoryHelper.CategoryEntry();
                break;
            }
            else if(choice == 'A'||choice == 'a')
            {
                AddCategoryHelper.display();
            
                AddProductHelper.entry();
                break;
            }
            else
            {
                System.out.println("Invalid choice");
                System.out.println("Enter your choice: ");
                choice = sc.next().charAt(0);
            }
        }
    }
}