class Electricity{
  public static void main(String args[]){
    int units =100;
    double TotalAmount =0;
    if(units<=50){
      TotalAmount =units*0.50;
    }
    else if(units<=150){
      TotalAmount=(0.50*50)+(0.75*100);
    }
    else if(units<=250)
    {
      TotalAmount=((0.50*50)+(0.75*100)+(1.20*100)+(1.50*(units-250)));
    }
    System.out.println("TotalAmount 20%added  total electricity bill=" +TotalAmount );
  }
}