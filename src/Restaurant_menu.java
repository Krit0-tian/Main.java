import java.util.Scanner;
public class Restaurant_menu extends Restaurant_Name
{public Restaurant_menu(String name) { super(name); }

    public Restaurant_menu() {
        super();
    }

    public void f1()
    {
        System.out.println("这是今天的菜单：\n");
        System.out.println("1.辣子鸡丁 38元\n"+"2.水煮肉片 22元\n"+"3.糖醋里脊 18元\n"+"4.干锅牛肉 38元\n"+"5.干锅排骨 29元\n"+"输入想点的菜单序号(空格键分割)：");
        int menu_money[]={38,22,18,38,29};//定义数组
        String menu_name[]={"辣子鸡丁 38元","水煮肉片 22元","糖醋里脊 18元","干锅牛肉 38元","干锅排骨 29元"};
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("你一共选择了：\n"+menu_name[n-1]+"\n"+"共计 "+menu_money[n-1]+"\n"+"还有需要点的菜吗？\n");
        int m = input.nextInt();
        System.out.println("你一共选择了：\n"+menu_name[n-1]+"\n"+menu_name[m-1]+"\n"+"共计 "+(menu_money[n-1]+menu_money[m-1])+"\n");
        System.out.println("请选择付款方式：");
        String way[]={"1.支付宝","2.微信","3.现金支付"};
        for(int k=0;k<3;k++)
        {
            System.out.println(way[k]);
        }
        int z = input.nextInt();
        System.out.println("你选择了："+way[z-1]+"共"+(menu_money[n-1]+menu_money[m-1]));
    }
}
