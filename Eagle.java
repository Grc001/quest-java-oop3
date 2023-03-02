public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
     
        
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

   
    public void takeOff() {
      if (this.flying == false && this.altitude == 0) {
            this.flying = true;
        System.out.println( getName() + " takes off in the sky");
        }
    }
    
    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = this.altitude + meters;
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void glide() {
        if (this.flying) {
            System.out.println("It glides into the air.");
        }
     
    }
    
    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.altitude < 5) {
        
            System.out.printf("%s lands on the ground", this.getName());
            this.altitude = 0;
            this.flying = false;
        } else {
            System.out.println(this.getName() + " is too high to land. if he tries, he will crash sa tronche de piaf on the floor!");
        }
        
    }



}
