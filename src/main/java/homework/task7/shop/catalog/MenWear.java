package homework.task7.shop.catalog;

import homework.task7.shop.catalog.parameters.FabricParameter;
import homework.task7.shop.catalog.parameters.Size;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MenWear extends Wear {

    private static final Logger LOGGER = LogManager.getLogger();

    public MenWear(String productName, Double productCost, Size size, FabricParameter fabric) {
        super(productName, productCost, size, fabric);
    }

    @Override
    public void doPrepareForSale() {
        LOGGER.debug("The men's wear is ready for sale");
    }

    @Override
    public String toString() {
        return "It is class MenWear";
    }
}