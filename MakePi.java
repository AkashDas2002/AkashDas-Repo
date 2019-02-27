	
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
