package Test0002;

import com.github.javafaker.Faker;

public class seleniumTest2 {
	public static void main(String[] args) {

		Faker fake = new Faker();

		String fullName=fake.name().fullName();
		String firstName = fake.name().firstName();
		String lastName = fake.name().lastName();
		String address = fake.address().city();
		String phoneNumber = fake.phoneNumber().cellPhone();
		String email = fake.internet().emailAddress();

		System.out.println(fullName);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(address);
		System.out.println(phoneNumber);
		System.out.println(email);

	}
}
