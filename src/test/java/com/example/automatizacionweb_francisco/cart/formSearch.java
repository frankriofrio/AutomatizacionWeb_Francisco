package com.example.automatizacionweb_francisco.cart;

import org.openqa.selenium.By;

public class formSearch {
    public static By ADD_PRODUCT_CART= By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a");

    public static By SELECT_PRODUCT_ONE = By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/h4/a");

    public static By SELECTION_PRODUCT_TWO = By.xpath("/html/body/div[5]/div/div[2]/div/div[3]/div/div/h4/a");
    public static By SELECT_CART_OPTION = By.xpath("/html/body/nav/div/div/ul/li[4]/a");

    public static By RETURN_MAIN_PAGE = By.xpath("/html/body/nav/div/div/ul/li[1]/a");

    public static By GENERATE_ORDER = By.xpath("/html/body/div[6]/div/div[2]/button");
}
