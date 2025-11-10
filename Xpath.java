By homepageLogo = By.cssSelector("img[class=\"logo-default\"]");
	By pharmacyTabXpath = By.xpath("//a[@href='#/Pharmacy']");
	private By tabXpath;
	By calendarFromDropdown = By.xpath("(//input[@id='date'])[1]");
	By calendarToDropdown = By.xpath("(//input[@id='date'])[2]");
	By closeModalButtonXpath = By.xpath("//a[@title='Cancel']");
	By okButtonXpath = By.xpath("//button[contains(text(),'OK')]");
	By filterDropdownXpath = By.xpath("//div[@class='dropdown']//span[@data-hover='dropdown']");
	By radiButtonCompleteXpath = By.xpath("//input[@value='complete']/../span");
//	public By radiButtonCancelledXpath = By.xpath("//input[@value='cancelled']/../span");
	By radiButtonAllXpath = By.xpath("//input[@value='all']/../span");
	By expiryDateFieldId = By.id("ExpiryDate");//byID ..
	By addNewItemModalXpath = By.xpath("(//div[@class='modelbox-div clearfix'])[2]");
	By modalXpath = By.xpath("//div[@class='modelbox-div clearfix']");
	By favouriteOrStarIcon = By.xpath("//i[contains(@class,'icon-favourite')]");
	By goodReceiptTableDataRow = By.cssSelector("div[ref=\"eCenterContainer\"] div[role=\"row\"]");
	By actualDatesOfGoodReceiptTableXpath = By
			.xpath("//div[@col-id=\"GoodReceiptDate\"]/span[not(@ref=\"cbSelectAll\")]");
	
	String pageName = this.getClass().getSimpleName();
	public pharmacy_Pages(WebDriver driver) {
//		public UserActions userActions;
		super(driver);
	}

	public By getXpathById(String strId) {
		return By.id(strId);
	}
	
	
	public By getSubTagXpath(String value) {
		return By.xpath("//ul[@class='page-breadcrumb']//a[@href='#/Pharmacy/"+value+"']");
	}
	
	public By getSubTabOfSubTab(String value) {
		return By.xpath("//a[@href='#/Pharmacy/Order/"+value+"']");
	}
	
	public By getInputByPlaceHolder(String value) {
		return By.xpath("//input[@placeholder='"+value+"']");
	}
