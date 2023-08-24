package com.example.automatizacionweb_francisco.cart;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class formCart {
    public static Performable addCartOne() {
        return Task.where("{0} adds product",
                Click.on(formSearch.SELECT_PRODUCT_ONE),
                Click.on(formSearch.ADD_PRODUCT_CART)

        );
    }
    public static Performable addCartTwo() {
        return Task.where("{0} adds product",
                Click.on(formSearch.SELECTION_PRODUCT_TWO),
                Click.on(formSearch.ADD_PRODUCT_CART)
        );
    }

    public static Performable return_main_page() {
        return Task.where("{0} adds product",
                Click.on(formSearch.RETURN_MAIN_PAGE)

        );
    }

    public static Performable generate_orden() {
        return Task.where("{0} adds product",
                Click.on(formSearch.GENERATE_ORDER)


        );
    }

    public static Performable cartButton(){
        return Task.where("{0} cart button",
                Click.on(formSearch.SELECT_CART_OPTION)
        );
    }


    public static Performable checkoutForm(String name, String country, String city, String card,
                                           String month, String year) {
        return Task.where("{0} checkout form",
                        Enter.theValue(name).into(form.NAME),
                        Enter.theValue(country).into(form.COUNTRY),
                        Enter.theValue(city).into(form.CITY),
                        Enter.theValue(card).into(form.CARD),
                        Enter.theValue(month).into(form.MONTH),
                        Enter.theValue(year).into(form.YEAR),
                        Click.on(form.CONTINUE_SHOPPING)
                )
                .with("name").of(name)
                .with("country").of(country)
                .with("city").of(city)
                .with("card").of(card)
                .with("month").of(month)
                .with("year").of(year);
    }
}
