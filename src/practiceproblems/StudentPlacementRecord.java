package practiceproblems;

public class StudentPlacementRecord {
	String studentName;
	String company;
	double packageLpa;
	StudentPlacementRecord(String name, String comp, double pack) {
		studentName = name;
		company = comp;
		packageLpa = pack;
	}
	void printRecord() {
		System.out.println(studentName + " -> " + company + " @ " + packageLpa + " Lpa ");
	}
	public static void main(String[] args) {
		StudentPlacementRecord s1 = new StudentPlacementRecord("Ravi", "TCS", 4.5);
		StudentPlacementRecord s2 = new StudentPlacementRecord("Anitha", "Zoho", 6.2);
		StudentPlacementRecord s3 = new StudentPlacementRecord("Karthik", "Infosys", 4.0);
		StudentPlacementRecord[] records = {s1, s2, s3};
		for (StudentPlacementRecord record : records) {
			record.printRecord();
		}
	}
}
