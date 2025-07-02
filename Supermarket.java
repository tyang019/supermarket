import java.util.Arrays;

public class Supermarket {
	
		String[] city;
		double[] profit;
	
		public Supermarket (String[] city, double[] profit){
			this.city = city; 
			this.profit = profit;
		}
		public void showOriginalData(){
		System.out.println("Original data ");
		for (int i = 0; i < city.length; i++){
			System.out.println(city[i] + " $" + profit[i]);
			}	
		}
		public double calculateAverageProfit(){
		double sum = 0;
		for (double profit: profit) {
			sum += profit;
		}
		return sum / profit.length;
	}
		public String findCityHighestProfit() {
		double maxProfit = profit[0];
		int maxIndex = 0;
		
		for(int i = 1; i < profit.length; i++) {
			if(profit[i]>maxProfit) {
				maxProfit = profit[i];
				maxIndex = i;
			}
		}
		return city[maxIndex];
	}
		public void listAboveAverageCities() {
			double averageProfit = calculateAverageProfit();
			System.out.println("\nCities with profit at or above the average ");
			for (int i = 0; i < profit.length; i++) {
				if(profit[i] >= averageProfit) {
					System.out.println(city[i] + " $" + profit[i]);			
			}
		}
	}
		public double calculateStandardDeviation() {
			double sumDifference = 0;
			double mean = calculateAverageProfit();
			for (int i = 0; i < profit.length; i++) {
				sumDifference += Math.pow(profit[i] - mean, 2);
		}
			return Math.sqrt(sumDifference / (profit.length - 1));
	}
		public void cityDescendingOrder() {
			System.out.println("\nCity profit in descending order ");
			double[] copyOfProfit = Arrays.copyOf(profit, profit.length);
			Arrays.sort(copyOfProfit);
			for (int i = copyOfProfit.length - 1; i >= 0; i--) {
				for(int i1 = 0; i1 < profit.length; i1++) {
					if (profit[i1] == copyOfProfit[i1]) {
						System.out.println(city[i1]+ " $" + profit[i1]);
						break;	}
			}
		}
	}
		public double findCityProfit(String city) {
			for (int i = 0; i < city.length(); i++) {
				if (city.equalsIgnoreCase(city)) {
					return profit[i];
			}
		}
		return -1;
	}
}
