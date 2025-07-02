import java.util.Scanner;

public class TestSupermarket {
	public static void main(String[] args) {
		
		String city[] = {"Miami","Sunrise", "Hollywood","Tallahassee","Jacksonville","Orlando","Gainesville","Pensacola","Ocala","Sebring"};
		double profit[] = {10200000.00,14600000.00,17000000.00,6000000.00,21600000.00,9100000.00,8000000.00,12500000.00,2000000.00,4500000.00};
		
		Supermarket supermarket = new Supermarket(city, profit);
		
		supermarket.showOriginalData();
		System.out.println("Average profit is $" + supermarket.calculateAverageProfit());
		System.out.println("Highest profit is " + supermarket.findCityHighestProfit()); 
		supermarket.listAboveAverageCities();
		System.out.println("Standard deviation for Profits $" + supermarket.calculateStandardDeviation());
		supermarket.cityDescendingOrder();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a city ");
		String inputCity = scanner.nextLine();
		double givenCityProfit = getData(supermarket, inputCity);
		if (givenCityProfit != -1)
		{
			System.out.println("Profit for " + inputCity + "$" + givenCityProfit);
		}	
	else {
		System.out.println("Unknown City.");
	}
}
	private static double getData(Supermarket supermarket, String city) {
		return supermarket.findCityProfit(city);
	}
}
