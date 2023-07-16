package smartPhones;

public class smartPhonesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartPhoneChoosiing category = new smartPhoneChoosiing();
	
				category.populateMobilePhoneBrandsApple();
				category.populateMobilePhoneBrandsSamsung();
				category.populateMobilePhoneBrandsGoogle();
				
				category.printSmartPhoneNames(category.smartPhoneBrandsApple);
				category.printSmartPhoneNames(category.smartPhoneBrandsGoogle);
				category.printSmartPhoneNames(category.smartPhoneBrandsSamsung);
				category.findSmartPhone();
	}

}
