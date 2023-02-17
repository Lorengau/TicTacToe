package pack1;

import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.IntStream;

public class GewinnRoutine {
	Timer time;
	
	public GewinnRoutine() {
		time = new Timer();
		time.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {

					if(GUI.winner == 0 ) {
							int[] row1 = {GUI.state[0], GUI.state[1], GUI.state[2]};
							int sum1 = IntStream.of(row1).sum();
							int[] row2 = {GUI.state[3], GUI.state[4], GUI.state[5]};
							int sum2 = IntStream.of(row2).sum();
							int[] row3 = {GUI.state[6], GUI.state[7], GUI.state[8]};
							int sum3 = IntStream.of(row3).sum();
							
							int[] column1 = {GUI.state[0], GUI.state[3], GUI.state[6]};
							int sum4 = IntStream.of(column1).sum();
							int[] column2 = {GUI.state[1], GUI.state[4], GUI.state[7]};
							int sum5 = IntStream.of(column2).sum();
							int[] column3 = {GUI.state[2], GUI.state[5], GUI.state[8]};
							int sum6 = IntStream.of(column3).sum();
							
							int[] cross1 = {GUI.state[0], GUI.state[4], GUI.state[8]};
							int sum7 = IntStream.of(cross1).sum();
							int[] cross2 = {GUI.state[2], GUI.state[4], GUI.state[6]};
							int sum8 = IntStream.of(cross2).sum();
							
							boolean two1 = IntStream.of(row1).anyMatch(x -> x == 2);
							boolean two2 = IntStream.of(row2).anyMatch(x -> x == 2);
							boolean two3 = IntStream.of(row3).anyMatch(x -> x == 2);
							boolean two4 = IntStream.of(column1).anyMatch(x -> x == 2);
							boolean two5 = IntStream.of(column2).anyMatch(x -> x == 2);
							boolean two6 = IntStream.of(column3).anyMatch(x -> x == 2);
							boolean two7 = IntStream.of(cross1).anyMatch(x -> x == 2);
							boolean two8 = IntStream.of(cross2).anyMatch(x -> x == 2);
							
							boolean zero1 = IntStream.of(row1).anyMatch(x -> x == 0);
							boolean zero2 = IntStream.of(row2).anyMatch(x -> x == 0);
							boolean zero3 = IntStream.of(row3).anyMatch(x -> x == 0);

						if(sum1 == 6 || sum2 == 6 || sum3 == 6 || sum4 == 6 || 
							sum5 == 6 || sum6 == 6 || sum7 == 6 || sum8 == 6) 
						{
							GUI.winner = 2;
							}
							else if((!two1 && sum1 == 3) || 
									(!two2 && sum2 == 3) ||
									(!two3 && sum3 == 3) ||
									(!two4 && sum4 == 3) ||
									(!two5 && sum5 == 3) ||
									(!two6 && sum6 == 3) ||
									(!two7 && sum7 == 3) ||
									(!two8 && sum8 == 3)) {
								GUI.winner = 1;
								}
							else if(!zero1 && !zero2 && !zero3) {
							GUI.winner = 3;
						} 
					}
				}
		}, 0, 150);
	}
}