public class MakePi {

    public static void main(String[] commandLine) {
	double mass = Double.parseDouble(commandLine[0]);
	System.out.println(collisionCount(1,mass,10));
    }

    public static int collisionCount(double mass1, double mass2, double vel) {
	int count = 0;
	double velocity1 = 0;
	double velocity2 = vel;

	while (!(velocity2 < 0 && velocity2 < velocity1 && velocity1 <= 0)) {
	
	    if (velocity2 >= 0) {
		if (velocity1 <= 0) {
		    count += 1;
		    double vel1 = velocity1;
		    double vel2 = velocity2;
		    velocity1 = ((mass1 - mass2)/(mass1 + mass2))*vel1 + ((2*mass2)/(mass1 + mass2))*vel2;
		    velocity2 = ((mass2 - mass1)/(mass1 + mass2))*vel2 + ((2*mass1)/(mass1 + mass2))*vel1;

		    //		    System.out.println("velocity1 = " + velocity1 + ", velocity2 = " + velocity2);
		}

		else if (velocity1 > 0) {
		    count += 1;
		    velocity1 *= -1;
		    //		    System.out.println("velocity1 = " + velocity1 + ", velocity2 = " + velocity2);
		}
	    }

	    else {
		if (velocity1 > 0) {
		    count +=1;
		    velocity1 *= -1;
		    //		    System.out.println("velocity1 = " +  velocity1 + ", velocity2 = " + velocity2);
		}

		else if (velocity1 <= 0 && velocity1 < velocity2) {
		    count += 1;
		    double vel1 = velocity1;
		    double vel2 = velocity2;
		    velocity1 = ((mass1 - mass2)/(mass1 + mass2))*vel1 + ((2*mass2)/(mass1 + mass2))*vel2;
		    velocity2 = ((mass2 - mass1)/(mass1 + mass2))*vel2 + ((2*mass1)/(mass1 + mass2))*vel1;
		    //		    System.out.println("velocity1 = " + velocity1 + ", velocity2 = " + velocity2);
		}
	    }
	}

	return count;
    }
	
}
