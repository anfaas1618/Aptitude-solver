public class PowerCycle {
    int arr[]={0,0,4,4,2,1,1,4,4,2};
    String number;
    String power;
    int unitPlaceNumber;
    int r;
    int powRem;
    public PowerCycle() {

    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void set(String number, String power) {
        this.number = number;
        this.power = power;
    }
   void printDigitPlace(){
     unitPlaceNumber= findUnitPlace(number);
    }

    int findUnitPlace(String num)
    {
      int unit=  Integer.parseInt(String.valueOf(num.toCharArray()[num.toCharArray().length-1]));
        System.out.println("the unit place of "+num +" is " + unit);
      return unit;
    }
   int findMod()
    {  r= Integer.parseInt(power)%arr[unitPlaceNumber];
        System.out.println("the reminder of "+power +" upon " + arr[unitPlaceNumber]+" is "+ r );
        return r;
    }
    double powerOfReminder()
    {
       powRem = (int) Math.pow(unitPlaceNumber,r);
        System.out.println("l ^ r is "+unitPlaceNumber+"^"+r+" = "+powRem);
        return powRem;
    }
    int printPowRemUnit()
    {   int ans =  findUnitPlace(String.valueOf(powRem));
        System.out.println("the unit place of power reminder is "+ans);
       return ans;
    }
}
