package smartPhones;

import java.util.Scanner;

public class smartPhoneChoosiing {

	String smartPhoneBrandsSamsung[] = new String[5];
	String smartPhoneBrandsApple[] = new String[5];
	String smartPhoneBrandsGoogle[] = new String[5];
	boolean flag = false;
	Scanner sc = new Scanner(System.in);
	String enteredName;
	

	void populateMobilePhoneBrandsSamsung() {

		smartPhoneBrandsSamsung[0] = "SamsungS20";
		smartPhoneBrandsSamsung[1] = "SamsungS21";
		smartPhoneBrandsSamsung[2] = "Flip3";
		smartPhoneBrandsSamsung[3] = "Fold";

	}

	void populateMobilePhoneBrandsApple() {
		smartPhoneBrandsApple[0] = "iphone11";
		smartPhoneBrandsApple[1] = "iphone12";
		smartPhoneBrandsApple[2] = "iphone13";
		smartPhoneBrandsApple[3] = "iphone13mini";

	}

	void populateMobilePhoneBrandsGoogle() {
		smartPhoneBrandsGoogle[0] = "GooglePixel6";
		smartPhoneBrandsGoogle[1] = "GooglePixel6Pro";
		smartPhoneBrandsGoogle[2] = "GooglePixelPro";
		smartPhoneBrandsGoogle[3] = "GooglePixel5";
	}

	void printSmartPhoneNames(String[] arr) {
		System.out.println("The available products are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}


	void findSmartPhone()
	{
		System.out.println("Enter the Name of Mobile Phones You want to search ");
		enteredName = sc.next();
		for (int i = 0; i < smartPhoneBrandsGoogle.length; i++) {
			if (enteredName.equals(smartPhoneBrandsGoogle[i])) {
flag = true;
break;
			}			
		}
for (int i = 0; i < smartPhoneBrandsApple.length;i++) {
	
	if (enteredName.equals(smartPhoneBrandsApple[i])) {
		flag = true;
		break;
	}
	
		}
for (int i = 0; i < smartPhoneBrandsSamsung.length; i++) {
	if (enteredName.equals(smartPhoneBrandsSamsung[i])) {
		flag = true;
		break;
	}
}

if(flag== true) {
	System.out.println("Product selected is :"+ enteredName);
}else {
	System.out.println("Please select a product from the list");
}
}
}

//void populateMobilePhoneCategory() {
//	for(i=0;i<5;i++)
//	{
//		System.out.println();
//	}
//}
