public class Car extends Vehicle{
    private int doorNum; 
    private int passengers;

    public Car(int aDoorNum, int Passengers){ 
        super("Honda", "Civic", "1893-jj");
        this.doorNum = aDoorNum; 
        this.passengers = Passengers; 
    }

    public int getDoorNum(){
        return this.doorNum;
    }

    public int getPassengers(){
        return this.passengers;
    }

    @Override 
    public String toString(){
        String result = String.format("%d -door  %s   %s  with license %s",this.doorNum, this.getMake(),
         this.getModel(), this.getPlate());
         
        return result;
    }

    @Override 
    public boolean equals(Object obj){ 
        //determines if it is an instance of the Ammunition class
		if (!(obj instanceof Car)){
			return false;
		}
		
		// cast other to current type
		Car otherCar = (Car) obj;
		
			//checks the size of the rocks
			if (this.doorNum == otherCar.getDoorNum()) {
                if(this.passengers == otherCar.getPassengers()){
				return super.equals(obj);
		
			}
        }
		return false;
    }
 
    public Car copy(){ 
        int doornumber = this.getDoorNum();
        int passen = this.getPassengers();

        Car theCopy = new Car(doornumber,passen);
        return theCopy; 
    }

    public static void main(String[] args){
        Car myCar = new Car(4,4);
        System.out.println(myCar.toString());
    }
}
