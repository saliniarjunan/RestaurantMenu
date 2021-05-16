package restaurant;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Menu {

    public static HashMap<String, MenuItem> menuList = new HashMap<>();

    public static HashMap<String, MenuItem> getMenuList() {
        return menuList;
    }

    public static void removeMenuList(String menuName){
        if (menuList.containsKey(menuName)) {
            menuList.remove(menuName);
        }
        else{
            System.out.println( "The " + menuName + " menu item is not in system. Please check it");
        }
    }

    public static void printOneMenu(String menuName){
        if (menuList.containsKey(menuName)) {
            MenuItem indMenuItem = menuList.get(menuName);
            System.out.println(menuName + " (" + indMenuItem.getDescription() + ")" + " - $" + indMenuItem.getPrice() + " - " + indMenuItem.getCategory() + " - " + indMenuItem.getLastUpdated());
        }
        else{
            System.out.println( "The " + menuName + " menu item is not in system. Please check it");
        }
    }

    public static void checkLastUpdatedDate(String menuName){
        if (menuList.containsKey(menuName)) {
            MenuItem indMenuItem = menuList.get(menuName);
            System.out.println(menuName + " was last updated on " + indMenuItem.getLastUpdated());
        }
        else{
            System.out.println( "The " + menuName + " menu item is not in system. Please check it");
        }
    }

    public static void checkNewInd(String menuName){
        if (menuList.containsKey(menuName)) {
            MenuItem indMenuItem = menuList.get(menuName);
            if (indMenuItem.getNewInd()){
                System.out.println(menuName + " is a new item");
            }
            else{
                System.out.println(menuName + " is not a new item");
            }
        }
        else{
            System.out.println( "The " + menuName + " menu item is not in system. Please check it");
        }
    }
    public static void printAllMenu()
    {
        for (Map.Entry<String,MenuItem> MListHash : Menu.getMenuList().entrySet()) {
            System.out.println(MListHash.getKey() + " (" + MListHash.getValue().getDescription() + ")" + " - $" + MListHash.getValue().getPrice() + " - " + MListHash.getValue().getCategory() + " - " + MListHash.getValue().getLastUpdated());
        }
    }

    public static void setMenuList(String menuName, String description, Double price, String category, Boolean newIndicator, Date lastUpdated) {
        if (!menuList.containsKey(menuName)) {
            MenuItem mItem = new MenuItem();
            mItem.setDescription(description);
            mItem.setPrice(price);
            mItem.setCategory(category);
            mItem.setNewInd(newIndicator);
            mItem.setLastUpdated(lastUpdated);
            menuList.put(menuName, mItem);
        }
        else
        {
            System.out.println( "The " + menuName + " menu item is already in system. Please try to add new item");
        }
    }
}
