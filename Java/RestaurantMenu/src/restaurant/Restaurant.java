package restaurant;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Restaurant {
    public static void main(String[] args) throws ParseException {
        // write your code here
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");

        Menu.setMenuList("Chicken Biryani","Spicy Cooked basmati rice with Chicken",13.99,"main course", true,dateFormatter.parse("05/16/2021"));
        Menu.setMenuList("Goat Biryani","Spicy Cooked basmati rice with Goat",15.99,"main course", true, dateFormatter.parse("05/01/2021"));
        Menu.setMenuList("Hot Sour Chicken Soup","Chicken with boiled water",6.99,"appetizer", true, dateFormatter.parse("04/10/2021"));
        Menu.setMenuList("Ice Cream","Chocolate with Ice Cream",3.99,"dessert", false, dateFormatter.parse("05/16/2020"));
        Menu.setMenuList("Hot Sour Chicken Soup","Chicken with boiled water",6.99,"appetizer", true, dateFormatter.parse("04/10/2021"));
        //System.out.println(Menu.getMenuList());

        System.out.println("Print the entire, updated menu to the screen");
        System.out.println("---------------------------------------------");
        Menu.printAllMenu();
        System.out.println("-------------------------------------------");
        System.out.println("Print an individual menu item to the screen");
        System.out.println("--------------------------------------------");
        Menu.printOneMenu("Ice Cream");
        System.out.println("-------------------------------------------------");
        System.out.println("Delete an item from a menu, then reprint the menu");
        System.out.println("-------------------------------------------------");
        Menu.removeMenuList("Goat Biryani");
        Menu.printAllMenu();
        System.out.println("---------------------------------");
        System.out.println("Check the menu item is new or not");
        System.out.println("---------------------------------");
        Menu.checkNewInd("Ice Cream");
        Menu.checkNewInd("Chicken Biryani");
        System.out.println("---------------------------");
        System.out.println("Check the last updated date");
        System.out.println("---------------------------");
        Menu.checkLastUpdatedDate("Ice Cream");
        Menu.checkLastUpdatedDate("Chicken Biryani");
    }
}
