//The owner of the code: Barbod Salehinoparvar



public class Shoes extends Product
{
  int stock_6black;
  int stock_6brown;
  int stock_7black;
  int stock_7brown;
  int stock_8black;
  int stock_8brown;
  int stock_9black;
  int stock_9brown;
  int stock_10black;
  int stock_10brown;

  public Shoes (String name, String id, double price, 
  int stock_6black,
  int stock_6brown,
  int stock_7black,
  int stock_7brown,
  int stock_8black,
  int stock_8brown,
  int stock_9black,
  int stock_9brown,
  int stock_10black,
  int stock_10brown)
  {
  	 // Make use of the constructor in the super class Product. Initialize additional Shoes instance variables.
  	 // Set category to CLOTHING 
     super(name, id, price, 100000, Product.Category.CLOTHING);
     	this.stock_6black = stock_6black;
     	this.stock_6brown = stock_6brown;
     	this.stock_7black = stock_7black;
     	this.stock_7brown = stock_7brown;
     	this.stock_8black = stock_8black;
     	this.stock_8brown = stock_8brown;
     	this.stock_9black = stock_9black;
     	this.stock_9brown = stock_9brown;
     	this.stock_10black = stock_10black;
     	this.stock_10brown = stock_10brown;
  }
    
  // Checks if it is in a valid format  
  public boolean validOptions(String productOptions)
  {
    switch (productOptions)
        {
        case "6 Black" :
        case "6 Brown" :
        case "7 Black" :
        case "7 Brown" :
        case "8 Black" :
        case "8 Brown" :
        case "9 Black" :
        case "9 Brown" :
        case "10 Black" :
        case "10 Brown" :
                return true;
            default: return false;
        }
  }
  public int getStockCount(String productOptions)
  {
  switch (productOptions)
        {
        case "6 Black": return stock_6black;
        case "6 Brown" : return stock_6brown;
        case "7 Black" : return stock_7black;
        case "7 Brown" : return stock_7brown;
        case "8 Black" : return stock_8black;
        case "8 Brown" : return stock_8brown;
        case "9 Black" : return stock_9black;
        case "9 Brown" : return stock_9brown;
        case "10 Black" : return stock_10black;
        case "10 Brown" : return stock_10brown;
          default: return super.getStockCount(productOptions);
        }
    }
  public void setStockCount(int stockCount, String productOptions)
	{
       switch (productOptions)
        {
          case "6 Black" :
            this.stock_6black = stockCount;
            break;
          case "6 Brown" :
            this.stock_6brown = stockCount;
            break;
          case "7 Black" :
            this.stock_7black = stockCount;
            break;
          case "7 Brown" :
            this.stock_7brown = stockCount;
            break;
          case "8 Black" :
            this.stock_8black = stockCount;
            break;
          case "8 Brown" :
            this.stock_8brown = stockCount;
            break;
          case "9 Black" :
            this.stock_9black = stockCount;
            break;
          case "9 Brown" :
            this.stock_9brown = stockCount;
            break;
          case "10 Black" :
            this.stock_10black = stockCount;
            break;
          case "10 Brown" :
            this.stock_10brown = stockCount;
            break;
        }
	}
  //When a shoe is ordered, a stock from its stock count is reduced
  public void reduceStockCount(String productOptions)
	{
  	// Use the productOptions to check for (and reduce) the number of stock for all the shoes
      switch (productOptions)
      {
          case "6 Black":
        	  stock_6black--;
            break;
          case "6 Brown" :
        	  stock_6brown--;
            break;
          case "7 Black" :
        	  stock_7black--;
            break;
          case "7 Brown" :
        	  stock_7brown--;
            break;
          case "8 Black" :
        	  stock_8black--;
            break;
          case "8 Brown" :
        	  stock_8brown--;
            break;
          case "9 Black":
        	  stock_9black--;
            break;
          case "9 Brown" :
        	  stock_9brown--;
            break;
          case "10 Black" :
        	  stock_10black--;
            break;
          case "10 Brown" :
        	  stock_10brown--;
            break;
      }
    System.out.println(stock_6brown); //just to test if it is working delete later
    }
    
// Print product information in super class 
  public void print()
  {
    super.print();
  }
}
