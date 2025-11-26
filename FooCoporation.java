import java.util.Scanner;

public class FooCoporation {
    float hours;
    float perpay;
    double totalpay;
    public void caculate(){
      if (perpay>=8.0)
         if (hours<=40&&hours>0){
            totalpay=hours*perpay;
            System.out.println("您的工资为："+totalpay);
         }
         else if(hours>40&&hours<=60) {
            totalpay = (40 *perpay) + (hours - 40) * perpay * 1.5;
            System.out.println("您的工资为：" + totalpay);
         }
         else{
            System.out.println("error");
         }
     else {
         System.out.println("error");
     }
    }
    public static void main(String[] args) {
        FooCoporation fooCoporation = new FooCoporation();

        System.out.println("请输入您的工作小时数：");
        Scanner sc = new Scanner(System.in);
        fooCoporation.hours = sc.nextFloat();
        System.out.println("请输入您的每小时工资：");
        fooCoporation.perpay = sc.nextFloat();

        fooCoporation.caculate();
    }
}
