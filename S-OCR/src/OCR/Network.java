package OCR;

public class Network {

	public Neuron n[];
	
	public Network(){
		
		n=new Neuron[10];
	}
	
	
	public int prediction(float[][] pixels){
		
		int answer = 0;
		int x;
		
		for(x=0;x<10;x++){
			n[x].startFunction(pixels);
		}
		
		float value=0;
		
		for(x=0;x<10;x++){
			if(value<n[x].sum){
				value=n[x].sum;
				answer=x;
			}
		}
		
		return answer+1;
	}
	
	public void trainNetwork(){
		
		
		
	}
}
