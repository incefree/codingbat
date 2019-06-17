package codingBat;

public class StartOz {

	public static void main(String[] args) {
		System.out.println(startOz("ozymandias"));
		System.out.println(startOz("bzoo"));
		System.out.println(startOz("oxx") );
		System.out.println(startOz("o"));
		System.out.println(startOz(""));
	}
	public static String startOz(String str) {
		if(str.startsWith("oz")) {
			return "oz";
		}
		if(str.startsWith("o")) {
			return "o";
		}
		if(str.startsWith("z", 1)) {
			return "z";
		}
		return "";
	}
}
