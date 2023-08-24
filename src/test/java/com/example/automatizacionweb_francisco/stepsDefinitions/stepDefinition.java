package com.example.automatizacionweb_francisco.stepsDefinitions;
import com.example.automatizacionweb_francisco.cart.formCart;
//import com.example.automatizacionweb_francisco.cart.Search;
import com.example.automatizacionweb_francisco.navigate.Navigate;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class stepDefinition {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^(.*) navigates mainly to the main page")
    public void homeCart(String actor) {
        theActorCalled(actor).attemptsTo(Navigate.OpenHomePage());
    }
    @When("Step select first product and add to cart")
    public void clickFirstArticle(){
        withCurrentActor(
                formCart.addCartOne()

        );
    }

    @When("Step select second product and add to cart")
    public void clickSecondArticle() {
        withCurrentActor(
                formCart.addCartTwo()
        );
    }

    @When("Step return main page")
    public void returnMainPage()  {
        withCurrentActor(
                formCart.return_main_page()
        );

    }

    @When("Step visualize cart")
    public void goCart() {
        withCurrentActor(
                formCart.cartButton()
        );
    }

    @When("Step display order")
    public void generateOrden(){
        withCurrentActor(
                formCart.generate_orden()
        );

    }

    @When("Step fill form {string}, {string}, {string}, {string}, {string}, {string}")
    public void fillCheckoutForm(String name, String country, String city, String card, String month, String year) throws InterruptedException{
        withCurrentActor(
                formCart.checkoutForm(name, country, city, card, month, year)
        );
        Thread.sleep(2000);
    }


    @Then("Step validate message {string}")
    public void validatesMessage(String message) throws InterruptedException {
        Target confirmOrder = Target.the("message").located(By.xpath("/html/body/div[10]/h2"));
        Thread.sleep(2000);
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(confirmOrder).text().contains(message)
        );
    }

}
