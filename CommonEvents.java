public CommonEvents waitForUrlContains(String urlFragment, long seconds) {
	    new WebDriverWait(driver, Duration.ofSeconds(seconds))
	        .until(ExpectedConditions.urlContains(urlFragment));
	    return new CommonEvents(driver);
	}

public CommonEvents scrollIntoView(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", element);

		return new CommonEvents(driver);
	}



public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

public CommonEvents highlightElement(WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Add the highlight
		jse.executeScript("arguments[0].setAttribute('style', 'border: solid 5px green');", element);

		try {
			// Wait for a specified time (e.g., 500 milliseconds)
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Remove the highlight
		jse.executeScript("arguments[0].setAttribute('style', '');", element);

		return new CommonEvents(driver);
	}

public boolean isDisplayed(WebElement element)
	{
		boolean flag = false;
		try
		{
			waitTillElementVisible(element, 60);
			if(element.isDisplayed())
				flag = true;
		}catch(Exception e)
		{
			flag = false;
		}

		return flag;
	}


public CommonEvents waitTillElementVisible(WebElement element, long seconds) {
		new WebDriverWait(driver, Duration.ofSeconds(seconds))
		.until(ExpectedConditions.visibilityOf(element));
		return new CommonEvents(driver);
	}


public CommonEvents waitTillElementVisible(By by, long seconds) {
		new WebDriverWait(driver, Duration.ofSeconds(seconds))
		.until(ExpectedConditions.visibilityOf(getWebElement(by)));
		return new CommonEvents(driver);
	}

public WebElement getWebElement(By by)
	{
		return driver.findElement(by);
	}

public boolean isDisplayed(By by)
	{
		boolean flag = false;
		try
		{
			waitTillElementVisible(by, 60);
			if(getWebElement(by).isDisplayed())
				flag = true;
		}catch(Exception e)
		{
			flag = false;
		}

		return flag;
	}

public List<WebElement> getWebElements(By by)
	{
		return driver.findElements(by);
	}

public CommonEvents click(WebElement element)
	{
		element.click();
		return new CommonEvents(driver);
	}


public String getTitle()
	{
		return driver.getTitle();
	}


public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}




public CommonEvents click(WebElement element)
	{
		element.click();
		return new CommonEvents(driver);
	}


public CommonEvents sendKeys(WebElement element,String textToBeEntered)
	{
		element.sendKeys(textToBeEntered);
		return new CommonEvents(driver);
	}
public CommonEvents sendKeys(By by, String textToBeEntered)
	{
		getWebElement(by).sendKeys(textToBeEntered);
		return new CommonEvents(driver);
	}

public CommonEvents waitTillNumberOfElementsToBe(By by, long seconds, int count) throws Exception
	{
		new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.numberOfElementsToBe(by, count));
		return new CommonEvents(driver);
	}


public CommonEvents clear(By by)
	{
		getWebElement(by).clear();
		return new CommonEvents(driver);
	}

public CommonEvents sendKeys(WebElement element, Keys key)
	{
		element.sendKeys(key);
		return new CommonEvents(driver);
	}

public CommonEvents sendKeys(By by, Keys key)
	{
		getWebElement(by).sendKeys(key);
		return new CommonEvents(driver);
	}

public CommonEvents waitTillNumberOfElementsToBe(By by, long seconds, int count) throws Exception
	{
		new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.numberOfElementsToBe(by, count));
		return new CommonEvents(driver);
	}

public CommonEvents waitTillNumberOfElementsToBeMoreThan(By by, long seconds, int count)
	{
		new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.numberOfElementsToBeMoreThan(by, count));
		return new CommonEvents(driver);
	}





