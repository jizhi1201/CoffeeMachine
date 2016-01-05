public class Coffee {
private static final int ADD = 1; 
private static final int STOP = 0; 
private static int infunde;
private static Coffee coffee;

private Coffee(int infunde) {
super();
this.infunde = infunde;
}
public static Coffee getCoffeeInstance(){
if(coffee == null){
coffee = new Coffee(Coffee.STOP);
}
return coffee;
}

public int getInfunde() {
System.out.println("您的咖啡已经满了，请取走，慢慢享用，欢迎下次光临！");
return infunde;
}

public void setInfunde(int infunde) {
System.out.println("注入咖啡");
this.infunde = infunde;
}

public void infundeCoffee(int state){
if(state == Coffee.ADD){
setInfunde(500);
}else {
System.out.println("咖啡未用完，不需要增加");
}
}
}

