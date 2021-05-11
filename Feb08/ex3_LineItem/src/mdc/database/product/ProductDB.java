package mdc.database.product;

public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a database
        // For now, this code just uses if/else statements
        // to return the correct product data

        // create the Product object
        //Product product = new Product();
        Product product;

        // fill the Product object with data
        //product.setCode(productCode);
        if (productCode.equalsIgnoreCase("java")) {
            product = new Product(productCode,"Java Programming",57.50);
            //product.setPrice();
        } else if (productCode.equalsIgnoreCase("jsp")) {
            product = new Product(productCode, "Java Servlets and JSP", 57.50);
            //product.setDescription("Java Servlets and JSP");
            //product.setPrice(57.50);
        } else if (productCode.equalsIgnoreCase("mysql")) {
            product = new Product(productCode, "MySQL", 54.50);
            //product.setDescription("MySQL");
            //product.setPrice(54.50);
        } else if (productCode.equalsIgnoreCase("android")) {
            product = new Product(productCode, "Android Programming", 35.50);
            //product.setDescription("Android Programming");
            //product.setPrice(35.50);
        } else {
            product = new Product(productCode, "Unknown", 0);
            //product.setDescription("Unknown");
        }
        return product;
    }
}