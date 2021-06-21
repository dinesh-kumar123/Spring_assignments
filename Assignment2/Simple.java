package Assignment2;

public class Simple {

	@Override
	public String toString() {
		return "Simple [principle=" + principle + ", rate=" + rate + ", time=" + time +", race=" + race + "]";
	}
		 public double principle,rate,time;



		public double getPrinciple() {
			return principle;
		}



		public void setPrinciple(double principle) {
			this.principle = principle;
		}



		public double getRate() {
			return rate;
		}



		public void setRate(double rate) {
			this.rate = rate;
		}



		public double getTime() {
			return time;
		}



		public void setTime(double time) {
			this.time = time;
		}
		 public double race;



		public double getRace() {
			race=principle*rate*time/100;
			return race;
		}



		public void setRace(double race) {
			this.race = race;
		}
		 
	

}
