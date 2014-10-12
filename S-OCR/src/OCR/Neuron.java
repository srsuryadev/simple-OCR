package OCR;

public class Neuron {
	
	private float threshold;
	private float inputs[];
	private float weights[];
	private float learningRate;
	private float errorMargin;
	
	public float sum;
	
	public void startFunction(float[][] pixels){
		
		int start=0;
		int i,j;
		
		for(i=0;i<pixels.length;i++){
			for(j=0;j<pixels[0].length;j++){
				sum+=pixels[i][j]*weights[start];
				start++;
			}
		}
		
	}

	

}
