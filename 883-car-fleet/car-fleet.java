class Car implements Comparable<Car>{
    int pos; 
    int speed;

    public Car(int pos, int speed){
        this.pos = pos;
        this.speed = speed;
    }

    public int compareTo(Car otherCar){
        return otherCar.pos - this.pos;
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Car[] cars = new Car[position.length];
        Stack<Double> stack = new Stack<>();
        for(int i = 0; i<position.length; i++){
            cars[i] = new Car(position[i],speed[i]);
        }
        Arrays.sort(cars);
        for(Car car: cars){
            double timeToReachTar = (double)(target - car.pos) / car.speed;
            if(!stack.isEmpty() && timeToReachTar <= stack.peek()){
                continue;
            }
            stack.push(timeToReachTar);
        }
        return stack.size();
    }
}