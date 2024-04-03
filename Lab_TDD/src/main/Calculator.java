package main;

public class Calculator {

		public int add(int  x, int y) {
	        if (x < 0 || y < 0) {
	            throw new IllegalArgumentException("Inputs cannot be negative.");
	        }
	        if (!isInteger(x) || !isInteger(y)) {
	            throw new IllegalArgumentException("Both inputs must be integers.");
	        }
	        return (int) (x + y);
	    }
		 private boolean isInteger(Object obj) {
		        if (obj == null) {
		            return false;
		        }
		        return obj.getClass() == Integer.class;
		    }
		 
		 public Object add(int x, double y) {
				throw new IllegalArgumentException("Both inputs must be integers.");
			}
		 public Object add(double y, int y2) {
				throw new IllegalArgumentException("Both inputs must be integers.");
			}
		 public Object add(double x, double y) {
				throw new IllegalArgumentException("Both inputs must be integers.");
			}

}
