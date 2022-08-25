package automationpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass
{
// BaseClass base=new BaseClass();
 Amazonshopping shop=new Amazonshopping();	

 
 @BeforeClass
 public void setup()
 {
	 shop.Invokebrowser();
 }
 

 
 
 
/*@Test(priority=0)
public  String verifytitleofthepage() 
{
	String message=base.verifypagetitle();
	return message;
}

@Test (priority=0)
public void accessin()
{
	shop.login();
}*/
 
@Test(priority=0)
public void productsearch()
{
	shop.productsearch();
}


/*@Test(priority=1 )
public void allproductsdetails()
{
	shop.listproducts();
}*/
@Test(priority=1)
public void particularbrand()
{
	shop.selectingbrands();
}
@Test(priority=2)

public void fastdelivery()
{
	shop.selectingbrands();
}
@Test(priority=3)

public void refiningprice()
{
shop.Pricerefinements();
}

@AfterClass
public void endbrowser() 
{
	 shop.endwindow();
}
}
