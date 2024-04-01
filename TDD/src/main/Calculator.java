package main;

public class Calculator {

	public int add(int  e, int d) {
        if (e < 0 || d < 0) {
            throw new IllegalArgumentException("Inputs cannot be negative.");
        }
        if (!isInteger(e) || !isInteger(d)) {
            throw new IllegalArgumentException("Both inputs must be integers.");
        }
        return (int) (e + d);
    }
	 private boolean isInteger(Object obj) {
	        if (obj == null) {
	            return false;
	        }
	        return obj.getClass() == Integer.class;
	    }
	public Object add(int e, double d) {
		throw new IllegalArgumentException("Both inputs must be integers.");
	}
	public Object add(double d, int d2) {
		throw new IllegalArgumentException("Both inputs must be integers.");
	}
	public Object add(double d, double e) {
		throw new IllegalArgumentException("Both inputs must be integers.");
	}

}
