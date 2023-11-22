package Practice3;

public class Cars 
{
    private
        int maxSpeed;
        String company;
    public
        void setCompany(String company) {
            this.company = company;
        }
        void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }
        String getCompany() {
            return company;
        }
        int getMaxSpeed() {
            return maxSpeed;
        }
        void showData( ) 
        {
        System.out.println("The car is made by "+company);
        System.out.println("Its max Speed is " + maxSpeed +" miles per hour");
        }
        Cars()
        {
            company="Hyundai";
            maxSpeed=150;
        }
        public String toString()
        {
            System.out.println("");
            String value=" ";
            value="Company " +this.company+". \n";
            value+="Top Speed: "+this.maxSpeed+"mph. \n";
            value+="-----------------";
            return value;
        }
        public boolean equals(Cars otherObject) 
        {
            return((company.equalsIgnoreCase(otherObject.company))&& (maxSpeed== otherObject.maxSpeed));
        }
        
}
