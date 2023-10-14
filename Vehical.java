package fall2023;
/*4531041
 * Nikhil Kataria
 * Inheritance
 */
class Sportvehical{
	String manufacture;
}
class SUV extends Sportvehical{
	int passengercount;
}
class sedan extends Sportvehical{
	String Model;
	
}
public class Vehical {

	public static void main(String[] args) {
	SUV z=new SUV();
	z.manufacture="Toyota";
	z.passengercount=5;
	System.out.println("SUV Details");
	System.out.println("-----------");
	System.out.println("The manufacture is "+ z.manufacture);
	System.out.println("Total passenger is "+ z.passengercount);

	}

}
