// Barbod Salehinoparvar
// student number # 501120154
// 
//



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/*
 * Models a simple ECommerce system. Keeps track of products for sale, registered customers, product orders and
 * orders that have been shipped to a customer
 */
public class ECommerceSystem
{
    private ArrayList<Product>  products = new ArrayList<Product>();
    private ArrayList<Customer> customers = new ArrayList<Customer>();	
    private ArrayList<ProductOrder> orders   = new ArrayList<ProductOrder>();
    private ArrayList<ProductOrder> shippedOrders   = new ArrayList<ProductOrder>();
    private ArrayList<Book> books = new ArrayList<Book>();
    
    // These variables are used to generate order numbers, customer id's, product id's 
    private int orderNumber = 500;
    private int customerId = 900;
    private int productId = 700;
    
    // General variable used to store an error message when something is invalid (e.g. customer id does not exist)  
    String errMsg = null;
    
    // Random number generator
    Random random = new Random();
    
    public ECommerceSystem()
    {
    	// NOTE: do not modify or add to these objects!! - the TAs will use for testing
    	// If you do the class Shoes bonus, you may add shoe products
    	
    	// Create some products. Notice how generateProductId() method is used
    	products.add(new Product("Acer Laptop", generateProductId(), 989.0, 99, Product.Category.COMPUTERS));
    	products.add(new Product("Apex Desk", generateProductId(), 1378.0, 12, Product.Category.FURNITURE));
    	products.add(new Book("Book", generateProductId(), 45.0, 4, 2, "Ahm Gonna Make You Learn", "T. McInerney"));
    	products.add(new Product("DadBod Jeans", generateProductId(), 24.0, 50, Product.Category.CLOTHING));
    	products.add(new Product("Polo High Socks", generateProductId(), 5.0, 199, Product.Category.CLOTHING));
    	products.add(new Product("Tightie Whities", generateProductId(), 15.0, 99, Product.Category.CLOTHING));
    	products.add(new Book("Book", generateProductId(), 35.0, 4, 2, "How to Fool Your Prof", "D. Umbast"));
    	products.add(new Book("Book", generateProductId(), 45.0, 4, 2, "How to Escape from Prison", "A. Fugitive"));
    	products.add(new Book("Book", generateProductId(), 44.0, 14, 12, "Ahm Gonna Make You Learn More", "T. McInerney"));
    	products.add(new Product("Rock Hammer", generateProductId(), 10.0, 22, Product.Category.GENERAL));
    	
    	// Create some shoe products.
        // change last 10 parameters
        products.add(new Shoes("Nike", generateProductId(), 1000.0, 87, 46, 29, 45, 39, 19,98,99,32,49));
    	products.add(new Shoes("Timberland", generateProductId(), 320.0, 29, 44, 66, 69, 12, 10,38,56,15,34));
    	products.add(new Shoes("Gucci", generateProductId(), 125.0, 34, 58, 93, 29, 16,10,96,69,85,75));
    	products.add(new Shoes("Dior", generateProductId(), 220.0, 86, 76, 25, 83, 110, 99,48,119,39,46));
    	
    	// Create some customers. Notice how generateCustomerId() method is used
    	customers.add(new Customer(generateCustomerId(),"Inigo Montoya", "1 SwordMaker Lane, Florin"));
    	customers.add(new Customer(generateCustomerId(),"Prince Humperdinck", "The Castle, Florin"));
    	customers.add(new Customer(generateCustomerId(),"Andy Dufresne", "Shawshank Prison, Maine"));
    	customers.add(new Customer(generateCustomerId(),"Ferris Bueller", "4160 Country Club Drive, Long Beach"));
    }
    
    private String generateOrderNumber()
    {
    	return "" + orderNumber++;
    }

    private String generateCustomerId()
    {
    	return "" + customerId++;
    }
    
    private String generateProductId()
    {
    	return "" + productId++;
    }
    
    public String getErrorMessage()
    {
    	return errMsg;
    }
    
    public void printAllProducts()
    {
    	for (Product p : products)
    		p.print();
    }
    
    // Print all products that are books. See getCategory() method in class Product
    public void printAllBooks()
    {
    	for (int i=0; i< products.size(); i++)
    		if (products.get(i).getCategory().equals(Product.Category.BOOKS))
    			products.get(i).print();
    }
    
    // Print all current orders
    public void printAllOrders()
    {
    	for (ProductOrder Ord: orders) 
    	{
            Ord.print();
        }
    }
    // Print all shipped orders
    public void printAllShippedOrders()
    {
    	for (ProductOrder po: shippedOrders) 
    	{
            po.print();
        }
    }
    
    // Print all customers
    public void printCustomers()
    {
    	for(int i = 0; i< customers.size(); i++)
    	{
    		Customer cus = customers.get(i);
    		cus.print();
    	}
    }
    /*
     * Given a customer id, print all the current orders and shipped orders for them (if any)
     */
    public boolean printOrderHistory(String customerId)
    {
      // Make sure customer exists - check using customerId
    	// If customer does not exist, set errMsg String and return false
    	// see video for an appropriate error message string
    	// ... code here
    	Customer foundCustomer = null;
        for (Customer c: customers)
        {
            if (c.getId().equals(customerId))
            {
                foundCustomer = c;
            }
        }
        if (foundCustomer == null)//incase it coudn't found give an error message
        {
            errMsg = "Customer " + customerId + " Not Found";
            return false;
        }
    	// Print current orders of this customer 
    	System.out.println("Current Orders of Customer " + customerId);
    	// enter code here
    	for (ProductOrder po: orders) 
    	{
            if (po.getCustomer().getId().equals(foundCustomer.getId()))
            {
                po.print();
            }
        }
    	// Print shipped orders of this customer 
    	System.out.println("\nShipped Orders of Customer " + customerId);
    	//enter code here
    	for (ProductOrder po: shippedOrders)
    	{
            if (po.getCustomer().getId().equals(foundCustomer.getId()))
            {
                po.print();
            }
        }
    	return true;
    }
    
    public String orderProduct(String productId, String customerId, String productOptions)
    {
    	// First check to see if customer object with customerId exists in array list customers
    	// if it does not, set errMsg and return null (see video for appropriate error message string)
    	// else get the Customer object
    	Customer customer = null;//make known cust as an object in customers therefore it checks
        for (Customer c: customers) 
        {
            if (c.getId().equals(customerId))
            {
                customer = c;
            }else if(!c.getId().equals(customerId))//in case it coudn't found give an error message
            {
            	errMsg = "Customer " + customerId + " not found";
            }
        }
        
        if (customer == null)
        {
            return null;
        }
    	// Check to see if product object with productId exists in array list of products
    	// if it does not, set errMsg and return null (see video for appropriate error message string)
    	// else get the Product object 
        Product product = null;
        for (Product p: products) {
            if (p.getId().equals(productId))
            {
                product = p;
            }
            else{
            	errMsg = "Product " + productId + " not found.";//in case it coudn't found give an error message
            }
        }
        

        if (product == null) {
            return null;
        }
    	// Check if the options are valid for this product (e.g. Paperback or Hardcover or EBook for Book product)
    	// See class Product and class Book for the method vaidOptions()
    	// If options are not valid, set errMsg string and return null;
        if (!productOptions.equals(""))
        {
        	if (product.validOptions(productOptions) == false)// give error messages if it is wrong or invalid
            {
                if (product.getCategory().equals(Product.Category.BOOKS)){
                    errMsg = "Product Book ProductId " + productId + " Invalid Options: " + productOptions;
                    return null;
                }
                else if (product.getCategory().equals(Product.Category.CLOTHING)){
                    errMsg = "Product Shoe ProductId " + productId + " Invalid Options: " + productOptions;
                    return null;
                }
                else{
                    errMsg = "Invalid Category for ProductID " + productId;//in case it coudn't found give an error message which is included product's id
                    return null;
                }
            }
        }
    	// Check if the product has stock available (i.e. not 0)
    	// See class Product and class Book for the method getStockCount()
    	// If no stock available, set errMsg string and return null
        if (product.getStockCount(productOptions) == 0)
        {
            errMsg = "Product " + productId + " is 0 in stock.";
            return null;
        }
      // Create a ProductOrder, (make use of generateOrderNumber() method above)
    	// reduce stock count of product by 1 (see class Product and class Book)
    	// Add to orders list and return order number string
        orders.add(new ProductOrder(generateOrderNumber(), product, customer, productOptions));
        product.reduceStockCount(productOptions);
        return "Order number :"+ (orderNumber-1);
    }
    
    /*
     * Create a new Customer object and add it to the list of customers
     */
    
    public boolean createCustomer(String name, String address)
    {
    	// Check name parameter to make sure it is not null or ""
    	// If it is not a valid name, set errMsg (see video) and return false
    	// Repeat this check for address parameter
    	if (name == null || name.equals("")) 
    	{
            errMsg = "Invalid name";
            return false;
    	}
        if (address == null || address.equals("")) 
        {
            errMsg = "Invalid address";
            return false;
        }
    	// Create a Customer object and add to array list
        Customer cust = new Customer(generateCustomerId(), name, address);
        customers.add(cust);
        return true;
    }
    
    public boolean shipOrder(String orderNumber)
    {
      // Check if order number exists first. If it doesn't, set errMsg to a message (see video) 
    	// and return false
    	// Retrieve the order from the orders array list, remove it, then add it to the shippedOrders array list
    	// return a reference to the order
    	ArrayList<ProductOrder> shipOrder = new ArrayList<ProductOrder>();
    	
        ProductOrder reference = null; //with this we can use it out of the for loop
        
        for (ProductOrder order: orders)
        {
            if (order.getOrderNumber().equals(orderNumber)) 
            {
                shipOrder.add(order);
                shippedOrders.add(order); 
                order.print(); 
                reference = order;
                break;
            } 
            else  //if the order does not exist it will give error
            {
            	errMsg = "Order number " + orderNumber + " Not found.";
            }
        }
        orders.removeAll(shipOrder);
        return reference != null;
     }
    /*
     * Cancel a specific order based on order number
     */
    public boolean cancelOrder(String orderNumber)
    {
      // Check if order number exists first. If it doesn't, set errMsg to a message (see video) 
    	// and return false
    	ArrayList <ProductOrder> cancel_order = new ArrayList<ProductOrder>();
        ProductOrder shipping = null;
    	for(ProductOrder order:orders) 
        {
          if(orderNumber.equals(order.getOrderNumber())) 
          {
              cancel_order.add(order);
              shipping = order;
          }
          else
          {
              errMsg = "Order number " + orderNumber + " Not found.";
              continue;
          }
        }
        orders.removeAll(cancel_order);
        if(shipping == null)
        {
            return false;
        }
        return true;
    }
    public void printAuthorBooks(String authorName)
    {
    	ArrayList <Book> bklist = new ArrayList<Book>();
        Book book = null;
        for (Product bk : products) {
            if (bk.getCategory().equals(Product.Category.BOOKS)) 
            {
                books.add((Book) bk);
                book = (Book) bk; //it goes through Books.java and search for bk will find it
                if (book.getAuthor().equals(authorName))
                    bklist.add(book);
            }
        }

        Comparator <Book> ByAuthorNAME = new Comparator<Book>() 
        {
            public int compare(Book o1, Book o2)
            {
                if(o1.getYear() > o2.getYear())
                    return 1;
                else
                    return -1;
            }
        };
        bklist.sort(ByAuthorNAME); //sort author's name by their name
        for (Book b : bklist)
            b.print();
    }
    
    // Sort products by increasing price
    public void sortByPrice()
    {
    	Comparator<Product> comparing_price = new Comparator<>()
  		{
  		  public int compare(Product product1, Product product2)
  		  {
  			  if(product1.getPrice()>product2.getPrice())
  			  {
  				  return 1;
  			  }
  			  else 
  			  {
  				  return -1;
  			  }
  		  }
  		};
  		Collections.sort(products, comparing_price);
    }
    
    
    // Sort products alphabetically by product name
    public void sortByName()
    {
    	Comparator<Product> CompName = new Comparator<>()
  		{
  		  public int compare(Product prod1, Product prod2)
  		  {
  			  return prod1.getName().compareTo(prod2.getName());
  		  }
  		};
  		Collections.sort(products, CompName);
    }
    
        
    // Sort products alphabetically by product name
    public void sortCustomersByName()
    {
    	Comparator<Customer> comparingcustname = new Comparator<>()
  		{
  		  public int compare(Customer customer1, Customer customer2)
  		  {
  			  return customer1.getName().compareTo(customer2.getName());
  		  }
  		};
  		Collections.sort(customers, comparingcustname);
    }
}
