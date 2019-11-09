package m;

public class staffmain {
	StaffMember[] member;

	public staffmain() {
		member = new StaffMember[6];
		member[0] = new Executive("Sam", "123 Main Line", "555-0469", "656878", 2923.07);
		member[1] = new Employee("Carla", "456 Off Line", "555-0101", "24252532", 1246.15);
		member[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "5356333", 1169.23);
		member[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "34645745", 422.0);
		member[4] = new volunteer("Jane", "455 Fifth Ave", "555-3564");
		member[5] = new Volunteer("John", "944 Main Line", "555-3575");

		((Executive) staffList[0]).bonus(500);
		((Hourly) staffList[3]).hoursworked(4);

	}

	public void payday() {
		// TODO Auto-generated method stub

		for (int i = 0; i < staffList.length; i++) {
			System.out.println(staffList[i]);

			double amount = staffList[i].pay();
			if (amount == 0) {
				System.out.println("Thanks!");
				System.out.println("-----------------------------");

			} else {
				System.out.println(amount);
				System.out.println("-----------------------------");

			}
		}
	}
}
