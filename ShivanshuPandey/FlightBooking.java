import java.util.Arrays;
public class FlightBooking {

    public int[] corpFlightBookings(int[][] bookings, int n) {
    
        int[] res = new int[n];
        
    
        for (int[] booking : bookings) {
            int start = booking[0] - 1; 
            int end = booking[1] - 1;   
            int seats = booking[2];
            
            res[start] += seats; 
            if (end + 1 < n) {
                res[end + 1] -= seats; 
            }
        }
        
        for (int i = 1; i < n; i++) {
            res[i] += res[i - 1];
        }
        
        return res;
    }

    public static void main(String[] args) {
        FlightBooking solution = new FlightBooking();
        
        int[][] bookings = {
            {1, 2, 10},
            {2, 3, 20},
            {2, 5, 25}
        };
        int n = 5;

        int[] result = solution.corpFlightBookings(bookings, n);

        System.out.println(Arrays.toString(result));
    }
}


